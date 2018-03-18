package com.umbrrella.java.training.objects;

/**
 * Plane subclass. Will override listSeats, so numbering columns has letters.
 *
 */
public class Plane extends Vehicle {
	/** Some comment here */
	public Plane() {
		super();
		seats = new Passenger[4][5];

	}

	/** @see com.umbrrella.java.training.objects.Vehicle#listSeats() */
	@Override
	protected void listSeats() {
		int rows = 0;
		int columns = 0;
		String output;
		final String[] labels = new String[] { "A", "B", "C", "D", "E" };

		for (rows = 0; rows < seats.length; rows++) {
			for (columns = 0; columns < seats[rows].length; columns++) {
				final String seat = rows + 1 + labels[columns];
				if (seats[rows][columns] == null) {
					output = "Seat " + seat + ": " + "Empty";
					System.out.println(output); // NOPMD on 18/03/18 13:54, with reason: SystemPrintln
				} else {
					final String firstName = seats[rows][columns].getFirstName(); // NOPMD on 18/03/18 13:54, with
																					// reason: LawOfDemeter
					final String lastName = seats[rows][columns].getLastName(); // NOPMD on 18/03/18 13:54, with reason:
																				// LawOfDemeter
					output = "Seat " + seat + ": " + firstName + " " + lastName;
					System.out.println(output); // NOPMD on 18/03/18 13:54, with reason: SystemPrintln
				}
			}
		}

	}

}
