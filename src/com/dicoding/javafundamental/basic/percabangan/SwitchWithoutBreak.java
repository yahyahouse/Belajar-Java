package com.dicoding.javafundamental.basic.percabangan;

import java.util.Scanner;

public class SwitchWithoutBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char input = 'D';
        int ouput = 0;
        switch (input){
            case 'A':
                ouput++;
            case 'B':
                ouput++;
            case 'C':
                ouput++;
            case 'D':
                ouput++;
            default:
        }

        System.out.println(ouput);
    }
}
