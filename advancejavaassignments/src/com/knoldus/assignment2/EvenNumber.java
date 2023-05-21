package com.knoldus.assignment2;

import java.util.Scanner;

interface NextEvenNumber{
    long getNextEven(long number2);
}
public class EvenNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number : ");
        Scanner scanner = new Scanner(System.in);
        Long userNumber = scanner.nextLong();

        // Defining a lambda function to get the next even number
        NextEvenNumber nextEvenNumber = (number) ->{
            if (number % 2 == 0) {
                return (int)number+2;
            }
            else{
                return (int)++number;
            }
        };


        long result = nextEvenNumber.getNextEven(userNumber);
        System.out.println("Even number next to " + userNumber + " is : " + result);

    }
}
