package com.company;

import java.util.Arrays;

public class CricketToss {
    public static void main(String[] args) {
        String[] teachersName = {"Sumon Sir", "Dipok Sir", "Iftee Sir"};
        String[] studentName = {"Tahmid", "Alamgir", "Mamun"};

        int[] array = new int[3];
        int[] array1 = new int[3];
        ran(array, 3);
        ran(array1, 3);
        System.out.println("Teachers Array Index = " + Arrays.toString(array));
        System.out.println("Students Array Index = " + Arrays.toString(array1));
        System.out.println("\n --------Toss Result-------");

        for (int i = 0; i < teachersName.length; i++) {
            int randomNumner = array[i];
            randomNumner = randomNumner - 1;
            int randomNumner1 = array1[i];
            randomNumner1 = randomNumner1 - 1;
            System.out.println("    " + teachersName[randomNumner] + "    " + studentName[randomNumner1]);
        }
    }

    public static boolean valueMatched(int[] arr, float random) {
        for (float v : arr) {
            if (v == random) {
                return true;
            }
        }
        return false;
    }

    public static void ran(int[] array, int limit) {
        int index = 0;
        for (int i = 0; ; i++) {
            float ran = Math.round((float) (Math.random()) * limit);
            if (index == array.length) {
                break;
            } else {
                boolean result = valueMatched(array, ran);
                if (!result) {
                    array[index] = (int) ran;
                    index++;
                }
            }
        }
    }
}
