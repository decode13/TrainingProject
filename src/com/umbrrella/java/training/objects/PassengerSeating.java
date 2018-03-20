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
        final StringBuffer header = new StringBuffer(128);

        final Car sedan = new Car();
        sedan.setManufacturer("Volkswagen");
        sedan.setModelNo("Passat");
        sedan.plateNo = "C-AR-902813";
        sedan.destination = "Munich";
        header.append("Seating for vehicle type: Car, model: ").append(sedan.getManufacturer()).append(' ').append(sedan.getModelNo()).append(", plate number: ").append(sedan.plateNo).append(", with destination: ").append(sedan.destination);
        System.out.println(header); // NOPMD on 18/03/18 18:51, with reason: SystemPrintln
        System.out.println(separator(header.toString())); // NOPMD on 18/03/18 18:51, with reason: SystemPrintln

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
        final StringBuilder header = new StringBuilder(128);

        final Bus smallBus = new Bus();
        smallBus.setManufacturer("Iveco");
        smallBus.setModelNo("Wheels");
        smallBus.plateNo = "B-US-827643";
        smallBus.destination = "Graz";
        header.append("Seating for vehicle type: Bus, model: ").append(smallBus.getManufacturer()).append(' ').append(smallBus.getModelNo()).append(", plate number: ").append(smallBus.plateNo).append(", with destination: ").append(smallBus.destination);
        System.out.println(header.toString()); // NOPMD on 18/03/18 18:52, with reason: SystemPrintln
        System.out.println(separator(header.toString())); // NOPMD on 18/03/18 18:52, with reason: SystemPrintln

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
        final StringBuilder header = new StringBuilder(128);

        final Plane tinyPlane = new Plane();
        tinyPlane.setManufacturer("Airbus");
        tinyPlane.setModelNo("Crow");
        tinyPlane.plateNo = "DE-12319908";
        tinyPlane.destination = "Paris";
        header.append("Seating for vehicle type: Plane, model: ").append(tinyPlane.getManufacturer()).append(' ').append(tinyPlane.getModelNo()).append(", plate number: ").append(tinyPlane.plateNo).append(", with destination: ").append(tinyPlane.destination);
        System.out.println(header.toString()); // NOPMD on 18/03/18 18:53, with reason: SystemPrintln
        System.out.println(separator(header.toString())); // NOPMD on 18/03/18 18:53, with reason: SystemPrintln

        final List<Passenger> passengerList = GetPassengerList.getFromCSV(csvFile);

        for (final Passenger passenger : passengerList) {
            tinyPlane.reserveSeat(passenger);
        }

        tinyPlane.listSeats();
        System.out.println(""); // NOPMD on 18/03/18 18:53, with reason: SystemPrintln
    }

    private String separator(final String title) {

        final StringBuilder separator = new StringBuilder();
        for (int h = 0; h < title.length(); h++) {
            separator.append('-');
        }

        return separator.toString();

    }
}
