package com.challenge;

public class RegexUtils {

    private final static String PATTERN_PASSWORD = "((?=.*[A-Z])(?=.*[a-z]))";
    private final static String PATTERN_DIGITS = "(?=.*\\d)";
    private final static String PATTERN_SPECIAL_CHARS = "(?=.*[\\W])";

    public boolean hasLowerAndUpperCaseWords() {
        return PATTERN_PASSWORD.matches(PATTERN_PASSWORD);
    }

    public boolean hasDigits() {
        return PATTERN_DIGITS.matches(PATTERN_DIGITS);
    }

    public boolean hasSpecialChars() {
        return PATTERN_SPECIAL_CHARS.matches(PATTERN_SPECIAL_CHARS);
    }
}
