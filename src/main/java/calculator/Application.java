package calculator;

import calculator.config.CalculatorConfig;
import calculator.controller.CalculatorController;

public class Application {
    public static void main(String[] args) {
        CalculatorConfig config = new CalculatorConfig();

        CalculatorController controller = new CalculatorController(
                config.getOutputView(),
                config.getCalculator(),
                config.getInputHandler()
        );

        controller.addition();
    }
}
