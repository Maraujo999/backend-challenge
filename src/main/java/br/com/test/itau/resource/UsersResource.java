package br.com.test.itau.resource;

import br.com.test.itau.dto.UsersRequestDto;
import br.com.test.itau.entity.Users;
import br.com.test.itau.mappers.IUsersMapper;
import br.com.test.itau.service.UsersService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.NoSuchElementException;

@Slf4j
@RestController
@RequestMapping("/api/itau/test/")
public class UsersResource {

    @Autowired
    public UsersService usersService;

    @Autowired
    private IUsersMapper usersMapper;

    @PostMapping()
    @ResponseStatus(code = HttpStatus.CREATED, reason = "Senha válida")
    private Users users(@RequestBody UsersRequestDto users) {
      try{
          log.info("POST /api/itau/test/::{}", users.getUsername());
          return usersService.saveUsers(users);
      }catch (NoSuchElementException e){
          throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
      }

    }
}
