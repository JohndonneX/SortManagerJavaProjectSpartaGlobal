package com.sparta.dt.sort_algorithms;

public class InsertionSort implements SortAlgorithm {
    public int[] performSortAlgorithm(int[] toSort) {
        int[] sortedArray = toSort.clone();
        for (int i = 1; i < toSort.length; i++) {
            int currentNumber = sortedArray[i];
            int indexOfCurrentNumber = i;
            int indexOfPreviousNumber = i - 1;
            for (int j = indexOfPreviousNumber; j >= 0; j--) {
                int previousNumber = sortedArray[j];
                if (currentNumber < previousNumber) {
                    sortedArray[j] = currentNumber;
                    sortedArray[j + 1] = previousNumber;
                    continue;
                } else {
                    break;
                }
            }
        }
        return sortedArray;
    }

    @Override
    public String getName() {
        return "Insertion Sort";
    }
}
