package calculator.controller;

import calculator.view.Message;
import calculator.view.View;

public class CalculatorController {
    private final View view;

    public CalculatorController(View view) {
        this.view = view;
    }

    public void addition() {
        view.printMessage(Message.ADDITION_CALCULATION_MESSAGE);
    }
}
