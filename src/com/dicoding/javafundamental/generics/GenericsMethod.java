package com.dicoding.javafundamental.generics;

import java.util.ArrayList;
import java.util.Collection;

public class GenericsMethod {
    static <T> void arrayToCollection(T[] a, Collection<T> c) {
        for (T o : a) {
            c.add(o);
        }
    }

    public static void main(String[] args) {
        Object[] oa = new Object[100];
        Collection<Object> co = new ArrayList();

        arrayToCollection(oa, co);

        String[] sa = new String[100];
        Collection<String> cs = new ArrayList();

        arrayToCollection(sa, cs);

        arrayToCollection(sa, co);

        Integer[] ia = new Integer[100];
        Float[] fa = new Float[100];
        Number[] na = new Number[100];
        Collection<Number> cn = new ArrayList();
        arrayToCollection(ia, cn);

        arrayToCollection(fa, cn);


        arrayToCollection(na, cn);


        arrayToCollection(na, co);


//        arrayToCollection(na, cs);
    }
}
