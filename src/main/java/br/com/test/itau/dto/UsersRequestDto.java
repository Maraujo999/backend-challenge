package br.com.test.itau.dto;

import br.com.test.itau.entity.Users;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class UsersRequestDto {

    @JsonInclude
    private Long id;

    @JsonProperty("username")
    private String username;

    @JsonProperty("password")
    private String password;

    public Users UsersConvertEntity(UsersRequestDto usersRequestDto) {
        Users users = new Users();
        users.setUsername(this.username);
        users.setPassword(this.password);
        return users;
    }

}
