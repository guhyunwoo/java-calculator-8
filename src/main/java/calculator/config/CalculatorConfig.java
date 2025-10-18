package calculator.config;

import calculator.view.View;

public class CalculatorConfig {
    private final View view = new View();

    public View getOutputView() {
        return view;
    }
}
