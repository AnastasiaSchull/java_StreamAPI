package com.company.factory;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NumberFactory {
    private static final Random random = new Random();

    public static List<Integer> generateRandomNumbers(int count, int min, int max) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            int number = random.nextInt(max - min + 1) + min;
            numbers.add(number);
        }
        return numbers;
    }
}
