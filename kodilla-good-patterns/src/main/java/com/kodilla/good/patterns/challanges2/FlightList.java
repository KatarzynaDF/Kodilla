package com.kodilla.good.patterns.challanges2;

import java.util.ArrayList;

public class FlightList {

    private FlightsData flightsData;

    public static ArrayList<FlightsData> allFlightListCreate() {
        final ArrayList<FlightsData> allFlightList = new ArrayList<>();
        allFlightList.add(new FlightsData("Wrocław", "Wiedeń", "Oslo"));
        allFlightList.add(new FlightsData("Wrocław", "Wenecja", "Kraków"));
        allFlightList.add(new FlightsData("Katowice", "Wiedeń", "Oslo"));
        allFlightList.add(new FlightsData("Rzym", "Wiedeń", "Oslo"));
        allFlightList.add(new FlightsData("Rzym", "Wiedeń", "none"));
        allFlightList.add(new FlightsData("Katowice", "Berlin", "none"));
        allFlightList.add(new FlightsData("Kolonia", "Katowice", "none"));
        allFlightList.add(new FlightsData("Katowice", "Frankfurt", "none"));
        allFlightList.add(new FlightsData("Barcelona", "Wiedeń", "none"));
        allFlightList.add(new FlightsData("Wrocław", "Wiedeń", "Praga"));
        allFlightList.add(new FlightsData("Wrocław", "Nowy Jork", "Praga"));
        allFlightList.add(new FlightsData("Wrocław", "Amsterdam", "none"));
        allFlightList.add(new FlightsData("Warszawa", "Manila", "Pekin"));
        allFlightList.add(new FlightsData("Warszawa", "Manila", "Bangkok"));
        allFlightList.add(new FlightsData("Warszawa", "Chicago", "Oslo"));
        allFlightList.add(new FlightsData("Warszawa", "Chicago", "none"));
        allFlightList.add(new FlightsData("Paryż", "Wiedeń", "Oslo"));
        allFlightList.add(new FlightsData("Paryż", "Wiedeń", "none"));
        return new ArrayList<FlightsData>(allFlightList);
    }
}