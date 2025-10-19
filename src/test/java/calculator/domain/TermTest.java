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
}