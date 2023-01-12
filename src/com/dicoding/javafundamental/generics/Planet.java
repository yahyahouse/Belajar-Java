package com.dicoding.javafundamental.generics;

public class Planet {
    private String name;
    private double mass;

    public Planet(String name, double mass){
        this.mass = mass;
        this.name = name;
    }

    public void print(){
        System.out.println("Planet "+name+", Masa "+mass);
    }
}
