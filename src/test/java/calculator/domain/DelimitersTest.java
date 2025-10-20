package calculator.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DelimitersTest {
    private final Delimiters delimiters = new Delimiters();

    @Test
    void 기본_구분자를_올바른_정규_표현식으로_반환해야_한다() {
        assertEquals(",|:", delimiters.regex());
    }

    @Test
    void 커스텀_구분자를_추가하고_올바른_정규_표현식으로_반환해야_한다() {
        delimiters.addCustomDelimiter("***");
        assertEquals(",|:|***", delimiters.regex());
    }
}