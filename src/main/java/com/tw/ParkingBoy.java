package com.tw;

public class ParkingBoy {
    private final ParkingLot parkingLot;
    private String lastErrorMessage;

    public ParkingBoy(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    public ParkingTicket park(Car car) {
        // TODO: Implement the method according to test
        // <-start-
        ParkingResult checkIn = parkingLot.park(car);
        lastErrorMessage = checkIn.getMessage();
        return checkIn.getTicket();
        // ---end->
    }

    public Car fetch(ParkingTicket ticket) {
        // TODO: Implement the method according to test
        // <-start-
        FetchingResult checkOut = parkingLot.fetch(ticket);
        lastErrorMessage = checkOut.getMessage();
        return checkOut.getCar();
        // ---end->
    }

    public String getLastErrorMessage() {
        return lastErrorMessage;
    }
}

