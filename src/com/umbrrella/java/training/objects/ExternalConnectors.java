package com.umbrrella.java.training.objects;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 *
 */
final class ExternalConnectors {
	
	private ExternalConnectors() {
		// Nothing to do here.
	}

	/** some comment here */
	public static List<String> readFromCSV(final String fileName) {
		
		final Path pathToFile = Paths.get(fileName);
		final List<String> output = new ArrayList<>();
		
		try (BufferedReader buffer = Files.newBufferedReader(pathToFile)) {
			
			String line = buffer.readLine();
			
			while (line != null) {
				
				line = buffer.readLine();
				output.add(line);
				
				
			}
		} catch (IOException e) {
			System.err.println("Error reading file: " + fileName); // NOPMD on 18/03/18 17:51, with reason: SystemPrintln
        }
		
		return output;
	}
	
}
