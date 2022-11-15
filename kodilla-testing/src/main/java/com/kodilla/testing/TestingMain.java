package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int addresult1 = calculator.add(4,6);
        if (addresult1 == 10) {
            System.out.println("Add test OK");
        } else {
            System.out.println("Error!");
        }
        int subResult2 = calculator.substract(2,7);
        if (subResult2 == 5) {
            System.out.println("Substract test OK");
        } else {
                System.out.println("Error!");
            }

        }
    }

