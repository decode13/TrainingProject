package com.umbrrella.java.training.objects;

import java.util.List;

/**
 * This is the main class.
 */
final public class PassengerSeating {

	/**
	 * PassengerSeating main class comments
	 */
	public static void main(final String[] args) {

		final String csvFile = System.getProperty("user.dir") + "/" + "resources/PassengersList.txt";

		carSeatReservation(csvFile);
		busSeatReservation(csvFile);
		planeSeatReservation(csvFile);
		
	}

	private PassengerSeating() {
		// Nothing to do here.
	}
	
	private static void carSeatReservation (final String csvFile) {
		final StringBuffer separator = new StringBuffer();
		final StringBuffer header = new StringBuffer(512);
		String vehicleType = "Car"; // NOPMD on 18/03/18 18:50, with reason: LocalVariableCouldBeFinal

		header.replace(0, header.length(), "");
		header.append("Seating for vehicle type: " + vehicleType + ", model: ");
		separator.replace(0, separator.length(), "");

		final Car sedan = new Car();
		sedan.setManufacturer("Volkswagen");
		sedan.setModelNo("Passat");
		sedan.plateNo = "C-AR-902813";
		sedan.destination = "Munich";
		header.append(sedan.getManufacturer() + " " + sedan.getModelNo() + ", plate number: " + sedan.plateNo
				+ ", with destination: " + sedan.destination);
		System.out.println(header); // NOPMD on 18/03/18 18:51, with reason: SystemPrintln
		for (int h = 0; h < header.length(); h++) {
			separator.append('-');
		}
		System.out.println(separator); // NOPMD on 18/03/18 18:51, with reason: SystemPrintln

		final List<Passenger> passengerList = GetPassengerList.getFromCSV(csvFile);
		for (int p = 0; p < passengerList.size(); p++) { // NOPMD on 18/03/18 18:51, with reason: LawOfDemeter
			sedan.reserveSeat(passengerList.get(p)); // NOPMD on 18/03/18 18:51, with reason: LawOfDemeter
		}
		sedan.listSeats();
		System.out.println(""); // NOPMD on 18/03/18 18:51, with reason: SystemPrintln

	}
	
	private static void busSeatReservation (final String csvFile) {
		final StringBuffer separator = new StringBuffer();
		final StringBuffer header = new StringBuffer(512);
		String vehicleType = "Bus"; // NOPMD on 18/03/18 18:50, with reason: LocalVariableCouldBeFinal

		header.replace(0, header.length(), "");
		header.append("Seating for vehicle type: " + vehicleType + ", model: ");
		separator.replace(0, separator.length(), "");

		final Bus smallBus = new Bus();
		smallBus.setManufacturer("Iveco");
		smallBus.setModelNo("Wheels");
		smallBus.plateNo = "B-US-827643";
		smallBus.destination = "Graz";
		header.append(smallBus.getManufacturer() + " " + smallBus.getModelNo() + ", plate number: "
		+ smallBus.plateNo + ", with destination: " + smallBus.destination);
		System.out.println(header); // NOPMD on 18/03/18 18:51, with reason: SystemPrintln
		
		for (int h = 0; h < header.length(); h++) {
		separator.append('-');
		}
		System.out.println(separator); // NOPMD on 18/03/18 18:51, with reason: SystemPrintln
		
		final List<Passenger> passengerList = GetPassengerList.getFromCSV(csvFile);
		for (int p = 0; p < passengerList.size(); p++) { // NOPMD on 18/03/18 18:51, with reason: LawOfDemeter
		smallBus.reserveSeat(passengerList.get(p)); // NOPMD on 18/03/18 18:51, with reason: LawOfDemeter
		}
		smallBus.listSeats();
		System.out.println(""); // NOPMD on 18/03/18 18:51, with reason: SystemPrintln
	}

	private static void planeSeatReservation (final String csvFile) {
		final StringBuffer separator = new StringBuffer();
		final StringBuffer header = new StringBuffer(512);
		String vehicleType = "Plane"; // NOPMD on 18/03/18 18:50, with reason: LocalVariableCouldBeFinal

		header.replace(0, header.length(), "");
		header.append("Seating for vehicle type: " + vehicleType + ", model: ");
		separator.replace(0, separator.length(), "");

		final Plane tinyPlane = new Plane();
		tinyPlane.setManufacturer("Airbus");
		tinyPlane.setModelNo("Crow");
		tinyPlane.plateNo = "DE-12319908";
		tinyPlane.destination = "Paris";
		header.append(tinyPlane.getManufacturer() + " " + tinyPlane.getModelNo() + ", plate number: "
		+ tinyPlane.plateNo + ", with destination: " + tinyPlane.destination);
		System.out.println(header); // NOPMD on 18/03/18 18:51, with reason: SystemPrintln
		for (int h = 0; h < header.length(); h++) {
		separator.append('-');
		}
		System.out.println(separator); // NOPMD on 18/03/18 18:51, with reason: SystemPrintln
		
		final List<Passenger> passengerList = GetPassengerList.getFromCSV(csvFile);
		for (int p = 0; p < passengerList.size(); p++) { // NOPMD on 18/03/18 18:51, with reason: LawOfDemeter
		tinyPlane.reserveSeat(passengerList.get(p)); // NOPMD on 18/03/18 18:51, with reason: LawOfDemeter
		}
		tinyPlane.listSeats();
		System.out.println(""); // NOPMD on 18/03/18 18:51, with reason: SystemPrintln
	}
}
