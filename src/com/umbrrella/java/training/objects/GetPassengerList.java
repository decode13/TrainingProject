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
final public class GetPassengerList {
	
	private GetPassengerList() {
		// Nothing to do here.
	}

	/**
	 * @param args
	 */
	public static List<Passenger> GetFromCSV(final String csvFile) {
		
		String csvDelimiter = ",";  // NOPMD on 18/03/18 18:04, with reason: LocalVariableCouldBeFinal
		List<String> csvLines = new ArrayList<String>();
		
		final List<Passenger> newPassengerList = new ArrayList<Passenger>();
		
		csvLines = ExternalConnectors.ReadFromCSV(csvFile);
		
		for (int line = 0; line < csvLines.size(); line++) { // NOPMD on 18/03/18 18:06, with reason: LawOfDemeter
			
			if (csvLines.get(line) == null) { // NOPMD on 18/03/18 18:06, with reason: LawOfDemeter
				break;				
			}
			
			final String[] passengerAttr = csvLines.get(line).split(csvDelimiter); // NOPMD on 18/03/18 18:06, with reason: LawOfDemeter
			
			try {
				
				final Passenger passenger = new Passenger(passengerAttr); // NOPMD on 18/03/18 18:05, with reason: AvoidInstantiatingObjectsInLoops
				newPassengerList.add(passenger);
				
			} catch (Exception e) { // NOPMD on 18/03/18 18:05, with reason: AvoidCatchingGenericException
				continue;
			}
		}
		
		return newPassengerList;

	}
}
