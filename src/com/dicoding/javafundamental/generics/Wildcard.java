package com.dicoding.javafundamental.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Wildcard {
    public static void main(String[] args) {
        List<String> ls = new ArrayList();
        ls.add("String1");
        ls.add("String2");

        print(ls);

        Collection<Planet> cp = new ArrayList();
        cp.add(new Planet("Mercury", 0.06));
        cp.add(new Planet("Venus", 0.82));

        print(cp);
    }

    public static void print(Collection<?> collection) {
        for (Object o : collection) {
            System.out.println(o);
        }
    }


}
