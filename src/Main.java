/**
 * Created by fatia on 14-05-2015.
 */
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.LexerInterpreter;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.tool.Grammar;

import java.util.Scanner;


public class Main {

    public static void main(String[] Args){

    	 try {
            
		String inputFile = null;
		if(args.length > 0) inputFile = args[0];
		InputStream is = System.in;
		if(inputFile != null) is = new FileInputStream(inputFile);
		
		ANTLRInputStream input = new ANTLRInputStream(is);
		
		Airport_ParserLexer lexer = new Airport_ParserLexer(input);
		
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		
		Airport_ParserParser parser = new Airport_ParserParser(tokens);
		
		ParserRuleContext tree = parser.startpoint(); // parse
		
		System.out.println(tree.toStringTree(parser)); // print LISP-style tree
		ParseTreeWalker walker = new ParseTreeWalker(); // create standard walker
														
		Airport_ParserListener extractor = new Airport_ParserListener();
		walker.walk(extractor, tree); // initiate walk of tree with listener
         } catch (Exception e) {
             e.printStackTrace();
         }
    	
    }
}
