package com.dicoding.javafundamental.basic.accessmodifier.package2;

import com.dicoding.javafundamental.basic.accessmodifier.package1.KelasA;

public class Main {
    public static void main(String[] args) {
        KelasA kelasA = new KelasA();
//        System.out.println(kelasA.functionB());
//        System.out.println(kelasA.memberB);
//        System.out.println(kelasA.memberC);
        KelasB kelasB = new KelasB();
        kelasB.methodC();
    }
}
