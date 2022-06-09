package br.com.test.itau.exceptions;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Response {

    private Integer status;
    private String errorCode;
    private String message;

    public Response(String message) {
        this.message = message;
    }
}
