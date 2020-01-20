package com.threenary.code;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CodilityOneShould {

    private CodilityOne codility;

    private static Stream<Arguments> provideWordPairs() {
        return Stream.of(
                Arguments.of("harder", "rather", 2),
                Arguments.of("apple", "pear", 3)
        );
    }

    @BeforeEach
    public void setUp() {
        codility = new CodilityOne();
    }

    @ParameterizedTest
    @MethodSource("provideWordPairs")
    public void return_the_amount_of_letters_to_make_an_anagram(String first, String second, int expected) {
        assertEquals(expected, codility.solution(first, second));
    }
}