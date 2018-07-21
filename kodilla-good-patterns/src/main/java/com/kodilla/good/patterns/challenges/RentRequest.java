package com.kodilla.good.patterns.challenges;

public class RentRequest {

    private String user;
    private String from;
    private String to;

    public RentRequest(String user, String from, String to) {
        this.user = user;
        this.from = from;
        this.to = to;
    }

    public String getTo() {
        return to;
    }

    public String getUser() {
        return user;

    }

    public String getFrom() {
        return from;
    }

    @Override
    public String toString() {
        return "RentRequest{" +
                "user='" + user + '\'' +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                '}';
    }
}


