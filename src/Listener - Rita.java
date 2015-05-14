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
        if (val != "FORWARD" && val  != "REVERSE")
            System.out.println("Error: Orientation value not expected! Expected 'FORWARD' OR 'REVERSE' but got " + val);
    }

    @Override
    public void enterTaxiwaypointType(Airport_ParserParser.TaxiwaypointTypeContext ctx) {
        String str = ctx.getText();
        String val = str.split("=")[1];
        if (val  != "NORMAL" && val != "HOLD_SHORT" && val  != "ILS_HOLD_SHORT" && val != "HOLD_SHORT_NO_DRAWT" && val  != "ILS_HOLD_SHORT_NO_DRAW")
            System.out.println("Error: TaxiwaypointType value not expected! Expected 'NORMAL' or 'HOLD_SHORT' or  'ILS_HOLD_SHORT' or  'HOLD_SHORT_NO_DRAW' or 'ILS_HOLD_SHORT_NO_DRAW' but got " + val);
    }

    @Override
    public void enterTaxiwayparkingType(Airport_ParserParser.TaxiwayparkingTypeContext ctx) {
        String str = ctx.getText();
        String val = str.split("=")[1];
        if (val != "NONE" && val  != "DOCK_GA" && val  != "FUEL" && val != "GATE_HEAVY" && val  != "GATE_MEDIUM" && val  != "GATE_SMALL" && val  != "RAMP_CARGO" && val  != "RAMP_GA" && val  != "RAMP_GA_LARGE" && val  != "RAMP_GA_MEDIUM" && val  != "RAMP_GA_SMALL" && val != "RAMP_MIL_CARGO" && val  != "RAMP_MIL_COMBAT" && val  != "VEHICLE")
            System.out.println("Error: TaxiwayparkingType value not expected! Got " + val);
    }

    @Override
    public void enterTaxiwayparkingName(Airport_ParserParser.TaxiwayparkingNameContext ctx) {
        String str = ctx.getText();
        String val = str.split("=")[1];
        if (val != "PARKING" && val  != "DOCK" && val  != "GATE" && val != "GATE_" && val  != "NONE" && val  != "N_PARKING" && val  != "NE_PARKING" && val  != "NW_PARKING" && val  != "SE_PARKING" && val  != "S_PARKING" && val  != "SW_PARKING" && val != "W_PARKING" && val  != "E_PARKING" )
            System.out.println("Error: TaxiwayparkingName value not expected! Got " + val);
    }

    @Override
    public void enterPush_back(Airport_ParserParser.Push_backContext ctx) {
        String str = ctx.getText();
        String val = str.split("=")[1];
        if (val != "NONE" && val  != "BOTH" && val  != "LEFT" && val != "RIGHT" )
            System.out.println("Error: Push_back value not expected! Got " + val);
    }

    @Override
    public void enterTaxiwayPathType(Airport_ParserParser.TaxiwayPathTypeContext ctx) {
        String str = ctx.getText();
        String val = str.split("=")[1];
        if (val != "RUNWAY" && val  != "PARKING" && val  != "TAXI" && val != "PATH" && val != "CLOSED" && val != "VEHICLE")
            System.out.println("Error: TaxiwayPathType value not expected! Got " + val);
    }

    @Override
    public void enterLeftEdgeLighted(Airport_ParserParser.LeftEdgeLightedContext ctx) {
        String str = ctx.getText();
        String val = str.split("=")[1];
        if (val != "NONE" && val  != "SOLID" && val  != "DASHED" && val != "SOLID_DASHED")
            System.out.println("Error: LeftEdgeLighted value not expected! Got " + val);
    }

    @Override
    public void enterRightEdgeLighted(Airport_ParserParser.RightEdgeLightedContext ctx) {
        String str = ctx.getText();
        String val = str.split("=")[1];
        if (val != "NONE" && val  != "SOLID" && val  != "DASHED" && val != "SOLID_DASHED")
            System.out.println("Error: RightEdgeLighted value not expected! Got " + val);
    }

    @Override
    public void enterTaxiwayPathNumber(Airport_ParserParser.TaxiwayPathNumberContext ctx) {
        String str = ctx.getText();
        String val = str.split("=")[1];
        if (val != "EAST" && val  != "NORTH" && val  != "NORTHEAST" && val != "NORTHWEST" && val != "SOUTH" && val != "SOUTHEAST" && val != "SOUTHWEST" && val != "WEST")
            System.out.println("Error: TaxiwayPathNumber value not expected! Got " + val);
    }

     @Override
    public void enterNumber(Airport_ParserParser.NumberContext ctx) {
        String str = ctx.getText();
        String val = str.split("=")[1];
        if (val != "EAST" && val  != "NORTH" && val  != "NORTHEAST" && val != "NORTHWEST" && val != "SOUTH" && val != "SOUTHEAST" && val != "SOUTHWEST" && val != "WEST")
            System.out.println("Error: Number value not expected! Got " + val);
    }




}