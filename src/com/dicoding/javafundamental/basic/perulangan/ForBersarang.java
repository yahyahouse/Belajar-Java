package com.dicoding.javafundamental.basic.perulangan;

public class ForBersarang {
    public static void main(String[] args) {
        int a = 5;
        for (int i = 0;i<=a; i++){
            for (int j = 0; j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int i = 0;i<=a; i++){
            for (int j = 5; i<=j;j--){
                System.out.print("*");
            }
            System.out.println(" ");
        }


        for (int i = 0;i < 5;i++){
            for(int j = 0; j < 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k<=i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 0; i<5;i++){
            for (int j = 0; j<=i;j++){
                System.out.print(" ");
            }
            for(int k = 0; k<5-i;k++){
                System.out.print(" *");
            }
            System.out.println();
        }


    }
}
