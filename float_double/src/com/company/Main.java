package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        float fmin = Float.MIN_VALUE;
        float fmax = Float.MAX_VALUE;
        System.out.println("Max F: " + fmax);
        System.out.println("Min F: " + fmin);

        double dmin = Double.MIN_VALUE;
        double dmax = Double.MAX_VALUE;
        System.out.println("Max D " + dmax);
        System.out.println("Min D: " + dmin);

        int myint = 5;
        float myfloat = 5f; //The "F" isn't needed. but is good pratice.
        double mydouble = 5d; // Same as above.
        float mycoolfloat = 5.25f; // Here you need the "F" b/c double is assumed for decimals.

        // Convert LB to KG:

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of pounds: ");
        float lb = sc.nextFloat();
        float kgout = lb / 2.2f;
        System.out.println(kgout);
    }
}
