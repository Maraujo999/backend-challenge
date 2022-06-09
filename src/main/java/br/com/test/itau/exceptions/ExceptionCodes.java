package br.com.test.itau.exceptions;

import lombok.Getter;

@Getter
public enum ExceptionCodes {

    PASSWORD_DOES_NOT_HAVE_NINE_CARACTERS(400,"PasswordDoesNotHaveNineCaracters", "Nove ou mais caracteres"),
    PASSWORD_MUST_CONTAIN_ONE_DIGITAL(400,"PasswordMustContainOneDigital", "Ao menos 1 dígito"),
    PASSWORD_DOES_NOT_CONTAIN_A_SMALL_LETTER(400,"PasswordDoesNotContainASmallLetter", "Ao menos 1 letra minúscula" ),
    PASSWORD_DOES_NOT_CONTAIN_A_CAPITAL_LETTER(400,"PasswordDoesNotContainACapitalLetter", "Ao menos 1 letra maiúscula" ),
    PASSWORD_MUST_CONTAIN_A_SPECIAL_CHARACTER(400,"PasswordMustContainASpecialCharacter", "Ao menos 1 caractere especial" );

    private final int status;
    private final String errorCode;
    private final String message;

    ExceptionCodes(int status, String errorCode, String message){
        this.status = status;
        this.errorCode = errorCode;
        this.message = message;
    }
}