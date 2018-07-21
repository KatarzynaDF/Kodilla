package com.kodilla.good.patterns.challanges2;

import java.util.ArrayList;
import java.util.Scanner;

public class LookForFlight {

    FlightList flightList;
    FlightsData flightsData;

    public ArrayList<FlightsData> resultFrom(FlightList flightsData) {
        System.out.println("Destination:");
        Scanner sc = new Scanner(System.in);
        String to = sc.nextLine();

        System.out.println("Interchange place (none/city name):");
        Scanner sb = new Scanner(System.in);
        String change1 = sb.nextLine();

        ArrayList<FlightsData> result = new ArrayList<>();

        FlightList.allFlightListCreate().stream()
                .filter(s -> to.equals(s.getTo()))
                .filter(k->change1.equals(k.getChange()))
                .forEach(result::add);

        return result;
    }

    public ArrayList<FlightsData> resultTo(FlightList flightsData) {
        System.out.println("Departure:");
        Scanner sc = new Scanner(System.in);
        String from = sc.nextLine();

        System.out.println("Interchange place (none/city name):");
        Scanner sb = new Scanner(System.in);
        String change2 = sb.nextLine();

        ArrayList<FlightsData> result1 = new ArrayList<>();

        FlightList.allFlightListCreate().stream()
                .filter(s -> from.equals(s.getFrom()))
                .filter(k->change2.equals(k.getChange()))
                .forEach(result1::add);

        return result1;
    }
}
