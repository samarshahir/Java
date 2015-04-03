package com.io;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;
public class Delimiter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList[] data = new ArrayList[3];
		try {
			File file = new File("/home/tenx/Samar/Test.txt");
			FileReader fileReader = new FileReader(file);
			BufferedReader br = new BufferedReader(fileReader);
			String line;
			 while((line = br.readLine()) != null) {
				    String[] theline = line.split("");
				    data[0].add(theline[0]);
				    data[1].add(theline[1]);
				    data[2].add(theline[2]);
				   }
			 }
			 catch(Exception e){
				 e.printStackTrace();
			 }
		}
	}
