package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {

    private int identyNumber;
    private String userName;
    private char sex;
    private LocalDate birthdate;
    private int postsNumber;

    public ForumUser(int identyNumber, String userName, char sex, LocalDate birthdate, int postsNumber) {
        this.identyNumber = identyNumber;
        this.userName = userName;
        this.sex = sex;
        this.birthdate = birthdate;
        this.postsNumber = postsNumber;
    }

    public int getIdentyNumber() {
        return identyNumber;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public int getPostsNumber() {
        return postsNumber;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "identyNumber=" + identyNumber +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", birthdate=" + birthdate +
                ", postsNumber=" + postsNumber +
                '}';
    }
}