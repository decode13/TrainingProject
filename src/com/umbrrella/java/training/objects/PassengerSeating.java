package com.umbrrella.java.training.objects;

import java.util.List;

import javafx.scene.control.Separator;

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

	private static void carSeatReservation(final String csvFile) {
		final StringBuffer header = new StringBuffer(128);

		final Car sedan = new Car();
		sedan.setManufacturer("Volkswagen");
		sedan.setModelNo("Passat");
		sedan.plateNo = "C-AR-902813";
		sedan.destination = "Munich";
		header.append("Seating for vehicle type: Car, model: " + sedan.getManufacturer() + " " + sedan.getModelNo()
				+ ", plate number: " + sedan.plateNo + ", with destination: " + sedan.destination);
		System.out.println(header); // NOPMD on 18/03/18 18:51, with reason: SystemPrintln
		System.out.println(sepparator(header.toString()).toString()); // NOPMD on 18/03/18 18:51, with reason: SystemPrintln

		final List<Passenger> passengerList = GetPassengerList.getFromCSV(csvFile);
		for (int p = 0; p < passengerList.size(); p++) { // NOPMD on 18/03/18 18:51, with reason: LawOfDemeter
			sedan.reserveSeat(passengerList.get(p)); // NOPMD on 18/03/18 18:51, with reason: LawOfDemeter
		}
		sedan.listSeats();
		System.out.println(""); // NOPMD on 18/03/18 18:51, with reason: SystemPrintln

	}

	private static void busSeatReservation(final String csvFile) {
		final StringBuffer header = new StringBuffer(128);

		final Bus smallBus = new Bus();
		smallBus.setManufacturer("Iveco");
		smallBus.setModelNo("Wheels");
		smallBus.plateNo = "B-US-827643";
		smallBus.destination = "Graz";
		header.append(
				"Seating for vehicle type: Bus, model: " + smallBus.getManufacturer() + " " + smallBus.getModelNo()
						+ ", plate number: " + smallBus.plateNo + ", with destination: " + smallBus.destination);
		System.out.println(header.toString()); // NOPMD on 18/03/18 18:52, with reason: SystemPrintln
		System.out.println(sepparator(header.toString()).toString()); // NOPMD on 18/03/18 18:52, with reason: SystemPrintln

		final List<Passenger> passengerList = GetPassengerList.getFromCSV(csvFile);
		for (int p = 0; p < passengerList.size(); p++) { // NOPMD on 18/03/18 18:52, with reason: LawOfDemeter
			smallBus.reserveSeat(passengerList.get(p)); // NOPMD on 18/03/18 18:52, with reason: LawOfDemeter
		}
		smallBus.listSeats();
		System.out.println(""); // NOPMD on 18/03/18 18:52, with reason: SystemPrintln
	}

	private static void planeSeatReservation(final String csvFile) {
		final StringBuffer header = new StringBuffer(128);

		final Plane tinyPlane = new Plane();
		tinyPlane.setManufacturer("Airbus");
		tinyPlane.setModelNo("Crow");
		tinyPlane.plateNo = "DE-12319908";
		tinyPlane.destination = "Paris";
		header.append(
				"Seating for vehicle type: Plane, model: " + tinyPlane.getManufacturer() + " " + tinyPlane.getModelNo()
						+ ", plate number: " + tinyPlane.plateNo + ", with destination: " + tinyPlane.destination);
		System.out.println(header.toString()); // NOPMD on 18/03/18 18:53, with reason: SystemPrintln
		System.out.println(sepparator(header.toString()).toString()); // NOPMD on 18/03/18 18:53, with reason: SystemPrintln

		final List<Passenger> passengerList = GetPassengerList.getFromCSV(csvFile);
		for (int p = 0; p < passengerList.size(); p++) { // NOPMD on 18/03/18 18:53, with reason: LawOfDemeter
			tinyPlane.reserveSeat(passengerList.get(p)); // NOPMD on 18/03/18 18:53, with reason: LawOfDemeter
		}
		tinyPlane.listSeats();
		System.out.println(""); // NOPMD on 18/03/18 18:53, with reason: SystemPrintln
	}
	
	private static StringBuffer sepparator (String title) {
		
		final StringBuffer separator = new StringBuffer();
		for (int h = 0; h < title.length(); h++) {
			separator.append('-');
		}
		
		return separator;	
		
	}
}
