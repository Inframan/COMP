/**
 * Created by fatia on 14-05-2015.
 */
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.gui.TreeViewer;



public class Blg2SDL {

	public static void main(String[] Args){

		try {
			
			String output="SDLOutputFile.sdl";
			if(Args.length>1)
				output=Args[1];
			String inputFile = null;
			if(Args.length > 0) inputFile = Args[0];
			InputStream is = System.in;
			if(inputFile != null) is = new FileInputStream(inputFile);
			else
				is = new FileInputStream("Portugal CentroNorte.bgl.xml");
			System.out.println(is);
			ANTLRInputStream input = new ANTLRInputStream(is);
			
			Airport_ParserLexer lexer = new Airport_ParserLexer(input);
			
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			
			Airport_ParserParser parser = new Airport_ParserParser(tokens);
			
			ParserRuleContext tree = parser.airports(); // parse
			
			//System.out.println(tree.toStringTree(parser)); // print LISP-style tree
			TreeViewer viewr = new TreeViewer(Arrays.asList(parser.getRuleNames()),tree);
			viewr.setScale(1);		
			PanAndZoom pan = new PanAndZoom(viewr);
			ParseTreeWalker walker = new ParseTreeWalker(); // create standard walker
			
			Listener extractor = new Listener();
			walker.walk(extractor, tree); // initiate walk of tree with listener
	
			SDLgenerator gen = new SDLgenerator(extractor,output);
			
			gen.export();
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		} catch(Exception e){
			System.out.println("Couldn't parse");
		}
			 
	}
}
