package com.rickhast.universal_converter;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DistanceConversion {

    static  void kilometersToMiles(Scanner scanner){
        // formula: km × 0.621371
        boolean validUserValue = false;
        double userKilometersValue = 0;
        double kilometersToMiles;

        while (!validUserValue){
            try {
                System.out.print("Enter the kilometer value: ");
                userKilometersValue = scanner.nextDouble();
                validUserValue = true;

            }catch (InputMismatchException e){
                System.out.println("Error: Please enter a valid number value !!");
                scanner.nextLine();
            }
        }

        kilometersToMiles = userKilometersValue * 0.621371;

        System.out.printf("%n convert kilometers to miles: %.2fKm = %.2f miles",
                userKilometersValue, kilometersToMiles);
    }

    static  void kilometersToMeters(Scanner scanner){
        // formula: km × 1000
        boolean validUserValue = false;
        double userKilometersValue = 0;
        double kilometersToMeters;

        while (!validUserValue){
            try {
                System.out.print("Enter the distance in kilometer value: ");
                userKilometersValue = scanner.nextDouble();
                validUserValue = true;

            }catch (InputMismatchException e){
                System.out.println("Error: Please enter a valid number value !!");
                scanner.nextLine();
            }
        }

        kilometersToMeters = userKilometersValue * 1000;

        System.out.printf("%n convert kilometers to meter: %.2fKm = %.2f meters %n",
                userKilometersValue, kilometersToMeters);
    }

    static  void milesToKilometer(Scanner scanner){
        // formula: miles × 1.60934
        boolean validUserValue = false;
        double userMilesValue = 0;
        double milesToKilometers;

        while (!validUserValue){
            try {
                System.out.print("Enter the distance in miles value: ");
                userMilesValue = scanner.nextDouble();
                validUserValue = true;

            }catch (InputMismatchException e){
                System.out.println("Error: Please enter a valid number value !!");
                scanner.nextLine();
            }
        }

        milesToKilometers = userMilesValue * 1.60934;

        System.out.printf("%n convert Miles to Kilometers: %.2f miles = %.2fKm",
                userMilesValue, milesToKilometers);
    }

    static  void milesToMeters(Scanner scanner){
        // formula: miles × 1609.34
        boolean validUserValue = false;
        double userMilesValue = 0;
        double milesToMeters;

        while (!validUserValue){
            try {
                System.out.print("Enter the distance in miles value: ");
                userMilesValue = scanner.nextDouble();
                validUserValue = true;

            }catch (InputMismatchException e){
                System.out.println("Error: Please enter a valid number value !!");
                scanner.nextLine();
            }
        }

        milesToMeters = userMilesValue * 1609.34;

        System.out.printf("%n convert Miles to meters: %.2f miles = %.2f meters",
                userMilesValue, milesToMeters);
    }

    static  void metersToKilometers(Scanner scanner){
        // formula: meters / 1000
        boolean validUserValue = false;
        double userMetersValue = 0;
        double metersToKilometers;

        while (!validUserValue){
            try {
                System.out.print("Enter the distance in meters value: ");
                userMetersValue = scanner.nextDouble();
                validUserValue = true;

            }catch (InputMismatchException e){
                System.out.println("Error: Please enter a valid number value !!");
                scanner.nextLine();
            }
        }

        metersToKilometers = userMetersValue / 1000;

        System.out.printf("%n convert Meters to Kilometers: %.2f meters = %.2fKm",
                userMetersValue, metersToKilometers);
    }

    static  void metersToMiles(Scanner scanner){
        // formula: meters / 1609.34
        boolean validUserValue = false;
        double userMetersValue = 0;
        double metersToMiles;

        while (!validUserValue){
            try {
                System.out.print("Enter the distance in meters value: ");
                userMetersValue = scanner.nextDouble();
                validUserValue = true;

            }catch (InputMismatchException e){
                System.out.println("Error: Please enter a valid number value !!");
                scanner.nextLine();
            }
        }

        metersToMiles = userMetersValue / 1609.34;

        System.out.printf("%n convert Meters to Miles: %.2f meters = %.2f miles",
                userMetersValue, metersToMiles);
    }


}
