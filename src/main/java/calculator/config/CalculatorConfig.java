package calculator.config;

import calculator.controller.InputHandler;
import calculator.domain.Calculator;
import calculator.domain.SumCalculator;
import calculator.view.View;

public class CalculatorConfig {
    private final View view = new View();
    private final Calculator sumCalculator = new SumCalculator();
    private final InputHandler inputHandler = new InputHandler();

    public View getOutputView() {
        return view;
    }
    public Calculator getSumCalculator() {
        return sumCalculator;
    }
    public InputHandler getInputHandler() {return inputHandler;}
}
