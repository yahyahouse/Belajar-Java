package com.dicoding.javafundamental.basic.objek;

public class Hewan {
    String nama;
    int berat;
    int tinggi;
    public Hewan(String namaHewan){
        nama = namaHewan;
    }
    public void beratHewan(int beratHewan){
        berat = beratHewan;
    }
    public void tinggiHewan(int tinggiHewan){
        tinggi = tinggiHewan;
    }
    public void cetakHewan(){
        System.out.println("nama hewan "+ nama);
        System.out.println("berat "+berat);
        System.out.println("tinggi "+tinggi);
    }

}
