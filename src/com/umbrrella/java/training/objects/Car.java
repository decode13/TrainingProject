package com.umbrrella.java.training.objects;

public class Car extends Vehicle {  // NOPMD - comment
	/**
	 * Car subclass. Will override reserveSeat, so the seat 1 has driver license.
	 *
	 */
	public Car() {
		super();
		seats = new Passenger[2][2];

	}

	protected String reserveSeat(final Passenger passenger) { // NOPMD - comment
		int rows = 0;
		int columns = 0;
		boolean isSeated = false;
		boolean hasDriverLicense = false;

		hasDriverLicense = passenger.isDriverLicense();

		for (rows = 0; rows < seats.length; rows++) {
			if (isSeated) {
				break;
			}
			for (columns = 0; columns < seats[rows].length; columns++) {
				if (seats[rows][columns] == null) {

					if (rows == 0 && columns == 0 && !hasDriverLicense) {
						continue;
					}

					seats[rows][columns] = passenger;
					isSeated = true;
					break;
				}
			}
		}

		final int seat = (rows - 1) * seats[0].length + columns + 1;

		return Integer.toString(seat);
	}

}
