package com.kodilla.good.patterns.challenges;

public class RentalDto {

    private String user;
    private  boolean b;

    public String getUser() {
        return user;
    }

    public boolean isB() {
        return b;
    }

    public RentalDto(String user, boolean b) {
        this.user = user;
        this.b = b;
    }

    @Override
    public String toString() {
        return "RentalDto{" +
                "user='" + user + '\'' +
                ", b=" + b +
                '}';
    }

}
