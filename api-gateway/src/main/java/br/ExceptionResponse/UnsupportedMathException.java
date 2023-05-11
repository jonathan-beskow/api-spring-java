package br.ExceptionResponse;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class UnsupportedMathException extends RuntimeException {
    public UnsupportedMathException(String ex) {
        super(ex);
    }

    private static final Long serialVersionUID = 1L;
}
