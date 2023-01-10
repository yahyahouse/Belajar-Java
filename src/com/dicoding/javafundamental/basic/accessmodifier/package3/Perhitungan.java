package com.dicoding.javafundamental.basic.accessmodifier.package3;

public class Perhitungan {
    public static int nilai = 0;

    Perhitungan(){
        nilai++;
    }
    protected static int getNilai(){
        return nilai;
    }
}
