package io.github.anton_petunov.cynteka_test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static io.github.anton_petunov.cynteka_test.util.MatchingUtil.divideAndMatch;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
        divideAndMatch("Бетон с присадкой", "Присадки для бетона");
    }

}
