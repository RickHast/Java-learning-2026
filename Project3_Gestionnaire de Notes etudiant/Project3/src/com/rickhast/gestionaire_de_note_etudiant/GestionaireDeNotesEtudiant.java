package com.rickhast.gestionaire_de_note_etudiant;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GestionaireDeNotesEtudiant {

    // Project3: Student Notes Manager

    // scanner (input)
    static Scanner scanner = new Scanner(System.in);

    static void displayForms(String symbol){
        int count = 60;

        for (int i = 0; i < count; i++){
            System.out.print(symbol);
        }
    }

    static String studentNames(){
        String name = "";
        String firstName = "";
        boolean validNames = true;

        while (validNames){
            try{
                System.out.print("\n Enter the student name: ");
                name = scanner.next();
                if (name.isBlank()){
                    throw new InputMismatchException("Please enter a valid student name !!");
                }

                System.out.print("Enter the student firstName: ");
                firstName = scanner.next();
                if (firstName.isBlank()){
                    throw new Error("Please enter a valid student firstname !!");
                }

                validNames = false;

            }catch (Exception e){
                displayForms("!");
                System.out.println("\n Error:" + e.getMessage());
                displayForms("!");
                scanner.nextLine();
                continue;
            }
        }

        return (name + " " + firstName);
    }


    static int getSubjects(){
        int subjects = 0;
        boolean validNames = true;

        while (validNames){
            try{
                System.out.print("\nEnter the subjects count: ");
                subjects = scanner.nextInt();
                if (subjects <= 0){
                    throw new IllegalArgumentException("Please the count of subjects must be superior than 0 !!");
                }
                scanner.nextLine();
                validNames = false;

            }catch (Exception e){
                displayForms("!");
                System.out.println("\n Error:" + e.getMessage());
                displayForms("!");
                scanner.nextLine();
                continue;
            }
        }

        return subjects;
    }

    static double[] getNotes(int subjects){
        boolean validNames;
        double[] notes = new double[subjects];
        double note;

        for (int i = 0; i < subjects; i++){
            validNames = false;
            while (!validNames){
                try{
                    System.out.printf("\nEnter the note %d: ", i+1);
                    note = scanner.nextDouble();
                    if (note < 0 || note > 20){
                        throw new IllegalArgumentException("Please the note must be in range of 0 to 20 !!");
                    }
                    notes[i] = note;
                    validNames = true;

                }catch (Exception e){
                    displayForms("!");
                    System.out.println("\n Error:" + e.getMessage());
                    displayForms("!");
                    scanner.nextLine();
                    continue;
                }
            }
        }

        return notes;
    }


    static double getAverage(double[] notes){
        double average = 0;
        int arraySize = notes.length;

        for (int i = 0; i < arraySize; i++){
            average += notes[i];
        }

        average /= arraySize;

        return average;
    }

    static double findMinNote(double[] notes){
        double min = notes[0];
        int arraySize = notes.length;

        for (int i = 1; i < arraySize; i++){
            if (notes[i] < min){
                min = notes[i];
            }

        }

        return min;
    }

    static double findMaxNote(double[] notes){
        double max = notes[0];
        int arraySize = notes.length;

        for (int i = 1; i < arraySize; i++){
            if (notes[i] > max){
                max = notes[i];
            }
        }

        return max;
    }


    static String getMention(double average){

        if (average >= 16) return "Excellent !";
        if (average >= 14) return "Very Good !";
        if (average >= 12) return "Good !";
        if (average >= 10) return "Fair !";

        return "Fail !";

    }

    static void start(){
        String fullName = studentNames();
        int subjects = getSubjects();
        double[] notes = getNotes(subjects);
        double average = getAverage(notes);
        String mention = getMention(average);
        double min = findMinNote(notes);
        double max = findMaxNote(notes);


        displayForms("=");
        System.out.println();
        System.out.println("\tReport Card");
        displayForms("=");


        System.out.println("\nStudent: " + fullName);
        System.out.println("Subjects: " + subjects);
        displayForms("-");

        System.out.println();
        System.out.printf("Average: %.2f / 20%n", average );
        System.out.printf("Min note: %.2f / 20%n", min);
        System.out.printf("Max note: %.2f / 20%n", max);
        System.out.printf("Mention: %s %n", mention);
        displayForms("=");
    }




    public static void main(String[] args){
        start();

        String userChoice = "";

        do{
            try{
                System.out.print("\n\nDo you want to enter a new student notes? (y/n): ");
                userChoice = scanner.next();

                if (userChoice.equalsIgnoreCase("y")) {
                    start();
                } else if (userChoice.equalsIgnoreCase("n")) {
                    System.out.println("\n\tGoodbye and have a great day!");
                } else {
                    throw new IllegalArgumentException("Please just enter y or n!");
                }

            }catch (Exception e){
                displayForms("!");
                System.out.println("\n Error:" + e.getMessage());
                displayForms("!");
                scanner.nextLine();
            }
        }while (userChoice.equalsIgnoreCase("y"));

        scanner.close();

    }
}