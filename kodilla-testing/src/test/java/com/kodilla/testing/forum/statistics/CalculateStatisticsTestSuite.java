package com.kodilla.testing.forum.statistics;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class CalculateStatisticsTestSuite {

    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void CalculateStatistics_case1() {  //posts=0
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int posts = 0;
        int comments = 1000;
        List<String> usersNames= new ArrayList<>();
        usersNames.add("User1");
        usersNames.add("User2");
        usersNames.add("User3");
        usersNames.add("User4");
        usersNames.add("User5");
        usersNames.add("User6");
        usersNames.add("User7");
        usersNames.add("User8");
        usersNames.add("User9");
        usersNames.add("User10");

        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.commentsCount()).thenReturn(comments);
        when(statisticsMock.usersNames()).thenReturn(usersNames);

        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);

        //When

        double averageNumbersOfCommentPerPost = calculateStatistics.calculateAdvStatistics1(0); //Arithmetic exception..
        double averageNumberOfCommentsPerUser = calculateStatistics.calculateAdvStatistics2(comments/usersNames.size());
        double averageNumberOfPostsPerUser = calculateStatistics.calculateAdvStatistics3(0);


        //Then
        Assert.assertEquals(0, averageNumbersOfCommentPerPost ,1.0);
        Assert.assertEquals(100, averageNumberOfCommentsPerUser ,1.0);
        Assert.assertEquals(0, averageNumberOfPostsPerUser,1.0);

    }

    @Test
    public void CalculateStatistics_case2() {  //posts=1000
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int posts = 1000;
        int comments = 1000;
        List<String> usersNames= new ArrayList<>();
        usersNames.add("User1");
        usersNames.add("User2");
        usersNames.add("User3");
        usersNames.add("User4");
        usersNames.add("User5");
        usersNames.add("User6");
        usersNames.add("User7");
        usersNames.add("User8");
        usersNames.add("User9");
        usersNames.add("User10");

        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.commentsCount()).thenReturn(comments);
        when(statisticsMock.usersNames()).thenReturn(usersNames);

        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);

        //When

        double averageNumbersOfCommentPerPost = calculateStatistics.calculateAdvStatistics1(comments/posts);
        double averageNumberOfCommentsPerUser = calculateStatistics.calculateAdvStatistics2(comments/usersNames.size());
        double averageNumberOfPostsPerUser = calculateStatistics.calculateAdvStatistics3(posts/usersNames.size());


        //Then
        Assert.assertEquals(1, averageNumbersOfCommentPerPost ,1.0);
        Assert.assertEquals(100, averageNumberOfCommentsPerUser ,1.0);
        Assert.assertEquals(100, averageNumberOfPostsPerUser,1.0);

    }

    @Test
    public void CalculateStatistics_case3() {  //comments=1000
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int posts = 1000;
        int comments = 0;
        List<String> usersNames= new ArrayList<>();
        usersNames.add("User1");
        usersNames.add("User2");
        usersNames.add("User3");
        usersNames.add("User4");
        usersNames.add("User5");
        usersNames.add("User6");
        usersNames.add("User7");
        usersNames.add("User8");
        usersNames.add("User9");
        usersNames.add("User10");

        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.commentsCount()).thenReturn(comments);
        when(statisticsMock.usersNames()).thenReturn(usersNames);

        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);

        //When

        double averageNumbersOfCommentPerPost = calculateStatistics.calculateAdvStatistics1(0);
        double averageNumberOfCommentsPerUser = calculateStatistics.calculateAdvStatistics2(0);
        double averageNumberOfPostsPerUser = calculateStatistics.calculateAdvStatistics3(posts/usersNames.size());


        //Then
        Assert.assertEquals(0, averageNumbersOfCommentPerPost ,1.0);
        Assert.assertEquals(0, averageNumberOfCommentsPerUser ,1.0);
        Assert.assertEquals(100, averageNumberOfPostsPerUser,1.0);

    }

    @Test
    public void CalculateStatistics_case4() {  //comments<posts
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int posts = 1000;
        int comments = 100;
        List<String> usersNames= new ArrayList<>();
        usersNames.add("User1");
        usersNames.add("User2");
        usersNames.add("User3");
        usersNames.add("User4");
        usersNames.add("User5");
        usersNames.add("User6");
        usersNames.add("User7");
        usersNames.add("User8");
        usersNames.add("User9");
        usersNames.add("User10");

        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.commentsCount()).thenReturn(comments);
        when(statisticsMock.usersNames()).thenReturn(usersNames);

        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);

        //When

        double averageNumbersOfCommentPerPost = calculateStatistics.calculateAdvStatistics1(comments/posts);
        double averageNumberOfCommentsPerUser = calculateStatistics.calculateAdvStatistics2(comments/usersNames.size());
        double averageNumberOfPostsPerUser = calculateStatistics.calculateAdvStatistics3(posts/usersNames.size());


        //Then
        Assert.assertEquals(0.1, averageNumbersOfCommentPerPost ,0.1);
        Assert.assertEquals(10, averageNumberOfCommentsPerUser ,1.0);
        Assert.assertEquals(100, averageNumberOfPostsPerUser,1.0);

    }

    @Test
    public void CalculateStatistics_case5() {  //comments>posts
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int posts = 100;
        int comments = 1000;
        List<String> usersNames= new ArrayList<>();
        usersNames.add("User1");
        usersNames.add("User2");
        usersNames.add("User3");
        usersNames.add("User4");
        usersNames.add("User5");
        usersNames.add("User6");
        usersNames.add("User7");
        usersNames.add("User8");
        usersNames.add("User9");
        usersNames.add("User10");

        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.commentsCount()).thenReturn(comments);
        when(statisticsMock.usersNames()).thenReturn(usersNames);

        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);

        //When

        double averageNumbersOfCommentPerPost = calculateStatistics.calculateAdvStatistics1(comments/posts);
        double averageNumberOfCommentsPerUser = calculateStatistics.calculateAdvStatistics2(comments/usersNames.size());
        double averageNumberOfPostsPerUser = calculateStatistics.calculateAdvStatistics3(posts/usersNames.size());


        //Then
        Assert.assertEquals(10, averageNumbersOfCommentPerPost ,1.0);
        Assert.assertEquals(100, averageNumberOfCommentsPerUser ,1.0);
        Assert.assertEquals(10, averageNumberOfPostsPerUser,1.0);

    }

    @Test
    public void CalculateStatistics_case6() {  //users=0
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int posts = 100;
        int comments = 1000;
        List<String> usersNames= new ArrayList<>();

        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.commentsCount()).thenReturn(comments);
        when(statisticsMock.usersNames()).thenReturn(usersNames);

        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);

        //When

        double averageNumbersOfCommentPerPost = calculateStatistics.calculateAdvStatistics1(comments/posts);
        double averageNumberOfCommentsPerUser = calculateStatistics.calculateAdvStatistics2(0);
        double averageNumberOfPostsPerUser = calculateStatistics.calculateAdvStatistics3(0);


        //Then
        Assert.assertEquals(10, averageNumbersOfCommentPerPost ,1.0);
        Assert.assertEquals(0, averageNumberOfCommentsPerUser ,1.0);
        Assert.assertEquals(0, averageNumberOfPostsPerUser,1.0);

    }

    @Test
    public void CalculateStatistics_case7() {  //users=100
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        int posts = 10;
        int comments = 1000;
        List<String> usersNames= new ArrayList<>();

                for (int userNameSize =0; userNameSize<=100; userNameSize++) {
                    usersNames.add("Kowalski Jan");
                }

        when(statisticsMock.postsCount()).thenReturn(posts);
        when(statisticsMock.commentsCount()).thenReturn(comments);
        when(statisticsMock.usersNames()).thenReturn(usersNames);

        CalculateStatistics calculateStatistics = new CalculateStatistics(statisticsMock);

        //When

        double averageNumbersOfCommentPerPost = calculateStatistics.calculateAdvStatistics1(comments/posts);
        double averageNumberOfCommentsPerUser = calculateStatistics.calculateAdvStatistics2(comments/usersNames.size());
        double averageNumberOfPostsPerUser = calculateStatistics.calculateAdvStatistics3(posts/usersNames.size());

        //Then
        Assert.assertEquals(100, averageNumbersOfCommentPerPost ,1.0);
        Assert.assertEquals(10, averageNumberOfCommentsPerUser ,1.0);
        Assert.assertEquals(0.1, averageNumberOfPostsPerUser,0.1);

    }



}







