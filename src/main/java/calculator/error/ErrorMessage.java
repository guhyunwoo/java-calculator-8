package calculator.error;

public enum ErrorMessage {
    NEGATIVE_NUMBER("음수는 입력할 수 없습니다."),
    NOT_A_NUMBER("숫자가 아닌 값이 입력되었습니다.");

    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
