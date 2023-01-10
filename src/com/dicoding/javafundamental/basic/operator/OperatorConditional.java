package com.dicoding.javafundamental.basic.operator;

public class OperatorConditional {
    public static void main(String[] args) {
        int nilai1 = 4;
        int nilai2 = 5;
        System.out.println("Conditional AND");
        boolean result1 = nilai1 == 3 && nilai2 == 5;
        boolean result2 = nilai1 != 3 && nilai2 == 5;

        System.out.println(result1);
        System.out.println(result2);
    }
}
