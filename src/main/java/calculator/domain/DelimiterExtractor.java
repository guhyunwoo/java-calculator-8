package calculator.domain;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DelimiterExtractor {
    /*
     * //;\n10;100;1000 => 결과 : 1110
     * 형식으로 입력 받아 반환하는 것이 목적
     * 다음과 같은 정규식으로 구분자와 바디를 추출
     * //${구분자}\n표현식
     */
    public static final Pattern CUSTOM_DELIMITER_PATTERN = Pattern.compile("//(.*)\\\\n(.*)");

    public String extract(String input, Delimiters delimiters) {
        Matcher m = CUSTOM_DELIMITER_PATTERN.matcher(input);

        // 입력 형식이 정규식에 맞으면 커스텀 구분자 추출 후 바디 반환
        if (m.matches()) {
            delimiters.addCustomDelimiter(Pattern.quote(m.group(1)));
            return m.group(2);
        }

        // 입력 그대로 반환
        return input;
    }
}

