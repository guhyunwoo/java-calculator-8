package calculator.domain;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Terms implements Iterable<Term>  {
    private final List<Term> terms;

    public Terms(String[] values) {
        this.terms = Arrays.stream(values)
                .map(Term::new)
                .toList();
    }

    @Override
    public Iterator<Term> iterator() {
        return terms.iterator();
    }
}
