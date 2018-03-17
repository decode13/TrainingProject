package com.umbrrella.java.training.objects;

public class Passenger { // NOPMD - comment?
	/**
	 * Passenger object class.
	 *
	 */

	private int passengerID; // NOPMD - id is short, but meaningful :-)
	private String firstName; // NOPMD - Passenger first name
	private String lastName; // NOPMD - Passenger last name
	private boolean driverLicense; // NOPMD - Passenger has driver license
	private String gender; // NOPMD - Passenger gender

	public Passenger(final String[] passengerArray) { // NOPMD - ArrayIsStoredDirectly

		this.passengerID = Integer.parseInt(passengerArray[0]);
		this.firstName = passengerArray[1];
		this.lastName = passengerArray[2];
		this.driverLicense = passengerArray[3].equals("Y");
		this.gender = passengerArray[4];
	}

	public Passenger(final int id, final String firstName, final String lastName, final boolean driverLicense, // NOPMD - comment 
			final String gender) {
		this.passengerID = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.driverLicense = driverLicense;
		this.gender = gender;
	}

	public int getPassengerID() { // NOPMD - Getters and Setters comment
		return passengerID;
	}

	public void setPassengerID(final int passengerID) { // NOPMD - Getters and Setters comment
		this.passengerID = passengerID;
	}

	public String getFirstName() { // NOPMD - Getters and Setters comment
		return firstName;
	}

	public void setFirstName(final String firstName) { // NOPMD - Getters and Setters comment
		this.firstName = firstName;
	}

	public String getLastName() { // NOPMD - Getters and Setters comment
		return lastName;
	}

	public void setLastName(final String lastName) { // NOPMD - Getters and Setters comment
		this.lastName = lastName;
	}

	public boolean isDriverLicense() { // NOPMD - Getters and Setters comment
		return driverLicense;
	}

	public void setDriverLicense(final boolean driverLicense) { // NOPMD - Getters and Setters comment
		this.driverLicense = driverLicense;
	}

	public String getGender() { // NOPMD - Getters and Setters comment
		return gender;
	}

	public void setGender(final String gender) { // NOPMD - Getters and Setters comment
		this.gender = gender;
	}

}
