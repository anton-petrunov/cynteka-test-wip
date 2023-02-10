package io.github.anton_petunov.cynteka_test.repository;

import io.github.anton_petunov.cynteka_test.model.Data;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class InMemoryDataRepositoryTest {

    @Autowired
    InMemoryDataRepository dataRepository;

    @Test
    void whenInputCorrectThanOutputCorrect() {
        Data data = dataRepository.get();
        assertThat(data).isEqualTo(data);
    }

    @Test
    void whenInputNotFoundThanFileNotFoundException() {
    }

}