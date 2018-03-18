package com.umbrrella.java.training.objects;

/**
 * Passenger object class.
 */
public class Passenger {

	/** Private declaration comment */
	private int passengerID;

	/** Private declaration comment */
	private String firstName;

	/** Private declaration comment */
	private String lastName;

	/** Private declaration comment */
	private boolean driverLicense;

	/** Private declaration comment */
	private String gender;

	/** Constructor comment */
	public Passenger(final String... passengerArray) {

		this.passengerID = Integer.parseInt(passengerArray[0]);
		this.firstName = passengerArray[1];
		this.lastName = passengerArray[2];
		this.driverLicense = passengerArray[3].equals("Y");
		this.gender = passengerArray[4];
	}

	/** Constructor comment */
	public Passenger(final int passengerID, final String firstName, final String lastName, final boolean driverLicense,
			final String gender) {
		this.passengerID = passengerID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.driverLicense = driverLicense;
		this.gender = gender;
	}

	/** Getters / Setters comment */
	public int getPassengerID() {
		return passengerID;
	}

	/** Getters / Setters comment */
	public void setPassengerID(final int passengerID) {
		this.passengerID = passengerID;
	}

	/** Getters / Setters comment */
	public String getFirstName() {
		return firstName;
	}

	/** Getters / Setters comment */
	public void setFirstName(final String firstName) {
		this.firstName = firstName;
	}

	/** Getters / Setters comment */
	public String getLastName() {
		return lastName;
	}

	/** Getters / Setters comment */
	public void setLastName(final String lastName) {
		this.lastName = lastName;
	}

	/** Getters / Setters comment */
	public boolean isDriverLicense() {
		return driverLicense;
	}

	/** Getters / Setters comment */
	public void setDriverLicense(final boolean driverLicense) {
		this.driverLicense = driverLicense;
	}

	/** Getters / Setters comment */
	public String getGender() {
		return gender;
	}

	/** Getters / Setters comment */
	public void setGender(final String gender) {
		this.gender = gender;
	}

}
