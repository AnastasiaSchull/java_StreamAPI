package com.company.analyzer;
import java.util.List;

public class NumberAnalyzer {
    private List<Integer> numbers;

    public NumberAnalyzer(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public long countPositiveNumbers() {
        return numbers.stream().filter(n -> n > 0).count();
    }

    public long countNegativeNumbers() {
        return numbers.stream().filter(n -> n < 0).count();
    }

    public long countTwoDigitNumbers() {
        return numbers.stream().filter(n -> (n >= 10 && n <= 99) || (n <= -10 && n >= -99)).count();
    }

    public long countMirrorNumbers() {
        return numbers.stream().filter(n -> {
            String str = Integer.toString(Math.abs(n));
            String reversed = new StringBuilder(str).reverse().toString();
            return str.equals(reversed);
        }).count();
    }
}
