package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

public class CollectionTestSuite {
    @BeforeEach
    public void before() {
        System.out.println("Testing empty and normal list");
    }
    @AfterEach
    public void after() {
        System.out.println("Ending test empty and normal list");
    }

    @DisplayName("When we create an empty list" + "Then the class works fine")

    @Test
    void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator oddNumbers = new OddNumbersExterminator();
        List<Integer> empyList = new ArrayList<>();
        //When
        List<Integer> result = oddNumbers.exterminate(empyList);
        //Then
        List<Integer> arrayListToCheck = new ArrayList<>();

        Assertions.assertEquals(0, result.size());
        Assertions.assertTrue(result.containsAll(arrayListToCheck));
    }
    @DisplayName("Testing list with even numbers" + "then the class works fine")

    @Test
    void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator oddNumberTwo = new OddNumbersExterminator();
        List<Integer> normalList = new ArrayList<>();
        normalList.add(1);
        normalList.add(2);
        normalList.add(3);
        normalList.add(4);
        normalList.add(5);
        normalList.add(6);
        normalList.add(7);
        normalList.add(8);
        normalList.add(9);
        normalList.add(10);

        //When
        List<Integer> result2 = oddNumberTwo.exterminate(normalList);

        //Then

        List<Integer> arrayListToCheckTwo = new ArrayList<>();
        arrayListToCheckTwo.add(2);
        arrayListToCheckTwo.add(4);
        arrayListToCheckTwo.add(6);
        arrayListToCheckTwo.add(8);
        arrayListToCheckTwo.add(10);

        Assertions.assertEquals(5,result2.size());
        Assertions.assertTrue(result2.containsAll(arrayListToCheckTwo));
    }
}
