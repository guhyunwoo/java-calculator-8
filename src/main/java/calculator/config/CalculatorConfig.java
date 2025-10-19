package calculator.config;

import calculator.controller.InputHandler;
import calculator.domain.Calculator;
import calculator.view.View;

public class CalculatorConfig {
    private final View view = new View();
    private final Calculator calculator = new Calculator();
    private final InputHandler inputHandler = new InputHandler();

    public View getOutputView() {
        return view;
    }
    public Calculator getCalculator() {
        return calculator;
    }
    public InputHandler getInputHandler() {return inputHandler;}
}
