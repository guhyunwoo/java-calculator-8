package calculator.error;

public class NotANumberException extends BaseException {
    public NotANumberException() {
        super(ErrorMessage.NOT_A_NUMBER);
    }
}
