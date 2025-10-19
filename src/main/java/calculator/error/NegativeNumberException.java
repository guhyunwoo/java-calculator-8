package calculator.error;

public class NegativeNumberException extends BaseException {
    public NegativeNumberException() {
        super(ErrorMessage.NEGATIVE_NUMBER);
    }
}
