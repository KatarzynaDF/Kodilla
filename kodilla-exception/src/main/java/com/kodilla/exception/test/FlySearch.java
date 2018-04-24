package com.kodilla.exception.test;

import java.util.HashMap;

final class FlySearch {
    public HashMap<String, Boolean> flySearch(Flight flight) throws Exception {
        HashMap<String, Boolean> flyMap = new HashMap<>();
        flyMap.put("Kolonia", true);
        flyMap.put("Katowice", false);
        flyMap.put("Manila", true);
        flyMap.put("Warszawa", false);
        flyMap.put("Mediolan", true);
        flyMap.put("Nowy Jork", true);
        flyMap.put("Boston", false);

        if (flyMap.containsKey(flight.getDepartureAirport())) {

            System.out.println("Looking for your airport.." + flyMap.get(flight.getArrivalAirport()) + flyMap);

        } else {
            throw new RouteNotFoundException();
        }
        return flyMap;
    }
}
