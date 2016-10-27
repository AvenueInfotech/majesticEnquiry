package com.sukenkar.majesticenquiry;

/**
 * Created by suken on 13-10-2016.
 */

public class Enquiry {

    private String Origin;
    private String Destination;
    private String Phone;

    public Enquiry(String origin, String destination, String phone) {
        Origin = origin;
        Destination = destination;
        Phone = phone;
    }

    public String getOrigin() {
        return Origin;
    }

    public String getDestination() {
        return Destination;
    }

    public String getPhone() {
        return Phone;
    }
}
