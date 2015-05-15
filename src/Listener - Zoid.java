import java.lang.Object
import java.util.regex.*

public class Listener extends Airport_ParserBaseListener {
    Pattern ident = Pattern.compile("[A-Za-Z]{0,5}");
    Pattern floatnumber = Pattern.compile("[+-]?[0-9]+('.'[0-9]+)?");
    Pattern heading = Pattern.compile("[0-360]('.'[0-9]+)?");


    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterRed(@NotNull Airport_ParserParser.RedContext ctx)
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

    @Override public void enterGreen(@NotNull Airport_ParserParser.GreenContext ctx)
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

    @Override public void enterBlue(@NotNull Airport_ParserParser.BlueContext ctx)
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

    @Override public void enterApproach_runway(@NotNull Airport_ParserParser.Approach_runwayContext ctx)
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



}
