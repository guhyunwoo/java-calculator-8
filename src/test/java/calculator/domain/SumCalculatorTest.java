package calculator.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SumCalculatorTest {
    private final Calculator calculator = new SumCalculator();

    @Test
    void 두_가지의_문자를_정확히_덧셈해야_한다() {
        String input = calculator.calculate("124,63");
        String result =calculator.calculate(input);
        assertEquals("187", result);
    }

    @Test
    void 자릿수_올림을_정확히_덧셈해야_한다() {
        String input = "999,1";
        String result = calculator.calculate(input);
        assertEquals("1000", result);
    }

    @Test
    void 공백이_존재하는_입력도_덧셈해야_한다() {
        String input = "  12  ,  8 ";
        String result = calculator.calculate(input);
        assertEquals("20", result);
    }
}