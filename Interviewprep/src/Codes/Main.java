package Codes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	    public static void main (String[] args) {
	        ArrayList<String> inputData = new ArrayList<String>();
	        int numLines = 0;
	        try {
	            Scanner in = new Scanner((Readable) new BufferedReader(new FileReader("C:\\Users\\mitali.bhade\\eclipse-workspace\\Interviewprep\\src\\Codes\\input.txt")));

	            /* Here we can read in the input file */
	            /* In this example, we're reading all the lines of file
	               `input.txt` and then ignoring them. 
	               You should modify this part of the
	               program to read and process the input as desired */
	            while(in.hasNextLine()) {
	            String str = in.nextLine();
	            System.out.println(str);
	           
	                //String line = in.nextLine();
	              //  if (!line.isEmpty())
	                //    numLines++;
	            }

	            /* In this example, we're writing `num_lines` to
	               the file `output.txt`.
	               You should modify this part of the
	               program to write the desired output */
	            PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter("C:\\Users\\mitali.bhade\\eclipse-workspace\\Interviewprep\\src\\Codes\\output.txt")));
	            output.println("" + numLines);
	            output.close();
	        } catch (IOException e) {
	            System.out.println("IO error in input.txt or output.txt");
	        }
	    }
	}


