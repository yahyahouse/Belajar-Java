package com.dicoding.javafundamental.exception;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        try {
            String location = "src/com/dicoding/javafundamental/exception/coba.txt";
            File file = new File(location);
            FileReader fr = new FileReader(file);
            System.out.println("Read file berhasil");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        int[] a = new int[5];
        try {
            System.out.println("Akses elemen ke 5 :" + a[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown :" + e);
        } finally {
            a[4] = 10;
            System.out.println("Nilai elemen terakhir: " + a[4]);
        }
    }
}
