package com.knoldus.assignment3;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

interface UpperCase{
    String  upperCaseFunction(ArrayList<String> stringList1);
}
public class UpperCaseConcatenation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the seven strings : ");

        ArrayList<String> stringList = new ArrayList<>();

        for(int index = 0; index<7; index++) {
            System.out.print("Enter string " + (index+1) + ": ");
            stringList.add(scanner.nextLine());
        }

        UpperCase upperCase = (stringList1) ->
            stringList.stream().map(String::toUpperCase).collect(Collectors.joining());

        String resultString = upperCase.upperCaseFunction(stringList);

        System.out.println(resultString);
    }
}
