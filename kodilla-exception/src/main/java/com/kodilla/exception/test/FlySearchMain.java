package com.kodilla.exception.test;

class FlySearchMain {
    public static void main(java.lang.String[] args) throws Exception {

        Flight flight1 = new Flight("blabla", "Manila");
        FlySearch flySearch1 = new FlySearch();
        try {
            flySearch1.flySearch(flight1);
        } catch (Exception e) {
            System.out.println("Coś poszło nie tak");
        } finally {
            System.out.println("Koniec");

        }
    }
}


