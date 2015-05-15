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
    
    Pattern string8 = [A-Za-z0-9]{0,8};
    Pattern floatnumber = [+-]?[0-9]+('.'[0-9]+)?;
    Pattern heading = [0-360]('.'[0-9]+)?;
    Pattern range = [0-9]+[FMN];



    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override 
    public void enterRed(@NotNull Airport_ParserParser.RedContext ctx)
    {
        String str = ctx.getText();
        int val = Integer.parseInt(str.split("=")[1]);
        if(val < 0 || val > 255)
            System.out.println("Error: Red value out of bounds! Expected [0,255] but got " + val);
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */

    @Override 
    public void enterGreen(@NotNull Airport_ParserParser.GreenContext ctx)
    {
        String str = ctx.getText();
        int val = Integer.parseInt(str.split("=")[1]);
        if(val < 0 || val > 255)
            System.out.println("Error: Blue value out of bounds! Expected [0,255] but got " + val);

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */

    @Override 
    public void enterBlue(@NotNull Airport_ParserParser.BlueContext ctx)
    {
        String str = ctx.getText();
        int val = Integer.parseInt(str.split("=")[1]);
        if(val < 0 || val > 255)
            System.out.println("Error: Green value out of bounds! Expected [0,255] but got " + val);


    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */

    @Override
    public void enterApproach_runway(@NotNull Airport_ParserParser.Approach_runwayContext ctx)
    {
        String str = ctx.getText();
        String value = str.split("=")[1];

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
                int d = Double.parseInt(value);
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
            System.out.println("Error: Aprroach_Runway value out of bounds! Expected cardinal points but got " + val);

    }

    @Override
    public void enterTaxiwayPathName(@NotNull Airport_ParserParser.TaxiwayPathNameContext ctx)
    {
        String str = ctx.getText();
        int val = Integer.parseInt(str.split("=")[1]);
        if(val < 0 || val > 255)
            System.out.println("Error: Name value out of bounds! Expected [0,255] but got " + val);

    }


    @Override
    public void enterTaxiwayNameString(@NotNull Airport_ParserParser.TaxiwayNameStringContext ctx)
    {
        String str = ctx.getText();
        String val = str.split("=")[1];
        if(!val.matches(string8))
            System.out.println("Error: taxiwayNameString Name value not expected! Got " + val);

    }
    
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
    public void enterSurface(Airport_ParserParser.SurfaceContext ctx) {
        String str = ctx.getText();
        String val = str.split("=")[1];
        if (val != "ASPHALT" && val  != "BITUMINOUS" && val  != "BRICK" && val != "CLAY" && val != "CEMENT" && val != "CONCRETE" && val != "CORAL" && val != "DIRT" && val != "GRASS" && val != "GRAVEL" && val != "ICE" && val != "MACADAM" && val != "OIL_TREATED" && val != "PLANKS" && val != "SAND" && val != "SHALE" && val != "SNOW" && val != "STEEL_MATS" && val != "TARMAC" && val != "UNKNOWN" && val != "WATER")
            System.out.println("Error: Surface value not expected! Got " + val);
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

    @Override
    public void enterDesignator(Airport_ParserParser.DesignatorContext ctx) {
        String str = ctx.getText();
        String val = str.split("=")[1];
        if (val != "NONE" && val  != "C" && val  != "CENTER" && val != "L" && val != "LEFT" && val != "R" && val != "RIGHT" && val != "W" && val != "WATER" && val != "A" && val != "B")
            System.out.println("Error: Designator value not expected! Got " + val);
    }

    @Override
    public void enterPrimaryDesignator(Airport_ParserParser.PrimaryDesignatorContext ctx) {
        String str = ctx.getText();
        String val = str.split("=")[1];
        if (val != "NONE" && val  != "C" && val  != "CENTER" && val != "L" && val != "LEFT" && val != "R" && val != "RIGHT" && val != "W" && val != "WATER" && val != "A" && val != "B")
            System.out.println("Error: PrimaryDesignator value not expected! Got " + val);
    }

    @Override
    public void enterSecondaryDesignator(Airport_ParserParser.SecondaryDesignatorContext ctx) {
        String str = ctx.getText();
        String val = str.split("=")[1];
        if (val != "NONE" && val  != "C" && val  != "CENTER" && val != "L" && val != "LEFT" && val != "R" && val != "RIGHT" && val != "W" && val != "WATER" && val != "A" && val != "B")
            System.out.println("Error: SecondaryDesignator value not expected! Got " + val);
    }

    @Override
    public void enterLength(Airport_ParserParser.LengthContext ctx) {
        String str = ctx.getText();
        String val = str.split("=")[1];
        if (val != "M" && val  != "F" )
            System.out.println("Error: Length value not expected! Got " + val);
    }

    @Override
    public void enterPatternAltitude(Airport_ParserParser.PatternAltitudeContext ctx) {
        String str = ctx.getText();
        String val = str.split("=")[1];
        if (val != "M" && val  != "F" )
            System.out.println("Error: PatternAltitude value not expected! Got " + val);
    }

    @Override
    public void enterSpacing(Airport_ParserParser.SpacingContext ctx) {
        String str = ctx.getText();
        String val = str.split("=")[1];
        if (val != "M" && val  != "F" )
            System.out.println("Error: Spacing value not expected! Got " + val);
    }

    @Override
    public void enterHelipad(Airport_ParserParser.HelipadContext ctx) {
        String str = ctx.getText();
        String val = str.split("=")[1];
        if (val != "M" && val  != "F" )
            System.out.println("Error: Helipad value not expected! Got " + val);
    }

    @Override
    public void enterCenter(Airport_ParserParser.CenterContext ctx) {
        String str = ctx.getText();
        String val = str.split("=")[1];
        if (val != "NONE" && val  != "LOW" && val  != "MEDIUM" && val  != "HIGH")
            System.out.println("Error: Center value not expected! Got " + val);
    }

    @Override
    public void enterEdge(Airport_ParserParser.EdgeContext ctx) {
        String str = ctx.getText();
        String val = str.split("=")[1];
        if (val != "NONE" && val  != "LOW" && val  != "MEDIUM" && val  != "HIGH")
            System.out.println("Error: Edge value not expected! Got " + val);
    }

    @Override
    public void enterEnd(Airport_ParserParser.EndContext ctx) {
        String str = ctx.getText();
        String val = str.split("=")[1];
        if (val != "PRIMARY" && val  != "SECONDARY")
            System.out.println("Error: End value not expected! Got " + val);
    }

    @Override
    public void enterSystem(Airport_ParserParser.SystemContext ctx) {
        String str = ctx.getText();
        String val = str.split("=")[1];
        if (val != "NONE" && val  != "ALSF1" && val  != "ALSF2" && val  != "CALVERT" && val  != "CALVERT2" && val  != "MALS" && val  != "MALSF" && val  != "MALSR" && val  != "ODALS" && val  != "RAIL" && val  != "SALS" && val  != "SALSF" && val  != "SSALF" && val  != "SSALR" && val  != "SSALS")
            System.out.println("Error: System value not expected! Got " + val);
    }

    @Override
    public void enterVasiType(Airport_ParserParser.VasiTypeContext ctx) {
        String str = ctx.getText();
        String val = str.split("=")[1];
        if (val != "PAPI2" && val  != "PAPI4" && val  != "PVASI" && val  != "TRICOLOR" && val  != "TVASI" && val  != "VASI21" && val  != "VASI22" && val  != "VASI23" && val  != "VASI31" && val  != "VASI32" && val  != "VASI33" && val  != "BALL" && val  != "APAP" && val  != "PANELS")
            System.out.println("Error: VasiType value not expected! Got " + val);
    }

    @Override
    public void enterRunway_start(Airport_ParserParser.Runway_startContext ctx) {
        String str = ctx.getText();
        String val = str.split("=")[1];
        if (val != "RUNWAY")
            System.out.println("Error: Runway_start value not expected! Got " + val);
    }

    @Override
    public void enterImage_complexety(Airport_ParserParser.Image_complexetyContext ctx) {
        String str = ctx.getText();
        String val = str.split("=")[1];
        if (val != "VERY_SPARSE" && val  != "SPARSE" && val  != "NORMAL" && val  != "DENSE" && val  != "VERY_DENSE")
            System.out.println("Error: Image_complexety value not expected! Got " + val);
    }

    @Override
    public void enterFuel_type(Airport_ParserParser.Fuel_typeContext ctx) {
        String str = ctx.getText();
        String val = str.split("=")[1];
        if (val != "73" && val  != "87" && val  != "100" && val  != "130" && val  != "145" && val  != "MOGAS" && val  != "JET" && val  != "JETA" && val  != "JETA1" && val  != "JETAP" && val  != "JETB" && val  != "JET4" && val  != "JET5" && val  != "UNKNOWN")
            System.out.println("Error: Fuel_type value not expected! Got " + val);
    }
    
    @Override
    public void enterLeftEdge(@NotNull Airport_ParserParser.LeftEdgeContext ctx){
		String str = ctx.getText();
		boolean val = boolean.parseDouble(str.split("=")[1]);
    	if (val == null)
    		System.out.println("Error: LeftEdge value not expected! Got " + val);
	}
    
    @Override
    public void enterRightEdgeLighted(@NotNull Airport_ParserParser.RightEdgeLightedContext ctx){
		String str = ctx.getText();
		boolean val = boolean.parseDouble(str.split("=")[1]);
    	if (val == null)
    		System.out.println("Error: RightEdgeLighted value not expected! Got " + val);
	}
    
    @Override
    public void enterTaxiwayPathStart(@NotNull Airport_ParserParser.TaxiwayPathStartContext ctx)
	{
        String str = ctx.getText();
        Double val = Double.parseDouble(str.split("=")[1]);
        if (val >= 255 || val < 0)
            System.out.println("Error: TaxiwayPathStart value not expected! Got " + val);
    }


}