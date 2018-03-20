package com.umbrrella.java.training.objects;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cromano
 *
 */
final class GetPassengerList {
	
	private GetPassengerList() {
		// Nothing to do here.
	}

	/**
	 * some comment here
	 */
	public static List<Passenger> getFromCSV(final String csvFile) {
		
		String csvDelimiter = ",";  // NOPMD on 18/03/18 18:04, with reason: LocalVariableCouldBeFinal
		List<String> csvLines;

		final List<Passenger> newPassengerList = new ArrayList<>();
		
		csvLines = ExternalConnectors.readFromCSV(csvFile);

		for (String csvLine : csvLines) { // NOPMD on 18/03/18 18:06, with reason: LawOfDemeter

			if (csvLine == null) { // NOPMD on 18/03/18 18:06, with reason: LawOfDemeter
				break;
			}

			final String[] passengerAttr = csvLine.split(csvDelimiter); // NOPMD on 18/03/18 18:06, with reason: LawOfDemeter

			try {

				final Passenger passenger = new Passenger(passengerAttr); // NOPMD on 18/03/18 18:05, with reason: AvoidInstantiatingObjectsInLoops
				newPassengerList.add(passenger);

			} catch (Exception e) { // NOPMD on 18/03/18 18:05, with reason: AvoidCatchingGenericException
				//continue;
			}
		}
		
		return newPassengerList;

	}
}
