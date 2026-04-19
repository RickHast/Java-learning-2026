package com.rickhast.universal_converter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UniversalConverter {

    static Scanner scanner = new Scanner(System.in);
    static boolean valid_under_function_choice = false;

    static void displayForm(String symbolForm, int symbolCount, String message){
        System.out.println();
        for (int i = 1; i <= symbolCount; i++){
            System.out.print(symbolForm);
        }

        System.out.println("\n" + message + "\n");

        for (int i = 1; i <= symbolCount; i++){
            System.out.print(symbolForm);
        }
    }

    static int getUnderFunctionChoice(String[] options, String prompt, String errorMessage){
        int userChoice = 0;
        int[] choices = {1, 2};
        boolean validChoice = false;

        for (String option : options){
            System.out.println(option);
        }

        while (!validChoice){
            try {
                System.out.println(prompt);
                userChoice = scanner.nextInt();
                if (userChoice != choices[0] && userChoice != choices[1]){
                    throw new InputMismatchException(errorMessage);
                }

                validChoice = true;
            }catch (InputMismatchException e){
                System.out.println(e.getMessage());
                scanner.nextLine();
                continue;
            }
        }

        return userChoice;
    }

    //temperature functions
    static void celsius(){
        String[] options = {"1. Celsius to fahrenheit", "2. Celsius to Kelvin"};
        int getChoice = getUnderFunctionChoice(
                options,
                "Enter your celsius conversion choice: ",
                "Error: Pick your choice in the list above !!");

        if (getChoice == 1){
            TemperatureConversion.celsiusToFahrenheit(scanner);
        }

        if (getChoice == 2) {
            TemperatureConversion.celsiusToKelvin(scanner);
        }
    }

    static void kelvin(){
        String[] options = {"1. Kelvin to fahrenheit", "2. Kelvin to Celsius"};
        int getChoice = getUnderFunctionChoice(
                options,
                "Enter your Kelvin conversion choice: ",
                "Error: Pick your choice in the list above !!");

        if (getChoice == 1){
            TemperatureConversion.kelvinToFahrenheit(scanner);
        }

        if (getChoice == 2) {
            TemperatureConversion.kelvinToCelsius(scanner);
        }
    }

    static void fahrenheit(){
        String[] options = {"1. Fahrenheit to Celsius", "2. Fahrenheit to Kelvin"};
        int getChoice = getUnderFunctionChoice(
                options,
                "Enter your Fahrenheit conversion choice: ",
                "Error: Pick your choice in the list above !!");

        if (getChoice == 1){
            TemperatureConversion.fahrenheitToCelsius(scanner);
        }

        if (getChoice == 2) {
            TemperatureConversion.fahrenheitToKelvin(scanner);
        }
    }


    static void temperatureMenu(){
        String symbol_form = "°";
        int symbol_count = 70;
        String message = "\tWelcome in the temperature converter";
        displayForm(symbol_form, symbol_count, message);

        String userTemperatureChoice = "";
        ArrayList<String> temperatureConverterOptions = new ArrayList<>();
        temperatureConverterOptions.add("Celsius (°C)");
        temperatureConverterOptions.add("kelvin (Kelvin)");
        temperatureConverterOptions.add("Fahrenheit (°F)");
        temperatureConverterOptions.add("Quit");

        System.out.println();
        for (int i = 0; i < temperatureConverterOptions.toArray().length; i++){
            System.out.println((i+1) + ". " + temperatureConverterOptions.get(i));
        }

        boolean validUserChoice = false;
        int converterUserChoice = 0;
        while (!validUserChoice){
            try {
                System.out.print("\n Enter your converter choice here: ");
                converterUserChoice = scanner.nextInt();

                if (converterUserChoice < 1 || converterUserChoice > temperatureConverterOptions.size()){
                    throw new InputMismatchException("Error: Please pick a choice between 1 and "
                            + temperatureConverterOptions.size() + " !!");
                }

                validUserChoice = true;
            }catch (InputMismatchException e){
                System.out.println("\n" + e.getMessage());
                scanner.nextLine();
                continue;
            }
        }

        switch (converterUserChoice){
            case 1:
                celsius();
                break;

            case 2:
                kelvin();
                break;

            case 3:
                fahrenheit();
                break;

            case 4:
                System.out.println("\nGoodbye and look forward, have a nice day !!");
                return;
        }

    }


    // distance functions
    static void kilometers(){
        String[] options = {"1. kilometers to miles", "2. kilometers to meters"};
        int getChoice = getUnderFunctionChoice(
                options,
                "Enter your kilometers conversion choice: ",
                "Error: Pick your choice in the list above !!");

        if (getChoice == 1){
            DistanceConversion.kilometersToMiles(scanner);
        }

        if (getChoice == 2) {
            DistanceConversion.kilometersToMeters(scanner);
        }
    }

    static void miles(){
        String[] options = {"1. miles to kilometers", "2. miles to meters"};
        int getChoice = getUnderFunctionChoice(
                options,
                "Enter your miles conversion choice: ",
                "Error: Pick your choice in the list above !!");

        if (getChoice == 1){
            DistanceConversion.milesToKilometer(scanner);
        }

        if (getChoice == 2) {
            DistanceConversion.milesToMeters(scanner);
        }
    }

    static void meters(){
        String[] options = {"1. meters to kilometers", "2. meters to miles"};
        int getChoice = getUnderFunctionChoice(
                options,
                "Enter your meters conversion choice: ",
                "Error: Pick your choice in the list above !!");

        if (getChoice == 1){
            DistanceConversion.metersToKilometers(scanner);
        }

        if (getChoice == 2) {
            DistanceConversion.metersToMiles(scanner);
        }
    }


    static void distanceMenu(){
        String userTemperatureChoice = "";
        ArrayList<String> distanceConverterOptions = new ArrayList<>();
        distanceConverterOptions.add("Kilometers (Km)");
        distanceConverterOptions.add("miles ");
        distanceConverterOptions.add("meters ");
        distanceConverterOptions.add("Quit");

        System.out.println();
        for (int i = 0; i < distanceConverterOptions.toArray().length; i++){
            System.out.println((i+1) + ". " + distanceConverterOptions.get(i));
        }

        boolean validUserChoice = false;
        int converterUserChoice = 0;
        while (!validUserChoice){
            try {
                System.out.print("\n Enter your converter choice here: ");
                converterUserChoice = scanner.nextInt();

                if (converterUserChoice < 1 || converterUserChoice > distanceConverterOptions.size()){
                    throw new InputMismatchException("Error: Please pick your choice in the list above !! ");
                }

                validUserChoice = true;
            }catch (InputMismatchException e){
                System.out.println("\n" + e.getMessage());
                scanner.nextLine();
                continue;
            }
        }

        switch (converterUserChoice){
            case 1:
                kilometers();
                break;

            case 2:
                miles();
                break;

            case 3:
                meters();
                break;

            case 4:
                System.out.println("\nGoodbye and look forward, have a nice day !!");
                return;
        }

    }


    // weight functions
    static void kilograms(){
        String[] options = {"1. kilograms to pounds", "2. kilograms to grams"};
        int getChoice = getUnderFunctionChoice(
                options,
                "Enter your kilograms conversion choice: ",
                "Error: Pick your choice in the list above !!");

        if (getChoice == 1){
            WeightConverter.kilogramsToPounds(scanner);
        }

        if (getChoice == 2) {
            WeightConverter.kilometersToGrams(scanner);
        }
    }

    static void pounds(){
        String[] options = {"1. pounds to kilograms", "2. pounds to grams"};
        int getChoice = getUnderFunctionChoice(
                options,
                "Enter your pounds conversion choice: ",
                "Error: Pick your choice in the list above !!");

        if (getChoice == 1){
            WeightConverter.poundsToKilograms(scanner);
        }

        if (getChoice == 2) {
            WeightConverter.poundToGrams(scanner);
        }
    }

    static void grams(){
        String[] options = {"1. grams to kilograms", "2. grams to pounds"};
        int getChoice = getUnderFunctionChoice(
                options,
                "Enter your grams conversion choice: ",
                "Error: Pick your choice in the list above !!");

        if (getChoice == 1){
            WeightConverter.gramsToKilograms(scanner);
        }

        if (getChoice == 2) {
            WeightConverter.gramsToPounds(scanner);
        }
    }

    static void weightMenu(){
        String symbolForm = "°";
        int symbolCount = 70;
        String message = "\tWelcome in the Universal Converter Menu";
        displayForm(symbolForm, symbolCount, message);

        String userTemperatureChoice = "";
        ArrayList<String> weightConverterOptions = new ArrayList<>();
        weightConverterOptions.add("kilograms (kg)");
        weightConverterOptions.add("pounds (lbs)");
        weightConverterOptions.add("grams (g)");
        weightConverterOptions.add("Quit");

        System.out.println();
        for (int i = 0; i < weightConverterOptions.toArray().length; i++){
            System.out.println((i+1) + ". " + weightConverterOptions.get(i));
        }

        boolean validUserChoice = false;
        int converterUserChoice = 0;
        while (!validUserChoice){
            try {
                System.out.print("\n Enter your converter choice here: ");
                converterUserChoice = scanner.nextInt();

                if (converterUserChoice < 1 || converterUserChoice > weightConverterOptions.size()){
                    throw new InputMismatchException("Error: Please pick your choice in the list above !! ");
                }

                validUserChoice = true;
            }catch (InputMismatchException e){
                System.out.println("\n" + e.getMessage());
                scanner.nextLine();
                continue;
            }
        }

        switch (converterUserChoice){
            case 1:
                kilograms();
                break;

            case 2:
                pounds();
                break;

            case 3:
                grams();
                break;

            case 4:
                System.out.println("\nGoodbye and look forward, have a nice day !!");
                return;
        }

    }


    static void mainMenu(){
        String symbolForm = "=";
        int symbolCount = 70;
        String message = "\tWelcome in the Universal Converter Menu";
        displayForm(symbolForm, symbolCount, message);

        ArrayList<String> converterOptions = new ArrayList<>();
        converterOptions.add("Temperature  (°C, °F, Kelvin)");
        converterOptions.add("Distance     (km, miles, meters)");
        converterOptions.add("Weight       (kg, pounds, grams)");
        converterOptions.add("Quit");

        System.out.println();
        for (int i = 0; i < converterOptions.size(); i++){
            System.out.println((i+1) + ". " + converterOptions.get(i));
        }

        boolean validUserChoice = false;
        int converterUserChoice = 0;
        while (!validUserChoice){
            try {
                System.out.print("\n Enter your converter choice here: ");
                converterUserChoice = scanner.nextInt();

                if (converterUserChoice < 1 || converterUserChoice > converterOptions.size()){
                    throw new InputMismatchException("Error: Please pick your choice in the list above !! ");
                }


                validUserChoice = true;
            }catch (InputMismatchException e){
                System.out.println("\n" + e.getMessage());
                scanner.nextLine();
                continue;
            }
        }

        switch (converterUserChoice){
            case 1:
                temperatureMenu();
                break;

            case 2:
                distanceMenu();
                break;

            case 3:
                weightMenu();
                break;

            case 4:
                System.out.println("\nGoodbye and look forward, have a nice day !!");
                break;

        }

    }

    public static void main(String[] args) {

        mainMenu();
        String userChoice = "";
        String[] choices = {"y", "n"};
        boolean validChoice = false;

        while (!validChoice){
            try {
                System.out.println("New conversion? (y/n): ");
                userChoice = scanner.next();
                if (!Arrays.asList(choices).contains(userChoice)){
                    throw new InputMismatchException("\nError: Please just enter Yes(y) or No(n) !!");
                }

                if(userChoice.equalsIgnoreCase("y")) {
                    mainMenu();
                } else if (userChoice.equalsIgnoreCase("n")) {
                    System.out.println("\nGoodbye and look forward, have a good day !!\n");
                    validChoice = true;
                }

            }catch (InputMismatchException e){
                System.out.println(e.getMessage());
                scanner.nextLine();
                continue;
            }
        }

    }
}