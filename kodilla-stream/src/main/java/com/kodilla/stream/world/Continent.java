package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;

public final class Continent {



    public  ArrayList<Country> countryEurope() {

        ArrayList <Country> counEurope = new ArrayList<>();
        counEurope.add(new Country("Poland", (new BigDecimal(1))));
        counEurope.add(new Country("France", (new BigDecimal(1))));
        return counEurope;
    }


    public ArrayList<Country> countryNorthAmerica() {

        ArrayList <Country> counNorthAmerica = new ArrayList<>();
        counNorthAmerica.add(new Country("United States", (new BigDecimal(1))));
        counNorthAmerica.add(new Country("Canada", (new BigDecimal(1))));

        return counNorthAmerica;

    }


    public ArrayList<Country> countrySouthAmerica() {

        ArrayList <Country> counSouthAmerica = new ArrayList<>();
        counSouthAmerica.add(new Country("Mexico", (new BigDecimal(1))));
        counSouthAmerica.add(new Country("Brazil", (new BigDecimal(1))));

        return counSouthAmerica;

    }

}
