package calculator.domain;

public class InputParser {
    private final Delimiters delimiters = new Delimiters();
    private final DelimiterExtractor extractor = new DelimiterExtractor();

    public Terms parseInput(String input) {
        input = extractor.extract(input, delimiters);
        return new Terms(input.split(delimiters.regex()));
    }
}
