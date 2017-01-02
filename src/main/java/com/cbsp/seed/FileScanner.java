package com.cbsp.seed;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileScanner {

	private File file;
	private Scanner scanner;
	private StringBuffer readFileContents;
	private ArrayList<String> fileContents;
	
	public FileScanner(String fileName) throws FileNotFoundException {
		this.file = new File(fileName);
		this.scanner = new Scanner(this.file);
		this.fileContents = new ArrayList<String>();
	}
	
	public void readFileContents() {
		readFileContents.setLength(0);
		while (this.scanner.hasNextLine()) {
			readFileContents.append(this.scanner.nextLine());
		}
	}
	
	public void readFileContentsIntoArrayList() {
		if (! this.fileContents.isEmpty())
			this.fileContents.clear();
		while (this.scanner.hasNextLine()) {
			this.fileContents.add(this.scanner.nextLine());
		}
	}
	
	public StringBuffer getReadFileContents() {
		return this.readFileContents;
	}
	
	public ArrayList<String> getFileContents() {
		return this.fileContents;
	}

}
