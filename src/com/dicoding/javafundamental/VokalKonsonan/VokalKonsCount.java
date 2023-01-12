package com.dicoding.javafundamental.VokalKonsonan;

import java.util.Scanner;

public class VokalKonsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String kata= scanner.nextLine();

        vokal(kata);
        konsonan(kata);

        System.out.println(vokal(kata));
        System.out.println(konsonan(kata));
    }

    public static int vokal(String kata){
        int jumlah= 0;
        for (int i = 0; i<kata.length();i++){
            if (kata.charAt(i)=='a'||kata.charAt(i)=='i'||kata.charAt(i)=='u'||kata.charAt(i)=='e'||kata.charAt(i)=='o'){
                jumlah++;
            }
        }
        return jumlah;
    }

    public static int konsonan(String kata){
        int jumlah = 0;
        for (int i =0;i<kata.length();i++){
            if (kata.charAt(i)!='a'&&kata.charAt(i)!='i'&&kata.charAt(i)!='u'&&kata.charAt(i)!='e'&&kata.charAt(i)!='o'){
                jumlah++;
            }
        }
        return jumlah;
    }
}
