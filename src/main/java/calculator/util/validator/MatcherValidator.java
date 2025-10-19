package calculator.util.validator;

import java.util.regex.Matcher;

public class MatcherValidator implements Validator<Matcher> {
    @Override
    public void validate(Matcher m) {
        if (!m.find()) {
            throw new IllegalArgumentException("잘못된 입력입니다.");
        }
    }
}
