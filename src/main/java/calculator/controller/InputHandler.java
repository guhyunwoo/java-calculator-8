package calculator.controller;

import calculator.domain.Expression;
import calculator.util.converter.StringToExpressionConverter;
import camp.nextstep.edu.missionutils.Console;

public class InputHandler {
    private final StringToExpressionConverter stringToExpressionConverter = new StringToExpressionConverter();
    private final static String DEFAULT_RESPONSE = "0";

    public Expression inputHandle() {
        String input = Console.readLine();
        if(input == null || input.isEmpty()) {
            return stringToExpressionConverter.convert(DEFAULT_RESPONSE);
        }
        return stringToExpressionConverter.convert(input);
    }
}
