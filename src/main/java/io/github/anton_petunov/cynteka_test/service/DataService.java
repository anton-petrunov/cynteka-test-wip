package io.github.anton_petunov.cynteka_test.service;

import io.github.anton_petunov.cynteka_test.model.Data;
import io.github.anton_petunov.cynteka_test.repository.InMemoryDataRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class DataService implements DataServiceInterface {
    private final InMemoryDataRepository dataRepository;

    @Override
    public List<String> generate() {
        Data data = dataRepository.get();
        List<String> first = data.getFirst().stream()
                .map(s -> s + ":?").toList();

        List<String> second = data.getSecond().stream()
                .map(s -> s + ":?").toList();

        List<String> description = new ArrayList<>(first);
        description.addAll(second);
        return description;
    }
}
