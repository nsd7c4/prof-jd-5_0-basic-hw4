package com.RashidGafurov_INC_LOL;

public class Main {

    public static void main(String[] args) {
        //Assignment 1
        int i = 10;
        while (i > 0) {
            System.out.print(i + " ");
            i -= 1;
        }
        System.out.println("");

        for (i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println("");

        //Assignment 2

        int firstFriday = 1;
        do {
            System.out.println("Today is Friday the " + firstFriday + "th. Prepare the report!");
            firstFriday += 7;
        } while (firstFriday <= 31);

        //Assignment 3
        int firstYear = 2022 - 200;
        int lastYear = 2022 + 100;
        for (i = (firstYear / 79 + 1) * 79; i < lastYear; i += 79) {
            System.out.println(i);
        }

        //Assignment 4
        for (i = 1; i <= 30; i++) {
            System.out.print(i + ":");
            if (i % 3 == 0) {
                System.out.print(" ping");
            }
            if (i % 5 == 0) {
                System.out.print(" pong");
            }
            System.out.println("");
        }

        //Assignment 5
        int firstNumber = 0;
        int secondNumber = 1;
        int tempV = 0;
        System.out.print(firstNumber + " ");
        System.out.print(secondNumber + " ");
        for (i = 1; i <= 8; i++) {
            tempV = secondNumber;
            secondNumber += firstNumber;
            firstNumber = tempV;
            System.out.print(secondNumber + " ");
        }
    }
}
