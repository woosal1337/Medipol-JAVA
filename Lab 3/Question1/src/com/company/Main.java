package com.company;

import java.util.*;
class Main {
    public static void main(String[] args) {
        int counter;
        Random rnum = new Random();
        /* Below code would generate 5 random numbers
         * between 0 and 200.
         */
        System.out.println("Random NUM");
        System.out.println("*****");
        for (counter = 1; counter <= 5; counter++) {
            System.out.println(rnum.nextInt(100));
        }
    }
}