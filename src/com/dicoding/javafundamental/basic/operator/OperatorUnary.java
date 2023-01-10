package com.dicoding.javafundamental.basic.operator;

public class OperatorUnary {
    public static void main(String[] args) {
        int awal = 5;
        int akhir = +awal;
        System.out.println("nilai akhir "+akhir);

        int akhir2 = -awal;
        System.out.println("nilai akhir "+akhir2);

        ++awal;
        System.out.println("nilai akhir "+awal);
    }
}
