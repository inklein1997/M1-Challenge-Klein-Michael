package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterApplicationTest {

    ConverterIf converterIf;
    ConverterSwitch converterSwitch;

    @Before
    public void setUp() {
        converterIf = new ConverterIf();
        converterSwitch = new ConverterSwitch();
    }

    @Test
    public void shouldConvertIntegersToMonthUsingSwitch() {
        assertEquals("March", converterSwitch.convertMonth(3));
        assertEquals("July", converterSwitch.convertMonth(7));
        assertEquals("November", converterSwitch.convertMonth(11));
    }

    @Test
    public void shouldConvertIntegersToMonthUsingIf() {
        assertEquals("February", converterIf.convertMonth(2));
        assertEquals("May", converterIf.convertMonth(5));
        assertEquals("December", converterIf.convertMonth(12));
    }

    @Test
    public void shouldConvertIntegersToWeekDayUsingSwitch() {
        assertEquals("Monday", converterSwitch.convertDay(2));
        assertEquals("Tuesday", converterSwitch.convertDay(3));
        assertEquals("Saturday", converterSwitch.convertDay(7));
    }

    @Test
    public void shouldConvertIntegersToWeekDayUsingIf() {
        assertEquals("Sunday", converterIf.convertDay(1));
        assertEquals("Wednesday", converterIf.convertDay(4));
        assertEquals("Thursday", converterIf.convertDay(5));
    }
}