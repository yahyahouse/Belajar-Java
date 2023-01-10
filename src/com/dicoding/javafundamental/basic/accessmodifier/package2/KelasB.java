package com.dicoding.javafundamental.basic.accessmodifier.package2;

import com.dicoding.javafundamental.basic.accessmodifier.package1.KelasA;

public class KelasB extends KelasA {
    @Override
    protected void methodC() {
        super.methodC();
        System.out.println("Contoh pemanggilan protected dari package luar");
    }
}
