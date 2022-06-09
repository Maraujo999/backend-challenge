package br.com.test.itau.service;

import br.com.test.itau.exceptions.ExceptionCodes;
import br.com.test.itau.exceptions.ResponseCodeException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class ValidPassword implements IValidPassword, IInvalidPassword {

    private IValidPassword validationPassword;

    private IInvalidPassword iInvalidPasswords;


    @Override
    public void IsValid(String password) {
        invalidPassword(password);
    }

  //  private boolean isValidOrInvalidPassword(String password) {
  //
  //  }
  //
    @Override
    public boolean invalidPassword(String password) {
        boolean valid = iInvalidPasswords.invalidPassword(password)? true : false;
        return valid;
    }
}
