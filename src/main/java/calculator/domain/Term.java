package calculator.domain;

import calculator.error.NegativeNumberException;
import calculator.error.NotANumberException;

public class Term {
    private final String value;

    Term(String value) {
        this.value = value;
    }

    public void validateNegative() {
        if (value.startsWith("-")) {
            throw new NegativeNumberException();
        }
    }

    public void validateTermFormat() {
        if (!value.matches("\\d+")) {
            throw new NotANumberException();
        }
    }

    public String trim() {
        return value.trim();
    }

    public String value() {
        return value;
    }
}
