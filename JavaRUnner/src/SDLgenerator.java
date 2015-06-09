import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.Map;

import org.antlr.v4.tool.Attribute;
import org.apache.bcel.generic.GETSTATIC;
import org.apache.xalan.xsltc.compiler.sym;
import org.jdom2.DocType;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.Namespace;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;


public class SDLgenerator {

	Listener symbolTable;

	public SDLgenerator(Listener extractor) {
		// TODO Auto-generated constructor stub
		symbolTable = extractor;
	}


	public void export()
	{

		Element scenario = new Element("scenario", "dcs:scenario");
		Document doc = new Document(scenario);

		//doc.setDocType(new DocType("ey"));
		//scenario.

		Namespace xsi = Namespace.getNamespace("xsi", "http://www.w3.org/2001/XMLSchema-instance");
		Namespace xsd = Namespace.getNamespace("xsd", "http://www.w3.org/2001/XMLSchema");

		scenario.addNamespaceDeclaration(xsi);
		scenario.addNamespaceDeclaration(xsd);

		Element bases = new Element("bases");
		scenario.addContent(bases);



		for(Integer  i = 1; i < symbolTable.airportCounter+1;i++)
		{
			Element baseOfOperations = new Element("baseOfOperations");
			Map<String,String> airportAtt = symbolTable.airportAttributs.get("Airport"+i.toString());
			Element location = new Element("location");
			Element airport = new Element("airport");
			Element name = new Element("name");
			baseOfOperations.setAttribute("id","b"+i.toString());

			if(airportAtt.containsKey("name"))
				name.addContent(airportAtt.get("name"));

			baseOfOperations.addContent(name);
			airport.addContent(name.clone());

			baseOfOperations.addContent(new Element("mobility").setAttribute("water","true").setAttribute("underwater","false").setAttribute("land","true").setAttribute("air","true"));
			baseOfOperations.addContent(new Element("description").addContent("XXX Description XXX"));
			baseOfOperations.addContent(new Element("history").addContent("XXX History XXX"));

			baseOfOperations.addContent(contactPerson());


			airportFiller(airport, airportAtt, i);
			locationFiller(location, airportAtt);

			baseOfOperations.addContent(location);
			baseOfOperations.addContent(airport);

			bases.addContent(baseOfOperations);

		}

		Format form = Format.getPrettyFormat();
		//form.setEncoding(encoding)
		XMLOutputter out = new XMLOutputter(form);		

		FileWriter writer;
		try {
			writer = new FileWriter("PENIs.xml");
			out.output(doc, writer);
			writer.close();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}


	private void locationFiller(Element location, Map<String,String> airportAtt)
	{
		Element city = new Element("city");
		Element region = new Element("stateDistrictRegion");
		Element country = new Element("country");

		location.addContent(new Element("address").addContent("xXxXxXxXxXxXx"));
		location.addContent(new Element("zipCode").addContent("xXxXxXxXxXxXx"));


		if(airportAtt.containsKey("city"))
			city.addContent(airportAtt.get("city"));
		if(airportAtt.containsKey("region"))
			region.addContent(airportAtt.get("region"));
		if(airportAtt.containsKey("country"))
			country.addContent(airportAtt.get("country"));

		location.addContent(city);
		location.addContent(region);
		location.addContent(country);

		location.addContent(new Element("country").addContent(airportAtt.get("")));
		getCoords(airportAtt, location);
		location.addContent(new Element("availability").setAttribute("available","always"));

	}

	private void airportFiller(Element airport, Map<String,String> attributs, Integer counter)
	{
		//////////name is already added
		Element location = new Element("location");
		Element runways = new Element("runways");
		locationFiller(location, attributs);
		runwaysFiller(runways, counter);
		helipadFiller(airport, counter);
		taxiwayFiller(airport, counter);
		taxiwayParkingFiller(airport, counter);
		hangarFiller(airport, counter);

		airport.addContent(new Element("description").addContent("XXX Description XXX"));
		airport.addContent(contactPerson());
		airport.addContent(location);
		airport.addContent(new Element("IATA").addContent("ABC"));
		airport.addContent(new Element("ICAO").addContent(attributs.get("ident")));
		airport.addContent(new Element("magVar").addContent(attributs.get("magvar")));

		airport.addContent(runways);

	}


	private void runwaysFiller(Element runways, Integer airportCounter)
	{
		Map<String,String> runwayAtt;
		for(Integer i = 1; i < symbolTable.runwayCounter+1;i++)
		{
			if(symbolTable.airportElements.get("Runway"+i.toString()).equals("Airport"+airportCounter.toString()))
			{
				runwayAtt = symbolTable.runwayAttributs.get("Runway"+i.toString());
				Integer reciprocalDesignation = Integer.parseInt(runwayAtt.get("number")) + 18;

				Element runway = new Element("runway");
				runway.setAttribute("id","r"+runwayAtt.get("number")+"-"+reciprocalDesignation.toString());



				getCoords(runwayAtt, runway);


				String[] unit = getLengthUnit(runwayAtt.get("length"));
				runway.addContent(new Element("length").addContent(unit[0]).setAttribute("lengthUnit",unit[1]));
				unit = getLengthUnit(runwayAtt.get("width"));
				runway.addContent(new Element("width").addContent(unit[0]).setAttribute("lengthUnit",unit[1]));

				runway.addContent(new Element("surface").addContent(runwayAtt.get("surface")));


				Element baseEnd = new Element("baseEnd");
				baseEnd.addContent(new Element("designation").addContent(runwayAtt.get("number")));
				Element startPoint = new Element("startpoint");
				getCoords(runwayAtt, startPoint);
				startPoint.addContent(new Element("connectsTo").addContent(new Element("xway").setAttribute("idr","x02")));
				baseEnd.addContent(startPoint);
				baseEnd.addContent(new Element("heading").addContent(runwayAtt.get("heading")).setAttribute("headingType","True"));
				Element endPoint = new Element("endpoint");
				getCoords(runwayAtt, endPoint);
				endPoint.addContent(new Element("connectsTo").addContent(new Element("xway").setAttribute("idr","x04")));
				baseEnd.addContent(endPoint);
				runway.addContent(baseEnd);

				Element reciprocalEnd = new Element("reciprocalEnd");
				reciprocalEnd.addContent(new Element("designation").addContent(reciprocalDesignation.toString()));
				Element startPoint_reciprocal = new Element("startpoint");
				getCoords(runwayAtt, startPoint_reciprocal);
				startPoint_reciprocal.addContent(new Element("connectsTo").addContent(new Element("xway").setAttribute("idr","x02")));
				reciprocalEnd.addContent(startPoint_reciprocal);
				reciprocalEnd.addContent(new Element("heading").addContent(runwayAtt.get("heading")).setAttribute("headingType","True"));
				reciprocalEnd.addContent(endPoint.clone());
				runway.addContent(reciprocalEnd);

				runways.addContent(runway);

			}

		}

	}

	private void helipadFiller(Element airport, Integer airportCounter){

		Map<String,String> helipadAttr;
		Element helipads = new Element("helipads");


		for(Integer i = 1; i < symbolTable.helipadCounter+1;i++)
		{
			helipadAttr = symbolTable.helipadAttributs.get("Helipad"+i.toString());

			if(symbolTable.airportElements.get("Helipad"+i.toString()).equals("Airport"+airportCounter.toString()))
			{

				Element helipad = new Element("Helipad");

				Element designation = new Element("designation").addContent("H"+i.toString());
				helipad.addContent(designation);
				helipad.addContent(new Element("surface").addContent(helipadAttr.get("surface")));
				getCoords(helipadAttr, helipad);
				Element radius = new Element("radius").addContent("15");
				helipad.addContent(radius);

				helipads.addContent(helipad);				
			}

		}

		airport.addContent(helipads);



	}

	private void taxiwayFiller(Element airport, Integer airportCounter){

		Map<String,String> taxiwayAttr;
		Element taxiways = new Element("taxiways");


		for(Integer i = 1; i < symbolTable.taxiwayPathCounter+1;i++)
		{
			taxiwayAttr = symbolTable.taxiwayPathAttributs.get("TaxiwayPath"+i.toString());

			if(symbolTable.airportElements.get("TaxiwayPath"+i.toString()).equals("Airport"+airportCounter.toString()))
			{
				String[] unit = getLengthUnit(taxiwayAttr.get("width"));

				Element taxiway = new Element("taxiway").setAttribute("id","x" + i.toString());

				Element designation = new Element("designation").addContent("Taxiway "+i.toString());
				taxiway.addContent(designation);
				taxiway.addContent(new Element("surface").addContent(taxiwayAttr.get("surface")));
				taxiway.addContent(new Element("width").addContent(unit[1]).setAttribute("lengthUnit", unit[0]));


				Element path = new Element("path");


				Element startPoint = new Element("startpoint");
				getCoords(taxiwayAttr, startPoint);
				startPoint.addContent(new Element("connectsTo").addContent(new Element("xway").setAttribute("idr","x02")));

				Element midPoint = new Element("midPoint");
				getCoords(taxiwayAttr, midPoint);
				startPoint.addContent(new Element("connectsTo").addContent(new Element("xway").setAttribute("idr","x02")));

				Element endPoint = new Element("endPoint");
				getCoords(taxiwayAttr, endPoint);
				endPoint.addContent(new Element("connectsTo").addContent(new Element("xway").setAttribute("idr","x02")));

				path.addContent(startPoint);
				path.addContent(midPoint);
				path.addContent(endPoint);

				taxiway.addContent(path);
				taxiways.addContent(taxiway);

			}

		}




	}

	private void taxiwayParkingFiller(Element airport, Integer airportCounter){


		Map<String,String> parkingAttr;
		Element parkingSpaces = new Element("parkingSpaces");


		for(Integer i = 1; i < symbolTable.taxiwayPathCounter+1;i++)
		{
			parkingAttr = symbolTable.taxiwayParkingAttributs.get("TaxiwayParking"+i.toString());

			if(symbolTable.airportElements.get("TaxiwayParking"+i.toString()).equals("Airport"+airportCounter.toString()))
			{
				String[] unit =  getLengthUnit(parkingAttr.get("radius"));
				Element parking = new Element("parking").setAttribute("parkingType","Medium");
				parking.setAttribute("id", "p" + i.toString());

				Element designation = new Element("designation").addContent("Parking "+i.toString());
				Element description = new Element("description").addContent("Parking description");
				Element airlines = new Element("airlines").addContent(" ");
				parking.addContent(designation);
				parking.addContent(description);
				parking.addContent(airlines);
				getCoords(parkingAttr, parking);
				Element radius = new Element("radius").addContent(unit[1]).setAttribute("lengthUnit", unit[0]);
				parking.addContent(radius);
				Element connectsToTaxiway = new Element("connectsToTaxiway").setAttribute("xway", "x11");
				parking.addContent(connectsToTaxiway);
				getCoords(parkingAttr,connectsToTaxiway);

				parkingSpaces.addContent(parking);

			}

		}
	}

	private void hangarFiller(Element airport, Integer airportCounter){


		Element hangars = new Element("hangars");

		Element hangar = new Element("hangar").setAttribute("id", "g1");

		Element designation = new Element("designation").addContent("Hangar 1");
		Element description = new Element("description").addContent("Hangar description");
		hangar.addContent(designation);
		hangar.addContent(description);
		Element shape = new Element("shape");
		Element vertex = new Element("vertex");
		Element lat = new Element("latitude").addContent("41º 16'  43'' N");
		Element lon = new Element("longitude").addContent("41º 16'  43'' N");
		vertex.addContent(lat);
		vertex.addContent(lon);
		shape.addContent(vertex);
		shape.addContent(vertex.clone());
		shape.addContent(vertex.clone());
		shape.addContent(vertex.clone());
		Element height = new Element("height").setAttribute("lengthUnit","Meter");
		height.addContent("7");
		shape.addContent(height);
		Element usefulArea = new Element("usefulArea").setAttribute("areaUnit","Square Meter");
		usefulArea.addContent("42");
		shape.addContent(usefulArea);
		Element doors = new Element("doors").setAttribute("doorType","DualSideSlip");
		doors.addContent(vertex.clone());
		doors.addContent(vertex.clone());
		Element length = new Element("height").setAttribute("lengthUnit","Meter");
		length.addContent("2");
		doors.addContent(length);
		doors.addContent(height.clone());
		shape.addContent(doors);

		hangar.addContent(shape);
		hangars.addContent(hangar);
		airport.addContent(hangars);


	}
	
	private void utiliesFiller(Element airport, Integer airportCounter){

		Map<String,String> towerAttr;
		Element utilities = new Element("utilities");


		for(Integer i = 1; i < symbolTable.towerCounter+1;i++)
		{
			towerAttr = symbolTable.towerAttributs.get("Tower"+i.toString());

			if(symbolTable.airportElements.get("Tower"+i.toString()).equals("Airport"+airportCounter.toString()))
			{

				Element tower = new Element("tower").setAttribute("id","u" +i.toString());

				Element designation = new Element("designation").addContent("T"+i.toString());
				tower.addContent(designation);
				getCoords(towerAttr, tower);
				Element radius = new Element("radius").setAttribute("lengthUnit","Meter");
				radius.addContent("2.55");
				tower.addContent(radius);
				Element height = new Element("height").setAttribute("lengthUnit","Meter");
				height.addContent("129");
				tower.addContent(height);

				utilities.addContent(tower);				
			}

		}

		airport.addContent(utilities);



	}


	private void getCoords(Map<String,String> attrs, Element root)
	{
		String[] unit = getLengthUnit(attrs.get("alt"));

		root.addContent(new Element("coordinates").addContent(
				new Element("latitude").addContent(attrs.get("lat"))).addContent(
						new Element("longitude").addContent(attrs.get("lon"))).addContent(
								new Element("altitude").addContent(unit[0]).setAttribute("measured",unit[1])));


	}



	private String[] getLengthUnit(String length)
	{
		if(length.endsWith("M"))
		{
			String ret[] = {length.split("M")[0],"Meter"};
			return ret;
		}
		else if(length.endsWith("F"))
		{
			String ret[] = {length.split("F")[0],"Foot"};
			return ret;
		}


		String ret[] = {length,"Meter"};
		return ret;//default value 	
	}



	private Element contactPerson()
	{
		Element contact = new Element("contactPerson");

		contact.addContent(new Element("name").addContent("XxX Name XxX"));
		contact.addContent(new Element("title").addContent("XxX Title XxX"));
		contact.addContent(new Element("institution").addContent("XxX Institution XxX"));
		contact.addContent(new Element("position").addContent("XxX position XxX"));
		contact.addContent(new Element("address").addContent("XxX address XxX"));
		contact.addContent(new Element("zipCode").addContent("XxX zipCode XxX"));
		contact.addContent(new Element("city").addContent("XxX city XxX"));
		contact.addContent(new Element("stateDistrictRegion").addContent("XxX stateDistrictRegion XxX"));
		contact.addContent(new Element("country").addContent("XxX country XxX"));
		contact.addContent(new Element("telephone").addContent("XxX telephone XxX"));
		contact.addContent(new Element("cellphone").addContent("XxX cellphone XxX"));
		contact.addContent(new Element("fax").addContent("XxX fax XxX"));
		contact.addContent(new Element("email").addContent("XxX email XxX"));



		return contact;		
	}

}
