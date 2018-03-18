/**
 * 
 */
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
public class ExternalConnectors {

	public static List<String> ReadFromCSV(final String fileName) {
		
		Path pathToFile = Paths.get(fileName);
		List<String> output = new ArrayList<String>();
		
		try (BufferedReader buffer = Files.newBufferedReader(pathToFile)) {
			
			String line = buffer.readLine();
			
			while (line != null) {
				
				line = buffer.readLine();
				output.add(line);
				
				
			}
		} catch (IOException e) {
            e.printStackTrace();
        }
		
		return output;
	}
	
}
