package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {

    private int number1;
    private int number2;
    private int number3;

    public int getNumber1() {
        return number1;
    }

    public int getNumber2() {
        return number2;
    }

    public int getNumber3() {
        return number3;
    }

    public OddNumbersExterminator(int number1, int number2, int number3) {
        this.number1 = number1;
        this.number2 = number2;
        this.number3 = number3;
    }

    public ArrayList<Integer> exterminate() {

        ArrayList<Integer> numbersInteger = new ArrayList<Integer>();
        numbersInteger.add(number1);
        numbersInteger.add(number2);
        numbersInteger.add(number3);
        boolean empty = numbersInteger.isEmpty();

        System.out.println(numbersInteger);

        return numbersInteger;
    }

    public ArrayList<Integer> exterminateEven(){

        ArrayList<Integer> numbersIntegerEven = new ArrayList<Integer>();

        if (number1 % 2 == 0) {
            numbersIntegerEven.add(number1);
        }
        if (number2 % 2 == 0) {
            numbersIntegerEven.add(number2);
        }
        if (number3 % 2 == 0) {
            numbersIntegerEven.add(number3);
        }

        System.out.println(numbersIntegerEven);

        return numbersIntegerEven;

    }
}



