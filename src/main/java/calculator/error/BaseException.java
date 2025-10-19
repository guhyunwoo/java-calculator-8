package calculator.error;

public class BaseException extends RuntimeException {
    public BaseException(ErrorMessage message) {
        super(message.getMessage());
    }
}
