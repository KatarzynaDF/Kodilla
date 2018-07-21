package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {
        //Given
        World world = new World();
        Continent continent = new Continent();
        //When
        ArrayList<Country> fullList = continent.getCountryList();
        BigDecimal result = world.getPeopleQuantity();
        // Then
        BigDecimal calculated = new BigDecimal("6000000000");
        Assert.assertEquals(calculated, result);

    }
}