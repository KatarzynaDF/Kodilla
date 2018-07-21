package com.kodilla.testing.forum.statistics;

import java.util.List;

class CalculateStatistics implements Statistics {
    private Statistics statistics;

    public CalculateStatistics(Statistics statistics){
        this.statistics = statistics;
    }

    double calculateAdvStatistics1(double averageNumbersOfCommentPerPost) {

        return  averageNumbersOfCommentPerPost;
    }

    double calculateAdvStatistics2(double averageNumberOfCommentsPerUser) {

        return  averageNumberOfCommentsPerUser;
    }

    double calculateAdvStatistics3(double averageNumberOfPostsPerUser) {

        return averageNumberOfPostsPerUser;
    }

    @Override
    public List<String> usersNames() {
        return usersNames();
    }

    @Override
    public int postsCount() {
        return postsCount();
    }

    @Override
    public int commentsCount() {
        return commentsCount();
    }


}



