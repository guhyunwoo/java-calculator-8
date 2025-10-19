package calculator.domain;

public class Term {
    private final String value;

    Term(String value) {
        this.value = value;
    }

    public void validateNegative() {
        if (value.startsWith("-")) {
            throw new IllegalArgumentException("음수는 입력할 수 없습니다.");
        }
    }

    public void validateTermFormat() {
        if (!value.matches("\\d+")) {
            throw new IllegalArgumentException("숫자가 아닌 값이 입력되었습니다.");
        }
    }

    public String trim() {
        return value.trim();
    }

    public String value() {
        return value;
    }
}
