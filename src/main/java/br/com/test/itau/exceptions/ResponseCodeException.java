package br.com.test.itau.exceptions;

import lombok.Getter;

public class ResponseCodeException extends RuntimeException{

    @Getter
    private final transient Response response;

    public ResponseCodeException(ExceptionCodes code) {
        super(code.getMessage());
        this.response = new Response(code.getStatus(), code.getErrorCode(), code.getMessage());
    }
}
