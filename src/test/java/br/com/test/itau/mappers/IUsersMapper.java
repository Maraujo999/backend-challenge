package br.com.test.itau.mappers;

import br.com.test.itau.dto.UsersRequestDto;
import br.com.test.itau.entity.Users;

//@Mapper(componentModel = "spring")
public interface IUsersMapper {

    Users map(UsersRequestDto users);
}