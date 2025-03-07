package io.github.AndCandido.Students_quality_sistemas.api.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
public class ApiResponseError {
    private List<String> errors;
}
