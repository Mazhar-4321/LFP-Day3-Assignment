package org.example;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        // Constants
        int IS_FULL_TIME = 1;
        int attendance = (int) Math.floor(Math.random() * 10) % 2 + 1;
        if (attendance == IS_FULL_TIME) {
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee is Absent");
        }
    }
}
