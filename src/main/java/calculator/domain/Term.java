package calculator.domain;

import calculator.error.ErrorMessage;

public class Term {
    private final String value;

    Term(String value) {
        this.value = value;
    }

    public void validateNegative() {
        if (value.startsWith("-")) {
            throw new IllegalArgumentException(ErrorMessage.NEGATIVE_NUMBER.getMessage());
        }
    }

    public void validateTermFormat() {
        if (!value.matches("\\d+")) {
            throw new IllegalArgumentException(ErrorMessage.NOT_A_NUMBER.getMessage());
        }
    }

    public String trim() {
        return value.trim();
    }

    public String value() {
        return value;
    }
}
