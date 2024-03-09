package org.tfoc;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * The class containing the solution to this exercise
 */
public class Solution {

    public boolean isAnagram(
            String s,
            String t) {

        Map<String, Long> collectS = getLettersOcurrences(s);
        Map<String, Long> collectT = getLettersOcurrences(t);

        return collectS.equals(collectT);
    }

    private Map<String, Long> getLettersOcurrences(String value) {
        return Arrays.stream(value.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

}
