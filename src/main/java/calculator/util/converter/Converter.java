package calculator.util.converter;

public interface Converter<T, S> {
    T convert(S source);
}
