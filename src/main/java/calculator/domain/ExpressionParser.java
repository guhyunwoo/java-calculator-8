package calculator.domain;

import calculator.util.validator.MatcherValidator;
import calculator.util.validator.Validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressionParser {
    private final Delimiters delimiters = new Delimiters();
    private final Validator<Matcher> matcherValidator = new MatcherValidator();

    public Terms parseExpression(Expression expression) {
        String exp = expression.getExpression();

        if (exp.startsWith("//")) {
            exp = extractCustomDelimiter(exp);
        }

        return new Terms(exp.split(delimiters.regex()));
    }

    private String extractCustomDelimiter(String exp) {
        exp = exp.replace("\\n", "\n");
        Matcher m = Pattern.compile("//(.+?)\\n(.*)").matcher(exp);

        matcherValidator.validate(m);

        String customDelimiter = m.group(1);
        delimiters.addCustomDelimiter(Pattern.quote(customDelimiter));

        return m.group(2);
    }
}
