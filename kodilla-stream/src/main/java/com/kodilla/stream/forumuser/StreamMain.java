package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {
        Forum forum = new Forum();
        Map<Integer, ForumUser> resultUserList = forum.getList().stream()
                .filter(user -> user.getSex() =='M')
                .filter(user-> ChronoUnit.YEARS.between(user.getBirthdate(), LocalDate.now())>=20)
                .filter(user->user.getPostsNumber()>=1)
                .collect(Collectors.toMap(ForumUser::getIdentyNumber, user->user));

        System.out.println(resultUserList);
    }
}
