import java.io.*;
import java.util.Scanner;
/**
 * Driver program for the Analyzer class. Reads through a file for
 * lines of input and uses Analyzer to analyze inputs syntactically 
 * and lexically.
 * @author My Tran
 * @version 1.0
 */
public class Main 
{
    public static void main(String[] args) throws FileNotFoundException
    {
        //test
        //create scanner and associate scanner to input file
        File inFile = new File("src/input.txt");
        Scanner fin = new Scanner(inFile);
        String expression = "";
        while(fin.hasNextLine())
        {
            //read line from file in
            expression = fin.nextLine();
            Analyzer ex = new Analyzer(expression);
            System.out.println("\nExpression: " + expression + "\n");
            ex.parse();
        }
        fin.close();

    }
}