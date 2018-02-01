package com.phan.codechallenge.datecalculate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateCalculator {

    public static final SimpleDateFormat format = new SimpleDateFormat("dd MM yyyy");

    /**
     * @param date1
     * @param date2
     */
    public static Long diffDays(String date1, String date2) throws ParseException {

        // 1. parse date
        Date d1 = format.parse(date1);
        Date d2 = format.parse(date2);

        // 2. date limits
        if (isValid(d1) && isValid(d2)) {
            // 3 in milliseconds
            long diff = d2.getTime() - d1.getTime();
            long diffDays = diff / (24 * 60 * 60 * 1000);

            return diffDays;
        } else
            throw new Error("Error: out of calculation range!");
    }

    static boolean isValid(Date date) throws ParseException {
        return date.after(format.parse("01 01 1900")) && date.before(format.parse("31 12 2010"));
    }
}
