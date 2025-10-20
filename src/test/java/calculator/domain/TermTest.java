package calculator.domain;

import calculator.error.ErrorMessage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TermTest {
    @Test
    void 음수가_입력되면_예외가_발생한다() {
        Term term = new Term("-10");
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, term::validateNegative);
        assertEquals(ErrorMessage.NEGATIVE_NUMBER.getMessage(), ex.getMessage());
    }

    @Test
    void 정상적인_값이_입력되면_음수_예외가_발생하지_않는다() {
        Term term = new Term("10");
        assertDoesNotThrow(term::validateNegative);
    }

    @Test
    void 숫자_형식이_아닌_문자가_입력되면_예외가_발생한다() {
        Term term = new Term("ass1093aa");
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, term::validateTermFormat);
        assertEquals(ErrorMessage.NOT_A_NUMBER.getMessage(), ex.getMessage());
    }

    @Test
    void 정상적인_값이_입력되면_문자_예외가_발생하지_않는다() {
        Term term = new Term("100");
        assertDoesNotThrow(term::validateTermFormat);
    }
}