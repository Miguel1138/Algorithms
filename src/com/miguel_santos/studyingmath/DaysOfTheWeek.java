package com.miguel_santos.studyingmath;

public class DaysOfTheWeek {

    public static String findNameOfTheDay(int n) {
        String day = "";
        // A week has a pattern, which is a row of 7
        // To find the day of the week is necessary to divide the number by seven an get the remainder of the
        // division.
        switch (n % 7) {
            case 1: {
                day = "Monday";
            } break;

            case 2: {
                day = "Tuesday";
            } break;

            case 3: {
                day = "Wednesday";
            } break;

            case 4: {
                day = "Thursday";
            } break;

            case 5: {
                day = "Friday";
            } break;

            case 6: {
                day = "Saturday";
            } break;

            // Means it's divisible by seven, which goes to the end of the row, that terminates also in 7.
            case 0: {
                day = "Sunday";
            } break;

            default: {
                day = "Error";
            } break;
        }

        return day;
    }
}
