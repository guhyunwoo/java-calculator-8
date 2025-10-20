package calculator.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Iterator;

class TermsTest {
    @Test
    void 문자열_배열로_객체들을_정상적으로_생성해야_한다() {
        String[] input = {"1", "2", "3"};
        Terms terms = new Terms(input);

        Iterator<Term> iterator = terms.iterator();

        assertTrue(iterator.hasNext());
        assertEquals("1", iterator.next().value());
        assertEquals("2", iterator.next().value());
        assertEquals("3", iterator.next().value());
        assertFalse(iterator.hasNext());
    }

    @Test
    void 빈_배열을_입력하면_빈_리스트가_되어야_한다() {
        String[] input = {};
        Terms terms = new Terms(input);

        Iterator<Term> iterator = terms.iterator();
        assertFalse(iterator.hasNext());
    }
}
