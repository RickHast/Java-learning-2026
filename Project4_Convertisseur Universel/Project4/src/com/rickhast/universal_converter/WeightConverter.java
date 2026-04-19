package com.rickhast.universal_converter;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WeightConverter {

    static  void kilogramsToPounds(Scanner scanner){
        // formula: kg × 2.20462
        boolean validUserValue = false;
        double userKilogramsValue = 0;
        double kilogramsToPounds;

        while (!validUserValue){
            try {
                System.out.print("Enter the kilogram value: ");
                userKilogramsValue = scanner.nextDouble();
                validUserValue = true;

            }catch (InputMismatchException e){
                System.out.println("Error: Please enter a valid number value !!");
                scanner.nextLine();
            }
        }

        kilogramsToPounds = userKilogramsValue * 2.20462;

        System.out.printf("%n convert Kilograms to Pounds: %.2fKg = %.2f pounds",
                userKilogramsValue, kilogramsToPounds);
    }

    static  void kilometersToGrams(Scanner scanner){
        // formula: kg × 1000
        boolean validUserValue = false;
        double userKilogramsValue = 0;
        double kilogramsToGrams;

        while (!validUserValue){
            try {
                System.out.print("Enter the distance in kilogram value: ");
                userKilogramsValue = scanner.nextDouble();
                validUserValue = true;

            }catch (InputMismatchException e){
                System.out.println("Error: Please enter a valid number value !!");
                scanner.nextLine();
            }
        }

        kilogramsToGrams = userKilogramsValue * 1000;

        System.out.printf("%n convert kilograms to grams: %.2fKg = %.2f grams %n",
                userKilogramsValue, kilogramsToGrams);
    }

    static  void poundsToKilograms(Scanner scanner){
        // formula: pounds / 2.20462
        boolean validUserValue = false;
        double userPoundsValue = 0;
        double poundsToKilograms;

        while (!validUserValue){
            try {
                System.out.print("Enter the distance in pounds value: ");
                userPoundsValue = scanner.nextDouble();
                validUserValue = true;

            }catch (InputMismatchException e){
                System.out.println("Error: Please enter a valid number value !!");
                scanner.nextLine();
            }
        }

        poundsToKilograms = userPoundsValue / 2.20462;

        System.out.printf("%n convert Pounds to Kilograms: %.2f pounds = %.2fKg",
                userPoundsValue, poundsToKilograms);
    }

    static  void poundToGrams(Scanner scanner){
        // formula: pounds × 453.592
        boolean validUserValue = false;
        double userPoundsValue = 0;
        double poundsToGrams;

        while (!validUserValue){
            try {
                System.out.print("Enter the distance in pounds value: ");
                userPoundsValue = scanner.nextDouble();
                validUserValue = true;

            }catch (InputMismatchException e){
                System.out.println("Error: Please enter a valid number value !!");
                scanner.nextLine();
            }
        }

        poundsToGrams = userPoundsValue * 453.592;

        System.out.printf("%n convert Pounds to Grams: %.2f pounds = %.2f grams",
                userPoundsValue, poundsToGrams);
    }

    static  void gramsToKilograms(Scanner scanner){
        // formula: grams / 1000
        boolean validUserValue = false;
        double userGramsValue = 0;
        double gramsToKilograms;

        while (!validUserValue){
            try {
                System.out.print("Enter the distance in grams value: ");
                userGramsValue = scanner.nextDouble();
                validUserValue = true;

            }catch (InputMismatchException e){
                System.out.println("Error: Please enter a valid number value !!");
                scanner.nextLine();
            }
        }

        gramsToKilograms = userGramsValue / 1000;

        System.out.printf("%n convert Grams to Kilograms: %.2f grams = %.2fKg",
                userGramsValue, gramsToKilograms);
    }

    static  void gramsToPounds(Scanner scanner){
        // formula: grams / 453.592
        boolean validUserValue = false;
        double userGramsValue = 0;
        double gramsToPounds;

        while (!validUserValue){
            try {
                System.out.print("Enter the distance in grams value: ");
                userGramsValue = scanner.nextDouble();
                validUserValue = true;

            }catch (InputMismatchException e){
                System.out.println("Error: Please enter a valid number value !!");
                scanner.nextLine();
            }
        }

        gramsToPounds = userGramsValue / 453.592;

        System.out.printf("%n convert Grams to Pounds: %.2f grams = %.2f pounds",
                userGramsValue, gramsToPounds);
    }
}
