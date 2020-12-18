package com.company;

import java.util.Scanner;

public class Main {
    static Scanner theScanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Which shape would you like to draw?\n1. Line \n2. Parabola \n3. Circle\n4. Exit");
        int userChoiceInput = theScanner.nextInt();

        while (0 < userChoiceInput && userChoiceInput < 5) {
            if (userChoiceInput == 1) {
                Line();
            } else if (userChoiceInput == 2) {
                Parabola();
            } else if (userChoiceInput == 3) {
                Circle();
            } else {
                System.exit(0);
            }
        }
    }

    public static void Line() {

        System.out.println("Line formula is y = ax + b");
        System.out.print("Please enter coefficients a and b: ");
        double a = theScanner.nextDouble();
        double b = theScanner.nextDouble();

        for (int i = 10; i >= -10; i--) {
            for (int j = -10; j <= 10; j++) {
                double y = a * j + b;

                if (y == i) {
                    System.out.print("*");
                } else if (i == 0 && j == 0) {
                    System.out.print("+");
                } else if (i == 0) {
                    System.out.print("-");
                } else if (j == 0) {
                    System.out.print("|");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("Which shape would you like to draw?\n1. Line \n2. Parabola \n3. Circle\n4. Exit");
        int userChoiceInput = theScanner.nextInt();

        while (0 < userChoiceInput && userChoiceInput < 5) {
            if (userChoiceInput == 1) {
                Line();
            } else if (userChoiceInput == 2) {
                Parabola();
            } else if (userChoiceInput == 3) {
                Circle();
            } else {
                System.exit(0);
            }
        }
    }

    public static void Parabola() {

        System.out.println("Parabola formula is y = ax^2 + bx + c");
        System.out.print("Please enter parabola's coefficients a, b and c: ");
        double a = theScanner.nextDouble();
        double b = theScanner.nextDouble();
        double c = theScanner.nextDouble();

        for (int i = 10; i >= -10; i--) {
            for (int j = -10; j <= 10; j++) {
                double y = a * j * j + b * j + c;

                if (y == i) {
                    System.out.print("*");
                } else if (i == 0 && j == 0) {
                    System.out.print("+");
                } else if (i == 0) {
                    System.out.print("-");
                } else if (j == 0) {
                    System.out.print("|");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("Which shape would you like to draw?\n1. Line \n2. Parabola \n3. Circle\n4. Exit");
        int userChoiceInput = theScanner.nextInt();

        while (0 < userChoiceInput && userChoiceInput < 5) {
            if (userChoiceInput == 1) {
                Line();
            } else if (userChoiceInput == 2) {
                Parabola();
            } else if (userChoiceInput == 3) {
                Circle();
            } else {
                System.exit(0);
            }
        }
    }

    public static void Circle() {

        System.out.println("Circle formula is (x-a)^2 + (y-b)^2 = r^2 ");
        System.out.print("Please enter circle's coefficients a, b and radius: ");
        double a = theScanner.nextDouble();
        double b = theScanner.nextDouble();
        double r = theScanner.nextDouble();


        for (int i = 10; i >= -10; i--) {
            for (int j = -10; j <= 10; j++) {
                if ((j - a) * (j - a) + (i - b) * (i - b) == r * r) {
                    System.out.print("*");
                } else if (i == 0 && j == 0) {
                    System.out.print("+");
                } else if (i == 0) {
                    System.out.print("-");
                } else if (j == 0) {
                    System.out.print("|");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println("Which shape would you like to draw?\n1. Line \n2. Parabola \n3. Circle\n4. Exit");
        int userChoiceInput = theScanner.nextInt();

        while (0 < userChoiceInput && userChoiceInput < 5) {
            if (userChoiceInput == 1) {
                Line();
            } else if (userChoiceInput == 2) {
                Parabola();
            } else if (userChoiceInput == 3) {
                Circle();
            } else {
                System.exit(0);
            }
        }
    }
}
