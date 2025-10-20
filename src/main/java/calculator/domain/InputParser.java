package calculator.domain;

public class InputParser {
    private final Delimiters delimiters = new Delimiters();
    private final DelimiterExtractor extractor = new DelimiterExtractor();

    public Terms parseInput(String input) {
        input = extractor.extract(input, delimiters);
        // 바디 부분을 구분자로 분리 후 Terms 객체로 반환
        return new Terms(input.split(delimiters.regex()));
    }
}
