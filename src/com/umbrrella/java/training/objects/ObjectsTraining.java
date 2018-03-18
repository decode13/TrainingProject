package com.umbrrella.java.training.objects;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * This is the main class.
 */
public class ObjectsTraining {

	/**
	 * ObjectsTraining class comments
	 */
	public static void main(final String[] args) {

		final String csvFile = System.getProperty("user.dir") + "/" + "resources/PassengersList.txt";
		BufferedReader passengerFile = null;
		String line = "";
		String cvsSplitBy = ","; // NOPMD on 18/03/18 13:59, with reason: LocalVariableCouldBeFinal
		final String[] vehicleType = new String[] { "Car", "Bus", "Plane" };
		String output = "";

		try {

			passengerFile = new BufferedReader(new FileReader(csvFile));
			final List<Passenger> passengerList = new ArrayList<>();

			while ((line = passengerFile.readLine()) != null) { // NOPMD on 18/03/18 14:01, with reason:
																// AssignmentInOperand

				final String[] csvLine = line.split(cvsSplitBy); // NOPMD on 18/03/18 14:02, with reason: LawOfDemeter

				try {

					passengerList.add(new Passenger(csvLine)); // NOPMD on 18/03/18 14:04, with reason:
																// AvoidInstantiatingObjectsInLoops

				} catch (Exception e) { // NOPMD on 18/03/18 14:05, with reason: AvoidCatchingGenericException
					continue;
				}
			}

			final StringBuffer separator = new StringBuffer();
			final StringBuffer header = new StringBuffer(512);

			for (int v = 0; v < vehicleType.length; v++) {

				header.replace(0, header.length(), "");
				header.append("Seating for vehicle type: " + vehicleType[v] + ", model: ");
				separator.replace(0, separator.length(), "");

				System.out.println(""); // NOPMD on 18/03/18 14:06, with reason: SystemPrintln

				if (vehicleType[v].equals("Car")) { // NOPMD on 18/03/18 14:08, with reason: AvoidLiteralsInIfCondition
													// && LawOfDemeter
					final Car sedan = new Car(); // NOPMD on 18/03/18 14:11, with reason:
													// AvoidInstantiatingObjectsInLoops
					sedan.setManufacturer("Volkswagen");
					sedan.setModelNo("Passat");
					sedan.plateNo = "C-AR-902813";
					sedan.destination = "Munich";
					header.append(sedan.getManufacturer() + " " + sedan.getModelNo() + ", plate number: "
							+ sedan.plateNo + ", with destination: " + sedan.destination);
					System.out.println(header); // NOPMD on 18/03/18 14:07, with reason: SystemPrintln
					for (int h = 0; h < header.length(); h++) {
						separator.append('-');
					}
					System.out.println(separator); // NOPMD on 18/03/18 14:07, with reason: SystemPrintln

					for (int p = 0; p < passengerList.size(); p++) {
						sedan.reserveSeat(passengerList.get(p));
					}
					sedan.listSeats();

				} else if (vehicleType[v].equals("Bus")) { // NOPMD on 18/03/18 14:08, with reason:
															// AvoidLiteralsInIfCondition && LawOfDemeter
					final Bus smallBus = new Bus(); // NOPMD on 18/03/18 14:11, with reason:
													// AvoidInstantiatingObjectsInLoops
					smallBus.setManufacturer("Iveco");
					smallBus.setModelNo("Wheels");
					smallBus.plateNo = "B-US-827643";
					smallBus.destination = "Graz";
					header.append(smallBus.getManufacturer() + " " + smallBus.getModelNo() + ", plate number: "
							+ smallBus.plateNo + ", with destination: " + smallBus.destination);
					System.out.println(header); // NOPMD on 18/03/18 14:08, with reason: SystemPrintln

					for (int h = 0; h < header.length(); h++) {
						separator.append('-');
					}
					System.out.println(separator); // NOPMD on 18/03/18 14:07, with reason: SystemPrintln

					for (int p = 0; p < passengerList.size(); p++) {
						smallBus.reserveSeat(passengerList.get(p));
					}
					smallBus.listSeats();
				} else if (vehicleType[v].equals("Plane")) { // NOPMD on 18/03/18 14:08, with reason:
																// AvoidLiteralsInIfCondition && LawOfDemeter
					final Plane tinyPlane = new Plane(); // NOPMD on 18/03/18 14:11, with reason:
															// AvoidInstantiatingObjectsInLoops
					tinyPlane.setManufacturer("Airbus");
					tinyPlane.setModelNo("Crow");
					tinyPlane.plateNo = "DE-12319908";
					tinyPlane.destination = "Paris";
					header.append(tinyPlane.getManufacturer() + " " + tinyPlane.getModelNo() + ", plate number: "
							+ tinyPlane.plateNo + ", with destination: " + tinyPlane.destination);
					System.out.println(header); // NOPMD on 18/03/18 14:07, with reason: SystemPrintln
					for (int h = 0; h < header.length(); h++) {
						separator.append('-');
					}
					System.out.println(separator); // NOPMD on 18/03/18 14:06, with reason: SystemPrintln

					for (int p = 0; p < passengerList.size(); p++) {
						tinyPlane.reserveSeat(passengerList.get(p));
					}
					tinyPlane.listSeats();
				} else {
					output = vehicleType[v] + " vehicle type is: Unknown";
					System.out.println(output); // NOPMD on 18/03/18 14:07, with reason: SystemPrintln
					continue;
				}

			}

		} catch (FileNotFoundException e) {
			System.err.println("PassengerList file was not found!"); // NOPMD on 18/03/18 14:06, with reason:
																		// SystemPrintln
		} catch (IOException e) {
			// e.printStackTrace();
			System.err.println("Unknown file error was found!"); // NOPMD on 18/03/18 14:07, with reason: SystemPrintln
		} finally {
			if (passengerFile != null) {
				try {
					passengerFile.close();
				} catch (IOException e) {
					// e.printStackTrace();
					System.err.println("Unknown file error was found!"); // NOPMD on 18/03/18 14:07, with reason:
																			// SystemPrintln
				}
			}
		}

	}

}
