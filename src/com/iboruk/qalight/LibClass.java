package com.iboruk.qalight;
//import java.util.Random;
//import java.util.Scanner;


public class LibClass {

    public static void elementsOfArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 10) {
                System.out.println(i + "-й элемент, равный " + array[i] + " - меньше десяnи");
            } else if (array[i] == 10) {
                System.out.println(i + "-й элемент, равный " + array[i] + " - равен десяnи");
            } else if (array[i] > 10) {
                System.out.println(i + "-й элемент, равный " + array[i] + " - больше десяnи");
            }
        }
    }

    public static int getSum(int a, int b) {
        int c = a + b;
        System.out.println("Сумма равна = " + c);
        return c;
    }

    public static String getSum(String a, String b) {
        String c = a + b;
        System.out.println("Сумма равна = " + c);
        return c;
    }

    public static int getSum(int a, String b) {
        int c = 0;
        try {
            int cc = Integer.valueOf(b);
            c = a + cc;
        } catch (RuntimeException e){
            System.out.println("Строка должна быть только из чисел!");
        }
        return c;
    }
}
