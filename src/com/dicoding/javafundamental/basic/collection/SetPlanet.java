package com.dicoding.javafundamental.basic.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetPlanet {
    public static void main(String[] args) {
        Set<String> planet = new HashSet<>();
        planet.add("bumi");
        planet.add("mars");
        planet.add("mars");
        planet.add("jupiter");

        System.out.println(planet.size());

        for (Iterator iterator = planet.iterator(); iterator.hasNext();){
            System.out.println(iterator.next());
        }
    }
}
