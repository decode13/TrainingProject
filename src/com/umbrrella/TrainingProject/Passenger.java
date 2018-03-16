package com.umbrrella.TrainingProject;

public class Passenger {

	private int id;
	private String firstName;
	private String lastName;
	private boolean driverLicense;
	private String gender;

	public Passenger(String[] PassengerArray) {

		this.id = Integer.parseInt(PassengerArray[0]);
		this.firstName = PassengerArray[1];
		this.lastName = PassengerArray[2];
		this.driverLicense = PassengerArray[3].equals("Y");
		this.gender = PassengerArray[4];
	}

	public Passenger(int id, String firstName, String lastName, boolean driverLicense, String gender) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.driverLicense = driverLicense;
		this.gender = gender;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public boolean getDriverLicense() {
		return driverLicense;
	}

	public void setDriverLicense(boolean driverLicense) {
		this.driverLicense = driverLicense;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
