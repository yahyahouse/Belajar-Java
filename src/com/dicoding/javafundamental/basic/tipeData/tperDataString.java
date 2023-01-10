package com.dicoding.javafundamental.basic.tipeData;

public class tperDataString {
    public static void tipeString(){
        String greeting = "Hello World!";
        System.out.println(greeting);
        char[] dicodingChars = { 'd', 'i', 'c', 'o', 'd', 'i', 'n', 'g' };
        String dicodingString = new String(dicodingChars);
        System.out.println(dicodingString);
    }
    public static void panjangString(){
        String dicoding = "dicoding";
        int length = dicoding.length();
        System.out.println(length);
    }
    public static void ambilString(){
        String dicoding = "dicoding";
        char result = dicoding.charAt(7);
        System.out.println(result);
    }
}
