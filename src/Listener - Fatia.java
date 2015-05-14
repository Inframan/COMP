import java.util.regex.*;

public class Listener extends Airport_ParserBaseListener {

    String string = "[a-zA-Z0-9]";
    String trafficScallar = "[0-9]+['F'|'M'|'N']";
    String unsigned_int = "[0-9]*";
    String floatnumber = "[+-]?[0-9]+('.'[0-9]+)?";
    String altitude_value = "[+-]?[0-9]+('.'[0-9]+)? ('F'|'M')?";


    @Override
    public void enterLattitude(Airport_ParserParser.LattitudeContext ctx) {
        String str = ctx.getText();
        Double val = Double.parseDouble(str.split("=")[1]);
        if (val >= 90 || val <= -90)
            System.out.println("Error: Latitude value out of bounds! Expected ]-90,90[ but got " + val);
    }

    @Override
    public void enterLongitude(Airport_ParserParser.LongitudeContext ctx) {
        String str = ctx.getText();
        Double val = Double.parseDouble(str.split("=")[1]);
        if (val >= 180 || val <= -180)
            System.out.println("Error: Longitude value out of bounds! Expected ]-180,180[ but got " + val);
    }

    @Override
    public void enterOrientation(Airport_ParserParser.OrientationContext ctx) {
        String str = ctx.getText();
        String val = str.split("=")[1];
        if (val == "FORWARD" || val == "REVERSE")
            System.out.println("Error: Orientation value not expected! Expected 'FORWARD' OR 'REVERSE' but got " + val);
    }

    @Override
    public void enterTaxiwaypointType(Airport_ParserParser.TaxiwaypointTypeContext ctx) {
        String str = ctx.getText();
        String val = str.split("=")[1];
        if (val == "NORMAL" || val == "HOLD_SHORT" || val == "ILS_HOLD_SHORT" || val == "HOLD_SHORT_NO_DRAWT" || val == "ILS_HOLD_SHORT_NO_DRAW")
            System.out.println("Error: TaxiwaypointType value not expected! Expected 'NORMAL' or 'HOLD_SHORT' or  'ILS_HOLD_SHORT' or  'HOLD_SHORT_NO_DRAW' or 'ILS_HOLD_SHORT_NO_DRAW' but got " + val);
    }

    @Override
    public void enterRegion(Airport_ParserParser.RegionContext ctx) {
        String str = ctx.getText();
        String val = str.split("=")[1];
        if(!val.matches(str) && val.length()>48)
            System.out.println("Error: Region value out of bounds! Val size must be minor then 48 but was " + val.length());
    }

    @Override
    public void enterCity(Airport_ParserParser.CityContext ctx) {
        String str = ctx.getText();
        String val = str.split("=")[1];
        if(!val.matches(string) && val.length()>48)
            System.out.println("Error: City value out of bounds! Val size must be minor then 48 but was " + val.length());
    }

    @Override
    public void enterCountry(Airport_ParserParser.CountryContext ctx) {
        String str = ctx.getText();
        String val = str.split("=")[1];
        if(!val.matches(str) && val.length()>48)
            System.out.println("Error: Country value out of bounds! Val size must be minor then 48 but was " + val.length());
    }

    @Override
    public void enterState(Airport_ParserParser.StateContext ctx) {
        String str = ctx.getText();
        String val = str.split("=")[1];
        if(!val.matches(str) && val.length()>48)
            System.out.println("Error: State value out of bounds! Val size must be minor then 48 but was " + val.length());
    }

    @Override
    public void enterName(Airport_ParserParser.NameContext ctx) {
        String str = ctx.getText();
        String val = str.split("=")[1];
        if(!val.matches(str) && val.length()>48)
            System.out.println("Error: Name value out of bounds! Val size must be minor then 48 but was " + val.length());
    }

    @Override
    public void enterInstanceId(Airport_ParserParser.InstanceIdContext ctx) {
        String str = ctx.getText();
        String val = str.split("=")[1];
        if(!val.matches(str) && val.length()>48){
            System.out.println("Error: Name value out of bounds! Val size must be minor then 48 but was " + val.length());
        }
    }

    @Override
    public void enterPrimaryTakeoff(Airport_ParserParser.PrimaryTakeoffContext ctx) {
        String str = ctx.getText();
        String val = str.split("=")[1];
        if (val != "YES" || val != "NO" || val != "TRUE" || val != "FALSE")
            System.out.println("Error: PrimaryTakeoff value not expected! Val was: " + val);
    }

    @Override
    public void enterPrimaryLanding(Airport_ParserParser.PrimaryLandingContext ctx) {
        String str = ctx.getText();
        String val = str.split("=")[1];
        if (val != "TRUE" || val != "FALSE")
            System.out.println("Error: PrimaryLanding value not expected! Val was: " + val);
    }

    @Override
    public void enterPrimaryPattern(Airport_ParserParser.PrimaryPatternContext ctx) {
        String str = ctx.getText();
        String val = str.split("=")[1];
        if (val != "LEFT" || val != "RIGHT")
            System.out.println("Error: PrimaryPattern value not expected! Val was: " + val);
    }

    @Override
    public void enterSecondaryTakeoff(Airport_ParserParser.SecondaryTakeoffContext ctx) {
        String str = ctx.getText();
        String val = str.split("=")[1];
        if (val != "TRUE" || val != "FALSE")
            System.out.println("Error: SecondaryTakeoff value not expected! Val was: " + val);
    }

    @Override
    public void enterSecondaryLanding(Airport_ParserParser.SecondaryLandingContext ctx) {
        String str = ctx.getText();
        String val = str.split("=")[1];
        if (val != "TRUE" || val != "FALSE")
            System.out.println("Error: SecondaryLanding value not expected! Val was: " + val);
    }

    @Override
    public void enterSecondaryPattern(Airport_ParserParser.SecondaryPatternContext ctx) {
        String str = ctx.getText();
        String val = str.split("=")[1];
        if (val != "LEFT" || val != "RIGHT")
            System.out.println("Error: SecondaryPattern value not expected! Val was: " + val);
    }

    @Override
    public void enterPrimaryMarkingBias(Airport_ParserParser.PrimaryMarkingBiasContext ctx) {
        String str = ctx.getText();
        String val = str.split("=")[1];
        if (!val.matches(trafficScallar))
            System.out.println("Error: PrimaryMarkingBias value not expected! Val was: " + val);
    }

    @Override
    public void enterSecondaryMarkingBias(Airport_ParserParser.SecondaryMarkingBiasContext ctx) {
        String str = ctx.getText();
        String val = str.split("=")[1];
        if (!val.matches(trafficScallar))
            System.out.println("Error: SecondaryMarkingBias value not expected! Val was: " + val);
    }

    @Override
    public void enterAlternateThreshold(Airport_ParserParser.AlternateThresholdContext ctx) {
        String str = ctx.getText();
        String val = str.split("=")[1];
        if (val != "TRUE" || val != "FALSE")
            System.out.println("Error: AlternateThreshold value not expected! Val was: " + val);
    }

    @Override
    public void enterAlternateTouchdown(Airport_ParserParser.AlternateTouchdownContext ctx) {
        String str = ctx.getText();
        String val = str.split("=")[1];
        if (val != "TRUE" || val != "FALSE")
            System.out.println("Error: AlternateTouchdown value not expected! Val was: " + val);
    }

    @Override
    public void enterAlternateFixedDistance(Airport_ParserParser.AlternateFixedDistanceContext ctx) {
        String str = ctx.getText();
        String val = str.split("=")[1];
        if (val != "TRUE" || val != "FALSE")
            System.out.println("Error: AlternateFixedDistance value not expected! Val was: " + val);
    }

    @Override
    public void enterAlternatePrecision(Airport_ParserParser.AlternatePrecisionContext ctx) {
        String str = ctx.getText();
        String val = str.split("=")[1];
        if (val != "TRUE" || val != "FALSE")
            System.out.println("Error: AlternatePrecision value not expected! Val was: " + val);
    }

    @Override
    public void enterLeadingZeroIdent(Airport_ParserParser.LeadingZeroIdentContext ctx) {
        String str = ctx.getText();
        String val = str.split("=")[1];
        if (val != "TRUE" || val != "FALSE")
            System.out.println("Error: LeadingZeroIdent value not expected! Val was: " + val);
    }

    @Override
    public void enterNoThresholdEndArrows(Airport_ParserParser.NoThresholdEndArrowsContext ctx) {
        String str = ctx.getText();
        String val = str.split("=")[1];
        if (val != "TRUE" || val != "FALSE")
            System.out.println("Error: NoThresholdEndArrows value not expected! Val was: " + val);
    }

    @Override
    public void enterEdges(Airport_ParserParser.EdgesContext ctx) {
        String str = ctx.getText();
        String val = str.split("=")[1];
        if (val != "TRUE" || val != "FALSE")
            System.out.println("Error: Edges value not expected! Val was: " + val);
    }

    @Override
    public void enterThreshold(Airport_ParserParser.ThresholdContext ctx) {
        String str = ctx.getText();
        String val = str.split("=")[1];
        if (val != "TRUE" || val != "FALSE")
            System.out.println("Error: Threshold value not expected! Val was: " + val);
    }

    @Override
    public void enterFixed(Airport_ParserParser.FixedContext ctx) {
        String str = ctx.getText();
        String val = str.split("=")[1];
        if (val != "TRUE" || val != "FALSE")
            System.out.println("Error: Fixed value not expected! Val was: " + val);
    }

    @Override
    public void enterTouchdown(Airport_ParserParser.TouchdownContext ctx) {
        String str = ctx.getText();
        String val = str.split("=")[1];
        if (val != "TRUE" || val != "FALSE")
            System.out.println("Error: Touchdown value not expected! Val was: " + val);
    }

    @Override
    public void enterDashes(Airport_ParserParser.DashesContext ctx) {
        String str = ctx.getText();
        String val = str.split("=")[1];
        if (val != "TRUE" || val != "FALSE")
            System.out.println("Error: Dashes value not expected! Val was: " + val);
    }

    @Override
    public void enterIdent_Marking(Airport_ParserParser.Ident_MarkingContext ctx) {
        String str = ctx.getText();
        String val = str.split("=")[1];
        if (val != "TRUE" || val != "FALSE")
            System.out.println("Error: Ident_Marking value not expected! Val was: " + val);
    }

    @Override
    public void enterPrecision(Airport_ParserParser.PrecisionContext ctx) {
        String str = ctx.getText();
        String val = str.split("=")[1];
        if (val != "TRUE" || val != "FALSE")
            System.out.println("Error: Precision value not expected! Val was: " + val);
    }

    @Override
    public void enterEdgePavement(Airport_ParserParser.EdgePavementContext ctx) {
        String str = ctx.getText();
        String val = str.split("=")[1];
        if (val != "TRUE" || val != "FALSE")
            System.out.println("Error: EdgePavement value not expected! Val was: " + val);
    }

    @Override
    public void enterSingleEnd(Airport_ParserParser.SingleEndContext ctx) {
        String str = ctx.getText();
        String val = str.split("=")[1];
        if (val != "TRUE" || val != "FALSE")
            System.out.println("Error: SingleEnd value not expected! Val was: " + val);
    }

    @Override
    public void enterPrimaryClosed(Airport_ParserParser.PrimaryClosedContext ctx) {
        String str = ctx.getText();
        String val = str.split("=")[1];
        if (val != "TRUE" || val != "FALSE")
            System.out.println("Error: PrimaryClosed value not expected! Val was: " + val);
    }

    @Override
    public void enterSecondaryClosed(Airport_ParserParser.SecondaryClosedContext ctx) {
        String str = ctx.getText();
        String val = str.split("=")[1];
        if (val != "TRUE" || val != "FALSE")
            System.out.println("Error: SecondaryClosed value not expected! Val was: " + val);
    }

    @Override
    public void enterPrimaryStol(Airport_ParserParser.PrimaryStolContext ctx) {
        String str = ctx.getText();
        String val = str.split("=")[1];
        if (val != "TRUE" || val != "FALSE")
            System.out.println("Error: PrimaryStol value not expected! Val was: " + val);
    }

    @Override
    public void enterSecondaryStol(Airport_ParserParser.SecondaryStolContext ctx) {
        String str = ctx.getText();
        String val = str.split("=")[1];
        if (val != "TRUE" || val != "FALSE")
            System.out.println("Error: SecondaryStol value not expected! Val was: " + val);
    }

    @Override
    public void enterBackCourse(Airport_ParserParser.BackCourseContext ctx) {
        String str = ctx.getText();
        String val = str.split("=")[1];
        if (val != "TRUE" || val != "FALSE")
            System.out.println("Error: BackCourse value not expected! Val was: " + val);
    }

    @Override
    public void enterCenterRed(Airport_ParserParser.CenterRedContext ctx) {
        String str = ctx.getText();
        String val = str.split("=")[1];
        if (val != "TRUE" || val != "FALSE")
            System.out.println("Error: CenterRed value not expected! Val was: " + val);
    }

    @Override
    public void enterStrobes(Airport_ParserParser.StrobesContext ctx) {
        String str = ctx.getText();
        String val = str.split("=")[1];
        if (!val.matches(unsigned_int))
            System.out.println("Error: Strobes value not expected! Val was: " + val);
    }

    @Override
    public void enterAltitude(Airport_ParserParser.AltitudeContext ctx) {
        String str = ctx.getText();
        String val = str.split("=")[1];
        if (!val.matches(altitude_value))
            System.out.println("Error: Altitude value not expected! Val was: " + val);
    }

    @Override
    public void enterAirportTestRadius(Airport_ParserParser.AirportTestRadiusContext ctx) {
        String str = ctx.getText();
        String val = str.split("=")[1];
        if (!val.matches(trafficScallar))
            System.out.println("Error: AirportTestRadius value not expected! Val was: " + val);
    }

    @Override
    public void enterRadius(Airport_ParserParser.RadiusContext ctx) {
        String str = ctx.getText();
        String val = str.split("=")[1];
        if (!val.matches(floatnumber))
            System.out.println("Error: Radius value not expected! Val was: " + val);
    }

    @Override
    public void enterTaxiwayparkingNumber(Airport_ParserParser.TaxiwayparkingNumberContext ctx) {
        String str = ctx.getText();
        Double val = Double.parseDouble(str.split("=")[1]);
        if (val >= 3999 || val < 0)
            System.out.println("Error: TaxiwayparkingNumber value out of bounds! Expected [0,3999] but got " + val);
    }

    @Override
    public void enterAvailability(Airport_ParserParser.AvailabilityContext ctx) {
        String str = ctx.getText();
        String val = str.split("=")[1];
        if (val != "TRUE" || val != "FALSE" || val != "UNKNOWN" || val != "PRIOR_REQUEST")
            System.out.println("Error: Availability value out of bounds! Expected [0,3999] but got " + val);
    }
}




