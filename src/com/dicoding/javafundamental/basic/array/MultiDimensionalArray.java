package com.dicoding.javafundamental.basic.array;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        char[][] array = new char[2][2];

        array[0][0] = 'A';
        array[0][1] = 'B';
        array[1][0] = 'X';
        array[1][1] = 'Y';

        System.out.println("array 0 0 = "+array[0][0]);
    }
}
