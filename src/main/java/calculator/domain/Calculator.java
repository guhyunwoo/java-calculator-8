package calculator.domain;

public class Calculator {
    private final ExpressionParser expressionParser = new ExpressionParser();

    public String calculate(Expression expression) {
        String[] numbers = expressionParser.parseExpression(expression);
    }
}
