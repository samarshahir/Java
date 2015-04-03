package com.io;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.*;

public class UseDelimiter {
	public static void main(String args[]) throws IOException {

	    String token1 = "";
	    
	    Scanner inFile1 = new Scanner(new File("/home/tenx/Samar/Test.txt")).useDelimiter(",\\s*");

	    List<String> temps = new ArrayList<String>();

	    while (inFile1.hasNext()) {
	      token1 = inFile1.next();
	      temps.add(token1);
	    }
	    inFile1.close();

	    String[] tempsArray = temps.toArray(new String[0]);

	    for (String s : tempsArray) {
	      System.out.println(s);
	    }
	  
	  }
}
