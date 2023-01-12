package com.dicoding.javafundamental.generics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List lo = new ArrayList<>();
        lo.add("lo - String 1");
        lo.add(new Planet("Bumi",1.000));

        for (Object o: lo){
            Planet p= (Planet) o;
            p.print();
        }

        List<Planet> planets = new ArrayList<>();
        planets.add(new Planet("Mercury", 0.06));
        planets.add(new Planet("Venus", 0.82));

        for (Planet p:planets){
            p.print();
        }
    }
}
