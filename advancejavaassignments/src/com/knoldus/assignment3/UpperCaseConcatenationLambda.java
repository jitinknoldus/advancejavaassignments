package com.knoldus.assignment3;

import java.util.Scanner;
import java.util.stream.Stream;

interface ConcatenateString {
    String concatenatedString(String str1, String str2, String str3, String str4, String str5, String str6, String str7);
}


public class UpperCaseConcatenationLambda{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Strings: ");
        String string1 = input.nextLine();
        String string2 = input.nextLine();
        String string3 = input.nextLine();
        String string4 = input.nextLine();
        String string5 = input.nextLine();
        String string6 = input.nextLine();
        String string7 = input.nextLine();


        ConcatenateString stringConcatenation = (input1, input2, input3, input4, input5, input6, input7) -> {
            String finalString = Stream.of(input1, input2, input3, input4, input5, input6, input7).map(String ::toUpperCase).reduce("", String::concat);
            return finalString;
        };

        String finalString = stringConcatenation.concatenatedString(string1,string2,string3,string4,string5,string6,string7);
        System.out.println(finalString);
    }
}
