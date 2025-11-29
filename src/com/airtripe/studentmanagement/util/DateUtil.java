package com.airtripe.studentmanagement.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;



public class DateUtil {

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    // ===== Get today's date =====
    public static LocalDate today() {
        return LocalDate.now();
    }

    // ===== Convert String → LocalDate =====
    public static LocalDate toDate(String dateStr) {
        return LocalDate.parse(dateStr, FORMATTER);
    }

    // ===== Convert LocalDate → String =====
    public static String toString(LocalDate date) {
        return date.format(FORMATTER);
    }

    // ===== Add Days to a Date =====
    public static LocalDate addDays(LocalDate date, int days) {
        return date.plusDays(days);
    }

    // ===== Add Months to a Date =====
    public static LocalDate addMonths(LocalDate date, int months) {
        return date.plusMonths(months);
    }
}
