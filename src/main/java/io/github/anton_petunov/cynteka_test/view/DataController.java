package io.github.anton_petunov.cynteka_test.view;

import io.github.anton_petunov.cynteka_test.service.DataService;
import io.github.anton_petunov.cynteka_test.to.DataTo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

@Controller
@AllArgsConstructor
public class DataController {
    private final DataService dataService;

    @PostConstruct
    public void generate() {
        List<DataTo> description = dataService.getMatched();
        try (FileWriter fileWriter = new FileWriter("output.txt")) {
            for (DataTo line : description) {
//                https://ru.stackoverflow.com/a/574105 - using operational system line separator
                fileWriter.write(line + System.lineSeparator());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
