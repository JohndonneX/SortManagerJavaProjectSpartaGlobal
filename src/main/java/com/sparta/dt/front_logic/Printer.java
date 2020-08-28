package com.sparta.dt.front_logic;

import java.util.Scanner;

public class Printer {

    public void displayOptions(boolean startProgram) {
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println(
                "Sort Manager - Please select your desired sorting algorithm using the corresponding number"
                        + "\n 1. Bubble Sort"
                        + "\n 2. Insertion Sort"
                        + "\n 3. Selection Sort"
                        + "\n 4. Merge (Recursive) Sort"
                        + "\n 5. Binary Tree Sort"
                        + "\n 6. Quick Sort"
                        + "\n 7. Perform All Sorting Algorithms"
                        + "\n 8. Display Previously Run Algorithm Speeds"
        );
        if (!startProgram) {
            System.out.println("\n 9. Generate New Array");
        }
        System.out.println("\n 0. Terminate Program");
        System.out.println("--------------------------------------------------------------------------------------------");
    }

    public int getOptionFromInput(boolean startProgram) {
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("User Input: ");
                int input = sc.nextInt();
                // option must be in available options
                if ((input < 0) || (input > 8 && startProgram) || (input > 9)) {
                    System.out.println("This option does not exist. \n");
                    continue;
                }
                System.out.println("Option " + input + " selected. \n");
                return input;
            } catch (Exception e) {
                System.out.println("Please type a valid number.\n");
            }
        }
    }

    public int getArraySizeFromInput() {
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter random array size: ");
                int input = sc.nextInt();
                System.out.println("Size of array set to " + input + ". \n");
                return input;
            } catch (Exception e) {
                System.out.println("Please type a valid size. \n");
            }
        }
    }


}
