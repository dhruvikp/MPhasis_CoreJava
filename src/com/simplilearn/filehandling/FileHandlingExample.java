package com.simplilearn.filehandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

public class FileHandlingExample {

	public static void main(String[] args) throws IOException {
		
		createFileUsingFileOutputStream();
		createFileUsingFileClass();
		
		createFileUsingNIOPackage();
		
		

	}
	
	
	static void createFileUsingNIOPackage() throws IOException {
		String data = "Test data";
		
		
		Files.write(Paths.get("/tmp/ashwini/testFile3.txt"), data.getBytes("UTF-8"));
		
		//
		
		ArrayList<String> lines = new ArrayList<>();
		lines.add("1st line");
		lines.add("2nd line");
		
		Files.write(Paths.get("/tmp/simplilearn/testFile4.txt"), lines, StandardCharsets.UTF_8, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
		
		
	}
	
	static void createFileUsingFileOutputStream() throws IOException {
		File file = createFileIfNotPresent("/tmp/simplilearn", "testFile1.txt");
		
		String data = "Simplilearn!";
		FileOutputStream fos = new FileOutputStream(file);
		fos.write(data.getBytes());
		fos.close();
		
	}
	
	
	static void createFileUsingFileClass() throws IOException {
		File file = createFileIfNotPresent("/tmp/simplilearn", "testFile1.txt");
		
		
		// Write content into file
		FileWriter fileWriter = new FileWriter(file);
		fileWriter.write("Hello!! This is simplilearn!");
		fileWriter.close();
		
	}

	private static File createFileIfNotPresent(String directory, String fileName) throws IOException {
		
		// Create directory
		File directoryFile = new File(directory);
		
		if(! directoryFile.exists()) {
			directoryFile.mkdirs();
		}
		
		//Create file
		File file = new File(directory+fileName);
		
		if(file.createNewFile()) {
			System.out.println("File is creted!");
		} else {
			System.out.println("File already present!");
		}
		return file;
	}
	
	
	

}
