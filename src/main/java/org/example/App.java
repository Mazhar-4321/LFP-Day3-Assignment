package org.example;

public class App {
    static final int IS_FULL_TIME = 1;
    static final int IS_PART_TIME = 2;
    static final int WAGE_PER_HOUR = 20;
    static int PART_TIME_WORKING_HOURS = 4;
    static int FULL_TIME_WORKING_HOURS = 8;

    public static void main(String[] args) {
        System.out.println("Hello World!");
        // Variables
        int empCheck = (int) Math.floor(Math.random() * 10) % 3;
        int empWages = 0;
        int workingHours = 0;
        String empStatus = "Present";
        // Functionality
        if (empCheck == IS_FULL_TIME) {
            empStatus = "Full Time";
            empWages = FULL_TIME_WORKING_HOURS * WAGE_PER_HOUR;
            workingHours = FULL_TIME_WORKING_HOURS;
        } else {
            if (empCheck == IS_PART_TIME) {
                empStatus = "Part Time";
                empWages = PART_TIME_WORKING_HOURS * WAGE_PER_HOUR;
                workingHours = PART_TIME_WORKING_HOURS;
            } else {
                empStatus = "Absent";

            }
        }
        System.out.println(empStatus);
        System.out.printf("Wage Per Hour=%d, Working Hours=%d\n", WAGE_PER_HOUR, workingHours);
        System.out.printf("Wages Earned in a Day=%d", empWages);
    }
}
