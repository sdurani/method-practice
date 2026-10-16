package com.pluralsight;

public class CompareNumbers {

    public static void main(String[] args) {

        System.out.println(isEven(2));
        System.out.println(isPositive(-8.3));

    }

    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        }
        else {
            return false;
        }
        // or shorter way instead of if statement:
        // return number % 2 == 0;
    }

    public static boolean isPositive(double number) {
        if (number > 0) {
            return true;
        }
        else {
            return false;
        }
        // or shorter way instead of if statement:
        // return number > 0;
    }
}
