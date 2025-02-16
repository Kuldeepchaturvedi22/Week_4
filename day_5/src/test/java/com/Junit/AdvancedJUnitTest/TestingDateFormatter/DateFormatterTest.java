package com.Junit.AdvancedJUnitTest.TestingDateFormatter;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.text.ParseException;

public class DateFormatterTest {

    @Test
    public void testValidDate() throws ParseException {
        DateFormatter formatter = new DateFormatter();
        assertEquals("25-12-2023", formatter.formatDate("2023-12-25"));
    }

    @Test
    public void testInvalidDate() {
        DateFormatter formatter = new DateFormatter();
        assertThrows(ParseException.class, () -> {
            formatter.formatDate("2023-25-12");
        });
    }

    @Test
    public void testEmptyDate() {
        DateFormatter formatter = new DateFormatter();
        assertThrows(ParseException.class, () -> {
            formatter.formatDate("");
        });
    }

    @Test
    public void testNullDate() {
        DateFormatter formatter = new DateFormatter();
        assertThrows(NullPointerException.class, () -> {
            formatter.formatDate(null);
        });
    }
}