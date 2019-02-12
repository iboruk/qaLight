package com.iboruk.qalight;
//import java.util.Random;
//import java.util.Scanner;


public class LibCalc {

    // Massive elements comparing with 10
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

    // Sum of two int values
    public static int sumIntInt(int a, int b) {
        Integer rez_1 = a + b;
        System.out.println("rez_1 = " + rez_1);
        return rez_1;
    }

    // Sum of two String values
    public static String sumStrStr(String a, String b) {
        String rez_2 = a + b;
        System.out.println("rez_2 = " + rez_2);
        return rez_2;
    }

    // Sum of int and String values
    public static int sumIntStr(int a, String b) {
        int rez_3;
        try {
            int cc = Integer.valueOf(b);
            rez_3 = a + cc;
        }
        // it is String value validation with symbols (value should contains from digits)
        catch (NumberFormatException e) {
            if (e.getMessage().indexOf("null") > -1) {
                return 99999;
            }
            return 88888;
        }
        return rez_3;
    }

    // Multiplication two int values
    public static int multiplicationIntINt(int a, int b) {
        int rez_3 = a * b;
        System.out.println("rez_3 = " + rez_3);
        return rez_3;
    }

    // Division two int values
    public static int divisionIntInteger(int a, Integer b) {
        int rez_4;
        try {
            rez_4 = a / b;
            //System.out.println("rez_4 = " + rez_4);
        }
        // it is "b" value validation with zero (b should not be equal 0)
        catch (ArithmeticException e) {
            if (e.toString().contains("by zero")) {
                return 88888;
            } else {
                throw new RuntimeException(e);
            }
        } catch (NullPointerException e) {
            return 99999;
        }
        return rez_4;
    }

    // Division two double values
    public static double divisionDouble(double a, Double b) {
        //Double.compare(0, b);
        double rez_5;
        try {
            rez_5 = a / b;
        }
        // it is "b" value validation with zero (b should not be equal 0)
        catch (NullPointerException e) {
            return 99999;
        }
        if(rez_5 == Double.POSITIVE_INFINITY || rez_5 == Double.NEGATIVE_INFINITY) {
            return 88888;
        }
        return rez_5;
    }





}


//class ZeroDivisionException extends RuntimeException {
//    public ZeroDivisionException() {
//        super();
//    }
//
//
//}