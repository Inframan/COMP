import java.util.regex.*;

public class Listener extends Airport_ParserBaseListener {

    Pattern str= Pattern.compile("[a-zA-Z0-9]");


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
        if(!val.matches(str) && val.length()>48)
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




}