package com.kodilla.stream.lambda;

public class PoemBeautifier{

    public void makeUpperCase(String stringTobeaoutify, PoemDecorator poemdecorator){

        String beaoutifulString = stringTobeaoutify.toUpperCase();

       System.out.println(beaoutifulString);

    }

    public void addXOXO(String stringTobeaoutify, PoemDecorator poemdecorator){

        String beaoutifulString = "XOXO"+stringTobeaoutify+"XOXO";

        System.out.println(beaoutifulString);

    }

    public void substringTheHalf(String stringTobeaoutify, PoemDecorator poemdecorator){

        String beaoutifulString = stringTobeaoutify.substring(8);

        System.out.println(beaoutifulString);

    }

    public void makeLowerCase(String stringTobeaoutify, PoemDecorator poemdecorator){

        String beaoutifulString = stringTobeaoutify.toLowerCase();

        System.out.println(beaoutifulString);

    }



}
