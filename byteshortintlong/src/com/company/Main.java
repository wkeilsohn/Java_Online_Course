package com.company;

public class Main {

    public static void main(String[] args) {
        int myValue = 10000;

        int mymin = Integer.MIN_VALUE;
        int mymax = Integer.MAX_VALUE;

        System.out.println("Integer Minimum Value = " + mymin);
        System.out.println("Integer Max Value = " + mymax);
        System.out.println("Underflow Min Value = " + (mymax - 1));
        System.out.println("Overflow Max Value = " + (mymax + 1));

        int myNewMax = 2_147_483_647; // Still considered an integer.

        byte bytemin = Byte.MIN_VALUE;
        byte bytemax = Byte.MAX_VALUE;
        System.out.println("Max B: " + bytemax);
        System.out.println("Min B: " + bytemin);

        short shortmin = Short.MIN_VALUE;
        short shortmax = Short.MAX_VALUE;
        System.out.println("Max S: " + shortmax);
        System.out.println("Min S: " + shortmin);

        long longmin = Long.MIN_VALUE;
        long longmax = Long.MAX_VALUE;
        long mylongvalue = 100L; // Must include the "L" at the end to indicate a long in Java
        System.out.println("Max L: " + longmax);
        System.out.println("Min L: " + longmin);

        // Math on different Types:
        int myTotal = mymin / 2;
        // byte bytemin / 2; // On it's own, this won't work. Thus, you need to cast it.
        byte newbyte = (byte)(bytemin / 2);
        short newshort = (short)(shortmin / 2);
        // This is necessary as Java uses the integer by default.

        
    }
}
