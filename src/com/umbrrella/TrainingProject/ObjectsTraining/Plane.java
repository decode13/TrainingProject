package com.umbrrella.TrainingProject.ObjectsTraining;

public class Plane extends Vehicle { // NOPMD - comment?
	/**
	 * Plane subclass. Will override listSeats, so numbering columns has letters.
	 *
	 */
	public Plane() {
		super();
		seats = new Passenger[4][5];

	}

	protected void listSeats() { // NOPMD - comment
		int rows = 0;
		int columns = 0;
		String output;
		final String[] labels = new String[] { "A", "B", "C", "D", "E" };

		for (rows = 0; rows < seats.length; rows++) {
			for (columns = 0; columns < seats[rows].length; columns++) {
				final String seat = rows + 1 + labels[columns];
				if (seats[rows][columns] == null) {
					output = "Seat " + seat + ": " + "Empty";
					System.out.println(output); // NOPMD - SystemPrintln
				} else {
					final String firstName = seats[rows][columns].getFirstName(); // NOPMD - False LawOfDemeter
					final String lastName = seats[rows][columns].getLastName(); // NOPMD - False LawOfDemeter
					output = "Seat " + seat + ": " + firstName + " " + lastName;
					System.out.println(output); // NOPMD - SystemPrintln
				}
			}
		}

	}

}
