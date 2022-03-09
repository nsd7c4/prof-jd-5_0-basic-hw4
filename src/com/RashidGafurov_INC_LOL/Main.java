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
        for (i=firstYear; i < lastYear; i++) {
            while (i % 79 == 0 && i < lastYear) {
                System.out.println(i);
                i += 79;
            }
        }
    }
}
