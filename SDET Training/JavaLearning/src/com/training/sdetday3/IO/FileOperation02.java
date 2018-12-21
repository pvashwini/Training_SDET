package com.training.sdetday3.IO;

import java.io.File;

public class FileOperation02 {

	//\n new line , backslash only \\
	public static void main(String[] args) {
	
		File file = new File("C:\\Users\\Huser\\Desktop\\Myfolder");
		
		String [] list = file.list();
		
		for(String temp : list){
			File f = new File(file,temp);
		/*	if(f.isDirectory()){
			System.out.println(f.getName());
		
			}*/
			
			if(f.isFile() && !f.canWrite()){
				System.out.println(f.getName());
			}
}
	}
}