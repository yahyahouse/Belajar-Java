package com.dicoding.javafundamental.basic.inputOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserBufferedReader {
    public static void main(String[] args) {
        InputStreamReader streamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(streamReader);

        int nilai1 = 0;
        int nilai2 = 0;
        try {
            System.out.println("masukan angka pertama");
            nilai1 = Integer.parseInt(bufferedReader.readLine());

            System.out.println("masukan angka kedua");
            nilai2 = Integer.parseInt(bufferedReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        int hasil = nilai1 + nilai2;
        System.out.println("hasil penjumlahan adalah "+hasil);
    }
}
