package com.dicoding.javafundamental.basic.collection;

import java.util.ArrayList;
import java.util.List;

public class ListPlanet {
    public static void main(String[] args) {
        String[] heroes = new String[2];
        heroes[0] = "superman";
        heroes[1] = "batman";

        List<String> planet = new ArrayList<>();
        planet.add("bumi");
        planet.add("mars");
        planet.add("jupiter");

        for (int i = 0; i<planet.size();i++){
            System.out.println("nama planet "+planet.get(i));
        }

        for (String pla: planet) {
            System.out.println(pla);

        }
    }
}
