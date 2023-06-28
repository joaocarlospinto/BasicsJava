package com.java.basicsjava;

/* basic java data type, data convertions, conditional operator, logical operators and loopings
   Joao Carlos Pinto - Java SE 17 Fundamentals
 */

public class Main {

    public static void main(String[] args) {
        // Primitive data types
        int number = 10;
        double decimal = 3.14;
        char character = 'A';
        boolean flag = true;

        System.out.println("int number: " + number);
        System.out.println("double decimal: " + decimal);
        System.out.println("boolean flag: " + flag);

        // Type conversion and casting
        double convertedNumber = number; // Implicit type conversion
        int castedNumber = (int) decimal; // Explicit type casting


        // Conditional operator
        int a = 5;
        int b = 10;
        int max = (a > b) ? a : b; // Ternary conditional operator

        // with IF and ELSE

        if (a > b) {
            max = a;
        } else {
            max = b;
        }

        if (a == 5)
            System.out.println("If statement a equals 5");

        // Switch statement
        int dayOfWeek = 2;
        String day;
        switch (dayOfWeek) {
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            default:
                day = "Invalid day";
        }
        System.out.println("Today is " + day);


        // Logical operators
        boolean condition1 = (a > 0) && (b > 0); // AND operator
        boolean condition2 = (a > 0) || (b > 0); // OR operator
        boolean condition3 = !(a > 0); // NOT operator


        // Looping
        // For loop
        for (int i = 0; i < 5; i++) {
            System.out.println("For loop: " + i);
        }

        // While loop
        int j = 0;
        while (j < 5) {
            System.out.println("While loop: " + j);
            j++;
        }

        // Do-While loop
        int k = 0;
        do {
            System.out.println("Do-While loop: " + k);
            k++;
        } while (k < 5);
    }
}
