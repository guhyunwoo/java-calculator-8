package calculator.domain;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressionParser {
    private final Delimiters delimiters = new Delimiters();

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

        if (!m.find()) {
            throw new IllegalArgumentException("잘못된 커스텀 구분자 형식입니다.");
        }

        String customDelimiter = m.group(1);
        delimiters.addCustomDelimiter(Pattern.quote(customDelimiter));

        return m.group(2);
    }
}
