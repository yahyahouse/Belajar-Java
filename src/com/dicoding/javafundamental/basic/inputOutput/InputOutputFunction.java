package com.dicoding.javafundamental.basic.inputOutput;

import java.util.Scanner;

public class InputOutputFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("masukan angka pertama");
        int nilai1 = scanner.nextInt();

        System.out.println("masukan angka kedua");
        int nilai2 = scanner.nextInt();

        int hasil = nilai1 + nilai2;
        System.out.println("hasil penjumlahan "+hasil);
    }
}
