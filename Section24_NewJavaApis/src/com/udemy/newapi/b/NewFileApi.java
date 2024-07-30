package com.udemy.newapi.b;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NewFileApi {

	public static void main(String[] args ) throws IOException {
		
		Path path = Paths.get("./resources/sample.txt");
		String fileContent = Files.readString(path);
		System.out.println(fileContent);
		
		String newContent = fileContent.replace("Line", "New Line");
		
		//this will also create a file. 
		Path newPath = Paths.get("./resources/sample-new.txt");
		Files.writeString(newPath, newContent);
		
		//check new file with the name sample-new.txt in project structure.  
	}
}
