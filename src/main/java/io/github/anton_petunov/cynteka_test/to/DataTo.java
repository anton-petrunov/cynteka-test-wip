package io.github.anton_petunov.cynteka_test.to;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class DataTo {
    private String first;
    private String second;
    private Integer score;
}
