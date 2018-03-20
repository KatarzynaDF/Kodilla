package com.kodilla.testing;
import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }
        System.out.println("Test - pierwszy test jednostkowy:");

        Calculator calculator1 = new Calculator();

        double result1 = calculator1.add(4,5);
        double result2 = calculator1.substract(4,5);

        if (result1==9){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        if (result2==-1){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

    }
}
