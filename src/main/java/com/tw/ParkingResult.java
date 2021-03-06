package com.tw;

public class ParkingResult {
    private final boolean success;
    private final ParkingTicket ticket;
    private final String message;

    ParkingResult(String errorMessage) {
        this(false, null, errorMessage);
    }

    ParkingResult(ParkingTicket ticket) {
        this(true, ticket, null);
    }

    private ParkingResult(boolean success, ParkingTicket ticket, String message) {
        this.success = success;
        this.ticket = ticket;
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public ParkingTicket getTicket() {
        return ticket;
    }

    public String getMessage() {
        return message;
    }
}

