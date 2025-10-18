package calculator.controller;

import calculator.domain.Calculator;
import calculator.domain.Expression;
import calculator.util.converter.StringToExpressionConverter;
import calculator.view.Message;
import calculator.view.View;
import camp.nextstep.edu.missionutils.Console;

public class CalculatorController {
    private final View view;
    private final Calculator calculator;

    public CalculatorController(View view, Calculator calculator) {
        this.view = view;
        this.calculator = calculator;
    }

    public void addition() {
        view.printMessage(Message.ADDITION_CALCULATION_MESSAGE);
        String input = Console.readLine();
        if(input == null || input.isEmpty()) {
            System.out.println("0");
            return;
        }
        StringToExpressionConverter converter = new StringToExpressionConverter();
        Expression expression = converter.convert(input);
        calculator.calculate(expression);
    }
}
