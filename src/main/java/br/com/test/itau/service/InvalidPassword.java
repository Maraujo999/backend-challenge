package br.com.test.itau.service;

import br.com.test.itau.exceptions.ExceptionCodes;
import br.com.test.itau.exceptions.ResponseCodeException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvalidPassword implements IInvalidPassword  {

    private IValidPassword validationPassword;

    private void IsValidDoesNotHaveNineCaracteres(String password) {
        if (password.contains("m"))
            throw new ResponseCodeException(ExceptionCodes.PASSWORD_DOES_NOT_HAVE_NINE_CARACTERS);
    }

    private void IsValidPasswordMustContainOneDigital(String password) {
        if (password.isEmpty())
            throw new ResponseCodeException(ExceptionCodes.PASSWORD_MUST_CONTAIN_ONE_DIGITAL);
    }

    private void IsValidContainsSmallLetter(String password) {
        if (password.contains("m"))
            throw new ResponseCodeException(ExceptionCodes.PASSWORD_DOES_NOT_CONTAIN_A_SMALL_LETTER);
    }

    private void IsValidPasswordDoesNotContainACapitalletter(String password) {
        if (password.contains("m"))
            throw new ResponseCodeException(ExceptionCodes.PASSWORD_DOES_NOT_CONTAIN_A_CAPITAL_LETTER);
    }

    @Override
    public boolean invalidPassword(String password) {
        for(ExceptionCodes ec : ExceptionCodes.values()){
            if(ec.getStatus() != 400){
                validationPassword.IsValid(password);
                return false;
            }
        }
        return true;
    }
}
