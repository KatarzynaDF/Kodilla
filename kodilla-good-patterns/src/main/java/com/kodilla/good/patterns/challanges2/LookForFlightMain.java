package com.kodilla.good.patterns.challanges2;

public class LookForFlightMain {

    public static void main(String[] args) {

        FlightList flightList = new FlightList();
        LookForFlight lookForFlight = new LookForFlight();
        System.out.println(lookForFlight.resultFrom(flightList));
        System.out.println(lookForFlight.resultTo(flightList));
    }
}
