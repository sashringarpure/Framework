package com.cbsp.seed;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FileBufferedReader {

	private InputStream inputStream;
	private InputStreamReader inputStreamReader;
	private BufferedReader bufferedReader;
	private StringBuffer fileContents;
	
	public FileBufferedReader(String fileName) throws FileNotFoundException {
		this.inputStream = new FileInputStream(fileName);
		this.inputStreamReader = new InputStreamReader(this.inputStream);
		this.bufferedReader = new BufferedReader(this.inputStreamReader);
	}
	
	public void ReadFile() throws IOException {
		fileContents.setLength(0);
		while ( this.bufferedReader.readLine() != null) {
			fileContents.append(bufferedReader.readLine());
		}
	}
	
	public StringBuffer getFileContents() {
		return this.fileContents;
	}

}
