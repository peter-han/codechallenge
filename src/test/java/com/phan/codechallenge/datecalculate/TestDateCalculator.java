package com.phan.codechallenge.datecalculate;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.text.ParseException;
import java.util.Date;

@RunWith(JUnit4.class)
public class TestDateCalculator {

    @Test
    public void testValidDate() throws ParseException {
        /*
        valid date
         */
        Date validDate = DateCalculator.format.parse("08 08 2008");
        Assert.assertTrue(DateCalculator.isValid(validDate));

        /*
        out of range
         */
        Date invalidDate = DateCalculator.format.parse("02 10 1800");
        Assert.assertFalse(DateCalculator.isValid(invalidDate));

        invalidDate = DateCalculator.format.parse("02 10 2020");
        Assert.assertFalse(DateCalculator.isValid(invalidDate));
    }

    @Test
    public void testDateDifferent() throws ParseException {
        /*
        date1 before date2
         */
        Assert.assertEquals(DateCalculator.diffDays("08 08 2008", "08 08 2009"), Long.valueOf(365));

        /*
        date1 after date2
         */
        Assert.assertEquals(DateCalculator.diffDays("10 08 2008", "08 08 2008"), Long.valueOf(-2));
    }
}
