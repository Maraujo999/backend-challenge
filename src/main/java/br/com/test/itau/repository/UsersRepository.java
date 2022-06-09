package br.com.test.itau.repository;

import br.com.test.itau.dto.UsersRequestDto;
import br.com.test.itau.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {

    Users save(UsersRequestDto usersRequestDto);

}
