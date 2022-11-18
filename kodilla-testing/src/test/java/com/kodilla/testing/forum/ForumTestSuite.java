package com.kodilla.testing.forum;

import org.junit.jupiter.api.*;

@DisplayName("Forum Test Suite")
public class ForumTestSuite {

    @BeforeEach
    public void before(){
        System.out.println("Test Case: begin");
    }
    @AfterEach
    public void after() {
        System.out.println("The test end");
    }
    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite: begin");
    }
    @AfterAll
    public static void afterAll(){
        System.out.println("Test Suite: end");
    }


    @Test
    void testCaseRealName(){
        SimpleUser simpleUser = new SimpleUser("theForumUser","John Smith");

        String result = simpleUser.getRealName();
        System.out.println("Testing" + result);

        Assertions.assertEquals("John Smith", result);
    }
    @DisplayName(
            "When created SimpleUser with name, " +
                    " then getUsername should return corret name"
    )
    @Test
    void testCaseUsername() {
        SimpleUser simpleUser = new SimpleUser("theForumUser", "John Smith");

        String result = simpleUser.getUsername();

        String expectedResult = "theForumUser";

        Assertions.assertEquals(expectedResult, result);

    }
}
