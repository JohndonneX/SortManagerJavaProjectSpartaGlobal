package com.sparta.dt.sort_algorithms;

public class SelectionSort implements SortAlgorithm {
    public int[] performSortAlgorithm(int[] toSort) {
        int[] sortedArray = toSort.clone();
        // move the boundary of unsorted subarray
        for (int i = 0; i < sortedArray.length - 1; i++) {
            int minimumValue = sortedArray[i];
            int minimumValueIndex = i;
            // find minimum value from rest of array
            for (int j = i + 1; j < sortedArray.length; j++) {
                if (sortedArray[j] < minimumValue) {
                    minimumValue = sortedArray[j];
                    minimumValueIndex = j;
                }
            }
            // swap minimum value to start
            int tempStoreStart = sortedArray[i];
            sortedArray[i] = sortedArray[minimumValueIndex];
            sortedArray[minimumValueIndex] = tempStoreStart;
        }
        return sortedArray;
    }

    @Override
    public String getName() {
        return "Selection Sort";
    }
}
