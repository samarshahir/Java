package com.io;

import java.io.*;
import java.util.*;


public class ReadTextThroughScanner {

	public static void main(String[] args) {
		try{
		Scanner sc = new Scanner(new File("/home/tenx/Samar/Test.txt")).useDelimiter(" ");
		ArrayList<String> list = new ArrayList<String>();
		while (sc.hasNextLine()) {
			 list.add(sc.next());
		 }
		Iterator itr = list.iterator();
	      while(itr.hasNext()) {
	    	  Object element = itr.next();
	          System.out.print(element + " ");
	        
	      }
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
