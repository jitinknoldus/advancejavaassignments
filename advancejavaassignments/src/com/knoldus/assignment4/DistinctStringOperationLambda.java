package com.knoldus.assignment4;

import java.util.*;
import java.util.stream.Collectors;


interface DistinctStringFunction {
    List<String> distinctStringList(List<String> stringList);
}

public class DistinctStringOperationLambda {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the list of strings: ");

        String inputString = scanner.nextLine();


        List<String> stringList = Arrays.asList(inputString.split(" "));

        DistinctStringFunction stringFunction = (stringList1) ->
                stringList.stream().distinct().sorted().collect(Collectors.toList());


        List<String> resultString = stringFunction.distinctStringList(stringList);
        for (String index : resultString) {
            System.out.print(index + " ");
        }
    }
}
