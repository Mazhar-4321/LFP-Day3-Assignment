package org.example;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        // Constants
        int IS_PRESENT = 1;
        int WAGE_PER_HOUR = 20;
        int WORKING_HOURS_IN_A_DAY = 8;
        int PART_TIME_WORKING_HOURS = 8;
        // Variables
        int fullTimeattendance = (int) Math.floor(Math.random() * 10) % 2 + 1;
        int partTimeAttendance = (int) Math.floor(Math.random() * 10) % 2 + 1;
        // Functionality
        if (fullTimeattendance == IS_PRESENT) {
            System.out.println("Nature Of Employee: Full Time , Status: Present");
            System.out.printf("Wage Per Hour=%d, Working Hours=%d\n", WAGE_PER_HOUR, WORKING_HOURS_IN_A_DAY);
            System.out.printf("Wages Earned in a Day=%d", (WAGE_PER_HOUR * WORKING_HOURS_IN_A_DAY));
        } else {
            if (partTimeAttendance == IS_PRESENT) {
                System.out.println("Nature Of Employee: Part Time , Status: Present");
                System.out.printf("Wage Per Hour=%d, Working Hours=%d\n", WAGE_PER_HOUR, PART_TIME_WORKING_HOURS);
                System.out.printf("Wages Earned in a Day=%d", (WAGE_PER_HOUR * PART_TIME_WORKING_HOURS));
            } else {
                System.out.println("Employee is Absent");
            }
        }
    }
}
