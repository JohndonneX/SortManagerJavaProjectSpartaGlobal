package com.sparta.dt.sort_algorithms;

public class QuickSort implements SortAlgorithm {

    public int partitionArray(int[] array, int low, int high) {
        int pivotValue = array[high]; // pivot always last value
        int indexOfLatestSmallest = low - 1;
        for (int j = low; j < high; j++) {
            if (array[j] < pivotValue) { // compare current element with value of pivot
                indexOfLatestSmallest++;
                int temp = array[indexOfLatestSmallest];
                array[indexOfLatestSmallest] = array[j];
                array[j] = temp;
            }
        }
        // move pivot after all swaps completed
        int temp = array[indexOfLatestSmallest + 1];
        array[indexOfLatestSmallest + 1] = pivotValue;
        array[high] = temp;

        return indexOfLatestSmallest + 1;
    }

    public void arraySort(int[] array, int low, int high) {
        if (low < high) {
            // partition and get index of partition point
            int partitionIndex = partitionArray(array, low, high);
            // then sort recursively the array before and after partition index
            arraySort(array, low, partitionIndex - 1);
            arraySort(array, partitionIndex + 1, high);
        }

    }


    @Override
    public int[] performSortAlgorithm(int[] toSort) {
        int[] sortedArray = toSort.clone(); // copy array so original is not modified
        arraySort(sortedArray, 0, sortedArray.length - 1);
        return sortedArray;
    }

    @Override
    public String getName() {
        return "Quick Sort";
    }
}
