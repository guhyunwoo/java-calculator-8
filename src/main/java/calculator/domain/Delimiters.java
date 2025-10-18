package calculator.domain;

import java.util.ArrayList;
import java.util.List;

public class Delimiters {
    private final List<String> delimiters = new ArrayList<>();

    public Delimiters() {
        delimiters.add(",");
        delimiters.add(":");
    }

    public void addCustomDelimiter(String customDelimiter) {
        delimiters.add(customDelimiter);
    }

    public String regex() {
        return String.join("|", delimiters);
    }
}
