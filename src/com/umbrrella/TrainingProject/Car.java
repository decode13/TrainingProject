package com.umbrrella.TrainingProject;

public class Car extends Vehicle {

	public Car() {

		seats = new Passenger[2][2];

	}

	protected String reserveSeat(Passenger p) {
		int i, j = 0;
		boolean isSeated = false;
		boolean hasDriverLicense = false;

		hasDriverLicense = p.getDriverLicense();

		for (i = 0; i < seats.length; i++) {
			if (isSeated) {
				break;
			}
			for (j = 0; j < seats[i].length; j++) {
				if (seats[i][j] == null) {

					if (i == 0 && j == 0) {
						if (!hasDriverLicense) {
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
