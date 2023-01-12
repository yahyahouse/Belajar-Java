package com.dicoding.javafundamental.datetime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExampleSimpleDateFormat {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy");

        String dateFormat = sdf.format(new Date());
        System.out.println(new Date());
        System.out.println(dateFormat);
    }
}
