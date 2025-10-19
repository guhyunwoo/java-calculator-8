package calculator.controller;

import calculator.domain.Calculator;
import calculator.view.Message;
import calculator.view.View;

public class CalculatorController {
    private final View view;
    private final Calculator sumCalculator;
    private final InputHandler inputHandler;

    public CalculatorController(View view, Calculator sumCalculator, InputHandler inputHandler) {
        this.view = view;
        this.sumCalculator = sumCalculator;
        this.inputHandler = inputHandler;
    }

    public void addition() {
        view.printMessage(Message.ADDITION_CALCULATION_MESSAGE);
        String input = inputHandler.inputHandle();
        String response = sumCalculator.calculate(input);
        view.printFormattingMessage(Message.CALCULATION_RESPONSE, response);
    }
}
