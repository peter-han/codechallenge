package com.phan.codechallenge.datecalculate;

import java.text.ParseException;
import java.util.Scanner;

/**
 * Option 1: Date Difference Description:
 * Create an application that can read in pairs of dates in the following format -
 * DD MM YYYY, DD MM YYYY
 * <p>
 * Validate the input data, and compute the difference between the two dates in days. Output of the application should be of the form -
 * DD MM YYYY, DD MM YYYY, difference
 * <p>
 * Where the first date is the earliest, the second date is the latest and the difference is the number of days.
 * <p>
 * Input can be from a file, or from standard input, as the developer chooses. Provide test data to exercise the application.
 * <p>
 * Constraints:
 * The application may not make use of the platform / SDK libraries for date manipulation (for example Date, Calendar classes).
 * The application can limit calculation on an input range of dates from 1900 to 2010.
 */
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a date1 (DD MM YYYY): ");
        String date1 = scan.nextLine();

        System.out.println("Enter a date2 (DD MM YYYY): ");
        String date2 = scan.nextLine();

        try {
            System.out.println(String.join(", ", new String[]{date1, date2, DateCalculator.diffDays(date1, date2).toString()}));
        } catch (ParseException | NullPointerException e) {
            System.err.println("ERROR: Invalid dates!");
        }
    }
}
