public class Listener extends Airport_ParserBaseListener {
    @Override
    public void enterLattitude(Airport_ParserParser.LattitudeContext ctx) {
        String str = ctx.getText();
        Double val = Double.parseDouble(str.split("=")[1]);
        if (val >= 90 || val <= -90)
            System.out.println("Error: Latitude value out of bounds! Expected ]-90,90[ but got " + val);
    }

    @Override
    public void enterOrientation(Airport_ParserParser.OrientationContext ctx) {
        String str = ctx.getText();
        String val = str.split("=")[1];
        if (val == "FORWARD" || val == "REVERSE")
            System.out.println("Error: Orientation value not expected! Expected 'FORWARD' OR 'REVERSE' but got " + val);
    }



}