package com.knoldus.assignment1;

import java.time.LocalTime;
import java.util.ArrayList;

class Menu {

       static ArrayList<Dish> menuList = new ArrayList<>();
    // static block that adds new Dish in menulist.
    static {
        menuList.add(new Dish(1101, "Pizza", LocalTime.now()));
        menuList.add(new Dish(1102,"Pasta", LocalTime.now()));
        menuList.add(new Dish(1103, "Risotto", LocalTime.now()));
        menuList.add(new Dish(1104,"Lasagna", LocalTime.now()));
        menuList.add(new Dish(1105,"Ravioli", LocalTime.now()));
    }

    //method displaying the dishes from menuList
    public static void displayDishes(){
        for (Dish index : menuList) {
            System.out.println(index);
        }
    }
    public static void compareDishID(int id){
        Dish searchId = new Dish(id);
        boolean isFound=false;
        for(Dish dish:menuList){
            if(dish.equals(searchId)){
                System.out.println(dish.toString());
                isFound=true;
                break;
            }
        }
    }



    }

