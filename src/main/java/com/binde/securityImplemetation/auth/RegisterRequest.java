package com.binde.securityImplemetation.auth;

import com.binde.securityImplemetation.user.Role;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RegisterRequest {
    private String firstname;
    private String lastname;
    private String email;
    private String password;
    //private Role role;

}
