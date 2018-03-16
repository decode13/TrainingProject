package com.umbrrella.TrainingProject;

public class Plane extends Vehicle {

	public Plane() {

		seats = new Passenger[4][5];

	}
	
	String[] labels = new String[]{"A","B","C","D","E"};

	protected void listSeats() {
		int i, j = 0;
		boolean isSeated = false;

		for (i = 0; i < seats.length; i++) {
			if (isSeated) {
				break;
			}
			for (j = 0; j < seats[i].length; j++) {
				String seat = (i + 1) + labels[j];
				if (seats[i][j] == null) {
					System.out.println("Seat " + seat + ": " + "Empty");
				} else {					
					System.out.println(
							"Seat " + seat + ": " + seats[i][j].getFirstName() + " " + seats[i][j].getLastName());
				}
			}
		}

	}

}
