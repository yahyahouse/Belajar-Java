package com.dicoding.javafundamental.basic.collection;

import java.util.HashMap;
import java.util.Map;

public class MapPlanet {
    public static void main(String[] args) {
        Map<String,Planet> planet = new HashMap<>();
        planet.put("key-1", new Planet("bumi", 0.06));
        planet.put("key-2", new Planet("venus", 0.82));

        System.out.println(planet.size());

        for (Planet planets: planet.values()) {
            System.out.println(planets);
        }
    }
}
