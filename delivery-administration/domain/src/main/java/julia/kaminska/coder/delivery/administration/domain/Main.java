package julia.kaminska.coder.delivery.administration.domain;

import java.util.Arrays;
import java.util.List;

public class Main {
    private static final List<String> SOME_STRINGS = Arrays.asList("Hello", "World");

    public static void main(String[] args) {
        SOME_STRINGS.stream().forEach(System.out::println);
    }
}