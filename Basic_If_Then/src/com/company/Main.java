package com.company;

public class Main {

    static boolean cake = false;

    public static void main(String[] args) {

        if(cake){ // Normal conditional operators apply.
            System.out.println("Half-Life-3 Confirmed");
        }else {
            System.out.println("To the moon with you!");
        }

        // && is used for "and"
        // || is used for "or"

        // Temary Operator:
        // - Assigns values to a variable based on a condition.
        String message = cake ? "Half-life-3 Confirmed!" : "It is a lie!";
        System.out.println(message);

    }
}
