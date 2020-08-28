package com.sparta.dt.front_logic;

import com.sparta.dt.sort_algorithms.*;
import com.sparta.dt.sort_algorithms.BinaryTreeSort.BinaryTreeSort;

import java.util.Arrays;

public class FrontEndInitiation {
    public static void start() {
        int[] generatedArray = null;
        boolean startProgram = true;
        while (true) {
            // getting option
            Printer p = new Printer();
            p.displayOptions(startProgram);
            int optionNumber = p.getOptionFromInput(startProgram);
            // terminate program
            if (optionNumber == 0) {
                System.out.println("Terminating..");
                break;
            }
            // controls array generation
            if ((startProgram && optionNumber != 8) || optionNumber == 9) {
                generatedArray = RandomArray.generateRandomArrayInt(p.getArraySizeFromInput());
                System.out.println("Generating random array... \n");
                startProgram = false;
                if (optionNumber == 9) {
                    Timer.storedTimes.clear(); // reset stored times from previous algorithm runs
                    continue; // return to menu
                }
            }
            // display speeds of previously run algorithms
            if (optionNumber == 8) {
                if (!Timer.storedTimes.isEmpty()) {
                    System.out.println("--------------------------------------------------------------------------------------------");
                    for (int option : Timer.storedTimes.keySet()) {
                        SortAlgorithm algorithm = getAlgorithmObjectFromOptionFactory(option);
                        System.out.println(algorithm.getName() + " speed: " + Timer.storedTimes.get(option) + " nanoseconds / " + (double) Timer.storedTimes.get(option) / 1000000 + " milliseconds.");
                    }
                    System.out.println("-------------------------------------------------------------------------------------------- \n");
                } else {
                    System.out.println("No algorithms have been performed yet. \n");
                }
                continue; // return to menu
            }
            // controls sorting
            if (optionNumber == 7) {
                for (int i = 1; i < 7; i++) {
                    System.out.println("Unsorted Array: " + Arrays.toString(generatedArray));
                    SortAlgorithm algorithm = getAlgorithmObjectFromOptionFactory(i);
                    Timer.printSortAndTime(algorithm, generatedArray, i);
                }
            } else {
                System.out.println("Unsorted Array: " + Arrays.toString(generatedArray));
                SortAlgorithm algorithm = getAlgorithmObjectFromOptionFactory(optionNumber);
                Timer.printSortAndTime(algorithm, generatedArray, optionNumber);
            }
        }
    }

    private static SortAlgorithm getAlgorithmObjectFromOptionFactory(int option) {
        switch (option) {
            case 1:
                BubbleSort bs = new BubbleSort();
                return bs;
            case 2:
                InsertionSort is = new InsertionSort();
                return is;
            case 3:
                SelectionSort ss = new SelectionSort();
                return ss;
            case 4:
                MergeSort ms = new MergeSort();
                return ms;
            case 5:
                BinaryTreeSort bts = new BinaryTreeSort();
                return bts;
            case 6:
                QuickSort qs = new QuickSort();
                return qs;
            default:
                return null;
        }

    }


}
