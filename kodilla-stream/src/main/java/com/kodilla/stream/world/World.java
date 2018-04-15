package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;

public class World {


    private  final ArrayList<String> continents = new ArrayList<>();

    public World() {
        continents.add("Europe");
        continents.add("North America");
        continents.add("South America");
    }

    Continent conti = new Continent();

    public BigDecimal getPeopleQuantity(){
        return continents.stream()
                .flatMap(continents->conti.countryEurope().stream())
                .flatMap(continents->conti.countryNorthAmerica().stream())
                .flatMap(continents->conti.countrySouthAmerica().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, peopleQuantity) -> peopleQuantity = sum.add(peopleQuantity));
    }


}


