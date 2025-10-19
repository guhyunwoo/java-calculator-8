package calculator.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Iterator;

class InputParserTest {
    private final InputParser parser = new InputParser();

    @Test
    void 기본_구분자로_문자열을_정확히_분리해야_한다() {
        String input = "1,2:3";

        Terms terms = parser.parseInput(input);

        Iterator<Term> it = terms.iterator();
        assertEquals("1", it.next().value());
        assertEquals("2", it.next().value());
        assertEquals("3", it.next().value());
        assertFalse(it.hasNext());
    }

    @Test
    void 커스텀_구분자를_정확히_추출하고_분리해야_한다() {
        String input = "//;\\n1;2;3";

        Terms terms = parser.parseInput(input);

        Iterator<Term> it = terms.iterator();
        assertEquals("1", it.next().value());
        assertEquals("2", it.next().value());
        assertEquals("3", it.next().value());
        assertFalse(it.hasNext());
    }
}
