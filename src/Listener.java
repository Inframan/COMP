import java.util.regex.*;

public class Listener extends Airport_ParserBaseListener {

    String floatnumber = "[+-]?[0-9]+('.'[0-9]+)?";
    String ident = "[A-Za-z]{0,5}";
    String heading = "[0-360]('.'[0-9]+)?";
    String range = "[0-9]+[FMN]";
    String string = "[a-zA-Z0-9]";
    String trafficScallar = "[0-9]+['F'|'M'|'N']";
    String unsigned_int = "[0-9]*";
    String altitude_value = "[+-]?[0-9]+('.'[0-9]+)? [FM]?";
    String string8 = "[A-Za-z0-9]{0,8}";


    @Override 
    public void enterRed(Airport_ParserParser.RedContext ctx)
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
    public void enterGreen(Airport_ParserParser.GreenContext ctx)
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
    public void enterBlue(Airport_ParserParser.BlueContext ctx)
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
    public void enterApproach_runway(Airport_ParserParser.Approach_runwayContext ctx)
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
        int val = Integer.parseInt(str.split("=")[1]);
        if(val < 0 || val > 255)
            System.out.println("Error: Name value out of bounds! Expected [0,255] but got " + val);

    }


    @Override
    public void enterTaxiwayNameString(Airport_ParserParser.TaxiwayNameStringContext ctx)
    {
        String str = ctx.getText();
        String val = str.split("=")[1];
        if(!val.matches(string8))
            System.out.println("Error: taxiwayNameString Name value not expected! Got " + val);

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
    public void enterTaxiwayPathStart(Airport_ParserParser.TaxiwayPathStartContext ctx)
	{
        String str = ctx.getText();
        Double val = Double.parseDouble(str.split("=")[1]);
        if (val >= 255 || val < 0)
            System.out.println("Error: TaxiwayPathStart value not expected! Got " + val);
    }

    @Override
    public void enterIdent(Airport_ParserParser.IdentContext ctx) {
        String str = ctx.getText();
        String val = str.split("=")[1];
        if(!val.matches(ident))
            System.out.println("Error: Ident value not expected! Got " + val);
    }

    @Override
    public void enterPitch(Airport_ParserParser.PitchContext ctx)
    {
        String str = ctx.getText();
        String val = str.split("=")[1];
        if(!val.matches(ident))
            System.out.println("Error: Pitch value not expected! Got " + val);
    }

    @Override
    public void enterIndex(Airport_ParserParser.IndexContext ctx) {
        String str = ctx.getText();
        Double val = Double.parseDouble(str.split("=")[1]);
        if (val >= 3999 || val <= 0)
            System.out.println("Error: Index value not expected! Got " + val);
    }

    @Override
    public void enterBiasX(Airport_ParserParser.BiasXContext ctx)
    {
        String str = ctx.getText();
        String val = str.split("=")[1];
        if(!val.matches(floatnumber))
            System.out.println("Error: BiasX value not expected! Got " + val);
    }

    @Override
    public void enterRange(Airport_ParserParser.RangeContext ctx){
        String str = ctx.getText();
        String val = str.split("=")[1];
        if(!val.matches(range))
            System.out.println("Error: Range value not expected! Got " + val);
    }

    @Override
    public void enterBiasY(Airport_ParserParser.BiasYContext ctx)
    {
        String str = ctx.getText();
        String val = str.split("=")[1];
        if(!val.matches(floatnumber))
            System.out.println("Error: BiasY value not expected! Got " + val);
    }

    @Override
    public void enterBiasZ(Airport_ParserParser.BiasZContext ctx)
    {
        String str = ctx.getText();
        String val = str.split("=")[1];
        if(!val.matches(floatnumber))
            System.out.println("Error: Biaz value not expected! Got " + val);
    }

    @Override
    public void enterHeading(Airport_ParserParser.HeadingContext ctx)
    {
        String str = ctx.getText();
        String val = str.split("=")[1];
        if(!val.matches(heading))
            System.out.println("Error: Heading value not expected! Got " + val);
    }
    @Override
    public void enterLattitude(Airport_ParserParser.LattitudeContext ctx) {
        String str = ctx.getText();
        Double val = Double.parseDouble(str.split("=")[1]);
        if (val >= 90 || val <= -90)
            System.out.println("Error: lattitude value not expected! Got " + val);
    }
    @Override
    public void enterMagvar(Airport_ParserParser.MagvarContext ctx) {
        String str = ctx.getText();
        Double val = Double.parseDouble(str.split("=")[1]);
        if (val >= 360 || val <= -360)
            System.out.println("Error: Magvar value not expected! Got " + val);
    }
    @Override
    public void enterWidth(Airport_ParserParser.WidthContext ctx)
    {
        String str = ctx.getText();
        String val = str.split("=")[1];
        if(!val.matches(floatnumber))
            System.out.println("Error: width value not expected! Got " + val);
    }
    @Override
    public void enterCenterLineLighted(Airport_ParserParser.CenterLineLightedContext ctx){
        String str = ctx.getText();
        String val = str.split("=")[1];
        if (val != "TRUE" || val != "FALSE")
            System.out.println("Error: CenterLineLighted value not expected! Got " + val);
    }
    @Override
    public void enterFrequency(Airport_ParserParser.FrequencyContext ctx){
        String str = ctx.getText();
        String val = str.split("=")[1];
        if(!val.matches(floatnumber))
            System.out.println("Error: Frequency value not expected! Got " + val);
    }
    @Override
    public void enterTeeOffSet3(Airport_ParserParser.TeeOffSet3Context ctx) {
        String str = ctx.getText();
        Double val = Double.parseDouble(str.split("=")[1]);
        if (val >= 0.0 || val <= 50.0)
            System.out.println("Error: TeeOffSet3 value not expected! Got " + val);
    }
    @Override
    public void enterTeeOffSet4(Airport_ParserParser.TeeOffSet4Context ctx){
        String str = ctx.getText();
        Double val = Double.parseDouble(str.split("=")[1]);
        if (val >= 0.0 || val <= 50.0)
            System.out.println("Error: TeeOffSet4 value not expected! Got " + val);
    }
    @Override
    public void enterTeeOffSet1(Airport_ParserParser.TeeOffSet1Context ctx){
        String str = ctx.getText();
        Double val = Double.parseDouble(str.split("=")[1]);
        if (val >= 0.0 || val <= 50.0)
            System.out.println("Error: TeeOffSet1 value not expected! Got " + val);
    }
    @Override
    public void enterTeeOffSet2(Airport_ParserParser.TeeOffSet2Context ctx){
        String str = ctx.getText();
        Double val = Double.parseDouble(str.split("=")[1]);
        if (val >= 0.0 || val <= 50.0)
            System.out.println("Error: TeeOffSet2 value not expected! Got " + val);
    }
    @Override
    public void enterLongitude(Airport_ParserParser.LongitudeContext ctx) {
        String str = ctx.getText();
        Double val = Double.parseDouble(str.split("=")[1]);
        if (val >= 180 || val <= -180)
            System.out.println("Error: Longitude value not expected! Got " + val);
    }
    @Override
    public void enterDrawSurface(Airport_ParserParser.DrawSurfaceContext ctx)	{
        String str = ctx.getText();
        String val = str.split("=")[1];
        if (val != "TRUE" || val != "FALSE")
            System.out.println("Error: drawSurface value not expected! Got " + val);
    }
    @Override
    public void enterIdent_ils(Airport_ParserParser.Ident_ilsContext ctx) {
        String str = ctx.getText();
        String val = str.split("=")[1];
        if(!val.matches(ident))
            System.out.println("Error: Ident_ils value not expected! Got " + val);
    }
    @Override
    public void enterCenterLine(Airport_ParserParser.CenterLineContext ctx){
        String str = ctx.getText();
        String val = str.split("=")[1];
        if (val != "TRUE" || val != "FALSE")
            System.out.println("Error: CenterLine value not expected! Got " + val);
    }
    @Override
    public void enterDrawDetail(Airport_ParserParser.DrawDetailContext ctx)  {
        String str = ctx.getText();
        String val = str.split("=")[1];
        if (val != "TRUE" || val != "FALSE")
            System.out.println("Error: DrawDetail value not expected! Got " + val);
    }
    @Override
    public void enterTaxiwayPathEnd(Airport_ParserParser.TaxiwayPathEndContext ctx)	{
        String str = ctx.getText();
        Double val = Double.parseDouble(str.split("=")[1]);
        if (val >= 255 || val < 0)
            System.out.println("Error: TaxiwayPathEnd value not expected! Got " + val);
    }
    @Override
    public void enterWeightLimit(Airport_ParserParser.WeightLimitContext ctx)	{
        String str = ctx.getText();
        Double val = Double.parseDouble(str.split("=")[1]);
        if (val >= 255 || val < 0)
            System.out.println("Error: WeightLimit value not expected! Got " + val);
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