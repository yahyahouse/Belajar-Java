package com.dicoding.javafundamental.basic.array;

import java.util.Arrays;

public class InisiasiArray {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3};

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);

        int[] array2 = new int[3];
        array2[0] = 60;
        array2[1] = 55;
        array2[2] = 70;
        for (int arr: array2) {
            System.out.println(arr);
        }

        int[] array3 = new int[100];

        for (int i = 0; i<array3.length;i++){
            array3[i] = i+i;
            System.out.println(array3[i]);
        }

    }
}
