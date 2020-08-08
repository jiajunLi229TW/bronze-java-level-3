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
        return checkIn.getTicket();
        // ---end->
    }

    public Car fetch(ParkingTicket ticket) {
        // TODO: Implement the method according to test
        // <-start-
        FetchingResult checkOut = parkingLot.fetch(ticket);
        return checkOut.getCar();
        // ---end->
    }

    public String getLastErrorMessage() {
        return lastErrorMessage;
    }
}

