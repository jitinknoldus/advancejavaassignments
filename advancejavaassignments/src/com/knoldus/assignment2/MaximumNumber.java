package com.knoldus.assignment2;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer number1 = Integer.valueOf(input.nextInt());
        Integer number2 = Integer.valueOf(input.nextInt());

        MaxNumber maxFunction = (numberOne, numberTwo) -> Math.max(number1, number2);

        Integer result = maxFunction.getMax(number1, number2);
        System.out.println("The maximum of " + number1 + " and " + number2 + " is " + result);
    }
}
