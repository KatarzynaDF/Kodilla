package com.kodilla.good.patterns.challanges2;

import java.util.Objects;

public class FlightsData {

    private String from;
    private String to;
    private String change;

    public FlightsData(String from, String to, String change) {
        this.from = from;
        this.to = to;
        this.change = change;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public String getChange() {
        return change;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlightsData that = (FlightsData) o;
        return Objects.equals(from, that.from) &&
                Objects.equals(to, that.to) &&
                Objects.equals(change, that.change);
    }

    @Override
    public int hashCode() {

        return Objects.hash(from, to, change);
    }

    @Override
    public String toString() {
        return "FlightsData{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", change='" + change + '\'' +
                '}';
    }
}
