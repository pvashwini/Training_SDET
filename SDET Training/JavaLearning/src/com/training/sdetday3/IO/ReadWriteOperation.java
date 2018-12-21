package com.training.sdetday3.IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadWriteOperation {
	public static void main(String[] args){
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		FileWriter filewriter = null;
		try{
		System.out.println("Enter emp id:");
		int empid = Integer.parseInt(br.readLine());
		
		System.out.println("Enter Emp Name:");
		String empName = br.readLine();
		
		System.out.println("Emp id"+empid+"\n");
		System.out.println("Emp Name"+empName+"\n");
		
		File file = new File("Sample.txt");
		 filewriter = new FileWriter(file, true);
		
	    filewriter.write("Emp id " + empid+"\n");
	    filewriter.write("Emp Name "+empName+"\n");
	    
	    System.out.println("Contents written to the file");
		
		
		}
		catch(NumberFormatException |IOException e){
			e.printStackTrace();
		}
		finally{
			
			try {
				filewriter.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

	
	
	
	
}
