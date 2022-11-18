package org.example;

public class App {
    static final int IS_FULL_TIME = 1;
    static final int IS_PART_TIME = 2;
    static final int WAGE_PER_HOUR = 20;
    final static int MONTHLY_WORKING_DAYS = 20;
    static int PART_TIME_WORKING_HOURS = 4;
    static int FULL_TIME_WORKING_HOURS = 8;

    public static void main(String[] args) {
        System.out.println("Hello World!");
        // Variables
        int empWages = 0;
        int totalMonthlyWages = 0;
        for (int i = 1; i <= MONTHLY_WORKING_DAYS; i++) {
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            empWages = 0;
            // Functionality
            switch (empCheck) {
                case IS_FULL_TIME:
                    empWages = FULL_TIME_WORKING_HOURS * WAGE_PER_HOUR;
                    break;
                case IS_PART_TIME:
                    empWages = PART_TIME_WORKING_HOURS * WAGE_PER_HOUR;
                    break;
            }
            totalMonthlyWages += empWages;
        }
        System.out.printf("Wages Earned In a Month=%d\n", totalMonthlyWages);
    }
}
