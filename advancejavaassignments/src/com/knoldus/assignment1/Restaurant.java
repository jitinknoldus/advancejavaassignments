package com.knoldus.assignment1;

import java.util.Scanner;


public class Restaurant {
    public static void findDish(){
        Scanner scanner =new Scanner(System.in);
        int dishId= scanner.nextInt();
        Menu.compareDishID(dishId);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the choice : ");
        System.out.println("Press 1 For display menu list.");
        System.out.println("Press 2 To get the details of dish. ");
        int choice = input.nextInt();
while(true) {
    switch (choice) {
        case 1:
            Menu.displayDishes();
            break;
        case 2:
            System.out.println("Enter the dish Id : ");
            findDish();
            break;

        default:
            System.out.println("Invalid input");
    }
    System.out.println("\nEnter 2 to get the further details for dish.");
    choice = input.nextInt();

    }
}
    }

