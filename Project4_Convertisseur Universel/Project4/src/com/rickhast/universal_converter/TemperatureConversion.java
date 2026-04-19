package com.rickhast.universal_converter;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TemperatureConversion {

    static void celsiusToKelvin(Scanner scanner){
        // formula: C + 273.15
        boolean validUserValue = false;
        double userCelsiusValue = 0;
        double celsiusKelvinConversion;

        while (!validUserValue){
            try {
                System.out.print("Enter your value in celsius: ");
                userCelsiusValue = scanner.nextDouble();
                validUserValue = true;

            }catch (InputMismatchException e){
                System.out.println("Error: Please enter a valid number value !!");
                scanner.nextLine();
            }
        }

        celsiusKelvinConversion = userCelsiusValue + 273.15;

        System.out.printf("\nconversion Celsius to Kelvin: %.2f°C = %.2f Kelvin\n",
                userCelsiusValue, celsiusKelvinConversion);

    }


    static void celsiusToFahrenheit(Scanner scanner){
        // formula: (C × 9/5) + 32
        boolean validUserValue = false;
        double userCelsiusValue = 0;
        double celsiusFahrenheitConversion;

        while (!validUserValue){
            try {
                System.out.print("Enter your value in celsius: ");
                userCelsiusValue = scanner.nextDouble();
                validUserValue = true;

            }catch (InputMismatchException e){
                System.out.println("Error: Please enter a valid number value !!");
                scanner.nextLine();
            }
        }

        celsiusFahrenheitConversion = ((userCelsiusValue * 9)/5) + 32;

        System.out.printf("\nconversion Celsius to Fahrenheit: %.2f°C = %.2f°F\n",
                userCelsiusValue, celsiusFahrenheitConversion);

    }


    static void kelvinToFahrenheit(Scanner scanner){
        // formula: (K - 273.15) × 9/5 + 32
        double userKelvinValue = 0;
        boolean validUserValue = false;
        double kelvinFahrenheitConversion;

        while (!validUserValue){
            try {
                System.out.print("Enter your value in kelvin: ");
                userKelvinValue = scanner.nextDouble();
                validUserValue = true;

            }catch (InputMismatchException e){
                System.out.println("Error: Please enter a valid number value !!");
                scanner.nextLine();
            }
        }

        kelvinFahrenheitConversion = ((userKelvinValue - 273.15) * 9)/5 + 32;

        System.out.printf("\nconversion Kelvin to Fahrenheit: %.2f kelvin = %.2f°F\n",
                userKelvinValue, kelvinFahrenheitConversion);

    }


    static void kelvinToCelsius(Scanner scanner){
        // formula: K - 273.15
        double userKelvinValue = 0;
        boolean validUserValue = false;
        double kelvinCelsiusConversion;

        while (!validUserValue){
            try {
                System.out.print("Enter your value in kelvin: ");
                userKelvinValue = scanner.nextDouble();
                validUserValue = true;

            }catch (InputMismatchException e){
                System.out.println("Error: Please enter a valid number value !!");
                scanner.nextLine();
            }
        }

        kelvinCelsiusConversion = userKelvinValue - 273.15;

        System.out.printf("\nconversion Kelvin to Celsius: %.2f kelvin = %.2f°C\n",
                userKelvinValue, kelvinCelsiusConversion);

    }


    static void fahrenheitToKelvin(Scanner scanner){
        // formula: (F - 32) × 5/9 + 273.15
        double userFahrenheitValue = 0;
        boolean validUserValue = false;
        double fahrenheitKelvinConversion;

        while (!validUserValue){
            try {
                System.out.print("Enter your value in fahrenheit: ");
                userFahrenheitValue = scanner.nextDouble();
                validUserValue = true;

            }catch (InputMismatchException e){
                System.out.println("Error: Please enter a valid number value !!");
                scanner.nextLine();
            }
        }

        fahrenheitKelvinConversion = ((userFahrenheitValue - 32) * 5)/9 + 273.15;

        System.out.printf("\nconversion Fahrenheit to Kelvin: %.2f°F = %.2f kelvin\n",
                userFahrenheitValue, fahrenheitKelvinConversion);

    }

    static void fahrenheitToCelsius(Scanner scanner){
        // formula: (F - 32) × 5/9
        double userFahrenheitValue = 0;
        boolean validUserValue = false;
        double fahrenheitCelsiusConversion;

        while (!validUserValue){
            try {
                System.out.print("Enter your value in fahrenheit: ");
                userFahrenheitValue = scanner.nextDouble();
                validUserValue = true;

            }catch (InputMismatchException e){
                System.out.println("Error: Please enter a valid number value !!");
                scanner.nextLine();
            }
        }

        fahrenheitCelsiusConversion = ((userFahrenheitValue - 32) * 5)/9;

        System.out.printf("\nconversion Fahrenheit to Celsius: %.2f°F = %.2f°C\n",
                userFahrenheitValue, fahrenheitCelsiusConversion);

    }


}
