package com.umbrrella.java.training.objects;

/**
 * Bus subclass. Will override reserveSeat, so the no same gender on same row.
 */
public class Bus extends Vehicle { // NOPMD on 18/03/18 13:46, with reason: ShortClassName

	/** Some comment here */
	public Bus() {
		super();
		seats = new Passenger[4][2];

	}

	/** Method comment */
	@Override
	protected String reserveSeat(final Passenger passenger) {
		int rows = 0;
		int columns = 0;
		boolean isSeated = false;

		for (rows = 0; rows < seats.length; rows++) {
			if (isSeated) {
				break;
			}
			for (columns = 0; columns < seats[rows].length; columns++) {
				if (seats[rows][columns] == null) {

					if ((seats[rows][0] == null || !seats[rows][0].getGender().equals(passenger.getGender())) // NOPMD
							// on 18/03/18 13:46, with reason: LawOfDemeter

							&& columns == 1) { // NOPMD on 18/03/18 13:46, with reason: LawOfDemeter
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
