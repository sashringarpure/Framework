package com.fanatics.seed;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileBufferedWriter {

	private File file;
	private FileWriter fileWriter;
	private BufferedWriter bufferedWriter;
	
	public FileBufferedWriter(String fileName) throws IOException {
		this.file = new File(fileName);
		this.fileWriter = new FileWriter(this.file.getAbsoluteFile());
		this.bufferedWriter = new BufferedWriter(this.fileWriter);
	}
	
	public void writeContent(StringBuffer content) throws IOException {
		this.bufferedWriter.write(content.toString());
	}
	
	public void closeBufferedWriter() throws IOException {
		this.bufferedWriter.close();
	}
	
	public void flushBufferedWriter() throws IOException {
		this.bufferedWriter.flush();
	}

}
