package br.com.test.itau.exceptions;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Slf4j
@ControllerAdvice
public class GlobalControllerExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<Response> handleReponseCodeExceptions(ResponseCodeException ex) {
        log.error("{}:: {}", ex.getMessage(), ex.getResponse());
        Response response = ex.getResponse();
        return ResponseEntity.status(response.getStatus()).body(response);
    }
}