package calculator.view;

public enum Message {
    ADDITION_CALCULATION_MESSAGE("덧셈할 문자열을 입력해 주세요."),
    CALCULATION_RESPONSE("결과 : %s");

    private final String message;

    Message(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
