package com.rickhast.jeux_du_nombre_mystère;

import java.util.Scanner;
import java.util.Random;


public class JeuxDuNombreMystere {
    // Project2: Mystery number game
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();

    static boolean verification(int mysteryNumber, int userNumber, int attempts){
        String message;
        boolean result;

        if (mysteryNumber < userNumber){
            message = "Too High";
            result = true;
        } else if (mysteryNumber > userNumber) {
            message = "Too Low";
            result = true;
        }else {
            message = "\nCongratulations! you found it in " + attempts + " attempts\n";
            result = false;
        }

        System.out.println(message);
        return result;
    }

    static void playGame(){
        System.out.println("\n===== Welcome in the 'Mystery Number Game' =====");
        int mysteryNumber = random.nextInt(100) + 1;
        int userNumber;
        int attempts = 0;
        boolean verificationResult = true;
        int remaining;


        do {
            attempts++;
            remaining = 10 - attempts;
            try{
                System.out.printf("Enter a Number in range 1 to 100 (%d attempts remaining):  ", remaining);
                userNumber = scanner.nextInt();

                if (userNumber <=0 || userNumber >100){
                    throw new java.util.InputMismatchException();
                }
                verificationResult = verification(mysteryNumber, userNumber, attempts);
                if (verificationResult){
                    continue;
                }

            } catch (java.util.InputMismatchException e){
                System.out.println("\n===== Error =====");
                System.out.println("Invalid number: Please enter a number in range(1, 100) !!!! ");
                scanner.nextLine();
                attempts--;
                continue;
            }

            if (attempts >= 10 && verificationResult){
                System.out.printf("Game Over! the number was: %d", mysteryNumber);
                break;
            }

        } while (attempts < 10 && verificationResult);
    }

    public static void main(String[] args){
        String userChoice = "";

        do {
            try {
                System.out.print("Play again? (y/n): ");
                userChoice = scanner.next();
                if (!userChoice.equalsIgnoreCase("y") && !userChoice.equalsIgnoreCase("n")){
                    throw new java.util.InputMismatchException();
                }

                if (userChoice.equalsIgnoreCase("y")){
                    scanner.nextLine();
                    playGame();
                }else if (userChoice.equalsIgnoreCase("n")){
                    System.out.println("Goodbye and look forward !!");
                    System.out.println("Have a good day !!!");
                }
            }catch (java.util.InputMismatchException e){
                System.out.println("\n===== Error =====" + userChoice);
                System.out.println("Invalid Entry: Please just enter Yes(y) or No(n) !!!! ");
                scanner.nextLine();
                continue;
            }
        }while (userChoice.equalsIgnoreCase("y"));

    }
}