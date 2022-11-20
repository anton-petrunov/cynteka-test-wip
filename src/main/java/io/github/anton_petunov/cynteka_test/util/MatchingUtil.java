package io.github.anton_petunov.cynteka_test.util;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MatchingUtil {
    int windowSize = 3;

    public static String divideAndMatch(String first, String second) {
        String separated;
        String undivided;
        if (first.length() <= second.length()) {
            separated = first;
            undivided = second;
        } else {
            separated = second;
            undivided = first;
        }
        List<String> parts = new ArrayList<>();
        for (int i = 0; i < separated.length() - 2; i++) {
            parts.add(separated.substring(i, i + 3));
        }
        System.out.println(parts);

        System.out.println(parts.stream()
                .filter(s -> undivided.toLowerCase().contains(s.toLowerCase()))
                .collect(Collectors.toList()));

        System.out.println((int) parts.stream()
                .filter(s -> undivided.toLowerCase().contains(s.toLowerCase())).count());

        return first + ": " + second + ", score: " + parts.stream()
                .filter(s -> undivided.toLowerCase().contains(s.toLowerCase())).count();
    }
}
