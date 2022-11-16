package io.github.anton_petunov.cynteka_test.repository;

import io.github.anton_petunov.cynteka_test.model.Data;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryDataRepository {
    private final List<String> first = new ArrayList<>();
    private final List<String> second = new ArrayList<>();

    @PostConstruct
    public void init() {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("input.txt"))) {
            int firstQuantity = Integer.parseInt(bufferedReader.readLine());
            for (int i = 0; i < firstQuantity; i++) {
                first.add(bufferedReader.readLine());
            }
            int secondQuantity = Integer.parseInt(bufferedReader.readLine());
            for (int i = 0; i < secondQuantity; i++) {
                second.add(bufferedReader.readLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Data get() {
        return new Data(first, second);
    }
}
