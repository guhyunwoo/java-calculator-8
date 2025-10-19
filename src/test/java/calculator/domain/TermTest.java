package calculator.domain;

import calculator.error.ErrorMessage;
import calculator.error.NegativeNumberException;
import calculator.error.NotANumberException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TermTest {
    @Test
    void 음수가_입력되면_예외가_발생한다() {
        Term term = new Term("-10");
        NegativeNumberException ex = assertThrows(NegativeNumberException.class, term::validateNegative);
        assertEquals(ErrorMessage.NEGATIVE_NUMBER.getMessage(), ex.getMessage());
    }

    @Test
    void 숫자_형식이_아닌_문자가_입력되면_예외가_발생한다() {
        Term term = new Term("ass1093aa");
        NotANumberException ex = assertThrows(NotANumberException.class, term::validateTermFormat);
        assertEquals(ErrorMessage.NOT_A_NUMBER.getMessage(), ex.getMessage());
    }
}