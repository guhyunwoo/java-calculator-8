package calculator.domain;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DelimiterExtractor {
    public static final Pattern CUSTOM_DELIMITER_PATTERN = Pattern.compile("//(.*)\\\\n(.*)");

    public String extract(String input, Delimiters delimiters) {
        Matcher m = CUSTOM_DELIMITER_PATTERN.matcher(input);
        if (m.matches()) {
            delimiters.addCustomDelimiter(Pattern.quote(m.group(1)));
            return m.group(2);
        }
        return input;
    }
}

