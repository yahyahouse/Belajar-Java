package com.dicoding.javafundamental.basic.function;

public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println(hitungPersegi(5,5));
        System.out.println(hitungPersegi(5.0,5.0));

    }
    public static double hitungPersegi(double panjang, double lebar){
        double hasil = panjang * lebar;
        return hasil;
    }
    public static int hitungPersegi(int panjang, int lebar){
        int hasil = panjang * lebar;
        return hasil;
    }
}
