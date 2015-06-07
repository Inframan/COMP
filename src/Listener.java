import java.util.HashMap;
import java.util.Map;
import java.util.regex.*;

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
	private Integer runwayAliasCounter =0;
	private Integer helipadCounter =0;
	private Integer dmeCounter;


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




	@Override public void enterTaxiwayIndex(  Airport_ParserParser.TaxiwayIndexContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitTaxiwayIndex(  Airport_ParserParser.TaxiwayIndexContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterTaxiwayName(  Airport_ParserParser.TaxiwayNameContext ctx) { 
		taxiNameCounter++;
		receivingAttributs = "TaxiwayName";
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitTaxiwayName(  Airport_ParserParser.TaxiwayNameContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterLeftEdge(  Airport_ParserParser.LeftEdgeContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitLeftEdge(  Airport_ParserParser.LeftEdgeContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitRightEdgeLighted(  Airport_ParserParser.RightEdgeLightedContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitTaxiwayPathStart(  Airport_ParserParser.TaxiwayPathStartContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitIdent(  Airport_ParserParser.IdentContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitCenterRed(  Airport_ParserParser.CenterRedContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitPrimaryClosed(  Airport_ParserParser.PrimaryClosedContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitNumber(  Airport_ParserParser.NumberContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterApproachLights(  Airport_ParserParser.ApproachLightsContext ctx) {
		approachLightsCounter++;
		receivingAttributs = "ApproachLights";
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitApproachLights(  Airport_ParserParser.ApproachLightsContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitPrimaryDesignator(  Airport_ParserParser.PrimaryDesignatorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitState(  Airport_ParserParser.StateContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitPitch(  Airport_ParserParser.PitchContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterRunway_alias(  Airport_ParserParser.Runway_aliasContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitRunway_alias(  Airport_ParserParser.Runway_aliasContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitHelipad(  Airport_ParserParser.HelipadContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterBlastPad(  Airport_ParserParser.BlastPadContext ctx) { 
blastPadCounter++;
		receivingAttributs = "BlastPad";
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitBlastPad(  Airport_ParserParser.BlastPadContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitTaxiwayPathName(  Airport_ParserParser.TaxiwayPathNameContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitSurface(  Airport_ParserParser.SurfaceContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitPatternAltitude(  Airport_ParserParser.PatternAltitudeContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitIndex(  Airport_ParserParser.IndexContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitBiasX(  Airport_ParserParser.BiasXContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEdgePavement(  Airport_ParserParser.EdgePavementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitSecondaryLanding(  Airport_ParserParser.SecondaryLandingContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitRunway_start(  Airport_ParserParser.Runway_startContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitVasiType(  Airport_ParserParser.VasiTypeContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAirport(  Airport_ParserParser.AirportContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitTaxiwayPathNumber(  Airport_ParserParser.TaxiwayPathNumberContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterScalar(  Airport_ParserParser.ScalarContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitSystem(  Airport_ParserParser.SystemContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitSecondaryClosed(  Airport_ParserParser.SecondaryClosedContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitIdent_Marking(  Airport_ParserParser.Ident_MarkingContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterOffsetThreshold(  Airport_ParserParser.OffsetThresholdContext ctx) {
offsetThresholdCounter++;
		receivingAttributs = "OffsetThreshold";
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitOffsetThreshold(  Airport_ParserParser.OffsetThresholdContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitSecondaryTakeoff(  Airport_ParserParser.SecondaryTakeoffContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitCity(  Airport_ParserParser.CityContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitPrimaryPattern(  Airport_ParserParser.PrimaryPatternContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitRange(  Airport_ParserParser.RangeContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitTaxiwayparkingName(  Airport_ParserParser.TaxiwayparkingNameContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitSecondaryDesignator(  Airport_ParserParser.SecondaryDesignatorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAvailability(  Airport_ParserParser.AvailabilityContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterTrafficScallar(  Airport_ParserParser.TrafficScallarContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitTrafficScallar(  Airport_ParserParser.TrafficScallarContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterTransparent(  Airport_ParserParser.TransparentContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitTransparent(  Airport_ParserParser.TransparentContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitDesignator(  Airport_ParserParser.DesignatorContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitInstanceId(  Airport_ParserParser.InstanceIdContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 *//*
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitSpacing(  Airport_ParserParser.SpacingContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitBiasY(  Airport_ParserParser.BiasYContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The defa*/
	@Override public void exitBiasZ(  Airport_ParserParser.BiasZContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitPrimaryTakeoff(  Airport_ParserParser.PrimaryTakeoffContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitSecondaryPattern(  Airport_ParserParser.SecondaryPatternContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterTaxiwayPoint(  Airport_ParserParser.TaxiwayPointContext ctx) { 
taxiwayPointCounter++;
		receivingAttributs = "TaxiwayPoint";
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitTaxiwayPoint(  Airport_ParserParser.TaxiwayPointContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterLights(  Airport_ParserParser.LightsContext ctx) { 
		lightsCounter++;
		receivingAttributs = "Lights";
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitLights(  Airport_ParserParser.LightsContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterSide(  Airport_ParserParser.SideContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitSide(  Airport_ParserParser.SideContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitHeading(  Airport_ParserParser.HeadingContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitLattitude(  Airport_ParserParser.LattitudeContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitPrimaryStol(  Airport_ParserParser.PrimaryStolContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterServices(  Airport_ParserParser.ServicesContext ctx) {
		servicesCounter++;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitServices(  Airport_ParserParser.ServicesContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAirportTestRadius(  Airport_ParserParser.AirportTestRadiusContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitMagvar(  Airport_ParserParser.MagvarContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitBlue(  Airport_ParserParser.BlueContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterVasi(  Airport_ParserParser.VasiContext ctx) {
		receivingAttributs = "Vasi";
		vasiCounter++;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitVasi(  Airport_ParserParser.VasiContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>

	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitWidth(  Airport_ParserParser.WidthContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterClosed(  Airport_ParserParser.ClosedContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitClosed(  Airport_ParserParser.ClosedContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitCenterLineLighted(  Airport_ParserParser.CenterLineLightedContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterEndLights(  Airport_ParserParser.EndLightsContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEndLights(  Airport_ParserParser.EndLightsContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitCountry(  Airport_ParserParser.CountryContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterVertex(  Airport_ParserParser.VertexContext ctx) { 
		receivingAttributs = "Vertex";
		vertexCounter++;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitVertex(  Airport_ParserParser.VertexContext ctx) { 


	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterFuel(  Airport_ParserParser.FuelContext ctx) { 
		fuelCounter++;
		receivingAttributs = "Fuel";
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFuel(  Airport_ParserParser.FuelContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitPrecision(  Airport_ParserParser.PrecisionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitThreshold(  Airport_ParserParser.ThresholdContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterRightEdge(  Airport_ParserParser.RightEdgeContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitRightEdge(  Airport_ParserParser.RightEdgeContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFrequency(  Airport_ParserParser.FrequencyContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitTeeOffSet3(  Airport_ParserParser.TeeOffSet3Context ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitRed(  Airport_ParserParser.RedContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitTeeOffSet4(  Airport_ParserParser.TeeOffSet4Context ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEdge(  Airport_ParserParser.EdgeContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitTeeOffSet1(  Airport_ParserParser.TeeOffSet1Context ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitTeeOffSet2(  Airport_ParserParser.TeeOffSet2Context ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitTaxiwayPathType(  Airport_ParserParser.TaxiwayPathTypeContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitSingleEnd(  Airport_ParserParser.SingleEndContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitTaxiwayparkingType(  Airport_ParserParser.TaxiwayparkingTypeContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitRadius(  Airport_ParserParser.RadiusContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFuel_type(  Airport_ParserParser.Fuel_typeContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitLongitude(  Airport_ParserParser.LongitudeContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterTower(  Airport_ParserParser.TowerContext ctx) { 
		receivingAttributs = "Tower";
towerCounter++;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitTower(  Airport_ParserParser.TowerContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAlternateFixedDistance(  Airport_ParserParser.AlternateFixedDistanceContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterReil(  Airport_ParserParser.ReilContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitReil(  Airport_ParserParser.ReilContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterMarkings(  Airport_ParserParser.MarkingsContext ctx) {
markingsCounter++;
		receivingAttributs = "Markings";
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitMarkings(  Airport_ParserParser.MarkingsContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitTaxiwayparkingNumber(  Airport_ParserParser.TaxiwayparkingNumberContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterRunway(  Airport_ParserParser.RunwayContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitRunway(  Airport_ParserParser.RunwayContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitStrobes(  Airport_ParserParser.StrobesContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitDrawSurface(  Airport_ParserParser.DrawSurfaceContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAirports(  Airport_ParserParser.AirportsContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAirports(  Airport_ParserParser.AirportsContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterIls(  Airport_ParserParser.IlsContext ctx) { 
		ilsCounter++;
		receivingAttributs = "ils";
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitIls(  Airport_ParserParser.IlsContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterRunway_type(  Airport_ParserParser.Runway_typeContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitRunway_type(  Airport_ParserParser.Runway_typeContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitName(  Airport_ParserParser.NameContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAlternateTouchdown(  Airport_ParserParser.AlternateTouchdownContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFixed(  Airport_ParserParser.FixedContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitRegion(  Airport_ParserParser.RegionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitSecondaryStol(  Airport_ParserParser.SecondaryStolContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAirlineCodes(  Airport_ParserParser.AirlineCodesContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAirlineCodes(  Airport_ParserParser.AirlineCodesContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAltitude(  Airport_ParserParser.AltitudeContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitIdent_ils(  Airport_ParserParser.Ident_ilsContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitPrimaryLanding(  Airport_ParserParser.PrimaryLandingContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterOverrun(  Airport_ParserParser.OverrunContext ctx) {
overrunCounter++;
		receivingAttributs = "Overrun";
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitOverrun(  Airport_ParserParser.OverrunContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitLeadingZeroIdent(  Airport_ParserParser.LeadingZeroIdentContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitPush_back(  Airport_ParserParser.Push_backContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterTaxiwayParking(  Airport_ParserParser.TaxiwayParkingContext ctx) { 
		receivingAttributs = "TaxiwayParking";
		taxiwayParkingCounter++;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitTaxiwayParking(  Airport_ParserParser.TaxiwayParkingContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitNoThresholdEndArrows(  Airport_ParserParser.NoThresholdEndArrowsContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitCenterLine(  Airport_ParserParser.CenterLineContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitTouchdown(  Airport_ParserParser.TouchdownContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitPrimaryMarkingBias(  Airport_ParserParser.PrimaryMarkingBiasContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitTaxiwaypointType(  Airport_ParserParser.TaxiwaypointTypeContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEnd(  Airport_ParserParser.EndContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAlternatePrecision(  Airport_ParserParser.AlternatePrecisionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterVisual_model(  Airport_ParserParser.Visual_modelContext ctx) {

		visualModelCounter++;
		receivingAttributs = "Visual_model";

	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitVisual_model(  Airport_ParserParser.Visual_modelContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitApproach_runway(  Airport_ParserParser.Approach_runwayContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitBackCourse(  Airport_ParserParser.BackCourseContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitOrientation(  Airport_ParserParser.OrientationContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitGreen(  Airport_ParserParser.GreenContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitDrawDetail(  Airport_ParserParser.DrawDetailContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitTaxiwayPathEnd(  Airport_ParserParser.TaxiwayPathEndContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 *}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitSecondaryMarkingBias(  Airport_ParserParser.SecondaryMarkingBiasContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitCenter(  Airport_ParserParser.CenterContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitLength(  Airport_ParserParser.LengthContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEdges(  Airport_ParserParser.EdgesContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterHelipad_type(  Airport_ParserParser.Helipad_typeContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitHelipad_type(  Airport_ParserParser.Helipad_typeContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterTaxiwayPath(  Airport_ParserParser.TaxiwayPathContext ctx) { 
		receivingAttributs = "TaxiwayPath";
		taxiwayPathCounter++;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitTaxiwayPath(  Airport_ParserParser.TaxiwayPathContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitLeftEdgeLighted(  Airport_ParserParser.LeftEdgeLightedContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitImage_complexety(  Airport_ParserParser.Image_complexetyContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitWeightLimit(  Airport_ParserParser.WeightLimitContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterGlide_slope(  Airport_ParserParser.Glide_slopeContext ctx) {
		receivingAttributs = "Glide_slope";
		glideSlopeCounter++;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitGlide_slope(  Airport_ParserParser.Glide_slopeContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitTaxiwayNameString(  Airport_ParserParser.TaxiwayNameStringContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitDashes(  Airport_ParserParser.DashesContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAlternateThreshold(  Airport_ParserParser.AlternateThresholdContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterDme(  Airport_ParserParser.DmeContext ctx) {
		receivingAttributs = "Dme";
		dmeCounter++;
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitDme(  Airport_ParserParser.DmeContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterTaxinodes(  Airport_ParserParser.TaxinodesContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitTaxinodes(  Airport_ParserParser.TaxinodesContext ctx) { }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterEveryRule(  ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitEveryRule(  ParserRuleContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitTerminal(  TerminalNode node) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void visitErrorNode(  ErrorNode node) { }


	@Override 
	public void enterRed(Airport_ParserParser.RedContext ctx)
	{
		String str = ctx.getText();
		int val = Integer.parseInt(str.split("=")[1].split("\"")[1]);
		if(val < 0 || val > 255)
			System.out.println("Error: Red value out of bounds! Expected [0,255] but got " + val);
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */

	@Override 
	public void enterGreen(Airport_ParserParser.GreenContext ctx)
	{
		String str = ctx.getText();
		int val = Integer.parseInt(str.split("=")[1].split("\"")[1]);
		if(val < 0 || val > 255)
			System.out.println("Error: Blue value out of bounds! Expected [0,255] but got " + val);

	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */

	@Override 
	public void enterBlue(Airport_ParserParser.BlueContext ctx)
	{
		String str = ctx.getText();
		int val = Integer.parseInt(str.split("=")[1].split("\"")[1]);
		if(val < 0 || val > 255)
			System.out.println("Error: Green value out of bounds! Expected [0,255] but got " + val);


	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */

	@Override
	public void enterApproach_runway(Airport_ParserParser.Approach_runwayContext ctx)
	{
		String str = ctx.getText();
		String value = str.split("=")[1].split("\"")[1];

		if(value.equals("00"))
			return;
		if(value.startsWith("0")) {
			int val = Integer.parseInt(value);
			if (val < 0 || val > 9) {
				System.out.println("Error: Aprroach_Runway value out of bounds! Expected [00,09] but got " + val);
				return;
			}
		}
		else
		{
			try
			{
				int val = Integer.parseInt(value);
				if (val < 0 || val > 36)
					System.out.println("Error: Aprroach_Runway value out of bounds! Expected [0,36] but got " + val);
				return;
			}
			catch(NumberFormatException nfe)
			{
			}

		}
		if(!( value.equals("EAST") ||
				value.equals("NORTH") ||
				value.equals("NORTHEAST")  ||
				value.equals("NORTHWEST")  ||
				value.equals("SOUTH") ||
				value.equals("SOUTHEAST")  ||
				value.equals("SOUTHWEST")  ||
				value.equals("WEST")  ||
				value.equals("EAST") ))
			System.out.println("Error: Aprroach_Runway value out of bounds! Expected cardinal points but got " + value);

	}

	@Override
	public void enterTaxiwayPathName(Airport_ParserParser.TaxiwayPathNameContext ctx)
	{
		String str = ctx.getText();
		if(str.endsWith("<missing VALUE>"))
			str = "";
		else
		{
			try
			{
				int val = Integer.parseInt(str.split("=")[1].split("\"")[1]);
				if(val < 0 || val > 255)
					System.out.println("Error: Name value out of bounds! Expected [0,255] but got " + val);
			}
			catch(Exception e)
			{
				System.out.println("Error: Name value out of bounds! Expected [0,255] but got " + str);
			}
		}
	}


	@Override
	public void enterTaxiwayNameString(Airport_ParserParser.TaxiwayNameStringContext ctx)
	{
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: taxiwayNameString value not expected! Val was: " + val);else
			if(!val.matches(string8))
				System.out.println("Error: taxiwayNameString Name value not expected! Got " + val);

	}

	@Override
	public void enterOrientation(Airport_ParserParser.OrientationContext ctx) {
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: Orientation value not expected! Val was: " + val);else
			if (!val.equals("FORWARD") && !val.equals("REVERSE"))
				System.out.println("Error: Orientation value not expected! Expected 'FORWARD' OR 'REVERSE' but got " + val);
	}

	@Override
	public void enterTaxiwaypointType(Airport_ParserParser.TaxiwaypointTypeContext ctx) {
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: TaxiwayPoint type value not expected! Val was: " + val);else
			if (!val.equals("NORMAL") && !val.equals("HOLD_SHORT") && !val.equals("ILS_HOLD_SHORT") && !val.equals("HOLD_SHORT_NO_DRAWT" )&& !val.equals("ILS_HOLD_SHORT_NO_DRAW"))
				System.out.println("Error: TaxiwaypointType value not expected! Expected 'NORMAL' or 'HOLD_SHORT' or  'ILS_HOLD_SHORT' or  'HOLD_SHORT_NO_DRAW' or 'ILS_HOLD_SHORT_NO_DRAW' but got " + val);
	}

	@Override
	public void enterTaxiwayparkingType(Airport_ParserParser.TaxiwayparkingTypeContext ctx) {

		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: TaxiwayparkingType value not expected! Val was: " + val);else
			if (!val.equals("NONE") && !val.equals("DOCK_GA") && !val.equals("FUEL") && !val.equals("GATE_HEAVY") && !val.equals("GATE_MEDIUM") && !val.equals("GATE_SMALL") && !val.equals("RAMP_CARGO") && !val.equals("RAMP_GA") && !val.equals("RAMP_GA_LARGE") && !val.equals("RAMP_GA_MEDIUM") && !val.equals("RAMP_GA_SMALL") && !val.equals("RAMP_MIL_CARGO") && !val.equals("RAMP_MIL_COMBAT") && !val.equals("VEHICLE"))
				System.out.println("Error: TaxiwayparkingType value not expected! Got " + val);
	}

	@Override
	public void enterTaxiwayparkingName(Airport_ParserParser.TaxiwayparkingNameContext ctx) {
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: enterTaxiwayparkingName value not expected! Val was: " + val);else
			if (!val.equals("PARKING") && !val.equals("DOCK") && !val.equals("GATE") && !val.startsWith("GATE_") && !val.equals("NONE") && !val.equals("N_PARKING") && !val.equals("NE_PARKING" )&& !val.equals("NW_PARKING" )&& !val.equals("SE_PARKING" )&& !val.equals("S_PARKING") && !val.equals("SW_PARKING" )&& !val.equals("W_PARKING") && !val.equals("E_PARKING" ))
				System.out.println("Error: TaxiwayparkingName value not expected! Got " + val);
	}

	@Override
	public void enterPush_back(Airport_ParserParser.Push_backContext ctx) {
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: enterPush_back value not expected! Val was: " + val);else
			if (!val.equals("NONE") && !val.equals("BOTH") && !val.equals("LEFT") && !val.equals("RIGHT" ))
				System.out.println("Error: Push_back value not expected! Got " + val);
	}

	@Override
	public void enterTaxiwayPathType(Airport_ParserParser.TaxiwayPathTypeContext ctx) {
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: enterTaxiwayPathType value not expected! Val was: " + val);else
			if (!val.equals("RUNWAY") && !val.equals("PARKING") && !val.equals("TAXI") && !val.equals("PATH") && !val.equals("CLOSED") && !val.equals("VEHICLE"))
				System.out.println("Error: TaxiwayPathType value not expected! Got " + val);
	}

	@Override
	public void enterSurface(Airport_ParserParser.SurfaceContext ctx) {
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: enterSurface value not expected! Val was: " + val);else
			if (!val.equals("ASPHALT" )&& !val.equals("BITUMINOUS") && !val.equals("BRICK") && !val.equals("CLAY" )&& !val.equals("CEMENT" )&& !val.equals("CONCRETE" )&& !val.equals("CORAL") && !val.equals("DIRT") && !val.equals("GRASS" )&& !val.equals("GRAVEL") && !val.equals("ICE" )&& !val.equals("MACADAM" )&& !val.equals("OIL_TREATED" )&& !val.equals("PLANKS") && !val.equals("SAND" )&& !val.equals("SHALE") && !val.equals("SNOW" )&& !val.equals("STEEL_MATS" )&& !val.equals("TARMAC") && !val.equals("UNKNOWN") && !val.equals("WATER"))
				System.out.println("Error: Surface value not expected! Got " + val);
	}

	@Override
	public void enterLeftEdgeLighted(Airport_ParserParser.LeftEdgeLightedContext ctx) {
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) val = "FALSE";
		if (!val.equals("TRUE") && !val.equals("FALSE"))
			System.out.println("Error: LeftEdgeLighted value not expected! Got " + val);
	}

	@Override
	public void enterRightEdgeLighted(Airport_ParserParser.RightEdgeLightedContext ctx) {
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) val = "FALSE";
		if (!val.equals("TRUE") && !val.equals("FALSE"))
			System.out.println("Error: RightEdgeLighted value not expected! Got " + val);
	}

	@Override
	public void enterTaxiwayPathNumber(Airport_ParserParser.TaxiwayPathNumberContext ctx) {
		String str = ctx.getText();
		int num;
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: enterTaxiwayPathNumber value not expected! Val was: " + val);
		else
			if (!val.equals("EAST") && !val.equals("NORTH") && !val.equals("NORTHEAST") && !val.equals("NORTHWEST") && !val.equals("SOUTH" )&& !val.equals("SOUTHEAST") && !val.equals("SOUTHWEST" )&& !val.equals("WEST"))
			{
				if(val.length() < 3)
				{
					num = Integer.parseInt(val);
					if(num < 0 || num > 36 )
						System.out.println("Error: TaxiwayPathNumber value not expected! Got " + val);
				}
				else
					System.out.println("Error: TaxiwayPathNumber value not expected! Got " + val);
			}
	}

	@Override
	public void enterNumber(Airport_ParserParser.NumberContext ctx) {
		String str = ctx.getText();
		try{


			String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: CenterRed value not expected! Val was: " + val);else
				if(val.equals("00"))
					return;
			if (!val.equals("EAST") && !val.equals("NORTH") && !val.equals("NORTHEAST" )&& !val.equals("NORTHWEST") && !val.equals("SOUTH") && !val.equals("SOUTHEAST") && !val.equals("SOUTHWEST") && !val.equals("WEST"))
				if(val.startsWith("0")) {
					int value = Integer.parseInt(val);
					if (value < 0 || value > 9) {
						System.out.println("Error: Aprroach_Runway value out of bounds! Expected [00,09] but got " + val);
						return;
					}
				}
				else
				{
					int value = Integer.parseInt(val);
					if (value < 0 || value > 36)
						System.out.println("Error: Aprroach_Runway value out of bounds! Expected [0,36] but got " + val);
				}
		}
		catch(Exception e)
		{
			System.out.println("Error: Number value not expected! Got " + str);
		}
	}

	@Override
	public void enterDesignator(Airport_ParserParser.DesignatorContext ctx) {
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: enterDesignator value not expected! Val was: " + val);else
			if (!val.equals("NONE" )&& !val.equals("C") && !val.equals("CENTER") && !val.equals("L") && !val.equals("LEFT" )&& !val.equals("R") && !val.equals("RIGHT" )&& !val.equals("W" )&& !val.equals("WATER") && !val.equals("A") && !val.equals("B"))
				System.out.println("Error: Designator value not expected! Got " + val);
	}

	@Override
	public void enterPrimaryDesignator(Airport_ParserParser.PrimaryDesignatorContext ctx) {
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: enterPrimaryDesignator value not expected! Val was: " + val);else
			if (!val.equals("NONE") && !val.equals("C" )&& !val.equals("CENTER") && !val.equals("L") && !val.equals("LEFT" )&& !val.equals("R" )&& !val.equals("RIGHT") && !val.equals("W") && !val.equals("WATER") && !val.equals("A" )&& !val.equals("B"))
				System.out.println("Error: PrimaryDesignator value not expected! Got " + val);
	}

	@Override
	public void enterSecondaryDesignator(Airport_ParserParser.SecondaryDesignatorContext ctx) {
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: enterSecondaryDesignator value not expected! Val was: " + val);else
			if (!val.equals("NONE") && !val.equals("C") && !val.equals("CENTER") && !val.equals("L") && !val.equals("LEFT") && !val.equals("R") && !val.equals("RIGHT") && !val.equals("W") && !val.equals("WATER" )&& !val.equals("A") && !val.equals("B"))
				System.out.println("Error: SecondaryDesignator value not expected! Got " + val);
	}

	@Override
	public void enterLength(Airport_ParserParser.LengthContext ctx) {
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: enterLength value not expected! Val was: " + val);else
			if (!val.matches(altitude_value))
				System.out.println("Error: Length value not expected! Got " + val);
	}

	@Override
	public void enterPatternAltitude(Airport_ParserParser.PatternAltitudeContext ctx) {
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: enterPatternAltitude value not expected! Val was: " + val);else
			if (!val.matches(altitude_value) )
				System.out.println("Error: PatternAltitude value not expected! Got " + val);
	}

	@Override
	public void enterSpacing(Airport_ParserParser.SpacingContext ctx) {
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: enterSpacing value not expected! Val was: " + val);else
			if (!val.matches(altitude_value))
				System.out.println("Error: Spacing value not expected! Got " + val);
	}

	@Override
	public void enterHelipad(Airport_ParserParser.HelipadContext ctx) {
		receivingAttributs = "Helipad";
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: enterHelipad value not expected! Val was: " + val);else
			if (!val.matches(altitude_value))
				System.out.println("Error: Helipad value not expected! Got " + val);
	}

	@Override
	public void enterCenter(Airport_ParserParser.CenterContext ctx) {
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: enterCenter value not expected! Val was: " + val);else
			if (!val.equals("NONE") && !val.equals("LOW") && !val.equals("MEDIUM") && !val.equals("HIGH"))
				System.out.println("Error: Center value not expected! Got " + val);
	}

	@Override
	public void enterEdge(Airport_ParserParser.EdgeContext ctx) {
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: enterEdge value not expected! Val was: " + val);else
			if (!val.equals("NONE") && !val.equals("LOW") && !val.equals("MEDIUM") && !val.equals("HIGH"))
				System.out.println("Error: Edge value not expected! Got " + val);
	}

	@Override
	public void enterEnd(Airport_ParserParser.EndContext ctx) {
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: enterEnd value not expected! Val was: " + val);else
			if (!val.equals("PRIMARY") && !val.equals("SECONDARY"))
				System.out.println("Error: End value not expected! Got " + val);
	}

	@Override
	public void enterSystem(Airport_ParserParser.SystemContext ctx) {
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: enterSystem value not expected! Val was: " + val);else
			if (!val.equals("NONE") && !val.equals("ALSF1") && !val.equals("ALSF2") && !val.equals("CALVERT") && !val.equals("CALVERT2") && !val.equals("MALS") && !val.equals("MALSF") && !val.equals("MALSR") && !val.equals("ODALS") && !val.equals("RAIL") && !val.equals("SALS") && !val.equals("SALSF") && !val.equals("SSALF") && !val.equals("SSALR") && !val.equals("SSALS"))
				System.out.println("Error: System value not expected! Got " + val);
	}

	@Override
	public void enterVasiType(Airport_ParserParser.VasiTypeContext ctx) {

		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: enterVasiType value not expected! Val was: " + val);else
			if (!val.equals("PAPI2") && !val.equals("PAPI4") && !val.equals("PVASI") && !val.equals("TRICOLOR") && !val.equals("TVASI" )&& !val.equals("VASI21") && !val.equals("VASI22" )&& !val.equals("VASI23" )&& !val.equals("VASI31") && !val.equals("VASI32") && !val.equals("VASI33") && !val.equals("BALL") && !val.equals("APAP") && !val.equals("PANELS"))
				System.out.println("Error: VasiType value not expected! Got " + val);
	}

	@Override
	public void enterRunway_start(Airport_ParserParser.Runway_startContext ctx) {
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: enterRunway_start value not expected! Val was: " + val);else
			if (!val.equals("RUNWAY"))
				System.out.println("Error: Runway_start value not expected! Got " + val);
	}

	@Override
	public void enterImage_complexety(Airport_ParserParser.Image_complexetyContext ctx) {
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: enterImage_complexety value not expected! Val was: " + val);else
			if (!val.equals("VERY_SPARSE") && !val.equals("SPARSE") && !val.equals("NORMAL") && !val.equals("DENSE" )&& !val.equals("VERY_DENSE"))
				System.out.println("Error: Image_complexety value not expected! Got " + val);
	}

	@Override
	public void enterFuel_type(Airport_ParserParser.Fuel_typeContext ctx) {
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: enterFuel_type value not expected! Val was: " + val);else
			if (!val.equals("73") && !val.equals("87") && !val.equals("100") && !val.equals("130") && !val.equals("145") && !val.equals("MOGAS") && !val.equals("JET") && !val.equals("JETA") && !val.equals("JETA1") && !val.equals("JETAP") && !val.equals("JETB") && !val.equals("JET4") && !val.equals("JET5") && !val.equals("UNKNOWN"))
				System.out.println("Error: Fuel_type value not expected! Got " + val);
	}

	@Override
	public void enterTaxiwayPathStart(Airport_ParserParser.TaxiwayPathStartContext ctx)
	{
		String str = ctx.getText();
		String[] split = str.split("=");
		try{
			Double val = Double.parseDouble(str.split("=")[1].split("\"")[1]);
			if (val >= 255 || val < 0)
				System.out.println("Error: TaxiwayPathStart value not expected! Got " + val);

		}
		catch (Exception e)
		{
			System.out.println("Error: TaxiwayPathStart value not expected! Got " + str);
		}
	}

	@Override
	public void enterIdent(Airport_ParserParser.IdentContext ctx) {
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: enterIdent value not expected! Val was: " + val);else
			if(!val.matches(ident))
				System.out.println("Error: Ident value not expected! Got " + val);
			else//valid value
			{
				addAttribute("ident", val);				

			}
	}

	@Override
	public void enterPitch(Airport_ParserParser.PitchContext ctx)
	{
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: enterPitch value not expected! Val was: " + val);else
			if(!val.matches(heading))
				System.out.println("Error: Pitch value not expected! Got " + val);
	}

	@Override
	public void enterIndex(Airport_ParserParser.IndexContext ctx) {
		String str = ctx.getText();
		System.out.println(str);
		try
		{
			Double val = Double.parseDouble(str.split("=")[1].split("\"")[1]);
			if (val >= 3999 || val <= 0)
				System.out.println("Error: Index value not expected! Got " + val);

		}
		catch (Exception e)
		{
			System.out.println("Error: Index value not expected! Got "+str);
		}
	}

	@Override
	public void enterBiasX(Airport_ParserParser.BiasXContext ctx)
	{
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: enterBiasX value not expected! Val was: " + val);else
			if(!val.matches(altitude_value))
				System.out.println("Error: BiasX value not expected! Got " + val);
	}

	@Override
	public void enterRange(Airport_ParserParser.RangeContext ctx){
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: enterRange value not expected! Val was: " + val);else
			if(!val.matches(altitude_value))
				System.out.println("Error: Range value not expected! Got " + val);
	}

	@Override
	public void enterBiasY(Airport_ParserParser.BiasYContext ctx)
	{
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: enterBiasY value not expected! Val was: " + val);else
			if(!val.matches(altitude_value))
				System.out.println("Error: BiasY value not expected! Got " + val);
	}

	@Override
	public void enterBiasZ(Airport_ParserParser.BiasZContext ctx)
	{
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: enterBiasZ value not expected! Val was: " + val);else
			if(!val.matches(altitude_value))
				System.out.println("Error: Biaz value not expected! Got " + val);
	}

	@Override
	public void enterHeading(Airport_ParserParser.HeadingContext ctx)
	{
		String str = ctx.getText();
		try
		{

			String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: enterHeading value not expected! Val was: " + val);else
				if(!val.matches(heading))
					System.out.println("Error: Heading value not expected! Got " + val);
		}
		catch(Exception e)
		{
			System.out.println("Error: Heading value not expected! Got " + str);
		}
	}
	@Override
	public void enterLattitude(Airport_ParserParser.LattitudeContext ctx) {
		String str = ctx.getText();
		Double val = Double.parseDouble(str.split("=")[1].split("\"")[1]);
		if (val >= 90 || val <= -90)
			System.out.println("Error: lattitude value not expected! Got " + val);
	}
	@Override
	public void enterMagvar(Airport_ParserParser.MagvarContext ctx) {
		String str = ctx.getText();
		Double val = Double.parseDouble(str.split("=")[1].split("\"")[1]);
		if (val >= 360 || val <= -360)
			System.out.println("Error: Magvar value not expected! Got " + val);
	}
	@Override
	public void enterWidth(Airport_ParserParser.WidthContext ctx)
	{
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: enterWidth value not expected! Val was: " + val);else
			if(!val.matches(altitude_value))
				System.out.println("Error: width value not expected! Got " + val);
	}
	@Override
	public void enterCenterLineLighted(Airport_ParserParser.CenterLineLightedContext ctx){
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: enterCenterLineLighted value not expected! Val was: " + val);else
			if (!val.equals("TRUE") && !val.equals("FALSE"))
				System.out.println("Error: CenterLineLighted value not expected! Got " + val);
	}
	@Override
	public void enterFrequency(Airport_ParserParser.FrequencyContext ctx){
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: enterFrequency value not expected! Val was: " + val);else
			if(!val.matches(floatnumber))
				System.out.println("Error: Frequency value not expected! Got " + val);
	}
	@Override
	public void enterTeeOffSet3(Airport_ParserParser.TeeOffSet3Context ctx) {
		String str = ctx.getText();
		Double val = Double.parseDouble(str.split("=")[1].split("\"")[1]);
		if (val >= 0.0 || val <= 50.0)
			System.out.println("Error: TeeOffSet3 value not expected! Got " + val);
	}
	@Override
	public void enterTeeOffSet4(Airport_ParserParser.TeeOffSet4Context ctx){
		String str = ctx.getText();
		Double val = Double.parseDouble(str.split("=")[1].split("\"")[1]);
		if (val >= 0.0 || val <= 50.0)
			System.out.println("Error: TeeOffSet4 value not expected! Got " + val);
	}
	@Override
	public void enterTeeOffSet1(Airport_ParserParser.TeeOffSet1Context ctx){
		String str = ctx.getText();
		Double val = Double.parseDouble(str.split("=")[1].split("\"")[1]);
		if (val >= 0.0 || val <= 50.0)
			System.out.println("Error: TeeOffSet1 value not expected! Got " + val);
	}
	@Override
	public void enterTeeOffSet2(Airport_ParserParser.TeeOffSet2Context ctx){
		String str = ctx.getText();
		Double val = Double.parseDouble(str.split("=")[1].split("\"")[1]);
		if (val >= 0.0 || val <= 50.0)
			System.out.println("Error: TeeOffSet2 value not expected! Got " + val);
	}
	@Override
	public void enterLongitude(Airport_ParserParser.LongitudeContext ctx) {
		String str = ctx.getText();
		Double val = Double.parseDouble(str.split("=")[1].split("\"")[1]);
		if (val >= 180 || val <= -180)
			System.out.println("Error: Longitude value not expected! Got " + val);
	}
	@Override
	public void enterDrawSurface(Airport_ParserParser.DrawSurfaceContext ctx)	{
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: enterDrawSurface value not expected! Val was: " + val);else
			if (!val.equals("TRUE") && !val.equals("FALSE"))
				System.out.println("Error: drawSurface value not expected! Got " + val);
	}
	@Override
	public void enterIdent_ils(Airport_ParserParser.Ident_ilsContext ctx) {
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: enterIdent_ils value not expected! Val was: " + val);else
			if(!val.matches(ident))
				System.out.println("Error: Ident_ils value not expected! Got " + val);
	}
	@Override
	public void enterCenterLine(Airport_ParserParser.CenterLineContext ctx){
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: enterCenterLine value not expected! Val was: " + val);else
			if (!val.equals("TRUE") && !val.equals("FALSE"))
				System.out.println("Error: CenterLine value not expected! Got " + val);
	}
	@Override
	public void enterDrawDetail(Airport_ParserParser.DrawDetailContext ctx)  {
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: enterDrawDetail value not expected! Val was: " + val);else
			if (!val.equals("TRUE") && !val.equals("FALSE"))
				System.out.println("Error: DrawDetail value not expected! Got " + val);
	}
	@Override
	public void enterTaxiwayPathEnd(Airport_ParserParser.TaxiwayPathEndContext ctx)	{
		String str = ctx.getText();
		try{
			Double val = Double.parseDouble(str.split("=")[1].split("\"")[1]);
			if (val >= 255 || val < 0)
				System.out.println("Error: TaxiwayPathEnd value not expected! Got " + val);
		}
		catch(Exception e)
		{
			System.out.println("Error: TaxiwayPathEnd value not expected! Got " + str);
		}
	}
	@Override
	public void enterWeightLimit(Airport_ParserParser.WeightLimitContext ctx)	{
		String str = ctx.getText();
		Double val = Double.parseDouble(str.split("=")[1].split("\"")[1]);
		if (val < 0)
			System.out.println("Error: WeightLimit value not expected! Got " + val);
	}

	@Override
	public void enterRegion(Airport_ParserParser.RegionContext ctx) {
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: enterRegion value not expected! Val was: " + val);else
			if(!val.matches(str) && val.length()>48)
				System.out.println("Error: Region value out of bounds! Val size must be minor then 48 but was " + val.length());
		//  else
		//	airportAttributs.put("region", val);
	}

	@Override
	public void enterCity(Airport_ParserParser.CityContext ctx) {
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: enterCity value not expected! Val was: " + val);else
			if(!val.matches(string) && val.length()>48)
				System.out.println("Error: City value out of bounds! Val size must be minor then 48 but was " + val.length());
		//      else
		//    	airportAttributs.put("city", val);
	}

	@Override
	public void enterCountry(Airport_ParserParser.CountryContext ctx) {
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: enterCountry value not expected! Val was: " + val);else
			if(!val.matches(str) && val.length()>48)
				System.out.println("Error: Country value out of bounds! Val size must be minor then 48 but was " + val.length());
		//  else
		//	airportAttributs.put("country", val);
	}

	@Override
	public void enterState(Airport_ParserParser.StateContext ctx) {
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: enterState value not expected! Val was: " + val);else
			if(!val.matches(str) && val.length()>48)
				System.out.println("Error: State value out of bounds! Val size must be minor then 48 but was " + val.length());
		//       else
		//     	airportAttributs.put("state", val);
	}

	@Override
	public void enterName(Airport_ParserParser.NameContext ctx) {
		String str = ctx.getText();
		Map<String, String> name = new HashMap<String, String>();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: enterName value not expected! Val was: " + val);else
			if(!val.matches(str) && val.length()>48)
				System.out.println("Error: Name value out of bounds! Val size must be minor then 48 but was " + val.length());
			else
			{
				name.put("name", val);
				addAttribute("name", val);


			}
		//airportAttributs.put("name", val);
	}

	@Override
	public void enterInstanceId(Airport_ParserParser.InstanceIdContext ctx) {
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: enterInstanceId value not expected! Val was: " + val);else
			if(!val.matches(str) && val.length()>48){
				System.out.println("Error: Name value out of bounds! Val size must be minor then 48 but was " + val.length());
			}
	}

	@Override
	public void enterPrimaryTakeoff(Airport_ParserParser.PrimaryTakeoffContext ctx) {
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) val = "TRUE";
		if (!val.equals("YES") && !val.equals("NO") && !val.equals("TRUE") && !val.equals("FALSE"))
			System.out.println("Error: PrimaryTakeoff value not expected! Val was: " + val);
	}

	@Override
	public void enterPrimaryLanding(Airport_ParserParser.PrimaryLandingContext ctx) {
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) val = "TRUE";
		if (!val.equals("YES") && !val.equals("NO") && !val.equals("TRUE") && !val.equals("FALSE"))
			System.out.println("Error: PrimaryLanding value not expected! Val was: " + val);
	}

	@Override
	public void enterPrimaryPattern(Airport_ParserParser.PrimaryPatternContext ctx) {
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) val = "LEFT";
		if (!val.equals("LEFT") && !val.equals("RIGHT"))
			System.out.println("Error: PrimaryPattern value not expected! Val was: " + val);
	}

	@Override
	public void enterSecondaryTakeoff(Airport_ParserParser.SecondaryTakeoffContext ctx) {
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) val = "TRUE";
		if (!val.equals("YES") && !val.equals("NO") && !val.equals("TRUE") && !val.equals("FALSE"))
			System.out.println("Error: SecondaryTakeoff value not expected! Val was: " + val);
	}

	@Override
	public void enterSecondaryLanding(Airport_ParserParser.SecondaryLandingContext ctx) {
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) val = "TRUE";
		if (!val.equals("YES") && !val.equals("NO") && !val.equals("TRUE") && !val.equals("FALSE"))
			System.out.println("Error: SecondaryLanding value not expected! Val was: " + val);
	}

	@Override
	public void enterSecondaryPattern(Airport_ParserParser.SecondaryPatternContext ctx) {
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) val = "LEFT";
		if (!val.equals("LEFT") && !val.equals("RIGHT"))
			System.out.println("Error: SecondaryPattern value not expected! Val was: " + val);
	}

	@Override
	public void enterPrimaryMarkingBias(Airport_ParserParser.PrimaryMarkingBiasContext ctx) {
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: enterPrimaryMarkingBias value not expected! Val was: " + val);else
			if (!val.matches(trafficScallar))
				System.out.println("Error: PrimaryMarkingBias value not expected! Val was: " + val);
	}

	@Override
	public void enterSecondaryMarkingBias(Airport_ParserParser.SecondaryMarkingBiasContext ctx) {
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: enterSecondaryMarkingBias value not expected! Val was: " + val);else
			if (!val.matches(trafficScallar))
				System.out.println("Error: SecondaryMarkingBias value not expected! Val was: " + val);
	}

	@Override
	public void enterAlternateThreshold(Airport_ParserParser.AlternateThresholdContext ctx) {
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: enterAlternateThreshold value not expected! Val was: " + val);else
			if (!val.equals("TRUE") && !val.equals("FALSE"))
				System.out.println("Error: AlternateThreshold value not expected! Val was: " + val);
	}

	@Override
	public void enterAlternateTouchdown(Airport_ParserParser.AlternateTouchdownContext ctx) {
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: enterAlternateTouchdown value not expected! Val was: " + val);else
			if (!val.equals("TRUE") && !val.equals("FALSE"))
				System.out.println("Error: AlternateTouchdown value not expected! Val was: " + val);
	}

	@Override
	public void enterAlternateFixedDistance(Airport_ParserParser.AlternateFixedDistanceContext ctx) {
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: enterAlternateFixedDistance value not expected! Val was: " + val);else
			if (!val.equals("TRUE") && !val.equals("FALSE"))
				System.out.println("Error: AlternateFixedDistance value not expected! Val was: " + val);
	}

	@Override
	public void enterAlternatePrecision(Airport_ParserParser.AlternatePrecisionContext ctx) {
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: enterAlternatePrecision value not expected! Val was: " + val);else
			if (!val.equals("TRUE") && !val.equals("FALSE"))
				System.out.println("Error: AlternatePrecision value not expected! Val was: " + val);
	}

	@Override
	public void enterLeadingZeroIdent(Airport_ParserParser.LeadingZeroIdentContext ctx) {
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: enterLeadingZeroIdent value not expected! Val was: " + val);else
			if (!val.equals("TRUE") && !val.equals("FALSE"))
				System.out.println("Error: LeadingZeroIdent value not expected! Val was: " + val);
	}

	@Override
	public void enterNoThresholdEndArrows(Airport_ParserParser.NoThresholdEndArrowsContext ctx) {
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: enterNoThresholdEndArrows value not expected! Val was: " + val);else
			if (!val.equals("TRUE") && !val.equals("FALSE"))
				System.out.println("Error: NoThresholdEndArrows value not expected! Val was: " + val);
	}

	@Override
	public void enterEdges(Airport_ParserParser.EdgesContext ctx) {
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: enterEdges value not expected! Val was: " + val);else
			if (!val.equals("TRUE") && !val.equals("FALSE"))
				System.out.println("Error: Edges value not expected! Val was: " + val);
	}

	@Override
	public void enterThreshold(Airport_ParserParser.ThresholdContext ctx) {
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: enterThreshold value not expected! Val was: " + val);else
			if (!val.equals("TRUE") && !val.equals("FALSE"))
				System.out.println("Error: Threshold value not expected! Val was: " + val);
	}

	@Override
	public void enterFixed(Airport_ParserParser.FixedContext ctx) {
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: enterFixed value not expected! Val was: " + val);else
			if (!val.equals("TRUE") && !val.equals("FALSE"))
				System.out.println("Error: Fixed value not expected! Val was: " + val);
	}

	@Override
	public void enterTouchdown(Airport_ParserParser.TouchdownContext ctx) {
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: enterTouchdown value not expected! Val was: " + val);else
			if (!val.equals("TRUE") && !val.equals("FALSE"))
				System.out.println("Error: Touchdown value not expected! Val was: " + val);
	}

	@Override
	public void enterDashes(Airport_ParserParser.DashesContext ctx) {
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: enterDashes value not expected! Val was: " + val);else
			if (!val.equals("TRUE") && !val.equals("FALSE"))
				System.out.println("Error: Dashes value not expected! Val was: " + val);
	}

	@Override
	public void enterIdent_Marking(Airport_ParserParser.Ident_MarkingContext ctx) {
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: enterIdent_Marking value not expected! Val was: " + val);else
			if (!val.equals("TRUE") && !val.equals("FALSE"))
				System.out.println("Error: Ident_Marking value not expected! Val was: " + val);
	}

	@Override
	public void enterPrecision(Airport_ParserParser.PrecisionContext ctx) {
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: enterPrecision value not expected! Val was: " + val);else
			if (!val.equals("TRUE") && !val.equals("FALSE"))
				System.out.println("Error: Precision value not expected! Val was: " + val);
	}

	@Override
	public void enterEdgePavement(Airport_ParserParser.EdgePavementContext ctx) {
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: enterEdgePavement value not expected! Val was: " + val);else
			if (!val.equals("TRUE") && !val.equals("FALSE"))
				System.out.println("Error: EdgePavement value not expected! Val was: " + val);
	}

	@Override
	public void enterSingleEnd(Airport_ParserParser.SingleEndContext ctx) {
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: enterSingleEnd value not expected! Val was: " + val);else
			if (!val.equals("TRUE") && !val.equals("FALSE"))
				System.out.println("Error: SingleEnd value not expected! Val was: " + val);
	}

	@Override
	public void enterPrimaryClosed(Airport_ParserParser.PrimaryClosedContext ctx) {
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: enterPrimaryClosed value not expected! Val was: " + val);else
			if (!val.equals("TRUE") && !val.equals("FALSE"))
				System.out.println("Error: PrimaryClosed value not expected! Val was: " + val);
	}

	@Override
	public void enterSecondaryClosed(Airport_ParserParser.SecondaryClosedContext ctx) {
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: enterSecondaryClosed value not expected! Val was: " + val);else
			if (!val.equals("TRUE") && !val.equals("FALSE"))
				System.out.println("Error: SecondaryClosed value not expected! Val was: " + val);
	}

	@Override
	public void enterPrimaryStol(Airport_ParserParser.PrimaryStolContext ctx) {
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: enterPrimaryStol value not expected! Val was: " + val);else
			if (!val.equals("TRUE") && !val.equals("FALSE"))
				System.out.println("Error: PrimaryStol value not expected! Val was: " + val);
	}

	@Override
	public void enterSecondaryStol(Airport_ParserParser.SecondaryStolContext ctx) {
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: enterSecondaryStol value not expected! Val was: " + val);else
			if (!val.equals("TRUE") && !val.equals("FALSE"))
				System.out.println("Error: SecondaryStol value not expected! Val was: " + val);
	}

	@Override
	public void enterBackCourse(Airport_ParserParser.BackCourseContext ctx) {
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: enterBackCourse value not expected! Val was: " + val);else
			if (!val.equals("TRUE") && !val.equals("FALSE"))
				System.out.println("Error: BackCourse value not expected! Val was: " + val);
	}

	@Override
	public void enterCenterRed(Airport_ParserParser.CenterRedContext ctx) {
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: enterCenterRed value not expected! Val was: " + val);
		else
			if (!val.equals("TRUE") && !val.equals("FALSE"))
				System.out.println("Error: CenterRed value not expected! Val was: " + val);
	}

	@Override
	public void enterStrobes(Airport_ParserParser.StrobesContext ctx) {
		String str = ctx.getText();
		try
		{
			String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: enterStrobes value not expected! Val was: " + val);else
				if (!val.matches(unsigned_int))
					System.out.println("Error: Strobes value not expected! Val was: " + val);
		}
		catch(Exception e)
		{

			System.out.println("Error: Strobes value not expected! Val was: " + str);
		}
	}

	@Override
	public void enterAltitude(Airport_ParserParser.AltitudeContext ctx) {
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: enterAltitude value not expected! Val was: " + val);else
			if (!val.matches(altitude_value))
				System.out.println("Error: Altitude value not expected! Val was: " + val);
	}

	@Override
	public void enterAirportTestRadius(Airport_ParserParser.AirportTestRadiusContext ctx) {
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: enterAirportTestRadius value not expected! Val was: " + val);else
			if (!val.matches(altitude_value))
				System.out.println("Error: AirportTestRadius value not expected! Val was: " + val);
	}

	@Override
	public void enterRadius(Airport_ParserParser.RadiusContext ctx) {
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: enterRadius value not expected! Val was: " + val);else
			if (!val.matches(altitude_value))
				System.out.println("Error: Radius value not expected! Val was: " + val);
	}

	@Override
	public void enterTaxiwayparkingNumber(Airport_ParserParser.TaxiwayparkingNumberContext ctx) {
		String str = ctx.getText();
		Double val = Double.parseDouble(str.split("=")[1].split("\"")[1]);
		if (val >= 3999 || val < 0)
			System.out.println("Error: TaxiwayparkingNumber value out of bounds! Expected [0,3999] but got " + val);
	}

	@Override
	public void enterAvailability(Airport_ParserParser.AvailabilityContext ctx) {
		String str = ctx.getText();
		String val = protectedSplit(str); if(isNull(val)) System.out.println("Error: CenterRed value not expected! Val was: " + val);else
			if (!val.equals("YES") && !val.equals("NO") && !val.equals("UNKNOWN") &&  !val.equals("PRIOR_REQUEST"))
				System.out.println("Error: Availability value out of bounds! Expected [0,3999] but got " + val);
	}


	@Override public void enterAirport( Airport_ParserParser.AirportContext ctx)
	{
		receivingAttributs = "airport";
		airportCounter++;
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
			airportAttributs.put("Airport"+airportCounter.toString(), value);
			break;
		case "Tower":
			towerAttributs.put("Tower"+towerCounter.toString(), value);
			break;
		case "Runway":
			runwayAttributs.put("Runway"+runwayCounter.toString(), value);
			break;
		case "Runway_alias":
			runwayAliasAttributs.put("Runway_alias"+runwayAliasCounter.toString(), value);
			break;
		case "Helipad":
			helipadAttributs.put("Helipad"+helipadCounter .toString(), value);
			break;
		case "Runway_start":
			runway_startAttributs.put("Runway_start"+runwayStartCounter.toString(), value);
			break;
		case "TaxiwayPoint":
			taxiwayPointAttributs.put("TaxiwayPoint"+taxiwayPointCounter.toString(), value);
			break;
		case "TaxiwayParking":
			taxiwayParkingAttributs.put("TaxiwayParking"+taxiwayParkingCounter.toString(), value);
			break;
		case "TaxiwayName":
			taxiwayNameAttributs.put("TaxiwayName"+taxiNameCounter.toString(), value);
			break;
		case "TaxiwayPath":
			taxiwayPathAttributs.put("TaxiwayPath"+taxiwayPathCounter.toString(), value);

			break;
		case "Lights":
			lightsAttributs.put("Lights"+lightsCounter.toString(), value);
			break;
		case "OffsetThreshold":
			offsetThresholdAttributs.put("OffsetThreashold"+offsetThresholdCounter.toString(), value);
			break;
		case "BlastPad":
			blastPadAttributs.put("BlastPad"+blastPadCounter.toString(), value);
			break;
		case "Overrun":
			overrunAttributs.put("Overrun"+overrunCounter.toString(), value);
			break;
		case "ApproachLights":
			approachLightsAttributs.put("ApproachLights"+approachLightsCounter.toString(), value);
			break;
		case "Vasi":
			vasiAttributs.put("Vasi"+vasiCounter.toString(), value);
			break;
		case "Visual_model":
			visualModelAttributs.put("Visual_model"+visualModelCounter.toString(), value);
			break;
		case "Glide_slope":
			glide_scopeAttributs.put("Glide_scope"+glideSlopeCounter.toString(), value);
			break;
		case "Dme":
			dmeAttributs.put("DME"+dmeCounter.toString(), value);
			break;
		case "Fuel":
			fuelAttributs.put("Fuel"+fuelCounter.toString(), value);
			break;
		case  "Vertex":
			vertexAttributs.put("Vertex"+vertexCounter.toString(), value);
			break;
		default:
			break;
		}
	}
}