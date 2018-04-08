package com.kodilla.testing.library;

import java.util.Objects;

public class LibraryUser {
    String firstname;
    String lastname;
    String peselI;

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getPeselI() {
        return peselI;
    }

    public LibraryUser(String firstname, String lastname, String peselI) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.peselI = peselI;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LibraryUser that = (LibraryUser) o;
        return Objects.equals(firstname, that.firstname) &&
                Objects.equals(lastname, that.lastname) &&
                Objects.equals(peselI, that.peselI);
    }

    @Override
    public int hashCode() {

        return Objects.hash(firstname, lastname, peselI);
    }

    @Override
    public String toString() {
        return "LibraryUser{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", peselI='" + peselI + '\'' +
                '}';
    }
}
