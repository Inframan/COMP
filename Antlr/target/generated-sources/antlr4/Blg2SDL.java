/**
 * Created by fatia on 14-05-2015.
 */
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTreeWalker;



public class Blg2SDL {

	public static void main(String[] Args){

		try {
			
			
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
			
			System.out.println(tree.toStringTree(parser)); // print LISP-style tree
			ParseTreeWalker walker = new ParseTreeWalker(); // create standard walker
			
			Listener extractor = new Listener();
			walker.walk(extractor, tree); // initiate walk of tree with listener
			System.out.println("for debug");
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
			 
	}
}
