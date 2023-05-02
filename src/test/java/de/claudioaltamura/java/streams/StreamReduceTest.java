package de.claudioaltamura.java.streams;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class StreamReduceTest {

    private final List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
    @Test
    @DisplayName("sum ups a custom accumulator")
    void sumUp() {
        int result = numbers
                .stream()
                .reduce(0, (subtotal, element) -> subtotal + element);
        assertThat(result).isEqualTo(21);
    }

    @Test
    @DisplayName("sum ups using a method reference")
    void sumUpMethodReference() {
        int result = numbers
                .stream()
                .reduce(0, Integer::sum);
        assertThat(result).isEqualTo(21);
    }

    @Test
    @DisplayName("concats a string using a custom accumulator")
    void concat() {
        var letters = Arrays.asList("a", "b", "c", "d", "e");
        String result = letters
                .stream()
                .reduce("", (partialString, element) -> partialString + element);
        assertThat(result).isEqualTo("abcde");
    }

}
