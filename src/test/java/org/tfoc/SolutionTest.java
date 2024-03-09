package org.tfoc;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Slf4j
class SolutionTest {

    private static Stream<Arguments> provideAnagram() {
        return Stream.of(
                Arguments.of("anagram", "nagaram", true),
                Arguments.of("rat", "car", false),
                Arguments.of("", "", true),
                Arguments.of("U+0007raU+090x", "U+090xarU+0007", true)
        );
    }

    @ParameterizedTest
    @MethodSource("provideAnagram")
    void testSolution(String s, String t, Boolean resExpected) {
        Solution solution = new Solution();

        solution.isAnagram(s, t);

        assertEquals(solution.isAnagram(s, t), resExpected);
    }
}