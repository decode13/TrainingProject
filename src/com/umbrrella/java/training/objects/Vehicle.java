package com.umbrrella.java.training.objects;

/**
 * Vechicle base class. Will be extended by specific vehicles.
 *
 */
public class Vehicle {

	/**
	 *  
	 */
	private String manufacturer;
	
	/**
	 * 
	 */
	private String modelNo; 

	/**
	 * 
	 */
	protected transient Passenger seats[][] = new Passenger[0][0]; 
	
	/**
	 * 
	 */
	protected String plateNo; 
	
	/**
	 * 
	 */
	protected String destination; 

	/**
	 * 
	 */
	protected Vehicle() { 
		// This constructor is intentionally empty. 
		// Nothing special is needed here.
	}

	/**
	 * @return
	 */
	protected String getManufacturer() { 
		return manufacturer;
	}

	/**
	 * @return
	 */
	protected String getModelNo() { 
		return modelNo;
	}

	/**
	 * @param manufacturer
	 */
	protected void setManufacturer(final String manufacturer) { 
		this.manufacturer = manufacturer;
	}

	/**
	 * @param modelNo
	 */
	protected void setModelNo(final String modelNo) { 
		this.modelNo = modelNo;
	}

	/**
	 * @param passenger
	 * @return
	 */
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
					seats[rows][columns] = passenger;
					isSeated = true;
					break;
				}
			}
		}

		final int seat = (rows - 1) * seats[0].length + columns + 1;

		return Integer.toString(seat);
	}

	/**
	 * 
	 */
	protected void listSeats() { 
		int rows = 0;
		int columns = 0;
		String output;

		for (rows = 0; rows < seats.length; rows++) {

			for (columns = 0; columns < seats[rows].length; columns++) {
				final int seat = rows * seats[0].length + columns + 1;
				if (seats[rows][columns] == null) {
					output = "Seat " + seat + ": " + "Empty";
					System.out.println(output); // NOPMD on 18/03/18 12:47, with reason: SystemPrintln
				} else {
					output = "Seat " + seat + ": " + seats[rows][columns].getFirstName() + " "  // NOPMD on 18/03/18 12:46, with reason: LawOfDemeter
							+ seats[rows][columns].getLastName(); // NOPMD on 18/03/18 12:46, with reason: LawOfDemeter
					System.out.println(output); // NOPMD on 18/03/18 12:47, with reason: SystemPrintln
				}
			}
		}

	}

}
