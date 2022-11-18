package org.example;

public class App {
    static final int IS_FULL_TIME = 1;
    static final int IS_PART_TIME = 2;
    static final int WAGE_PER_HOUR = 20;
    final static int MONTHLY_WORKING_DAYS = 20;
    static final int MAX_WORKING_HOURS_FOR_A_MONTH = 100;
    static int PART_TIME_WORKING_HOURS = 4;
    static int FULL_TIME_WORKING_HOURS = 8;

    public static void main(String[] args) {
        System.out.println("Hello World!");
        // Variables
        int empWages = 0;
        int totalMonthlyWages = 0;
        int noOfDays = 0;
        boolean isActive = true;
        while (isActive) {
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            int workingHours = 0;
            empWages = 0;
            // Functionality
            switch (empCheck) {
                case IS_FULL_TIME:
                    empWages = FULL_TIME_WORKING_HOURS * WAGE_PER_HOUR;
                    workingHours += FULL_TIME_WORKING_HOURS;
                    break;
                case IS_PART_TIME:
                    empWages = PART_TIME_WORKING_HOURS * WAGE_PER_HOUR;
                    workingHours += PART_TIME_WORKING_HOURS;
                    break;
            }
            totalMonthlyWages += empWages;
            noOfDays++;
            if (noOfDays == MONTHLY_WORKING_DAYS || workingHours == MAX_WORKING_HOURS_FOR_A_MONTH) {
                isActive = false;
            }
        }
        System.out.printf("Wages Earned In a Month=%d\n", totalMonthlyWages);
    }
}
