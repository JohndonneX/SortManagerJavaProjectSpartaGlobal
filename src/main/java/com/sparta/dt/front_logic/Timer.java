package com.sparta.dt.front_logic;

import com.sparta.dt.sort_algorithms.SortAlgorithm;

import java.util.Arrays;
import java.util.HashMap;

public class Timer {

    public static HashMap<Integer, Long> storedTimes = new HashMap<Integer, Long>();

    public static void printSortAndTime(SortAlgorithm sortAlgorithm, int[] array, int optionNumber) {
        System.out.println("[----------" + sortAlgorithm.getName() + "----------]");
        long start = System.nanoTime();
        // call only the sorting
        int[] sortedArray = sortAlgorithm.performSortAlgorithm(array);
        long end = System.nanoTime();
        long totalTime = (end - start);
        System.out.println("Sorted Array: " + Arrays.toString(sortedArray));
        System.out.println(sortAlgorithm.getName() + " Speed: " + totalTime + " nanoseconds / " + (double) totalTime/1000000 + " milliseconds. \n");
        storedTimes.put(optionNumber, totalTime); // add time corresponding to algorithm used to running list of times
    }
}
