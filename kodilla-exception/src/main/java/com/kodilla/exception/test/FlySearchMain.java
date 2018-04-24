package com.kodilla.exception.test;

class FlySearchMain {
    public static void main(java.lang.String[] args) throws Exception {

        Flight flight1 = new Flight("Blabla", "Manila");
        FlySearch flySearch1 = new FlySearch();
        try {
            flySearch1.flySearch(flight1);
        } catch (Exception e) {
            System.out.println("Not found!");
        } finally {
            System.out.println("The End");

        }
    }
}


