package com.umbrrella.java.training.objects;

/**
 * Vehicle base class. Will be extended by specific vehicles.
 *
 */
class Vehicle {

	/** Private declaration comment */
	private String manufacturer;

	/** Private declaration comment */
	private String modelNo;

	/** Protected declaration comment */
	transient Passenger[][] seats = new Passenger[0][0];

	/** Protected declaration comment */
    String plateNo;

	/** Protected declaration comment */
    String destination;

	/** Constructor declaration comment */
    Vehicle() {
		// This constructor is intentionally empty.
		// Nothing special is needed here.
	}

	String getManufacturer() {
		return manufacturer;
	}

	String getModelNo() {
		return modelNo;
	}

	void setManufacturer(final String manufacturer) {
		this.manufacturer = manufacturer;
	}

	void setModelNo(final String modelNo) {
		this.modelNo = modelNo;
	}

	/** Method comment */
    void reserveSeat(final Passenger passenger) {
		int rows;
		int columns;
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

//		final int seat = (rows - 1) * seats[0].length + columns + 1;

	}

	/** Method comment */
    void listSeats() {
		int rows;
		int columns;
		String output;

		for (rows = 0; rows < seats.length; rows++) {

			for (columns = 0; columns < seats[rows].length; columns++) {
				final int seat = rows * seats[0].length + columns + 1;
				if (seats[rows][columns] == null) {
					output = "Seat " + seat + ": " + "Empty";
					System.out.println(output); // NOPMD on 18/03/18 12:47, with reason: SystemPrintln
				} else {
					output = "Seat " + seat + ": " + seats[rows][columns].getFirstName() + " " // NOPMD
							// on 18/03/18 12:46, with reason: LawOfDemeter
							
							+ seats[rows][columns].getLastName(); // NOPMD on 18/03/18 12:46, with reason: LawOfDemeter
					System.out.println(output); // NOPMD on 18/03/18 12:47, with reason: SystemPrintln
				}
			}
		}

	}

}
