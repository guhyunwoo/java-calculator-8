package calculator.domain;

public class Calculator {
    private final ExpressionParser expressionParser = new ExpressionParser();

    public String add(Expression expression) {
        Terms terms = expressionParser.parseExpression(expression);
        String result = "0";

        for(Term term : terms) {
            term = new Term(term.trim());

            term.validateNegative();

            term.validateTermFormat();

            result = addByString(result, term.value());
        }

        return result;
    }

    private String addByString(String num1, String num2) {
        StringBuilder result = new StringBuilder();

        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry != 0) {
            int digit1 = i >= 0 ? num1.charAt(i) - '0' : 0;
            int digit2 = j >= 0 ? num2.charAt(j) - '0' : 0;

            int sum = digit1 + digit2 + carry;
            carry = sum / 10;
            result.append(sum % 10);

            i--;
            j--;
        }

        return result.reverse().toString();
    }
}
