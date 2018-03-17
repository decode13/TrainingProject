package com.umbrrella.java.training.objects;

public class Bus extends Vehicle { // NOPMD - short class name
	/**
	 * Bus subclass. Will override reserveSeat, so the no same gender on same row.
	 *
	 */
	public Bus() {
		super();
		seats = new Passenger[4][2];

	}

	protected String reserveSeat(Passenger p) { // NOPMD - comment
		int rows = 0;
		int columns = 0;
		boolean isSeated = false;

		for (rows = 0; rows < seats.length; rows++) {
			if (isSeated) {
				break;
			}
			for (columns = 0; columns < seats[rows].length; columns++) {
				if (seats[rows][columns] == null) {

					if ((seats[rows][0] == null || !seats[rows][0].getGender().equals(p.getGender())) && columns == 1) {  // NOPMD - false LawOfDemeter
						continue;
					}

					seats[rows][columns] = p;
					isSeated = true;
					break;
				}
			}
		}

		final int seat = (rows - 1) * seats[0].length + columns + 1;

		return Integer.toString(seat);
	}
}
