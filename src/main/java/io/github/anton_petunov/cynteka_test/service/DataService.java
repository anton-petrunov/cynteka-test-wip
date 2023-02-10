package io.github.anton_petunov.cynteka_test.service;

import io.github.anton_petunov.cynteka_test.repository.InMemoryDataRepository;
import io.github.anton_petunov.cynteka_test.to.DataTo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static io.github.anton_petunov.cynteka_test.util.MatchingUtil.divideAndMatch;

@Service
@AllArgsConstructor
public class DataService implements DataServiceInterface {
    private final InMemoryDataRepository dataRepository;

    @Override
    public List<String> generate() {
        return null;
    }

    public List<DataTo> getMatched() {
        List<String> first = dataRepository.get().getFirst();
        List<String> second = dataRepository.get().getSecond();
        List<DataTo> matchingTable = new ArrayList<>();
        for (String one : first) {
            for (String two : second) {
                matchingTable.add(divideAndMatch(one, two));
            }
        }
        System.out.println(matchingTable);
        return matchingTable.stream()
                .sorted(Comparator.comparing(DataTo::getScore).reversed())
                .collect(Collectors.toList());
    }
}
