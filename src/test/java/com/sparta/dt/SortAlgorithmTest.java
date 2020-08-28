package com.sparta.dt;

import com.sparta.dt.sort_algorithms.*;
import com.sparta.dt.sort_algorithms.BinaryTreeSort.BinaryTreeSort;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SortAlgorithmTest {

    static int[] unsortedTestArray = new int[]{4, 5, 2, 4, 6};
    static int[] sortedTestArray = new int[]{2, 4, 4, 5, 6};

    @Test
    void bubbleSortTest() {
        System.out.println("Bubble Sort Test");
        BubbleSort bubbleSort = new BubbleSort();
        System.out.println("Before Sort unsortedTestArray: " + Arrays.toString(unsortedTestArray));
        int[] unsortedTestArrayClone = unsortedTestArray.clone();
        int[] sorted = bubbleSort.performSortAlgorithm(unsortedTestArray);
        // check original passed in array is unchanged after algorithm
        Assertions.assertEquals(Arrays.toString(unsortedTestArrayClone), Arrays.toString(unsortedTestArray));
        // check sorted array is as expected
        Assertions.assertEquals(Arrays.toString(sortedTestArray), Arrays.toString(sorted));
        System.out.println("After Sort unsortedTestArray: " + Arrays.toString(unsortedTestArray));
        System.out.println("Sorted Array: " + Arrays.toString(sorted));
    }

    @Test
    void insertionSortTest() {
        System.out.println("Insertion Sort Test");
        InsertionSort insertionSort = new InsertionSort();
        System.out.println("Before Sort unsortedTestArray: " + Arrays.toString(unsortedTestArray));
        int[] unsortedTestArrayClone = unsortedTestArray.clone();
        int[] sorted = insertionSort.performSortAlgorithm(unsortedTestArray);
        // check original passed in array is unchanged after algorithm
        Assertions.assertEquals(Arrays.toString(unsortedTestArrayClone), Arrays.toString(unsortedTestArray));
        // check sorted array is as expected
        Assertions.assertEquals(Arrays.toString(sortedTestArray), Arrays.toString(sorted));
        System.out.println("After Sort unsortedTestArray: " + Arrays.toString(unsortedTestArray));
        System.out.println("Sorted Array: " + Arrays.toString(sorted));
    }

    @Test
    void selectionSortTest() {
        System.out.println("Selection Sort Test");
        SelectionSort selectionSort = new SelectionSort();
        System.out.println("Before Sort unsortedTestArray: " + Arrays.toString(unsortedTestArray));
        int[] unsortedTestArrayClone = unsortedTestArray.clone();
        int[] sorted = selectionSort.performSortAlgorithm(unsortedTestArray);
        // check original passed in array is unchanged after algorithm
        Assertions.assertEquals(Arrays.toString(unsortedTestArrayClone), Arrays.toString(unsortedTestArray));
        // check sorted array is as expected
        Assertions.assertEquals(Arrays.toString(sortedTestArray), Arrays.toString(sorted));
        System.out.println("After Sort unsortedTestArray: " + Arrays.toString(unsortedTestArray));
        System.out.println("Sorted Array: " + Arrays.toString(sorted));
    }

    @Test
    void binaryTreeSortTest() {
        System.out.println("Binary Tree Sort Test");
        BinaryTreeSort binaryTreeSort = new BinaryTreeSort();
        System.out.println("Before Sort unsortedTestArray: " + Arrays.toString(unsortedTestArray));
        int[] unsortedTestArrayClone = unsortedTestArray.clone();
        int[] sorted = binaryTreeSort.performSortAlgorithm(unsortedTestArray);
        // check original passed in array is unchanged after algorithm
        Assertions.assertEquals(Arrays.toString(unsortedTestArrayClone), Arrays.toString(unsortedTestArray));
        // check sorted array is as expected
        Assertions.assertEquals(Arrays.toString(sortedTestArray), Arrays.toString(sorted));
        System.out.println("After Sort unsortedTestArray: " + Arrays.toString(unsortedTestArray));
        System.out.println("Sorted Array: " + Arrays.toString(sorted));
    }

    @Test
    void mergeSortTest() {
        System.out.println("Merge Sort Test");
        MergeSort mergeSort = new MergeSort();
        System.out.println("Before Sort unsortedTestArray: " + Arrays.toString(unsortedTestArray));
        int[] unsortedTestArrayClone = unsortedTestArray.clone();
        int[] sorted = mergeSort.performSortAlgorithm(unsortedTestArray);
        // check original passed in array is unchanged after algorithm
        Assertions.assertEquals(Arrays.toString(unsortedTestArrayClone), Arrays.toString(unsortedTestArray));
        // check sorted array is as expected
        Assertions.assertEquals(Arrays.toString(sortedTestArray), Arrays.toString(sorted));
        System.out.println("After Sort unsortedTestArray: " + Arrays.toString(unsortedTestArray));
        System.out.println("Sorted Array: " + Arrays.toString(sorted));
    }

    @Test
    void quickSortTest() {
        System.out.println("Quick Sort Test");
        QuickSort quickSort = new QuickSort();
        System.out.println("Before Sort unsortedTestArray: " + Arrays.toString(unsortedTestArray));
        int[] unsortedTestArrayClone = unsortedTestArray.clone();
        int[] sorted = quickSort.performSortAlgorithm(unsortedTestArray);
        // check original passed in array is unchanged after algorithm
        Assertions.assertEquals(Arrays.toString(unsortedTestArrayClone), Arrays.toString(unsortedTestArray));
        // check sorted array is as expected
        Assertions.assertEquals(Arrays.toString(sortedTestArray), Arrays.toString(sorted));
        System.out.println("After Sort unsortedTestArray: " + Arrays.toString(unsortedTestArray));
        System.out.println("Sorted Array: " + Arrays.toString(sorted));
    }
}
