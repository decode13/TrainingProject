package com.umbrrella.java.training.objects;

import java.util.List;

/**
 * This is the main class.
 */
final class PassengerSeating {

    private PassengerSeating() {
        // Nothing to do here.
    }

    /**
     * PassengerSeating main class comments
     */
    public static void main(final String... args) {

        final String csvFile = System.getProperty("user.dir") + "/" + "resources/PassengersList.txt";

        final PassengerSeating seating = new PassengerSeating();

        seating.carSeatReservation(csvFile);
        seating.busSeatReservation(csvFile);
        seating.planeSeatReservation(csvFile);

    }

    /**
     * some comment
     */
    private void carSeatReservation(final String csvFile) {

        final Car sedan = new Car();
        sedan.setManufacturer("Volkswagen");
        sedan.setModelNo("Passat");
        sedan.plateNo = "C-AR-902813";
        sedan.destination = "Munich";

        String[] words = new String[5];
        words[0] = "Car";
        words[1] = sedan.getManufacturer();
        words[2] = sedan.getModelNo();
        words[3] = sedan.plateNo;
        words[4] = sedan.destination;

        System.out.println(printHeader(words)); // NOPMD on 18/03/18 18:53, with reason: SystemPrintln

        final List<Passenger> passengerList = GetPassengerList.getFromCSV(csvFile);

        for (final Passenger passenger : passengerList) {
            sedan.reserveSeat(passenger);
        }

        sedan.listSeats();
        System.out.println(""); // NOPMD on 18/03/18 18:51, with reason: SystemPrintln

    }

    /**
     * some comment
     */
    private void busSeatReservation(final String csvFile) {

        final Bus smallBus = new Bus();
        smallBus.setManufacturer("Iveco");
        smallBus.setModelNo("Wheels");
        smallBus.plateNo = "B-US-827643";
        smallBus.destination = "Graz";

        String[] words = new String[5];
        words[0] = "Bus";
        words[1] = smallBus.getManufacturer();
        words[2] = smallBus.getModelNo();
        words[3] = smallBus.plateNo;
        words[4] = smallBus.destination;

        System.out.println(printHeader(words)); // NOPMD on 18/03/18 18:53, with reason: SystemPrintln

        final List<Passenger> passengerList = GetPassengerList.getFromCSV(csvFile);

        for (final Passenger passenger : passengerList) {
            smallBus.reserveSeat(passenger);
        }

        smallBus.listSeats();
        System.out.println(""); // NOPMD on 18/03/18 18:52, with reason: SystemPrintln
    }

    /**
     * some comment
     */
    private void planeSeatReservation(final String csvFile) {

        final Plane tinyPlane = new Plane();
        tinyPlane.setManufacturer("Airbus");
        tinyPlane.setModelNo("Crow");
        tinyPlane.plateNo = "DE-12319908";
        tinyPlane.destination = "Paris";

        String[] words = new String[5];
        words[0] = "Plane";
        words[1] = tinyPlane.getManufacturer();
        words[2] = tinyPlane.getModelNo();
        words[3] = tinyPlane.plateNo;
        words[4] = tinyPlane.destination;

        System.out.println(printHeader(words)); // NOPMD on 18/03/18 18:53, with reason: SystemPrintln

        final List<Passenger> passengerList = GetPassengerList.getFromCSV(csvFile);

        for (final Passenger passenger : passengerList) {
            tinyPlane.reserveSeat(passenger);
        }

        tinyPlane.listSeats();
        System.out.println(""); // NOPMD on 18/03/18 18:53, with reason: SystemPrintln
    }

    private String printHeader(final String... headerArray){

        final StringBuilder header = new StringBuilder(128);

        header.append("Seating for vehicle type: ").append(headerArray[0]).append(", model: ").append(headerArray[1]);
        header.append(' ').append(headerArray[2]).append(", plate number: ").append(headerArray[3]);
        header.append(", with destination: ").append(headerArray[4]).append('\n').append(separator(header.length()));

        return header.toString();
    }

    private String separator(final int headerLength) {

        final StringBuilder separator = new StringBuilder();
        for (int h = 0; h < headerLength; h++) {
            separator.append('-');
        }

        return separator.toString();

    }
}
