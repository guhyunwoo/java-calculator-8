package calculator.controller;

import calculator.domain.Calculator;
import calculator.view.Message;
import calculator.view.View;

public class CalculatorController {
    private final View view;
    private final Calculator calculator;
    private final InputHandler inputHandler;

    public CalculatorController(View view, Calculator calculator, InputHandler inputHandler) {
        this.view = view;
        this.calculator = calculator;
        this.inputHandler = inputHandler;
    }

    public void addition() {
        view.printMessage(Message.ADDITION_CALCULATION_MESSAGE);
        String input = inputHandler.inputHandle();
        String response = calculator.sum(input);
        view.printFormattingMessage(Message.CALCULATION_RESPONSE, response);
    }
}
