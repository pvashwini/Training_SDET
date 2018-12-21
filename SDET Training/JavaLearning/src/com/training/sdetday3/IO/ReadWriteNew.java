package com.training.sdetday3.IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadWriteNew {


	public static void main(String[] args){
		
		try {
			BufferedReader br = 
					new BufferedReader(new FileReader("sample.txt"));
		String line="";
		while((line = br.readLine())!=null){
			System.out.println(line);
		}
		
	}catch(IOException e){
		e.printStackTrace();
	}

	}}
	
	
	

