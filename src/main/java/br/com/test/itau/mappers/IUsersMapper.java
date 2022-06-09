package br.com.test.itau.mappers;

import br.com.test.itau.dto.UsersRequestDto;
import br.com.test.itau.entity.Users;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface IUsersMapper {

    @Mapping(target = "id", source = "id")
    Users map(UsersRequestDto users);
}
