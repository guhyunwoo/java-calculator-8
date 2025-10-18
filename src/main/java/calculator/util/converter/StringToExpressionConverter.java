package calculator.util.converter;

import calculator.domain.Expression;

public class StringToExpressionConverter implements Converter<Expression, String> {
    @Override
    public Expression convert(String source) {
        return new Expression(source);
    }
}
