package com.blogapp.blogappapis.payloads;

import com.blogapp.blogappapis.entities.Role;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.*;
import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@Getter
@Setter
public class UserDto {

    private int id;

    @NotEmpty
    @Size(min = 4, message = "Username must be min of 4 characters")
    private String name;

    @Email(message = "Email address not valid !!")
//    Below validation is for strict email validation
/*   @Email(regexp = "[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,3}",
                    flags = Pattern.Flag.CASE_INSENSITIVE)*/
    private String email;

    @NotEmpty
    @Size(min = 3, max = 10, message = "Password must be minimum of 3 characters and maximum of 10 characters")
//    @Pattern(regexp = "^[a-zA-Z0-9_.-]*$")
    private String password;

    @NotNull
    private String about;

    private Set<RoleDto> roles = new HashSet<>();
}
