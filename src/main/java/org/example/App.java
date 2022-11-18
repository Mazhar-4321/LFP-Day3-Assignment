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
        int argumentVariable;
        if (fullTimeattendance == IS_PRESENT) {
            argumentVariable = 0;
        } else {
            if (partTimeAttendance == IS_PRESENT) {
                argumentVariable = 1;
            } else {
                argumentVariable = -1;
            }

        }
        // Functionality
        switch (argumentVariable) {
            case 0:
                System.out.println("Nature Of Employee: Full Time , Status: Present");
                System.out.printf("Wage Per Hour=%d, Working Hours=%d\n", WAGE_PER_HOUR, WORKING_HOURS_IN_A_DAY);
                System.out.printf("Wages Earned in a Day=%d", (WAGE_PER_HOUR * WORKING_HOURS_IN_A_DAY));
                break;
            case 1:
                System.out.println("Nature Of Employee: Part Time , Status: Present");
                System.out.printf("Wage Per Hour=%d, Working Hours=%d\n", WAGE_PER_HOUR, PART_TIME_WORKING_HOURS);
                System.out.printf("Wages Earned in a Day=%d", (WAGE_PER_HOUR * PART_TIME_WORKING_HOURS));
                break;
            default:
                System.out.println("Employee is Absent");
                break;
        }

    }
}
