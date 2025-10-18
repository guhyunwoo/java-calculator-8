package calculator.config;

import calculator.domain.Calculator;
import calculator.view.View;

public class CalculatorConfig {
    private final View view = new View();
    private final Calculator calculator = new Calculator();

    public View getOutputView() {
        return view;
    }
    public Calculator getCalculator() {
        return calculator;
    }
}
