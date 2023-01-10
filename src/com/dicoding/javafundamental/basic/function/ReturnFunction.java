package com.dicoding.javafundamental.basic.function;

public class ReturnFunction {
    public static void main(String[] args) {
        System.out.println(menghitungPersegi(5,5));

    }

    public static double menghitungPersegi(double panjang, double lebar){
        double hasil = panjang * lebar;
        return hasil;
    }
}
