package com.airtripe.studentmanagement.util;



public class InputValidator {

    // ===== Validate empty string =====
    public static boolean isEmpty(String value) {
        return value == null || value.trim().isEmpty();
    }

    // ===== Validate email format =====
    public static boolean isValidEmail(String email) {
        return email != null && email.contains("@") && email.contains(".");
    }

    // ===== Validate phone number (10 digits) =====
    public static boolean isValidPhone(String phone) {
        return phone != null && phone.matches("[0-9]{10}");
    }

    // ===== Validate positive number =====
    public static boolean isPositive(int number) {
        return number > 0;
    }
}
