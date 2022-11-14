package io.github.anton_petunov.cynteka_test.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Data {
    private List<String> first;
    private List<String> second;
}
