package com.dicoding.javafundamental.basic.propertimetode;

public class Hewan {
    double tinggi=30;
    double berat=3;
    int umur;

    Hewan(int umurPram){
        umur =umurPram;
    }

    void lari(){
        System.out.println("lari");
    }
    void jalan(){
        System.out.println("jalan");
    }
    void makan(){
        System.out.println("makan");
    }

    public double getTinggi() {
        return tinggi;
    }

    public double getBerat() {
        return berat;
    }

    public int getUmur() {
        return umur;
    }
}
