package com.umbrrella.TrainingProject;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ObjectsTraining {

	public static void main(String[] args) {

		String csvFile = System.getProperty("user.dir") + "/" + "resources/PassengersList.txt";
		BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ",";
		String[] vehicleType = new String[]{ "Car", "Bus", "Plane" };

		try {

			br = new BufferedReader(new FileReader(csvFile));
			List<Passenger> passengerList = new ArrayList<>();

			while ((line = br.readLine()) != null) {

				String[] csvLine = line.split(cvsSplitBy);

				try {

					passengerList.add(new Passenger(csvLine));

				} catch (Exception e) {
					continue;
				}

			}

			for (int v = 0; v < vehicleType.length; v++) {

				String header = "Seating for vehicle type: " + vehicleType[v] + ", model: ";

				System.out.println("");

				if (vehicleType[v] == "Car") {
					Car sedan = new Car();
					sedan.setManufacturer("Volkswagen");
					sedan.setModelNo("Passat");
					sedan.plateNo = "B-01-CAR";
					header = header + sedan.getManufacturer() + " " + sedan.getModelNo() + ", plate number: "
							+ sedan.plateNo;
					System.out.println(header);
					String separator = "";
					for (int h = 0; h < header.length(); h++) {
						separator = separator + "-";
					}
					System.out.println(separator);

					for (int p = 0; p < passengerList.size(); p++) {
						sedan.reserveSeat(passengerList.get(p));
					}
					sedan.listSeats();

				} else if (vehicleType[v] == "Bus") {
					Bus smallBus = new Bus();
					smallBus.setManufacturer("Iveco");
					smallBus.setModelNo("Wheels");
					smallBus.plateNo = "CJ-93-BUS";
					header = header + smallBus.getManufacturer() + " " + smallBus.getModelNo() + ", plate number: "
							+ smallBus.plateNo;
					System.out.println(header);
					String separator = "";
					for (int h = 0; h < header.length(); h++) {
						separator = separator + "-";
					}
					System.out.println(separator);

					for (int p = 0; p < passengerList.size(); p++) {
						smallBus.reserveSeat(passengerList.get(p));
					}
					smallBus.listSeats();
				} else if (vehicleType[v] == "Plane") {
					Plane tinyPlane = new Plane();
					tinyPlane.setManufacturer("Airbus");
					tinyPlane.setModelNo("Crow");
					tinyPlane.plateNo = "AR 123199";
					header = header + tinyPlane.getManufacturer() + " " + tinyPlane.getModelNo() + ", plate number: "
							+ tinyPlane.plateNo;
					System.out.println(header);
					String separator = "";
					for (int h = 0; h < header.length(); h++) {
						separator = separator + "-";
					}
					System.out.println(separator);

					for (int p = 0; p < passengerList.size(); p++) {
						tinyPlane.reserveSeat(passengerList.get(p));
					}
					tinyPlane.listSeats();
				} else {
					System.out.println(vehicleType[v] + " vehicle type is: Unknown");
					continue;
				}

			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
