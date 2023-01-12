package com.dicoding.javafundamental.suhuair;

import java.util.Scanner;

public class SuhuAir {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int suhu = scanner.nextInt();

        if (suhu<=0){
            System.out.println("beku");
        } else if (1<=suhu && suhu<100) {
            System.out.println("cair");
        } else if (suhu>=100) {
            System.out.println("mendidih");
        }

    }
}
