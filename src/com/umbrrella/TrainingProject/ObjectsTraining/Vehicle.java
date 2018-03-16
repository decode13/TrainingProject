package com.umbrrella.TrainingProject.ObjectsTraining;

public class Vehicle {

	private String manufacturer;
	private String modelNo;
	
	protected Passenger seats[][] = new Passenger[0][0];
	protected String plateNo;
	protected String destination;

	protected String getManufacturer() {
		return manufacturer;
	}

	protected String getModelNo() {
		return modelNo;
	}

	protected void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	protected void setModelNo(String modelNo) {
		this.modelNo = modelNo;
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
					seats[i][j] = p;
					isSeated = true;
					break;
				}
			}
		}

		int seat = (i - 1) * seats[0].length + j + 1;

		return seat + "";
	}

	protected void listSeats() {
		int i, j = 0;
		boolean isSeated = false;
		
		for (i = 0; i < seats.length; i++) {
			if (isSeated) {
				break;
			}
			for (j = 0; j < seats[i].length; j++) {
				int seat = i * seats[0].length + j + 1;
				if (seats[i][j] == null) {
					System.out.println("Seat " + seat + ": " + "Empty");
				} else {
					System.out.println("Seat " + seat + ": " + seats[i][j].getFirstName() + " " + seats[i][j].getLastName());
				}
			}
		}
		
	}

}
