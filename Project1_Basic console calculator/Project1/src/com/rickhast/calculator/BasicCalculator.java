package com.rickhast.calculator;

import java.util.List;
import java.util.Scanner;

public class BasicCalculator {
    static Scanner scanner = new Scanner(System.in);
    static void calculate(String operator, double number1, double number2){

        double result = 0.0;

        switch (operator){

            case "+":
                result = number1 + number2;
                break;

            case "-":
                result = number1 - number2;
                break;

            case "*":
                result = number1 * number2;
                break;

            case "/":
                if (number2 == 0){
                    System.out.println("\nDivision by 0 is impossible !!");
                    return;
                }
                result = number1 / number2;
                break;
        }

        System.out.printf("%nYour operation is: %.2f %s %.2f = %.2f %n", number1, operator, number2, result);
    }

    public static void main(String[] args) {
        // Projet1: Basic Console Calculator

        List<String> list = List.of("+", "-", "*", "/");
        double number1;
        double number2;
        String operator;
        String userChoice;

        do {
            try{
                System.out.print("Enter The first number: ");
                number1 = scanner.nextDouble();

                System.out.print("Enter an operator number: ");
                operator = scanner.next();
                if (!list.contains(operator)){
                    throw new java.util.InputMismatchException("Please enter a valid operator: '+', '-', '*', '/'");
                }

                System.out.print("Enter The second number: ");
                number2 = scanner.nextDouble();

                calculate(operator, number1, number2);

            } catch(java.util.InputMismatchException e){
                System.out.println("\n\t\t ===== Error =====");
                System.out.println(e.getMessage());
                scanner.nextLine();
            }

            System.out.println("new Calcul ? (y/n): ");
            userChoice = scanner.next();

        }while (userChoice.equalsIgnoreCase("y"));

        scanner.close();
    }

}