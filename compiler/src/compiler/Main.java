package compiler;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.tree.pattern.ParseTreeMatch;
import org.antlr.v4.runtime.tree.pattern.ParseTreePattern;

import org.antlr.v4.runtime.tree.pattern.ParseTreePatternMatcher;
import org.antlr.v4.runtime.tree.xpath.XPath;

import lexerparser.*;

public class Main {
	
	public static void menu() {
		
		String choice;
		String filePath = "/Users/matt/eclipse-workspace2/compiler/src/compiler/samplePlainEnglish.pe";
		boolean exit = false;
		while(exit == false) {
			System.out.println("Welcome to the Plain English compiler\n"
	    			+ "Please select an option by typing the corresponding number and pressing enter\n"
	    			+ "1. Display the parse tree\n"
	    			+ "2. Search for an element in the parse tree\n"
	    			+ "3. To translate the file to JavaScript\n"
	    			+ "4. To view file path\n"
	    			+ "5. To input a custom file path\n"
	    			+ "6. To exit\n");
			Scanner menuInput = new Scanner(System.in);
			int temp = menuInput.nextInt();
			choice = "3";
			menuInput.close();
			
			switch(choice) {
			  case "1":
				  	File file = new File(filePath);
			        FileInputStream fis = null;
			        
			        try {
			        	fis = new FileInputStream(file);
			        	ANTLRInputStream inputFile = new ANTLRInputStream(fis);
			            PlainEnglishLexer lexer = new PlainEnglishLexer(inputFile);
			            CommonTokenStream tokens = new CommonTokenStream(lexer);
			            PlainEnglishParser parser = new PlainEnglishParser(tokens);
			            ParseTree tree = parser.program();
			            
			            ParseTreeWalker walker = new ParseTreeWalker();
			            walker.walk(new ParseTreePrint(), tree);

			            

			        } catch (IOException e) {
			            e.printStackTrace();
			        }
			        break;
			  case "2":
				  	File searchFile = new File(filePath);
			        FileInputStream searchFis = null;
			        
			        try {
			        	searchFis = new FileInputStream(searchFile);
			        	ANTLRInputStream searchInputFile = new ANTLRInputStream(searchFis);
			            PlainEnglishLexer lexer = new PlainEnglishLexer(searchInputFile);
			            CommonTokenStream tokens = new CommonTokenStream(lexer);
			            PlainEnglishParser parser = new PlainEnglishParser(tokens);
			            ParseTree tree = parser.program();
			            
			            Scanner searchInput = new Scanner(System.in);
			            System.out.println("Enter your search term \n");
					    String searchTerm = "literal";
					    searchInput.close();
					    boolean treeFound = false;
					    Collection<ParseTree> matchedTrees = null;
			            try {
			            	XPath p = new XPath(parser, "//" + searchTerm);
				            matchedTrees = p.evaluate(tree);
				            treeFound = true;
			            }
			            catch(Exception e){
			            	try {
			            		XPath p = new XPath(parser, "//'" + searchTerm + "'");
					            matchedTrees = p.evaluate(tree);
					            treeFound = true;
			            	}
			            	catch(Exception d) {
			            		System.out.println("No results found");
			            	}
			            }
			            if (treeFound == true) {
			            	int count = 1;
				            ParseTreeWalker subTreeWalker = new ParseTreeWalker();
				            for (ParseTree tempTree : matchedTrees) {
				            	System.out.println("Result No." + count + " : \n");
				            	subTreeWalker.walk(new ParseTreePrint(), tempTree);
				            	count++;
				            }
			            }
			            
			        } catch (IOException e) {
			            e.printStackTrace();
			        }
			        break;
			  case "3":
				  	File compileFile = new File(filePath);
			        FileInputStream compileFis = null;
			        
			        try {
			        	compileFis = new FileInputStream(compileFile);
			        	ANTLRInputStream inputFile = new ANTLRInputStream(compileFis);
			            PlainEnglishLexer lexer = new PlainEnglishLexer(inputFile);
			            CommonTokenStream tokens = new CommonTokenStream(lexer);
			            PlainEnglishParser parser = new PlainEnglishParser(tokens);
			            ParseTree tree = parser.program();
			            
			            ParseTreeWalker walker = new ParseTreeWalker();
			            walker.walk(new CompileToJavaScript(), tree);
			            

			        } catch (IOException e) {
			            e.printStackTrace();
			        }
				    break;
			  case "4":
				    System.out.println(filePath);
				    break;
			  case "5":
				    System.out.println("please input the file path \n");
				    Scanner fileInput = new Scanner(System.in);
				    filePath = fileInput.nextLine();
				    break;
				    
			  case "6":
				    exit = true;
				    break;
			  default:
				  System.out.println("That is not a menu item, please try again");
			}
		}
		
		
	}
    public static void main(String[] args) {
    	menu();
    	
        
    }

}
