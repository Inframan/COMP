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
             Scanner sc = new Scanner(System.in);
             Grammar g = Grammar.load("Airport_Parser.g4");
             LexerInterpreter lexer = g.createLexerInterpreter(new ANTLRFileStream(sc.next()));
             CommonTokenStream tokens = new CommonTokenStream(lexer);
             Airport_ParserParser parser = new Airport_ParserParser(tokens);
             ParseTree t = parser.airports();
             ParseTreeWalker walker = new ParseTreeWalker();
             Listener listener = new Listener();
             walker.walk(listener, t);

             sc.close();
         } catch (Exception e) {
             e.printStackTrace();
         }
    	
    }
}
