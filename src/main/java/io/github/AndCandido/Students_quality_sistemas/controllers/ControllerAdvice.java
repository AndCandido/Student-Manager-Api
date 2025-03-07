package io.github.AndCandido.Students_quality_sistemas.controllers;

import io.github.AndCandido.Students_quality_sistemas.api.exceptions.ApiResponseError;
import io.github.AndCandido.Students_quality_sistemas.api.exceptions.ResourceNotFoundException;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Collections;
import java.util.List;

@RestControllerAdvice
public class ControllerAdvice {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ApiResponseError> handlerValidationException(MethodArgumentNotValidException exception) {
        List<String> errors = exception.getAllErrors().stream()
                .map(DefaultMessageSourceResolvable::getDefaultMessage).toList();
        var response = new ApiResponseError(errors);

        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body(response);
    }

    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ApiResponseError> handlerResourceNotFoundException(ResourceNotFoundException exception) {
        var response = new ApiResponseError(Collections.singletonList(exception.getMessage()));

        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                .body(response);
    }
}
