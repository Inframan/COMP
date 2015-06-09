import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class Listener extends Airport_ParserBaseListener {

	String floatnumber = "[+-]?[0-9]+(\\.[0-9]+)?";
	String ident = "[A-Za-z]{0,5}";
	String heading = "0*([0-2]?[0-9]?[0-9]|3[0-5][0-9]|360)(\\.[0-9]+)?";
	String range = "[0-9]+[FMN]";
	String string = "[a-zA-Z0-9]";
	String trafficScallar = "[0-9]+[FMN]";
	String unsigned_int = "[0-9]*";
	String altitude_value = "[+-]?[0-9]+(\\.[0-9]+)?[FM]?";
	String string8 = "[A-Za-z0-9]{0,8}";

	Integer airportCounter =0;

	Integer  fuelCounter =0;
	Integer  towerCounter=0;
	Integer  runwayCounter=0;
	Integer  markingsCounter=0;
	Integer  lightsCounter=0;
	Integer  offsetThresholdCounter=0;
	Integer  approachLightsCounter=0;
	Integer  vasiCounter=0;
	Integer  ilsCounter=0;
	Integer  glideSlopeCounter=0;
	Integer  runwayStartCounter=0;
	Integer  blastPadCounter=0;
	Integer  overrunCounter=0;
	Integer  taxiwayPointCounter=0;
	Integer  taxiwayParkingCounter=0;
	Integer  taxiNameCounter=0;
	Integer  taxiwayPathCounter=0;
	Integer visualModelCounter = 0;
	Integer vertexCounter = 0;
	Integer servicesCounter = 0;
	Integer runwayAliasCounter =0;
	Integer helipadCounter =0;
	Integer dmeCounter = 0;


	String receivingAttributs = ""; //serve para saber a que atributo se vai adicionar o name

	Map<String,Map<String,String>> airportAttributs = new HashMap<String,Map<String,String>>(); 

	Map<String,Map<String,String>> ilsAttributs = new HashMap<String,Map<String,String>>();
	Map<String,Map<String,String>> visualModelAttributs = new HashMap<String,Map<String,String>>();
	Map<String,Map<String,String>> vertexAttributs = new HashMap<String,Map<String,String>>();
	Map<String,Map<String,String>> towerAttributs = new HashMap<String,Map<String,String>>();
	Map<String,Map<String,String>> runwayAttributs = new HashMap<String,Map<String,String>>();
	Map<String,Map<String,String>> runwayAliasAttributs = new HashMap<String,Map<String,String>>();
	Map<String,Map<String,String>> helipadAttributs = new HashMap<String,Map<String,String>>();
	Map<String,Map<String,String>> runway_startAttributs = new HashMap<String,Map<String,String>>();
	Map<String,Map<String,String>> taxiwayPointAttributs = new HashMap<String,Map<String,String>>();
	Map<String,Map<String,String>> taxiwayParkingAttributs = new HashMap<String,Map<String,String>>();
	Map<String,Map<String,String>> taxiwayNameAttributs = new HashMap<String,Map<String,String>>();
	Map<String,Map<String,String>> taxiwayPathAttributs = new HashMap<String,Map<String,String>>();
	Map<String,Map<String,String>> markingsAttributs = new HashMap<String,Map<String,String>>();
	Map<String,Map<String,String>> lightsAttributs = new HashMap<String,Map<String,String>>();
	Map<String,Map<String,String>> offsetThresholdAttributs = new HashMap<String,Map<String,String>>();
	Map<String,Map<String,String>> blastPadAttributs = new HashMap<String,Map<String,String>>();
	Map<String,Map<String,String>> overrunAttributs = new HashMap<String,Map<String,String>>();
	Map<String,Map<String,String>> approachLightsAttributs = new HashMap<String,Map<String,String>>();
	Map<String,Map<String,String>> vasiAttributs = new HashMap<String,Map<String,String>>();
	Map<String,Map<String,String>> glide_scopeAttributs = new HashMap<String,Map<String,String>>();
	Map<String,Map<String,String>> dmeAttributs = new HashMap<String,Map<String,String>>();
	Map<String,Map<String,String>> fuelAttributs = new HashMap<String,Map<String,String>>();

	Map<String,String> airportElements = new HashMap<String,String>();
	Map<String,String> runwayElements = new HashMap<String,String>();
	private Map<String,String>  ilsElements = new HashMap<String,String>();
	private Map<String, String> servicesElements = new HashMap<String,String>();


	@Override public void enterTaxiwayName(  Airport_ParserParser.TaxiwayNameContext ctx) { 
		taxiNameCounter++;
		receivingAttributs = "TaxiwayName";
	}


	@Override public void exitTaxiwayName(  Airport_ParserParser.TaxiwayNameContext ctx) { 
		airportElements.put("TaxiwayName"+taxiNameCounter.toString(), "Airport"+airportCounter.toString());
		
	}


	@Override public void enterApproachLights(  Airport_ParserParser.ApproachLightsContext ctx) {
		approachLightsCounter++;
		receivingAttributs = "ApproachLights";
	}


	@Override public void exitApproachLights(  Airport_ParserParser.ApproachLightsContext ctx) {
		runwayElements.put("ApproachLights"+approachLightsCounter.toString(), "Runway"+runwayCounter.toString());
	}


	@Override public void enterRunway_alias(  Airport_ParserParser.Runway_aliasContext ctx) { 
		
		runwayAliasCounter++;
	}


	@Override public void exitRunway_alias(  Airport_ParserParser.Runway_aliasContext ctx) { 
		airportElements.put("Runway_alias"+runwayAliasCounter.toString(), "Airport"+airportCounter.toString());
		
	}


	@Override public void enterBlastPad(  Airport_ParserParser.BlastPadContext ctx) { 
		blastPadCounter++;
		receivingAttributs = "BlastPad";
	}


	@Override public void exitBlastPad(  Airport_ParserParser.BlastPadContext ctx) {
		runwayElements.put("BlastPad"+blastPadCounter.toString(), "Runway"+runwayCounter.toString());
	}


	@Override public void enterOffsetThreshold(  Airport_ParserParser.OffsetThresholdContext ctx) {
		offsetThresholdCounter++;
		receivingAttributs = "OffsetThreshold";
	}


	@Override public void exitOffsetThreshold(  Airport_ParserParser.OffsetThresholdContext ctx) {
		runwayElements.put("OffsetThreshold"+offsetThresholdCounter.toString(), "Runway"+runwayCounter.toString());
		
	}


	@Override public void enterTaxiwayPoint(  Airport_ParserParser.TaxiwayPointContext ctx) { 
		taxiwayPointCounter++;
		receivingAttributs = "TaxiwayPoint";
	}


	@Override public void exitTaxiwayPoint(  Airport_ParserParser.TaxiwayPointContext ctx) { 
		airportElements.put("TaxiwayPoint"+taxiwayPointCounter.toString(), "Airport"+airportCounter.toString());
		
	}


	@Override public void enterLights(  Airport_ParserParser.LightsContext ctx) { 
		lightsCounter++;
		receivingAttributs = "Lights";
	}
	
	@Override
	public void enterHelipad(Airport_ParserParser.HelipadContext ctx) {
		helipadCounter++;
		receivingAttributs = "Helipad";
	}


	@Override
	public void enterRunway_start(Airport_ParserParser.Runway_startContext ctx) {
		runwayStartCounter++;
		receivingAttributs = "Runway_start";
	}


	@Override public void enterAirport( Airport_ParserParser.AirportContext ctx)
	{
		receivingAttributs = "Airport";
		airportCounter++;
	}


	@Override public void exitLights(  Airport_ParserParser.LightsContext ctx) { 
		runwayElements.put("Lights"+lightsCounter.toString(), "Runway"+runwayCounter.toString());
		
	}


	@Override public void enterServices(  Airport_ParserParser.ServicesContext ctx) {
		servicesCounter++;
	}


	@Override public void exitServices(  Airport_ParserParser.ServicesContext ctx) {
		
		airportElements.put("Services"+servicesCounter.toString(), "Airport"+airportCounter.toString());
	}


	@Override public void enterVasi(  Airport_ParserParser.VasiContext ctx) {
		receivingAttributs = "Vasi";
		vasiCounter++;
	}


	@Override public void exitVasi(  Airport_ParserParser.VasiContext ctx) {
		runwayElements.put("Vasi"+vasiCounter.toString(), "Runway"+runwayCounter.toString());
	}


	@Override public void enterVertex(  Airport_ParserParser.VertexContext ctx) { 
		receivingAttributs = "Vertex";
		vertexCounter++;
	}


	@Override public void exitVertex(  Airport_ParserParser.VertexContext ctx) { 


	}


	@Override public void enterFuel(  Airport_ParserParser.FuelContext ctx) { 
		fuelCounter++;
		receivingAttributs = "Fuel";
	}


	@Override public void exitFuel(  Airport_ParserParser.FuelContext ctx) {
		
		servicesElements.put("Fuel"+fuelCounter.toString(),"Services"+servicesCounter.toString());
	}


	@Override public void enterTower(  Airport_ParserParser.TowerContext ctx) { 
		receivingAttributs = "Tower";
		towerCounter++;
	}


	@Override public void exitTower(  Airport_ParserParser.TowerContext ctx) { 
		
		airportElements.put("Tower"+towerCounter.toString(), "Airport"+airportCounter.toString());
	}


	@Override public void enterMarkings(  Airport_ParserParser.MarkingsContext ctx) {
		markingsCounter++;
		receivingAttributs = "Markings";
	}


	@Override public void exitMarkings(  Airport_ParserParser.MarkingsContext ctx) { 
		runwayElements.put("Markings"+markingsCounter.toString(), "Runway"+runwayCounter.toString());
		
	}

	@Override public void enterRunway(  Airport_ParserParser.RunwayContext ctx) { 
		runwayCounter++;
		receivingAttributs = "Runway";
		
	}


	@Override public void exitRunway(  Airport_ParserParser.RunwayContext ctx) { 
		airportElements.put("Runway"+runwayCounter.toString(), "Airport"+airportCounter.toString());
		
	}


	@Override public void enterIls(  Airport_ParserParser.IlsContext ctx) { 
		ilsCounter++;
		receivingAttributs = "Ils";
	}


	@Override public void exitIls(  Airport_ParserParser.IlsContext ctx) { 
		runwayElements.put("Ils"+ilsCounter.toString(), "Runway"+runwayCounter.toString());
	}


	@Override public void enterOverrun(  Airport_ParserParser.OverrunContext ctx) {
		overrunCounter++;
		receivingAttributs = "Overrun";
	}


	@Override public void exitOverrun(  Airport_ParserParser.OverrunContext ctx) {
		runwayElements.put("Overrun"+overrunCounter.toString(), "Runway"+runwayCounter.toString());
	}

	@Override public void enterTaxiwayParking(  Airport_ParserParser.TaxiwayParkingContext ctx) { 
		receivingAttributs = "TaxiwayParking";
		taxiwayParkingCounter++;
	}


	@Override public void exitTaxiwayParking(  Airport_ParserParser.TaxiwayParkingContext ctx) {
		
		airportElements.put("TaxiwayParking"+taxiwayParkingCounter.toString(), "Airport"+airportCounter.toString());
	}


	@Override public void enterVisual_model(  Airport_ParserParser.Visual_modelContext ctx) {

		visualModelCounter++;
		receivingAttributs = "Visual_model";

	}

	@Override public void exitVisual_model(  Airport_ParserParser.Visual_modelContext ctx) { 
		ilsElements.put("Visual_model"+visualModelCounter.toString(), "Ils"+ilsCounter.toString());
	}
	
	@Override public void enterTaxiwayPath(  Airport_ParserParser.TaxiwayPathContext ctx) { 
		receivingAttributs = "TaxiwayPath";
		taxiwayPathCounter++;
	}

	@Override public void exitTaxiwayPath(  Airport_ParserParser.TaxiwayPathContext ctx) { 
		airportElements.put("TaxiwayPath"+taxiwayPathCounter.toString(), "Airport"+airportCounter.toString());
		
	}


	@Override public void enterGlide_slope(  Airport_ParserParser.Glide_slopeContext ctx) {
		receivingAttributs = "Glide_slope";
		glideSlopeCounter++;
	}


	@Override public void exitGlide_slope(  Airport_ParserParser.Glide_slopeContext ctx) {
		ilsElements.put("Glide_slope"+glideSlopeCounter.toString(), "Ils"+ilsCounter.toString());
	}


	@Override public void enterDme(  Airport_ParserParser.DmeContext ctx) {
		receivingAttributs = "Dme";
		dmeCounter++;
	}


	@Override public void exitDme(  Airport_ParserParser.DmeContext ctx) { 
		ilsElements.put("Dme"+dmeCounter.toString(), "Ils"+ilsCounter.toString());
	}
	
	@Override 
	public void exitRed(Airport_ParserParser.RedContext ctx)
	{
		String str = ctx.getText();
		int lineErr = ctx.getStart().getLine();
		int val = Integer.parseInt(str.split("=")[1].split("\"")[1]);
		if(val < 0 || val > 255)
			System.out.println("Error in line - " + lineErr +": Red value out of bounds! Expected [0,255] but got " + val);
		else
		{
			addAttribute(str.split("=")[0], str.split("=")[1].split("\"")[1]);
		}
	}
	
	@Override 
	public void exitBlue(Airport_ParserParser.BlueContext ctx)
	{
		String str = ctx.getText();
		int lineErr = ctx.getStart().getLine();
		int val = Integer.parseInt(str.split("=")[1].split("\"")[1]);
		if(val < 0 || val > 255)
			System.out.println("Error in line - " + lineErr +": Green value out of bounds! Expected [0,255] but got " + val);
		else
		{
			addAttribute(str.split("=")[0], str.split("=")[1].split("\"")[1]);
		}

	}
	
	@Override 
	public void exitGreen(Airport_ParserParser.GreenContext ctx)
	{
		String str = ctx.getText();
		int lineErr = ctx.getStart().getLine();
		int val = Integer.parseInt(str.split("=")[1].split("\"")[1]);
		if(val < 0 || val > 255)
			System.out.println("Error in line - " + lineErr +": Blue value out of bounds! Expected [0,255] but got " + val);
		else
		{
			addAttribute(str.split("=")[0], str.split("=")[1].split("\"")[1]);
		}
	}
	
	@Override
	public void exitApproach_runway(Airport_ParserParser.Approach_runwayContext ctx)
	{
		String str = ctx.getText();
		int lineErr = ctx.getStart().getLine();
		String value = str.split("=")[1].split("\"")[1];

		if(( value.equals("EAST") ||
				value.equals("NORTH") ||
				value.equals("NORTHEAST")  ||
				value.equals("NORTHWEST")  ||
				value.equals("SOUTH") ||
				value.equals("SOUTHEAST")  ||
				value.equals("SOUTHWEST")  ||
				value.equals("WEST")  ||value.equals("00") ||
				value.equals("EAST") ))
			addAttribute(str.split("=")[0], str.split("=")[1].split("\"")[1]);
		else if(value.startsWith("0"))
		{
			int val = Integer.parseInt(value);
			if (val < 0 || val > 9) {
				System.out.println("Error in line - " + lineErr +": Aprroach_Runway value out of bounds! Expected [00,09] but got " + val);
				return;
			}
		}
		else
		{
			try
			{
				int val = Integer.parseInt(value);
				if (val < 0 || val > 36)
					System.out.println("Error in line - " + lineErr +": Aprroach_Runway value out of bounds! Expected [0,36] but got " + val);
				else
					addAttribute(str.split("=")[0], str.split("=")[1].split("\"")[1]);
			}
			catch(NumberFormatException nfe)
			{
				System.out.println("Error in line - " + lineErr +": Aprroach_Runway value out of bounds! Expected cardinal points but got " + value);
			}

		}

	}

	@Override
	public void exitTaxiwayPathName(Airport_ParserParser.TaxiwayPathNameContext ctx)
	{
		String str = ctx.getText();
		int lineErr = ctx.getStart().getLine();
		if(str.endsWith("<missing VALUE>"))
			addAttribute(str.split("=")[0], "");
		else
		{
			try
			{
				int val = Integer.parseInt(str.split("=")[1].split("\"")[1]);
				if(val < 0 || val > 255)
					System.out.println("Error in line - " + lineErr +": Name value out of bounds! Expected [0,255] but got " + val);
				else
					addAttribute(str.split("=")[0], str.split("=")[1].split("\"")[1]);
			}
			catch(Exception e)
			{
				System.out.println("Error in line - " + lineErr +": Name value out of bounds! Expected [0,255] but got " + str);
			}
		}
	}


	@Override
	public void exitTaxiwayNameString(Airport_ParserParser.TaxiwayNameStringContext ctx)
	{
		String str = ctx.getText();
		int lineErr = ctx.getStart().getLine();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: taxiwayNameString value not expected! Val was: " + val);else
			if(!val.matches(string8))
				System.out.println("Error in line - " + lineErr +": taxiwayNameString Name value not expected! Got " + val);
			else
				addAttribute(str.split("=")[0], str.split("=")[1].split("\"")[1]);

	}

	@Override
	public void exitOrientation(Airport_ParserParser.OrientationContext ctx) {
		String str = ctx.getText();
		int lineErr = ctx.getStart().getLine();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: Orientation value not expected! Val was: " + val);else
			if (!val.equals("FORWARD") && !val.equals("REVERSE"))
				System.out.println("Error in line - " + lineErr +": Orientation value not expected! Expected 'FORWARD' OR 'REVERSE' but got " + val);
			else
				addAttribute(str.split("=")[0], str.split("=")[1].split("\"")[1]);
	}

	@Override
	public void exitTaxiwaypointType(Airport_ParserParser.TaxiwaypointTypeContext ctx) {
		String str = ctx.getText();
		int lineErr = ctx.getStart().getLine();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: TaxiwayPoint type value not expected! Val was: " + val);else
			if (!val.equals("NORMAL") && !val.equals("HOLD_SHORT") && !val.equals("ILS_HOLD_SHORT") && !val.equals("HOLD_SHORT_NO_DRAWT" )&& !val.equals("ILS_HOLD_SHORT_NO_DRAW"))
				System.out.println("Error in line - " + lineErr +": TaxiwaypointType value not expected! Expected 'NORMAL' or 'HOLD_SHORT' or  'ILS_HOLD_SHORT' or  'HOLD_SHORT_NO_DRAW' or 'ILS_HOLD_SHORT_NO_DRAW' but got " + val);
			else
				addAttribute(str.split("=")[0], str.split("=")[1].split("\"")[1]);
	}

	@Override
	public void exitTaxiwayparkingType(Airport_ParserParser.TaxiwayparkingTypeContext ctx) {

		String str = ctx.getText();
		int lineErr = ctx.getStart().getLine();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: TaxiwayparkingType value not expected! Val was: " + val);else
			if (!val.equals("NONE") && !val.equals("DOCK_GA") && !val.equals("FUEL") && !val.equals("GATE_HEAVY") && !val.equals("GATE_MEDIUM") && !val.equals("GATE_SMALL") && !val.equals("RAMP_CARGO") && !val.equals("RAMP_GA") && !val.equals("RAMP_GA_LARGE") && !val.equals("RAMP_GA_MEDIUM") && !val.equals("RAMP_GA_SMALL") && !val.equals("RAMP_MIL_CARGO") && !val.equals("RAMP_MIL_COMBAT") && !val.equals("VEHICLE"))
				System.out.println("Error in line - " + lineErr +": TaxiwayparkingType value not expected! Got " + val);
			else
				addAttribute(str.split("=")[0], str.split("=")[1].split("\"")[1]);
	}

	@Override
	public void exitTaxiwayparkingName(Airport_ParserParser.TaxiwayparkingNameContext ctx) {
		String str = ctx.getText();
		int lineErr = ctx.getStart().getLine();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: exitTaxiwayparkingName value not expected! Val was: " + val);else
			if (!val.equals("PARKING") && !val.equals("DOCK") && !val.equals("GATE") && !val.startsWith("GATE_") && !val.equals("NONE") && !val.equals("N_PARKING") && !val.equals("NE_PARKING" )&& !val.equals("NW_PARKING" )&& !val.equals("SE_PARKING" )&& !val.equals("S_PARKING") && !val.equals("SW_PARKING" )&& !val.equals("W_PARKING") && !val.equals("E_PARKING" ))
				System.out.println("Error in line - " + lineErr +": TaxiwayparkingName value not expected! Got " + val);
			else
				addAttribute(str.split("=")[0], str.split("=")[1].split("\"")[1]);
	}

	@Override
	public void exitPush_back(Airport_ParserParser.Push_backContext ctx) {
		String str = ctx.getText();
		int lineErr = ctx.getStart().getLine();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: exitPush_back value not expected! Val was: " + val);else
			if (!val.equals("NONE") && !val.equals("BOTH") && !val.equals("LEFT") && !val.equals("RIGHT" ))
				System.out.println("Error in line - " + lineErr +": Push_back value not expected! Got " + val);
			else
				addAttribute(str.split("=")[0], str.split("=")[1].split("\"")[1]);
	}

	@Override
	public void exitTaxiwayPathType(Airport_ParserParser.TaxiwayPathTypeContext ctx) {
		String str = ctx.getText();
		int lineErr = ctx.getStart().getLine();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: exitTaxiwayPathType value not expected! Val was: " + val);else
			if (!val.equals("RUNWAY") && !val.equals("PARKING") && !val.equals("TAXI") && !val.equals("PATH") && !val.equals("CLOSED") && !val.equals("VEHICLE"))
				System.out.println("Error in line - " + lineErr +": TaxiwayPathType value not expected! Got " + val);
			else
				addAttribute(str.split("=")[0], str.split("=")[1].split("\"")[1]);
	}

	@Override
	public void exitSurface(Airport_ParserParser.SurfaceContext ctx) {
		String str = ctx.getText();
		int lineErr = ctx.getStart().getLine();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: exitSurface value not expected! Val was: " + val);else
			if (!val.equals("ASPHALT" )&& !val.equals("BITUMINOUS") && !val.equals("BRICK") && !val.equals("CLAY" )&& !val.equals("CEMENT" )&& !val.equals("CONCRETE" )&& !val.equals("CORAL") && !val.equals("DIRT") && !val.equals("GRASS" )&& !val.equals("GRAVEL") && !val.equals("ICE" )&& !val.equals("MACADAM" )&& !val.equals("OIL_TREATED" )&& !val.equals("PLANKS") && !val.equals("SAND" )&& !val.equals("SHALE") && !val.equals("SNOW" )&& !val.equals("STEEL_MATS" )&& !val.equals("TARMAC") && !val.equals("UNKNOWN") && !val.equals("WATER"))
				System.out.println("Error in line - " + lineErr +": Surface value not expected! Got " + val);
			else
				addAttribute(str.split("=")[0], str.split("=")[1].split("\"")[1]);
	}

	@Override
	public void exitLeftEdgeLighted(Airport_ParserParser.LeftEdgeLightedContext ctx) {
		String str = ctx.getText();
		int lineErr = ctx.getStart().getLine();
		String val = protectedSplit(str); if(isNull(val)) val = "FALSE";
		if (!val.equals("TRUE") && !val.equals("FALSE"))
			System.out.println("Error in line - " + lineErr +": LeftEdgeLighted value not expected! Got " + val);
		else
			addAttribute(str.split("=")[0], str.split("=")[1].split("\"")[1]);
	}

	@Override
	public void exitRightEdgeLighted(Airport_ParserParser.RightEdgeLightedContext ctx) {
		String str = ctx.getText();
		int lineErr = ctx.getStart().getLine();
		String val = protectedSplit(str); if(isNull(val)) val = "FALSE";
		if (!val.equals("TRUE") && !val.equals("FALSE"))
			System.out.println("Error in line - " + lineErr +": RightEdgeLighted value not expected! Got " + val);
		else
			addAttribute(str.split("=")[0], str.split("=")[1].split("\"")[1]);
	}

	@Override
	public void exitTaxiwayPathNumber(Airport_ParserParser.TaxiwayPathNumberContext ctx) {
		String str = ctx.getText();
		int lineErr = ctx.getStart().getLine();
		int num;
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: exitTaxiwayPathNumber value not expected! Val was: " + val);
		else
			if (!val.equals("EAST") && !val.equals("NORTH") && !val.equals("NORTHEAST") && !val.equals("NORTHWEST") && !val.equals("SOUTH" )&& !val.equals("SOUTHEAST") && !val.equals("SOUTHWEST" )&& !val.equals("WEST"))
			{
				if(val.length() < 3)
				{
					num = Integer.parseInt(val);
					if(num < 0 || num > 36 )
						System.out.println("Error in line - " + lineErr +": TaxiwayPathNumber value not expected! Got " + val);
					else
						addAttribute(str.split("=")[0], str.split("=")[1].split("\"")[1]);
				}
				else
					System.out.println("Error in line - " + lineErr +": TaxiwayPathNumber value not expected! Got " + val);
			}
	}

	@Override
	public void exitNumber(Airport_ParserParser.NumberContext ctx) {
		String str = ctx.getText();
		int lineErr = ctx.getStart().getLine();
		try{


			String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: CexitRed value not expected! Val was: " + val);else
				if(val.equals("00"))
					addAttribute(str.split("=")[0], str.split("=")[1].split("\"")[1]);
			if (!val.equals("EAST") && !val.equals("NORTH") && !val.equals("NORTHEAST" )&& !val.equals("NORTHWEST") && !val.equals("SOUTH") && !val.equals("SOUTHEAST") && !val.equals("SOUTHWEST") && !val.equals("WEST"))
				if(val.startsWith("0")) {
					int value = Integer.parseInt(val);
					if (value < 0 || value > 9) {
						System.out.println("Error in line - " + lineErr +": Aprroach_Runway value out of bounds! Expected [00,09] but got " + val);
					}
					else
						addAttribute(str.split("=")[0], str.split("=")[1].split("\"")[1]);
				}
				else
				{
					int value = Integer.parseInt(val);
					if (value < 0 || value > 36)
						System.out.println("Error in line - " + lineErr +": Aprroach_Runway value out of bounds! Expected [0,36] but got " + val);
					else
						addAttribute(str.split("=")[0], str.split("=")[1].split("\"")[1]);
				}
		}
		catch(Exception e)
		{
			System.out.println("Error in line - " + lineErr +": Number value not expected! Got " + str);
		}
	}

	@Override
	public void exitDesignator(Airport_ParserParser.DesignatorContext ctx) {
		String str = ctx.getText();
		int lineErr = ctx.getStart().getLine();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: exitDesignator value not expected! Val was: " + val);else
			if (!val.equals("NONE" )&& !val.equals("C") && !val.equals("Cexit") && !val.equals("L") && !val.equals("LEFT" )&& !val.equals("R") && !val.equals("RIGHT" )&& !val.equals("W" )&& !val.equals("WATER") && !val.equals("A") && !val.equals("B"))
				System.out.println("Error in line - " + lineErr +": Designator value not expected! Got " + val);
			else
				addAttribute(str.split("=")[0], str.split("=")[1].split("\"")[1]);
	}

	@Override
	public void exitPrimaryDesignator(Airport_ParserParser.PrimaryDesignatorContext ctx) {
		String str = ctx.getText();
		int lineErr = ctx.getStart().getLine();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: exitPrimaryDesignator value not expected! Val was: " + val);else
			if (!val.equals("NONE") && !val.equals("C" )&& !val.equals("Cexit") && !val.equals("L") && !val.equals("LEFT" )&& !val.equals("R" )&& !val.equals("RIGHT") && !val.equals("W") && !val.equals("WATER") && !val.equals("A" )&& !val.equals("B"))
				System.out.println("Error in line - " + lineErr +": PrimaryDesignator value not expected! Got " + val);
			else
				addAttribute(str.split("=")[0], str.split("=")[1].split("\"")[1]);
	}

	@Override
	public void exitSecondaryDesignator(Airport_ParserParser.SecondaryDesignatorContext ctx) {
		String str = ctx.getText();
		int lineErr = ctx.getStart().getLine();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: exitSecondaryDesignator value not expected! Val was: " + val);else
			if (!val.equals("NONE") && !val.equals("C") && !val.equals("Cexit") && !val.equals("L") && !val.equals("LEFT") && !val.equals("R") && !val.equals("RIGHT") && !val.equals("W") && !val.equals("WATER" )&& !val.equals("A") && !val.equals("B"))
				System.out.println("Error in line - " + lineErr +": SecondaryDesignator value not expected! Got " + val);
			else
				addAttribute(str.split("=")[0], str.split("=")[1].split("\"")[1]);
	}

	@Override
	public void exitLength(Airport_ParserParser.LengthContext ctx) {
		String str = ctx.getText();
		int lineErr = ctx.getStart().getLine();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: exitLength value not expected! Val was: " + val);else
			if (!val.matches(altitude_value))
				System.out.println("Error in line - " + lineErr +": Length value not expected! Got " + val);
			else
				addAttribute(str.split("=")[0], str.split("=")[1].split("\"")[1]);
	}

	@Override
	public void exitPatternAltitude(Airport_ParserParser.PatternAltitudeContext ctx) {
		String str = ctx.getText();
		int lineErr = ctx.getStart().getLine();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: exitPatternAltitude value not expected! Val was: " + val);else
			if (!val.matches(altitude_value) )
				System.out.println("Error in line - " + lineErr +": PatternAltitude value not expected! Got " + val);
			else
				addAttribute(str.split("=")[0], str.split("=")[1].split("\"")[1]);
	}

	@Override
	public void exitSpacing(Airport_ParserParser.SpacingContext ctx) {
		String str = ctx.getText();
		int lineErr = ctx.getStart().getLine();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: exitSpacing value not expected! Val was: " + val);else
			if (!val.matches(altitude_value))
				System.out.println("Error in line - " + lineErr +": Spacing value not expected! Got " + val);
			else
				addAttribute(str.split("=")[0], str.split("=")[1].split("\"")[1]);
	}


	/////////////////////////////////////////////////////////////////////////////////////////////////////

	@Override
	public void exitCenter(Airport_ParserParser.CenterContext ctx) {
		String str = ctx.getText();
		int lineErr = ctx.getStart().getLine();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: exitCenter value not expected! Val was: " + val);else
			if (!val.equals("NONE") && !val.equals("LOW") && !val.equals("MEDIUM") && !val.equals("HIGH"))
				System.out.println("Error in line - " + lineErr +": Center value not expected! Got " + val);
			else
				addAttribute(str.split("=")[0], str.split("=")[1].split("\"")[1]);
	}

	@Override
	public void exitEdge(Airport_ParserParser.EdgeContext ctx) {
		String str = ctx.getText();
		int lineErr = ctx.getStart().getLine();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: exitEdge value not expected! Val was: " + val);else
			if (!val.equals("NONE") && !val.equals("LOW") && !val.equals("MEDIUM") && !val.equals("HIGH"))
				System.out.println("Error in line - " + lineErr +": Edge value not expected! Got " + val);
			else
				addAttribute(str.split("=")[0], str.split("=")[1].split("\"")[1]);
	}

	@Override
	public void exitEnd(Airport_ParserParser.EndContext ctx) {
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: exitEnd value not expected! Val was: " + val);else
			if (!val.equals("PRIMARY") && !val.equals("SECONDARY"))
				System.out.println("Error: End value not expected! Got " + val);
			else
				addAttribute(str.split("=")[0], str.split("=")[1].split("\"")[1]);
	}

	@Override
	public void exitSystem(Airport_ParserParser.SystemContext ctx) {
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: exitSystem value not expected! Val was: " + val);else
			if (!val.equals("NONE") && !val.equals("ALSF1") && !val.equals("ALSF2") && !val.equals("CALVERT") && !val.equals("CALVERT2") && !val.equals("MALS") && !val.equals("MALSF") && !val.equals("MALSR") && !val.equals("ODALS") && !val.equals("RAIL") && !val.equals("SALS") && !val.equals("SALSF") && !val.equals("SSALF") && !val.equals("SSALR") && !val.equals("SSALS"))
				System.out.println("Error: System value not expected! Got " + val);
			else
				addAttribute(str.split("=")[0], str.split("=")[1].split("\"")[1]);
	}

	@Override
	public void exitVasiType(Airport_ParserParser.VasiTypeContext ctx) {

		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: exitVasiType value not expected! Val was: " + val);else
			if (!val.equals("PAPI2") && !val.equals("PAPI4") && !val.equals("PVASI") && !val.equals("TRICOLOR") && !val.equals("TVASI" )&& !val.equals("VASI21") && !val.equals("VASI22" )&& !val.equals("VASI23" )&& !val.equals("VASI31") && !val.equals("VASI32") && !val.equals("VASI33") && !val.equals("BALL") && !val.equals("APAP") && !val.equals("PANELS"))
				System.out.println("Error: VasiType value not expected! Got " + val);
			else
				addAttribute(str.split("=")[0], str.split("=")[1].split("\"")[1]);
	}

	

	@Override
	public void exitImage_complexety(Airport_ParserParser.Image_complexetyContext ctx) {
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: exitImage_complexety value not expected! Val was: " + val);else
			if (!val.equals("VERY_SPARSE") && !val.equals("SPARSE") && !val.equals("NORMAL") && !val.equals("DENSE" )&& !val.equals("VERY_DENSE"))
				System.out.println("Error: Image_complexety value not expected! Got " + val);
			else
				addAttribute(str.split("=")[0], str.split("=")[1].split("\"")[1]);
	}

	@Override
	public void exitFuel_type(Airport_ParserParser.Fuel_typeContext ctx) {
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: exitFuel_type value not expected! Val was: " + val);else
			if (!val.equals("73") && !val.equals("87") && !val.equals("100") && !val.equals("130") && !val.equals("145") && !val.equals("MOGAS") && !val.equals("JET") && !val.equals("JETA") && !val.equals("JETA1") && !val.equals("JETAP") && !val.equals("JETB") && !val.equals("JET4") && !val.equals("JET5") && !val.equals("UNKNOWN"))
				System.out.println("Error: Fuel_type value not expected! Got " + val);
			else
				addAttribute(str.split("=")[0], str.split("=")[1].split("\"")[1]);
	}

		@Override
	public void exitTaxiwayPathStart(Airport_ParserParser.TaxiwayPathStartContext ctx)
	{
		String str = ctx.getText();
		try{
			Double val = Double.parseDouble(str.split("=")[1].split("\"")[1]);
			if (val >= 255 || val < 0)
				System.out.println("Error: exitTaxiwayPathStart value not expected! Got " + val);
			else
				addAttribute(str.split("=")[0], str.split("=")[1].split("\"")[1]);

		}
		catch (Exception e)
		{
			System.out.println("Error: exitTaxiwayPathStart value not expected! Got " + str);
		}
	}

	@Override
	public void exitIdent(Airport_ParserParser.IdentContext ctx) {
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: exitIdent value not expected! Val was: " + val);else
			if(!val.matches(ident))
				System.out.println("Error: Ident value not expected! Got " + val);
			else//valid value
			{
				addAttribute(str.split("=")[0], str.split("=")[1].split("\"")[1]);	

			}
	}

	@Override
	public void exitPitch(Airport_ParserParser.PitchContext ctx)
	{
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: exitPitch value not expected! Val was: " + val);else
			if(!val.matches(heading))
				System.out.println("Error: Pitch value not expected! Got " + val);
			else
				addAttribute(str.split("=")[0], str.split("=")[1].split("\"")[1]);
	}

	@Override
	public void exitIndex(Airport_ParserParser.IndexContext ctx) {
		String str = ctx.getText();
		
		try
		{
			Double val = Double.parseDouble(str.split("=")[1].split("\"")[1]);
			if (val >= 3999 || val <= 0)
				System.out.println("Error: exitIndex value not expected! Got " + val);
			else
				addAttribute(str.split("=")[0], str.split("=")[1].split("\"")[1]);

		}
		catch (Exception e)
		{
			System.out.println("Error: Index value not expected! Got "+str);
		}
	}

	@Override
	public void exitBiasX(Airport_ParserParser.BiasXContext ctx)
	{
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: exitBiasX value not expected! Val was: " + val);else
			if(!val.matches(altitude_value))
				System.out.println("Error: exitBiasX value not expected! Got " + val);
			else
				addAttribute(str.split("=")[0], str.split("=")[1].split("\"")[1]);
	}

	@Override
	public void exitRange(Airport_ParserParser.RangeContext ctx){
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: exitRange value not expected! Val was: " + val);else
			if(!val.matches(altitude_value))
				System.out.println("Error: exitRange value not expected! Got " + val);
			else
				addAttribute(str.split("=")[0], str.split("=")[1].split("\"")[1]);
	}

	@Override
	public void exitBiasY(Airport_ParserParser.BiasYContext ctx)
	{
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: exitBiasY value not expected! Val was: " + val);else
			if(!val.matches(altitude_value))
				System.out.println("Error: exitBiasY value not expected! Got " + val);
			else
				addAttribute(str.split("=")[0], str.split("=")[1].split("\"")[1]);
	}

	@Override
	public void exitBiasZ(Airport_ParserParser.BiasZContext ctx)
	{
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: exitBiasZ value not expected! Val was: " + val);else
			if(!val.matches(altitude_value))
				System.out.println("Error: exitBiasZ value not expected! Got " + val);
			else
				addAttribute(str.split("=")[0], str.split("=")[1].split("\"")[1]);
	}

	@Override
	public void exitHeading(Airport_ParserParser.HeadingContext ctx)
	{
		String str = ctx.getText();
		try
		{

			String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: exitHeading value not expected! Val was: " + val);else
				if(!val.matches(heading))
					System.out.println("Error: exitHeading value not expected! Got " + val);
				else
					addAttribute(str.split("=")[0], str.split("=")[1].split("\"")[1]);
		}
		catch(Exception e)
		{
			System.out.println("Error: exitHeading value not expected! Got " + str);
		}
	}
	@Override
	public void exitLattitude(Airport_ParserParser.LattitudeContext ctx) {
		String str = ctx.getText();
		Double val = Double.parseDouble(str.split("=")[1].split("\"")[1]);
		if (val >= 90 || val <= -90)
			System.out.println("Error: exitLattitude value not expected! Got " + val);
		else
			addAttribute(str.split("=")[0], str.split("=")[1].split("\"")[1]);
	}
	@Override
	public void exitMagvar(Airport_ParserParser.MagvarContext ctx) {
		String str = ctx.getText();
		Double val = Double.parseDouble(str.split("=")[1].split("\"")[1]);
		if (val >= 360 || val <= -360)
			System.out.println("Error: exitMagvar value not expected! Got " + val);
		else
			addAttribute(str.split("=")[0], str.split("=")[1].split("\"")[1]);
	}
	@Override
	public void exitWidth(Airport_ParserParser.WidthContext ctx)
	{
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: exitWidth value not expected! Val was: " + val);else
			if(!val.matches(altitude_value))
				System.out.println("Error: exitWidth value not expected! Got " + val);
			else
				addAttribute(str.split("=")[0], str.split("=")[1].split("\"")[1]);
	}
	@Override
	public void exitCenterLineLighted(Airport_ParserParser.CenterLineLightedContext ctx){
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: exitCenterLineLighted value not expected! Val was: " + val);else
			if (!val.equals("TRUE") && !val.equals("FALSE"))
				System.out.println("Error: exitCenterLineLighted value not expected! Got " + val);
			else
				addAttribute(str.split("=")[0], str.split("=")[1].split("\"")[1]);
	}

	@Override
	public void exitFrequency(Airport_ParserParser.FrequencyContext ctx){
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: exitFrequency value not expected! Val was: " + val);else
			if(!val.matches(floatnumber))
				System.out.println("Error: exitFrequency value not expected! Got " + val);
			else
				addAttribute(str.split("=")[0], str.split("=")[1].split("\"")[1]);
	}
	@Override
	public void exitTeeOffSet3(Airport_ParserParser.TeeOffSet3Context ctx) {
		String str = ctx.getText();
		Double val = Double.parseDouble(str.split("=")[1].split("\"")[1]);
		if (val >= 0.0 || val <= 50.0)
			System.out.println("Error: exitTeeOffSet3 value not expected! Got " + val);
		else
			addAttribute(str.split("=")[0], str.split("=")[1].split("\"")[1]);
	}
	@Override
	public void exitTeeOffSet4(Airport_ParserParser.TeeOffSet4Context ctx){
		String str = ctx.getText();
		Double val = Double.parseDouble(str.split("=")[1].split("\"")[1]);
		if (val >= 0.0 || val <= 50.0)
			System.out.println("Error: exitTeeOffSet4 value not expected! Got " + val);
		else
			addAttribute(str.split("=")[0], str.split("=")[1].split("\"")[1]);
	}
	@Override
	public void exitTeeOffSet1(Airport_ParserParser.TeeOffSet1Context ctx){
		String str = ctx.getText();
		Double val = Double.parseDouble(str.split("=")[1].split("\"")[1]);
		if (val >= 0.0 || val <= 50.0)
			System.out.println("Error: exitTeeOffSet1 value not expected! Got " + val);
		else
			addAttribute(str.split("=")[0], str.split("=")[1].split("\"")[1]);
	}
	@Override
	public void exitTeeOffSet2(Airport_ParserParser.TeeOffSet2Context ctx){
		String str = ctx.getText();
		Double val = Double.parseDouble(str.split("=")[1].split("\"")[1]);
		if (val >= 0.0 || val <= 50.0)
			System.out.println("Error: exitTeeOffSet2 value not expected! Got " + val);
		else
			addAttribute(str.split("=")[0], str.split("=")[1].split("\"")[1]);
	}
	@Override
	public void exitLongitude(Airport_ParserParser.LongitudeContext ctx) {
		String str = ctx.getText();
		Double val = Double.parseDouble(str.split("=")[1].split("\"")[1]);
		if (val >= 180 || val <= -180)
			System.out.println("Error: exitLongitude value not expected! Got " + val);
		else
			addAttribute(str.split("=")[0], str.split("=")[1].split("\"")[1]);
	}

	@Override
	public void exitDrawSurface(Airport_ParserParser.DrawSurfaceContext ctx)	{
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: exitDrawSurface value not expected! Val was: " + val);else
			if (!val.equals("TRUE") && !val.equals("FALSE"))
				System.out.println("Error: exitdrawSurface value not expected! Got " + val);
			else
				addAttribute(str.split("=")[0], str.split("=")[1].split("\"")[1]);
	}
	@Override
	public void exitIdent_ils(Airport_ParserParser.Ident_ilsContext ctx) {
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: exitIdent_ils value not expected! Val was: " + val);else
			if(!val.matches(ident))
				System.out.println("Error: exitIdent_ils value not expected! Got " + val);
			else
				addAttribute(str.split("=")[0], str.split("=")[1].split("\"")[1]);
	}
	@Override
	public void exitCenterLine(Airport_ParserParser.CenterLineContext ctx){
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: exitCenterLine value not expected! Val was: " + val);else
			if (!val.equals("TRUE") && !val.equals("FALSE"))
				System.out.println("Error: exitCenterLine value not expected! Got " + val);
			else
				addAttribute(str.split("=")[0], str.split("=")[1].split("\"")[1]);
	}
	@Override
	public void exitDrawDetail(Airport_ParserParser.DrawDetailContext ctx)  {
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: exitDrawDetail value not expected! Val was: " + val);else
			if (!val.equals("TRUE") && !val.equals("FALSE"))
				System.out.println("Error: exitDrawDetail value not expected! Got " + val);
			else
				addAttribute(str.split("=")[0], str.split("=")[1].split("\"")[1]);
	}
	@Override
	public void exitTaxiwayPathEnd(Airport_ParserParser.TaxiwayPathEndContext ctx)	{
		String str = ctx.getText();
		try{
			Double val = Double.parseDouble(str.split("=")[1].split("\"")[1]);
			if (val >= 255 || val < 0)
				System.out.println("Error: exitTaxiwayPathEnd value not expected! Got " + val);
			else
				addAttribute(str.split("=")[0], str.split("=")[1].split("\"")[1]);
		}
		catch(Exception e)
		{
			System.out.println("Error: exitTaxiwayPathEnd value not expected! Got " + str);
		}
	}
	@Override
	public void exitWeightLimit(Airport_ParserParser.WeightLimitContext ctx)	{
		String str = ctx.getText();
		Double val = Double.parseDouble(str.split("=")[1].split("\"")[1]);
		if (val < 0)
			System.out.println("Error: exitWeightLimit value not expected! Got " + val);
		else
			addAttribute(str.split("=")[0], str.split("=")[1].split("\"")[1]);
	}

	@Override
	public void exitRegion(Airport_ParserParser.RegionContext ctx) {
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: exitRegion value not expected! Val was: " + val);else
			if(!val.matches(str) && val.length()>48)
				System.out.println("Error: exitRegion value out of bounds! Val size must be minor then 48 but was " + val.length());
			else
				addAttribute(str.split("=")[0], str.split("=")[1].split("\"")[1]);
		//  else
		//	airportAttributs.put("region", val);
	}

	@Override
	public void exitCity(Airport_ParserParser.CityContext ctx) {
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: exitCity value not expected! Val was: " + val);else
			if(!val.matches(string) && val.length()>48)
				System.out.println("Error: exitCity value out of bounds! Val size must be minor then 48 but was " + val.length());
			else
				addAttribute(str.split("=")[0], str.split("=")[1].split("\"")[1]);
		//      else
		//    	airportAttributs.put("city", val);
	}

	@Override
	public void exitCountry(Airport_ParserParser.CountryContext ctx) {
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: exitCountry value not expected! Val was: " + val);else
			if(!val.matches(str) && val.length()>48)
				System.out.println("Error: exitCountry value out of bounds! Val size must be minor then 48 but was " + val.length());
			else
				addAttribute(str.split("=")[0], str.split("=")[1].split("\"")[1]);
		//  else
		//	airportAttributs.put("country", val);
	}

	@Override
	public void exitState(Airport_ParserParser.StateContext ctx) {
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: exitState value not expected! Val was: " + val);else
			if(!val.matches(str) && val.length()>48)
				System.out.println("Error: exitState value out of bounds! Val size must be minor then 48 but was " + val.length());
			else
				addAttribute(str.split("=")[0], str.split("=")[1].split("\"")[1]);
		//       else
		//     	airportAttributs.put("state", val);
	}

	@Override
	public void exitName(Airport_ParserParser.NameContext ctx) {
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: exitName value not expected! Val was: " + val);else
			if(!val.matches(str) && val.length()>48)
				System.out.println("Error: exitName value out of bounds! Val size must be minor then 48 but was " + val.length());
			else
				addAttribute(str.split("=")[0], str.split("=")[1].split("\"")[1]);
		//airportAttributs.put("name", val);
	}

	@Override
	public void exitInstanceId(Airport_ParserParser.InstanceIdContext ctx) {
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: exitInstanceId value not expected! Val was: " + val);else
			if(!val.matches(str) && val.length()>48){
				System.out.println("Error: exitName value out of bounds! Val size must be minor then 48 but was " + val.length());
			}
			else
				addAttribute(str.split("=")[0], str.split("=")[1].split("\"")[1]);
	}

	@Override
	public void exitPrimaryTakeoff(Airport_ParserParser.PrimaryTakeoffContext ctx) {
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) addAttribute(str.split("=")[0], "TRUE");
		else if (!val.equals("YES") && !val.equals("NO") && !val.equals("TRUE") && !val.equals("FALSE"))
			System.out.println("Error: exitPrimaryTakeoff value not expected! Val was: " + val);
		else
			addAttribute(str.split("=")[0], str.split("=")[1].split("\"")[1]);
	}

	@Override
	public void exitPrimaryLanding(Airport_ParserParser.PrimaryLandingContext ctx) {
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) addAttribute(str.split("=")[0], "TRUE");
		else if (!val.equals("YES") && !val.equals("NO") && !val.equals("TRUE") && !val.equals("FALSE"))
			System.out.println("Error: exitPrimaryLanding value not expected! Val was: " + val);
		else
			addAttribute(str.split("=")[0], str.split("=")[1].split("\"")[1]);
	}

	@Override
	public void exitPrimaryPattern(Airport_ParserParser.PrimaryPatternContext ctx) {
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) addAttribute(str.split("=")[0], "LEFT");
		else if (!val.equals("LEFT") && !val.equals("RIGHT"))
			System.out.println("Error: exitPrimaryPattern value not expected! Val was: " + val);
		else
			addAttribute(str.split("=")[0], str.split("=")[1].split("\"")[1]);
	}

	@Override
	public void exitSecondaryTakeoff(Airport_ParserParser.SecondaryTakeoffContext ctx) {
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) addAttribute(str.split("=")[0], "TRUE");
		else if (!val.equals("YES") && !val.equals("NO") && !val.equals("TRUE") && !val.equals("FALSE"))
			System.out.println("Error: exitSecondaryTakeoff value not expected! Val was: " + val);
		else
			addAttribute(str.split("=")[0], str.split("=")[1].split("\"")[1]);
	}

	@Override
	public void exitSecondaryLanding(Airport_ParserParser.SecondaryLandingContext ctx) {
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) val = "TRUE";
		if (!val.equals("YES") && !val.equals("NO") && !val.equals("TRUE") && !val.equals("FALSE"))
			System.out.println("Error: exitSecondaryLanding value not expected! Val was: " + val);
		else
			addAttribute(str.split("=")[0], val);
	}

	@Override
	public void exitSecondaryPattern(Airport_ParserParser.SecondaryPatternContext ctx) {
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) val = "LEFT";
		if (!val.equals("LEFT") && !val.equals("RIGHT"))
			System.out.println("Error: exitSecondaryPattern value not expected! Val was: " + val);
		else
			addAttribute(str.split("=")[0], val);
	}

	@Override
	public void exitPrimaryMarkingBias(Airport_ParserParser.PrimaryMarkingBiasContext ctx) {
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: exitPrimaryMarkingBias value not expected! Val was: " + val);else
			if (!val.matches(trafficScallar))
				System.out.println("Error: exitPrimaryMarkingBias value not expected! Val was: " + val);
			else
				addAttribute(str.split("=")[0], str.split("=")[1].split("\"")[1]);
	}

	@Override
	public void exitSecondaryMarkingBias(Airport_ParserParser.SecondaryMarkingBiasContext ctx) {
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: exitSecondaryMarkingBias value not expected! Val was: " + val);else
			if (!val.matches(trafficScallar))
				System.out.println("Error: exitSecondaryMarkingBias value not expected! Val was: " + val);
			else
				addAttribute(str.split("=")[0], str.split("=")[1].split("\"")[1]);
	}

	@Override
	public void exitAlternateThreshold(Airport_ParserParser.AlternateThresholdContext ctx) {
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: exitAlternateThreshold value not expected! Val was: " + val);else
			if (!val.equals("TRUE") && !val.equals("FALSE"))
				System.out.println("Error: exitAlternateThreshold value not expected! Val was: " + val);
			else
				addAttribute(str.split("=")[0], str.split("=")[1].split("\"")[1]);
	}

	@Override
	public void exitAlternateTouchdown(Airport_ParserParser.AlternateTouchdownContext ctx) {
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: exitAlternateTouchdown value not expected! Val was: " + val);else
			if (!val.equals("TRUE") && !val.equals("FALSE"))
				System.out.println("Error: exitAlternateTouchdown value not expected! Val was: " + val);
			else
				addAttribute(str.split("=")[0], str.split("=")[1].split("\"")[1]);
	}

	@Override
	public void exitAlternateFixedDistance(Airport_ParserParser.AlternateFixedDistanceContext ctx) {
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: exitAlternateFixedDistance value not expected! Val was: " + val);else
			if (!val.equals("TRUE") && !val.equals("FALSE"))
				System.out.println("Error: exitAlternateFixedDistance value not expected! Val was: " + val);
			else
				addAttribute(str.split("=")[0], str.split("=")[1].split("\"")[1]);
	}

	@Override
	public void exitAlternatePrecision(Airport_ParserParser.AlternatePrecisionContext ctx) {
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: exitAlternatePrecision value not expected! Val was: " + val);else
			if (!val.equals("TRUE") && !val.equals("FALSE"))
				System.out.println("Error: exitAlternatePrecision value not expected! Val was: " + val);
			else
				addAttribute(str.split("=")[0], str.split("=")[1].split("\"")[1]);
	}

	@Override
	public void exitLeadingZeroIdent(Airport_ParserParser.LeadingZeroIdentContext ctx) {
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: exitLeadingZeroIdent value not expected! Val was: " + val);else
			if (!val.equals("TRUE") && !val.equals("FALSE"))
				System.out.println("Error: exitLeadingZeroIdent value not expected! Val was: " + val);
			else
				addAttribute(str.split("=")[0], str.split("=")[1].split("\"")[1]);
	}

	@Override
	public void exitNoThresholdEndArrows(Airport_ParserParser.NoThresholdEndArrowsContext ctx) {
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: exitNoThresholdEndArrows value not expected! Val was: " + val);else
			if (!val.equals("TRUE") && !val.equals("FALSE"))
				System.out.println("Error: exitNoThresholdEndArrows value not expected! Val was: " + val);
			else
				addAttribute(str.split("=")[0], str.split("=")[1].split("\"")[1]);
	}

	@Override
	public void exitEdges(Airport_ParserParser.EdgesContext ctx) {
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: exitEdges value not expected! Val was: " + val);else
			if (!val.equals("TRUE") && !val.equals("FALSE"))
				System.out.println("Error: exitEdges value not expected! Val was: " + val);
			else
				addAttribute(str.split("=")[0], str.split("=")[1].split("\"")[1]);
	}

	@Override
	public void exitThreshold(Airport_ParserParser.ThresholdContext ctx) {
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: exitThreshold value not expected! Val was: " + val);else
			if (!val.equals("TRUE") && !val.equals("FALSE"))
				System.out.println("Error: exitThreshold value not expected! Val was: " + val);
			else
				addAttribute(str.split("=")[0], str.split("=")[1].split("\"")[1]);
	}

	@Override
	public void exitFixed(Airport_ParserParser.FixedContext ctx) {
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: exitFixed value not expected! Val was: " + val);else
			if (!val.equals("TRUE") && !val.equals("FALSE"))
				System.out.println("Error: exitFixed value not expected! Val was: " + val);
			else
				addAttribute(str.split("=")[0], str.split("=")[1].split("\"")[1]);
	}

	@Override
	public void exitTouchdown(Airport_ParserParser.TouchdownContext ctx) {
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: exitTouchdown value not expected! Val was: " + val);else
			if (!val.equals("TRUE") && !val.equals("FALSE"))
				System.out.println("Error: exitTouchdown value not expected! Val was: " + val);
			else
				addAttribute(str.split("=")[0], str.split("=")[1].split("\"")[1]);
	}

	@Override
	public void exitDashes(Airport_ParserParser.DashesContext ctx) {
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: exitDashes value not expected! Val was: " + val);else
			if (!val.equals("TRUE") && !val.equals("FALSE"))
				System.out.println("Error: exitDashes value not expected! Val was: " + val);
			else
				addAttribute(str.split("=")[0], str.split("=")[1].split("\"")[1]);
	}

	@Override
	public void exitIdent_Marking(Airport_ParserParser.Ident_MarkingContext ctx) {
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: exitIdent_Marking value not expected! Val was: " + val);else
			if (!val.equals("TRUE") && !val.equals("FALSE"))
				System.out.println("Error: exitIdent_Marking value not expected! Val was: " + val);
			else
				addAttribute(str.split("=")[0], str.split("=")[1].split("\"")[1]);
	}

	@Override
	public void exitPrecision(Airport_ParserParser.PrecisionContext ctx) {
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: exitPrecision value not expected! Val was: " + val);else
			if (!val.equals("TRUE") && !val.equals("FALSE"))
				System.out.println("Error: exitPrecision value not expected! Val was: " + val);
			else
				addAttribute(str.split("=")[0], str.split("=")[1].split("\"")[1]);
	}

	@Override
	public void exitEdgePavement(Airport_ParserParser.EdgePavementContext ctx) {
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: exitEdgePavement value not expected! Val was: " + val);else
			if (!val.equals("TRUE") && !val.equals("FALSE"))
				System.out.println("Error: exitEdgePavement value not expected! Val was: " + val);
			else
				addAttribute(str.split("=")[0], str.split("=")[1].split("\"")[1]);
	}

	@Override
	public void exitSingleEnd(Airport_ParserParser.SingleEndContext ctx) {
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: exitSingleEnd value not expected! Val was: " + val);else
			if (!val.equals("TRUE") && !val.equals("FALSE"))
				System.out.println("Error: exitSingleEnd value not expected! Val was: " + val);
			else
				addAttribute(str.split("=")[0], str.split("=")[1].split("\"")[1]);
	}

	@Override
	public void exitPrimaryClosed(Airport_ParserParser.PrimaryClosedContext ctx) {
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: exitPrimaryClosed value not expected! Val was: " + val);else
			if (!val.equals("TRUE") && !val.equals("FALSE"))
				System.out.println("Error: exitPrimaryClosed value not expected! Val was: " + val);
			else
				addAttribute(str.split("=")[0], str.split("=")[1].split("\"")[1]);
	}

	@Override
	public void exitSecondaryClosed(Airport_ParserParser.SecondaryClosedContext ctx) {
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: exitSecondaryClosed value not expected! Val was: " + val);else
			if (!val.equals("TRUE") && !val.equals("FALSE"))
				System.out.println("Error: exitSecondaryClosed value not expected! Val was: " + val);
			else
				addAttribute(str.split("=")[0], str.split("=")[1].split("\"")[1]);
	}

	@Override
	public void exitPrimaryStol(Airport_ParserParser.PrimaryStolContext ctx) {
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: exitPrimaryStol value not expected! Val was: " + val);else
			if (!val.equals("TRUE") && !val.equals("FALSE"))
				System.out.println("Error: exitPrimaryStol value not expected! Val was: " + val);
			else
				addAttribute(str.split("=")[0], str.split("=")[1].split("\"")[1]);
	}

	@Override
	public void exitSecondaryStol(Airport_ParserParser.SecondaryStolContext ctx) {
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: exitSecondaryStol value not expected! Val was: " + val);else
			if (!val.equals("TRUE") && !val.equals("FALSE"))
				System.out.println("Error: exitSecondaryStol value not expected! Val was: " + val);
			else
				addAttribute(str.split("=")[0], str.split("=")[1].split("\"")[1]);
	}

	@Override
	public void exitBackCourse(Airport_ParserParser.BackCourseContext ctx) {
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: exitBackCourse value not expected! Val was: " + val);else
			if (!val.equals("TRUE") && !val.equals("FALSE"))
				System.out.println("Error: exitBackCourse value not expected! Val was: " + val);
			else
				addAttribute(str.split("=")[0], str.split("=")[1].split("\"")[1]);
	}

	@Override
	public void exitCenterRed(Airport_ParserParser.CenterRedContext ctx) {
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: exitCenterRed value not expected! Val was: " + val);
		else
			if (!val.equals("TRUE") && !val.equals("FALSE"))
				System.out.println("Error: exitCenterRed value not expected! Val was: " + val);
			else
				addAttribute(str.split("=")[0], str.split("=")[1].split("\"")[1]);
	}

	@Override
	public void exitStrobes(Airport_ParserParser.StrobesContext ctx) {
		String str = ctx.getText();
		try
		{
			String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: exitStrobes value not expected! Val was: " + val);else
				if (!val.matches(unsigned_int))
					System.out.println("Error: exitStrobes value not expected! Val was: " + val);
				else
					addAttribute(str.split("=")[0], str.split("=")[1].split("\"")[1]);
		}
		catch(Exception e)
		{

			System.out.println("Error: exitStrobes value not expected! Val was: " + str);
		}
	}

	@Override
	public void exitAltitude(Airport_ParserParser.AltitudeContext ctx) {
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: exitAltitude value not expected! Val was: " + val);else
			if (!val.matches(altitude_value))
				System.out.println("Error: exitAltitude value not expected! Val was: " + val);
			else
				addAttribute(str.split("=")[0], str.split("=")[1].split("\"")[1]);
	}

	@Override
	public void exitAirportTestRadius(Airport_ParserParser.AirportTestRadiusContext ctx) {
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: exitAirportTestRadius value not expected! Val was: " + val);else
			if (!val.matches(altitude_value))
				System.out.println("Error: exitAirportTestRadius value not expected! Val was: " + val);
			else
				addAttribute(str.split("=")[0], str.split("=")[1].split("\"")[1]);
	}

	@Override
	public void exitRadius(Airport_ParserParser.RadiusContext ctx) {
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: exitRadius value not expected! Val was: " + val);else
			if (!val.matches(altitude_value))
				System.out.println("Error: exitRadius value not expected! Val was: " + val);
			else
				addAttribute(str.split("=")[0], str.split("=")[1].split("\"")[1]);
	}

	@Override
	public void exitTaxiwayparkingNumber(Airport_ParserParser.TaxiwayparkingNumberContext ctx) {
		String str = ctx.getText();
		Double val = Double.parseDouble(str.split("=")[1].split("\"")[1]);
		if (val >= 3999 || val < 0)
			System.out.println("Error: exitTaxiwayparkingNumber value out of bounds! Expected [0,3999] but got " + val);
		else
			addAttribute(str.split("=")[0], str.split("=")[1].split("\"")[1]);
	}

	@Override
	public void exitAvailability(Airport_ParserParser.AvailabilityContext ctx) {
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: exitCenterRed value not expected! Val was: " + val);else
			if (!val.equals("YES") && !val.equals("NO") && !val.equals("UNKNOWN") &&  !val.equals("PRIOR_REQUEST"))
				System.out.println("Error: exitAvailability value out of bounds! Expected [0,3999] but got " + val);
			else
				addAttribute(str.split("=")[0], str.split("=")[1].split("\"")[1]);
	}

	@Override
	public void exitRunway_start(Airport_ParserParser.Runway_startContext ctx) {
		airportElements.put("Runway_start"+runwayStartCounter.toString(), "Airport"+airportCounter.toString());
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: exitRunway_start value not expected! Val was: " + val);else
			if (!val.equals("RUNWAY"))
				System.out.println("Error: exitRunway_start value not expected! Got " + val);
			else
				addAttribute(str.split("=")[0], str.split("=")[1].split("\"")[1]);
	}

	
	@Override
	public void exitHelipad(Airport_ParserParser.HelipadContext ctx) {
		airportElements.put("Helipad"+helipadCounter.toString(), "Airport"+airportCounter.toString());
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: exitHelipad value not expected! Val was: " + val);else
			if (!val.matches(altitude_value))
				System.out.println("Error: exitHelipad value not expected! Got " + val);
			else
				addAttribute(str.split("=")[0], str.split("=")[1].split("\"")[1]);
	}

	public String protectedSplit(String str)
	{
		try{
			return str.split("=")[1].split("\"")[1];
		}
		catch(Exception e)
		{
			return null;
		}
	}


	public boolean isNull(String str)
	{
		try{
			if(str.equals("something"))
				return false;
			else
				return false;
		}
		catch(Exception e)
		{
			return true;
		}
	}


	public void addAttribute(String attName, String attValue)
	{
		Map<String, String> value = new HashMap<String,String>();
		value.put(attName,attValue);
		switch (receivingAttributs) {
		case "Airport":
			if(airportAttributs.containsKey("Airport"+airportCounter.toString()))
			{
				value = airportAttributs.get("Airport"+airportCounter.toString());
				value.put(attName, attValue);
			}
			else
				airportAttributs.put("Airport"+airportCounter.toString(), value);
			break;
		case "Tower":
			if(towerAttributs.containsKey("Tower"+towerCounter.toString()))
			{
				value = towerAttributs.get("Tower"+towerCounter.toString());
				value.put(attName, attValue);
			}
			else
				towerAttributs.put("Tower"+towerCounter.toString(), value);
			break;
		case "Runway":
			if(runwayAttributs.containsKey("Runway"+runwayCounter.toString().toString()))
			{
				value = runwayAttributs.get("Runway"+runwayCounter.toString().toString());
				value.put(attName, attValue);
			}
			else
				runwayAttributs.put("Runway"+runwayCounter.toString(), value);
			break;
		case "Runway_alias":
			if(runwayAliasAttributs.containsKey("Runway_alias"+runwayAliasCounter.toString()))
			{
				value = runwayAliasAttributs.get("Runway_alias"+runwayAliasCounter.toString());
				value.put(attName, attValue);
			}
			else
				runwayAliasAttributs.put("Runway_alias"+runwayAliasCounter.toString(), value);
			break;
		case "Helipad":
			if(helipadAttributs.containsKey("Helipad"+helipadCounter .toString()))
			{
				value = helipadAttributs.get("Helipad"+helipadCounter .toString());
				value.put(attName, attValue);
			}
			else
				helipadAttributs.put("Helipad"+helipadCounter .toString(), value);
			break;
		case "Runway_start":
			if(runway_startAttributs.containsKey("Runway_start"+runwayStartCounter.toString()))
			{
				value = runway_startAttributs.get("Runway_start"+runwayStartCounter.toString());
				value.put(attName, attValue);
			}
			else
				runway_startAttributs.put("Runway_start"+runwayStartCounter.toString(), value);
			break;
		case "TaxiwayPoint":
			if(taxiwayPointAttributs.containsKey("TaxiwayPoint"+taxiwayPointCounter.toString()))
			{
				value = taxiwayPointAttributs.get("TaxiwayPoint"+taxiwayPointCounter.toString());
				value.put(attName, attValue);
			}
			else
				taxiwayPointAttributs.put("TaxiwayPoint"+taxiwayPointCounter.toString(),value);
			break;
		case "TaxiwayParking":
			if(taxiwayParkingAttributs.containsKey("TaxiwayParking"+taxiwayParkingCounter.toString()))
			{
				value = taxiwayParkingAttributs.get("TaxiwayParking"+taxiwayParkingCounter.toString());
				value.put(attName, attValue);
			}
			else
				taxiwayParkingAttributs.put("TaxiwayParking"+taxiwayParkingCounter.toString(), value);
			break;
		case "TaxiwayName":
			if(taxiwayNameAttributs.containsKey("TaxiwayName"+taxiNameCounter.toString()))
			{
				value = taxiwayNameAttributs.get("TaxiwayName"+taxiNameCounter.toString());
				value.put(attName, attValue);
			}
			else
				taxiwayNameAttributs.put("TaxiwayName"+taxiNameCounter.toString(), value);
			break;
		case "TaxiwayPath":
			if(taxiwayPointAttributs.containsKey("TaxiwayPath"+taxiwayPathCounter.toString()))
			{
				value = taxiwayPointAttributs.get("TaxiwayPath"+taxiwayPathCounter.toString());
				value.put(attName, attValue);
			}
			else
				taxiwayPathAttributs.put("TaxiwayPath"+taxiwayPathCounter.toString(), value);
			break;
		case "Lights":
			if(lightsAttributs.containsKey("Lights"+lightsCounter.toString()))
			{
				value = lightsAttributs.get("Lights"+lightsCounter.toString());
				value.put(attName, attValue);
			}
			else
				lightsAttributs.put("Lights"+lightsCounter.toString(), value);
			break;
		case "OffsetThreshold":
			if(offsetThresholdAttributs.containsKey("OffsetThreashold"+offsetThresholdCounter.toString()))
			{
				value = offsetThresholdAttributs.get("OffsetThreashold"+offsetThresholdCounter.toString());
				value.put(attName, attValue);
			}
			else
				offsetThresholdAttributs.put("OffsetThreashold"+offsetThresholdCounter.toString(), value);
			break;
		case "BlastPad":
			if(blastPadAttributs.containsKey("BlastPad"+blastPadCounter.toString()))
			{
				value = blastPadAttributs.get("BlastPad"+blastPadCounter.toString());
				value.put(attName, attValue);
			}
			else
				blastPadAttributs.put("BlastPad"+blastPadCounter.toString(), value);
			break;
		case "Overrun":
			if(overrunAttributs.containsKey("Overrun"+overrunCounter.toString()))
			{
				value = overrunAttributs.get("Overrun"+overrunCounter.toString());
				value.put(attName, attValue);
			}
			else
				overrunAttributs.put("Overrun"+overrunCounter.toString(), value);
			break;
		case "ApproachLights":
			if(approachLightsAttributs.containsKey("ApproachLights"+approachLightsCounter.toString()))
			{
				value = approachLightsAttributs.get("ApproachLights"+approachLightsCounter.toString());
				value.put(attName, attValue);
			}
			else
				approachLightsAttributs.put("ApproachLights"+approachLightsCounter.toString(), value);
			break;
		case "Vasi":
			if(vasiAttributs.containsKey("Vasi"+vasiCounter.toString()))
			{
				value = vasiAttributs.get("Vasi"+vasiCounter.toString());
				value.put(attName, attValue);
			}
			else
				vasiAttributs.put("Vasi"+vasiCounter.toString(), value);
			break;
		case "Visual_model":
			if(visualModelAttributs.containsKey("Visual_model"+visualModelCounter.toString()))
			{
				value = visualModelAttributs.get("Visual_model"+visualModelCounter.toString());
				value.put(attName, attValue);
			}
			else
				visualModelAttributs.put("Visual_model"+visualModelCounter.toString(), value);
			break;
		case "Glide_slope":
			if(glide_scopeAttributs.containsKey("Glide_scope"+glideSlopeCounter.toString()))
			{
				value = glide_scopeAttributs.get("Glide_scope"+glideSlopeCounter.toString());
				value.put(attName, attValue);
			}
			else
				glide_scopeAttributs.put("Glide_scope"+glideSlopeCounter.toString(), value);
			break;
		case "Dme":
			if(dmeAttributs.containsKey("DME"+dmeCounter.toString()))
			{
				value = dmeAttributs.get("DME"+dmeCounter.toString());
				value.put(attName, attValue);
			}
			else
				dmeAttributs.put("DME"+dmeCounter.toString(), value);
			break;
		case "Fuel":
			if(fuelAttributs.containsKey("Fuel"+fuelCounter.toString()))
			{
				value = fuelAttributs.get("Fuel"+fuelCounter.toString());
				value.put(attName, attValue);
			}
			else
				fuelAttributs.put("Fuel"+fuelCounter.toString(), value);
			break;
		case  "Vertex":
			if(vertexAttributs.containsKey("Vertex"+vertexCounter.toString()))
			{
				value = vertexAttributs.get("Vertex"+vertexCounter.toString());
				value.put(attName, attValue);
			}
			else
				vertexAttributs.put("Vertex"+vertexCounter.toString(), value);
			break;
		case "Ils":
			if(ilsAttributs.containsKey("Ils"+ilsCounter.toString()))
			{
				value = vertexAttributs.get("Ils"+ilsCounter.toString());
				value.put(attName, attValue);
			}
			else
				vertexAttributs.put("Ils"+ilsCounter.toString(), value);
			break;
		default:
			break;
		}
	}
}