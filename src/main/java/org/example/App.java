package org.example;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        // Constants
        int IS_FULL_TIME = 1;
        int WAGE_PER_HOUR = 20;
        int WORKING_HOURS_IN_A_DAY = 8;
        int attendance = (int) Math.floor(Math.random() * 10) % 2 + 1;
        if (attendance == IS_FULL_TIME) {
            System.out.println("Employee is Present");
            System.out.printf("Wage Per Hour=%d, Working Hours=%d\n",WAGE_PER_HOUR,WORKING_HOURS_IN_A_DAY);
            System.out.printf("Wages Earned in a Day=%d",(WAGE_PER_HOUR*WORKING_HOURS_IN_A_DAY));
        } else {
            System.out.println("Employee is Absent");
        }
    }
}
