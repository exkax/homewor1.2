package com.company;

public class Main {

    public static void main(String[] args) {
        int temp = 5;
        int age = 20;
        System.out.println(nameOfMethod(temp, age));
        System.out.println(nameOfMethod(20, 8));
        System.out.println(nameOfMethod(20, 7));
        System.out.println(nameOfMethod(-40, 6));
        System.out.println(nameOfMethod(25, 54));
        System.out.println(nameOfMethod(23, 45));
    }

    private static String nameOfMethod(int temp, int age) {

        if (age >= 20 && age <= 45 && temp >= -20 && temp <= 30) {
            return "можно идти гулять";
        } else if (age > 0 && age <= 20 && temp >= 0 && temp <= 28) {
            return "можно идти гулять";
        } else if (age >= 45 && temp >= -10 && temp <= 25) {
            return "можно идти гулять";
        } else
            return "то, оставайся дома";
    }
}
