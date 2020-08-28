package com.sparta.dt.front_logic;

import java.util.Random;

public class RandomArray {
    public static int[] generateRandomArrayInt(int size) {
        Random rd = new Random();
        int[] randomArray = new int[size];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = rd.nextInt(1001);
        }
        return randomArray;
    }
}
