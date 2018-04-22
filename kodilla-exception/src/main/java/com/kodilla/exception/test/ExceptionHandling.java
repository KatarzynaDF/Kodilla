package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(java.lang.String[] args) throws Exception {
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            secondChallenge.probablyIWillThrowException(3, 0);
        } catch (Exception e) {
            System.out.println("Coś poszło nie tak");
        } finally {
            System.out.println("Koniec");

        }
    }
}

