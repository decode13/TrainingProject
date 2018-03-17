package com.umbrrella.TrainingProject.ObjectsTraining;

/**
 * Vechicle base class. Will be extended by specific vehicles.
 *
 */

public class Vehicle {

	private String manufacturer; // NOPMD
	private String modelNo; // NOPMD

	protected transient Passenger seats[][] = new Passenger[0][0]; // NOPMD
	protected String plateNo; // NOPMD
	protected String destination; // NOPMD

	protected Vehicle() { // NOPMD
		// This constructor is intentionally empty. Nothing special is needed here.

	}

	protected String getManufacturer() { // NOPMD
		return manufacturer;
	}

	protected String getModelNo() { // NOPMD
		return modelNo;
	}

	protected void setManufacturer(final String manufacturer) { // NOPMD
		this.manufacturer = manufacturer;
	}

	protected void setModelNo(final String modelNo) { // NOPMD
		this.modelNo = modelNo;
	}

	protected String reserveSeat(final Passenger passenger) { // NOPMD
		int rows = 0;
		int columns = 0;
		boolean isSeated = false;

		for (rows = 0; rows < seats.length; rows++) {
			if (isSeated) {
				break;
			}
			for (columns = 0; columns < seats[rows].length; columns++) {
				if (seats[rows][columns] == null) {
					seats[rows][columns] = passenger;
					isSeated = true;
					break;
				}
			}
		}

		final int seat = (rows - 1) * seats[0].length + columns + 1;

		return Integer.toString(seat);
	}

	protected void listSeats() { // NOPMD
		int rows = 0;
		int columns = 0;
		String output;

		for (rows = 0; rows < seats.length; rows++) {

			for (columns = 0; columns < seats[rows].length; columns++) {
				final int seat = rows * seats[0].length + columns + 1;
				if (seats[rows][columns] == null) {
					output = "Seat " + seat + ": " + "Empty";
					System.out.println(output);// NOPMD
				} else {
					output = "Seat " + seat + ": " + seats[rows][columns].getFirstName() + " " // NOPMD - false LawOfDemeter
							+ seats[rows][columns].getLastName();// NOPMD
					System.out.println(output);// NOPMD
				}
			}
		}

	}

}
