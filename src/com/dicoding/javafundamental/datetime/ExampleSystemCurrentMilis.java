package com.dicoding.javafundamental.datetime;

import java.util.Calendar;
import java.util.Date;

public class ExampleSystemCurrentMilis {
    public static void main(String[] args) {
        long timeNow = System.currentTimeMillis();
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();

        System.out.println(timeNow);
        System.out.println(date.toString());
        System.out.println(calendar.getTime());

        System.out.println("Tanggal "+calendar.get(Calendar.DATE));
        System.out.println("Bulan "+calendar.get(Calendar.MONTH));
        System.out.println("Tahun "+calendar.get((Calendar.YEAR)));

        calendar.add(Calendar.DATE,5);
        System.out.println("Lima hari kedepan "+calendar.getTime());

        calendar.add(Calendar.YEAR,10);
        System.out.println("Sepuluh tahun kedepan "+calendar.getTime());
    }
}
