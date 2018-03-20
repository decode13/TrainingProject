package com.umbrrella.java.training.objects;

/**
 * Passenger object class.
 */
class Passenger {

	/** Private declaration comment */
	private final transient int passengerID;

	/** Private declaration comment */
	private final String firstName;

	/** Private declaration comment */
	private final String lastName;

	/** Private declaration comment */
	private final boolean driverLicense;

	/** Private declaration comment */
	private final String gender;

	/** Constructor comment */
	Passenger(/* default */ final String... passengerArray) {

		this.passengerID = Integer.parseInt(passengerArray[0]);
		this.firstName = passengerArray[1];
		this.lastName = passengerArray[2];
		this.driverLicense = passengerArray[3].equals("Y");
		this.gender = passengerArray[4];
	}

// --Commented out by Inspection START (20/03/2018, 18:27):
//	/** Constructor comment */
////	public Passenger(final int passengerID, final String firstName, final String lastName, final boolean driverLicense,
////			final String gender) {
////		this.passengerID = passengerID;
////		this.firstName = firstName;
////		this.lastName = lastName;
////		this.driverLicense = driverLicense;
////		this.gender = gender;
////	}
//
//	public int getPassengerID() {
//		return passengerID;
//	}
// --Commented out by Inspection STOP (20/03/2018, 18:27)

// --Commented out by Inspection START (20/03/2018, 18:27):
//	public void setPassengerID(final int passengerID) {
//		this.passengerID = passengerID;
//	}
// --Commented out by Inspection STOP (20/03/2018, 18:27)

	public String getFirstName() {
		return firstName;
	}

// --Commented out by Inspection START (20/03/2018, 18:27):
//	public void setFirstName(final String firstName) {
//		this.firstName = firstName;
//	}
// --Commented out by Inspection STOP (20/03/2018, 18:27)

	public String getLastName() {
		return lastName;
	}

// --Commented out by Inspection START (20/03/2018, 18:27):
//	public void setLastName(final String lastName) {
//		this.lastName = lastName;
//	}
// --Commented out by Inspection STOP (20/03/2018, 18:27)

	public boolean isDriverLicense() {
		return driverLicense;
	}

// --Commented out by Inspection START (20/03/2018, 18:27):
//	public void setDriverLicense(final boolean driverLicense) {
//		this.driverLicense = driverLicense;
//	}
// --Commented out by Inspection STOP (20/03/2018, 18:27)

	public String getGender() {
		return gender;
	}

// --Commented out by Inspection START (20/03/2018, 18:27):
//	public void setGender(final String gender) {
//		this.gender = gender;
//	}
// --Commented out by Inspection STOP (20/03/2018, 18:27)

	@Override
	public String toString() {

		return "passengerID: " + Integer.toString(passengerID) + ", firstName: " + firstName + ", lastName: " + lastName
				+ ", driverLicense: " + driverLicense + ", gender: " + gender;
	}
}
