package com.umbrrella.TrainingProject.ObjectsTraining;
/**
 * This is the main class.
 *
 */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ObjectsTraining {

	public static void main(String[] args) { // NOPMD - comment

		final String csvFile = System.getProperty("user.dir") + "/" + "resources/PassengersList.txt";
		BufferedReader passengerFile = null;
		String line = "";
		final String cvsSplitBy = ","; // NOPMD
		final String[] vehicleType = new String[] { "Car", "Bus", "Plane" };
		String output = "";

		try {

			passengerFile = new BufferedReader(new FileReader(csvFile));
			final List<Passenger> passengerList = new ArrayList<>();

			while ((line = passengerFile.readLine()) != null) { // NOPMD

				final String[] csvLine = line.split(cvsSplitBy);

				try {

					passengerList.add(new Passenger(csvLine)); // NOPMD

				} catch (Exception e) { // NOPMD - AvoidCatchingGenericException
					continue;

				}

			}

			final StringBuffer separator = new StringBuffer();
			final StringBuffer header = new StringBuffer(64);

			for (int v = 0; v < vehicleType.length; v++) {

				header.replace(0, header.length(), "");
				header.append("Seating for vehicle type: " + vehicleType[v] + ", model: ");
				separator.replace(0, separator.length(), "");

				System.out.println("");

				if (vehicleType[v] == "Car") { // NOPMD - AvoidLiteralsInIfCondition
					final Car sedan = new Car(); // NOPMD - AvoidInstantiatingObjectsInLoops
					sedan.setManufacturer("Volkswagen");
					sedan.setModelNo("Passat");
					sedan.plateNo = "C-AR-902813";
					header.append(
							sedan.getManufacturer() + " " + sedan.getModelNo() + ", plate number: " + sedan.plateNo);
					System.out.println(header);
					for (int h = 0; h < header.length(); h++) {
						separator.append('-');
					}
					System.out.println(separator);

					for (int p = 0; p < passengerList.size(); p++) {
						sedan.reserveSeat(passengerList.get(p));
					}
					sedan.listSeats();

				} else if (vehicleType[v] == "Bus") { // NOPMD - AvoidLiteralsInIfCondition
					final Bus smallBus = new Bus(); // NOPMD - AvoidInstantiatingObjectsInLoops
					smallBus.setManufacturer("Iveco");
					smallBus.setModelNo("Wheels");
					smallBus.plateNo = "B-US-827643";
					header.append(smallBus.getManufacturer() + " " + smallBus.getModelNo() + ", plate number: "
							+ smallBus.plateNo);
					System.out.println(header);

					for (int h = 0; h < header.length(); h++) {
						separator.append('-');
					}
					System.out.println(separator);

					for (int p = 0; p < passengerList.size(); p++) {
						smallBus.reserveSeat(passengerList.get(p));
					}
					smallBus.listSeats();
				} else if (vehicleType[v] == "Plane") { // NOPMD - AvoidLiteralsInIfCondition
					final Plane tinyPlane = new Plane(); // NOPMD - AvoidInstantiatingObjectsInLoops
					tinyPlane.setManufacturer("Airbus");
					tinyPlane.setModelNo("Crow");
					tinyPlane.plateNo = "DE-12319908";
					header.append(tinyPlane.getManufacturer() + " " + tinyPlane.getModelNo() + ", plate number: "
							+ tinyPlane.plateNo);
					System.out.println(header);
					for (int h = 0; h < header.length(); h++) {
						separator.append('-');
					}
					System.out.println(separator);

					for (int p = 0; p < passengerList.size(); p++) {
						tinyPlane.reserveSeat(passengerList.get(p));
					}
					tinyPlane.listSeats();
				} else {
					output = vehicleType[v] + " vehicle type is: Unknown";
					System.out.println(output);
					continue;
				}

			}

		} catch (FileNotFoundException e) {
			System.err.println("PassengerList file was not found!");
		} catch (IOException e) {
			// e.printStackTrace();
			System.err.println("Unknown file error was found!");
		} finally {
			if (passengerFile != null) {
				try {
					passengerFile.close();
				} catch (IOException e) {
					// e.printStackTrace();
					System.err.println("Unknown file error was found!");
				}
			}
		}

	}

}
