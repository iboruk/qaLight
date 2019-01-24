package com.iboruk.qalight;
//import java.util.Random;
//import java.util.Scanner;


public class LibClass {

    public static void elementsOfArray(int[] array) {
        for (int a : array) {
            if (a < 10) {
                System.out.println(a + " Элемент меньше десяти");
            } else if (a == 10) {
                System.out.println(a + " Элемент равен десяти");
            } else {
                System.out.println(a + " Элемент больше десяти");
            }
        }
    }

    public static int sum(int a, int b) {
        int rez_1 = a + b;
        System.out.println("rez_1 = " + rez_1);
        return rez_1;
    }

    public static String sum(String a, String b) {
        String rez_2 = a + b;
        System.out.println("rez_2 = " + rez_2);
        return rez_2;
    }

    public static int sum(int a, String b) {
        int rez_3 = 0;
        try {
            if (b == null ) {
                System.out.println("99999");
                return rez_3;
            }
            int cc = Integer.valueOf(b);
            rez_3 = a + cc;
            System.out.println("rez_3 = " + rez_3);
        } catch (NumberFormatException e) {
            System.out.println("88888");
        }
        return rez_3;
    }

    public static int multiplication(int a, int b) {
        int rez_3 = a * b;
        System.out.println("rez_3 = " + rez_3);
        return rez_3;
    }

    public static int division(int a, int b) {
        int rez_4 = 0;
        try {
//            int cc = 0;
            rez_4 = a / b;
            System.out.println("rez_4 = " + rez_4);
        } catch (ArithmeticException e) {
            if (e.toString().contains("by zero")) {
                System.out.println("Дfffffff");
            } else {
                throw new RuntimeException(e);
            }
        }
        return rez_4;
    }
}
