/**
 * 
 */
package com.umbrrella.java.training.objects;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cromano
 *
 */
public class GetPassengerList {

	/**
	 * @param args
	 */
	public static List<Passenger> GetFromCSV(final String csvFile) {
		
		final String csvDelimiter = ","; 
		List<String> csvLines = new ArrayList<String>();
		
		List<Passenger> newPassengerList = new ArrayList<Passenger>();
		
		csvLines = ExternalConnectors.ReadFromCSV(csvFile);
		
		for (int line = 0; line < csvLines.size(); line++) {
			
			if (csvLines.get(line) == null) {
				break;				
			}
			
			String[] passengerAttributes = csvLines.get(line).split(csvDelimiter);
			
			try {
				
				Passenger passenger = new Passenger(passengerAttributes);
				newPassengerList.add(passenger);
				
			} catch (Exception e) {
				continue;
			}
		}
		
		return newPassengerList;

	}
}
