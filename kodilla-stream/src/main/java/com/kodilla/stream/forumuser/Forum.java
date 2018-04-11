package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {
    private  final List<ForumUser> usersList = new ArrayList<>();

    public Forum() {
        usersList.add(new ForumUser(1, "Janek1", 'M', LocalDate.of(1960, 1, 2), 11));
        usersList.add(new ForumUser(2, "Basia1", 'K', LocalDate.of(1990, 12, 11), 11));
        usersList.add(new ForumUser(3, "Janek2", 'M', LocalDate.of(1976, 8, 23), 0));
        usersList.add(new ForumUser(4, "Basia2", 'K', LocalDate.of(1978, 11, 9), 11));
        usersList.add(new ForumUser(5, "Janek3", 'M', LocalDate.of(2001, 3, 12), 16));
        usersList.add(new ForumUser(6, "Basia3", 'K', LocalDate.of(2007, 5, 24), 23));
        usersList.add(new ForumUser(7, "Janek4", 'M', LocalDate.of(1999, 1, 22), 0));
        usersList.add(new ForumUser(8, "Basia4", 'K', LocalDate.of(1998, 6, 30), 17));
        usersList.add(new ForumUser(9, "Janek5", 'M', LocalDate.of(1980, 1, 14), 45));
        usersList.add(new ForumUser(10, "Basia5", 'K', LocalDate.of(1960, 2, 2), 7));
    }
        public List <ForumUser> getList(){
            return new ArrayList<>(usersList);
        }

    }
