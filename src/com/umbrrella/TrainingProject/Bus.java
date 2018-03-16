package com.umbrrella.TrainingProject;

public class Bus extends Vehicle {

	public Bus() {

		seats = new Passenger[4][2];

	}

	protected String reserveSeat(Passenger p) {
		int i, j = 0;
		boolean isSeated = false;

		for (i = 0; i < seats.length; i++) {
			if (isSeated) {
				break;
			}
			for (j = 0; j < seats[i].length; j++) {
				if (seats[i][j] == null) {

					if (j == 1) {
						if (seats[i][0] == null || !seats[i][0].getGender().equals(p.getGender())) {
							continue;
						}
					}

					seats[i][j] = p;
					isSeated = true;
					break;
				}
			}
		}

		int seat = (i - 1) * seats[0].length + j + 1;

		return seat + "";
	}
}
