package calculator.domain;

import org.junit.jupiter.api.Test;

import java.util.regex.Pattern;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DelimiterExtractorTest {
    DelimiterExtractor delimiterExtractor = new DelimiterExtractor();
    Delimiters delimiters = new Delimiters();
    Delimiters customDelimiters = new Delimiters();

    @Test
    void 정규식_형태로_값이_들어오면_커스텀_구분자를_추출해야_한다() {
        String input = "//***\\n10***10000";

        delimiterExtractor.extract(input, delimiters);
        customDelimiters.addCustomDelimiter(Pattern.quote("***"));

        assertThat(delimiters).isInstanceOf(Delimiters.class);
        assertThat(delimiters).usingRecursiveComparison().isEqualTo(customDelimiters);
    }

    @Test
    void 정규식_형태로_값이_들어오면_구분자를_제외한_바디를_반환해야_한다() {
        String input = "//%%\\n389%%482";

        String body = delimiterExtractor.extract(input, delimiters);

        assertEquals("389%%482", body);
    }

    @Test
    void 정규식_형태가_아닌_값이_들어오면_입력_그대로_반환한다() {
        String input = "10,848:3028";

        String body = delimiterExtractor.extract(input, delimiters);

        assertEquals(input, body);
    }
}