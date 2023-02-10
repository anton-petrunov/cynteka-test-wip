package io.github.anton_petunov.cynteka_test.util;

import io.github.anton_petunov.cynteka_test.to.DataTo;

import java.util.ArrayList;
import java.util.List;

public class MatchingUtil {
    int windowSize = 3;

    public static DataTo divideAndMatch(String first, String second) {
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
        Integer count = parts.stream()
                .filter(s -> undivided.toLowerCase().contains(s.toLowerCase()))
                .toList().size();
        return new DataTo(first, second, count);
    }
}
