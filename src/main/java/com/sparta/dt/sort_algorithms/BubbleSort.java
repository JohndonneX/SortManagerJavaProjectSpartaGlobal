package com.sparta.dt.sort_algorithms;

public class BubbleSort implements SortAlgorithm {
    public int[] performSortAlgorithm(int[] toSort) {
        int[] sortedArray = toSort.clone();
        boolean anySwapPerformed = true; // true for loop to run at start
        while (anySwapPerformed) {
            int numberOfSwaps = 0;
            for (int i = 1; i < toSort.length; i++) {
                int indexOfCurrentNumber = i;
                int currentNumber = sortedArray[i];
                int indexOfPreviousNumber = i - 1;
                int previousNumber = sortedArray[i - 1];

                if (currentNumber < previousNumber) {
                    sortedArray[indexOfPreviousNumber] = currentNumber;
                    sortedArray[indexOfCurrentNumber] = previousNumber;
                    numberOfSwaps++;
                }
            }
            // stops iteration when no swaps are made
            if (numberOfSwaps == 0) {
                anySwapPerformed = false;
            }
        }
        return sortedArray;
    }

    @Override
    public String getName() {
        return "Bubble Sort";
    }
}
