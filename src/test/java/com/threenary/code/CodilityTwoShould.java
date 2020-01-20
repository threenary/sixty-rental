package com.threenary.code;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CodilityTwoShould {

    private CodilityTwo codility;

    private static Stream<Arguments> necklaceProvider() {
        return Stream.of(
                Arguments.of(new int[]{5, 4, 0, 3, 1, 6, 2},4)
        );
    }

    @BeforeEach
    public void setUp(){
        codility = new CodilityTwo();
    }

    @ParameterizedTest
    @MethodSource("necklaceProvider")
    void return_the_longest_necklaces_size(int[] necklace, int expected) {
        assertEquals(expected, codility.solution(necklace));
    }
}