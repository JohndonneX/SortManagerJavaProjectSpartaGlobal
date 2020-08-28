package com.sparta.dt.sort_algorithms;

public class MergeSort implements SortAlgorithm {
    public int[] performSortAlgorithm(int[] toSort) {
        // no need to make copy of toSort array since it is never modified - method returns a new merged array
        if (toSort.length != 1) {
            int middlePoint = toSort.length / 2;
            int[] split1 = new int[middlePoint];
            int[] split2 = new int[toSort.length - middlePoint];
            System.arraycopy(toSort, 0, split1, 0, middlePoint);
            System.arraycopy(toSort, middlePoint, split2, 0, toSort.length - middlePoint);
            int[] sortSplit1 = performSortAlgorithm(split1);
            int[] sortSplit2 = performSortAlgorithm(split2);
            int[] mergedArray = mergeTwoSortedArrays(sortSplit1, sortSplit2);
            return mergedArray;
        }
        return toSort;
    }

    @Override
    public String getName() {
        return "Merge (Recursive) Sort";
    }

    private int[] mergeTwoSortedArrays(int[] sortedArray1, int[] sortedArray2) {
        int array1Length = sortedArray1.length;
        int array2Length = sortedArray2.length;
        int[] combinedArray = new int[array1Length + array2Length];

        // traverse both arrays to compare numbers and insert into combined array the smaller one
        int array1Check = 0;
        int array2Check = 0;
        int combinedArrayIndex = 0;
        while (array1Check < array1Length && array2Check < array2Length) {
            if (sortedArray1[array1Check] <= sortedArray2[array2Check]) {
                combinedArray[combinedArrayIndex] = sortedArray1[array1Check];
                array1Check++;
            } else {
                combinedArray[combinedArrayIndex] = sortedArray2[array2Check];
                array2Check++;
            }
            combinedArrayIndex++;
        }

        // copy remaining elements
        while (array1Check < array1Length) {
            combinedArray[combinedArrayIndex] = sortedArray1[array1Check];
            array1Check++;
            combinedArrayIndex++;
        }
        while (array2Check < array2Length) {
            combinedArray[combinedArrayIndex] = sortedArray2[array2Check];
            array2Check++;
            combinedArrayIndex++;
        }
        return combinedArray;
    }
}
