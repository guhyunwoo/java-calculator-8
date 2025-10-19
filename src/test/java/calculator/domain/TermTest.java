package calculator.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TermTest {
    @Test
    void 음수가_입력되면_예외가_발생한다() {
        Term term = new Term("-10");
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, term::validateNegative);
        assertEquals("음수는 입력할 수 없습니다.", ex.getMessage());
    }

    @Test
    void 숫자_형식이_아닌_문자가_입력되면_예외가_발생한다() {
        Term term = new Term("ass1093aa");
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, term::validateTermFormat);
        assertEquals("숫자가 아닌 값이 입력되었습니다.", ex.getMessage());
    }
}