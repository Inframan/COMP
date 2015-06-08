import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.Map;

import org.antlr.v4.tool.Attribute;
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

			scenario.addContent(baseOfOperations);

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
		location.addContent(new Element("coordinates").addContent(
				new Element("latitude").addContent(airportAtt.get("lat"))).addContent(
						new Element("longitude").addContent(airportAtt.get("lon"))).addContent(
								new Element("altitude").addContent(airportAtt.get("alt"))));
		location.addContent(new Element("availability").setAttribute("available","always"));

	}

	private void airportFiller(Element airport, Map<String,String> attributs, Integer counter)
	{
		//////////name is already added
		Element location = new Element("location");
		locationFiller(location, attributs);
		
		airport.addContent(new Element("description").addContent("XXX Description XXX"));
		airport.addContent(contactPerson());
		airport.addContent(location);
		
		



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
