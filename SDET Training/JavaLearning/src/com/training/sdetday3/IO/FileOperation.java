package com.training.sdetday3.IO;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileOperation {

	public static void main(String[] args) throws IOException {
		File file = new File("Sample.txt");
		
		if(file.exists()){
			System.out.println("File exists");
			System.out.println("Modified Time" + new Date(file.lastModified()));
			System.out.println("Can read"+file.canRead());
			System.out.println("Can write"+file.canWrite());
			System.out.println("Can execute"+file.canExecute());
			System.out.println("Absolute path"+file.getAbsolutePath());
			System.out.println("path Seperator"+file.separator);
			file.delete();
		}
		else {
			file.createNewFile();
			System.out.println("File created...");
		}
		
		System.out.println("Job done");
	}

}
