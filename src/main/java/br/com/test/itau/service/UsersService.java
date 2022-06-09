package br.com.test.itau.service;

import br.com.test.itau.dto.UsersRequestDto;
import br.com.test.itau.entity.Users;
import br.com.test.itau.mappers.IUsersMapper;
import br.com.test.itau.repository.UsersRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UsersService {

    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    private ValidPassword validPassword;

    @Autowired
    private IUsersMapper usersMapper;


    public Users saveUsers(UsersRequestDto users) {
        validPassword.IsValid(users.getPassword());
        Users usersConvert = usersMapper.map(users);
        log.info("POST", usersConvert);
        return usersRepository.save(usersConvert);

    }
}

