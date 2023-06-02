package com.url.shorty.data.dto.request;


import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LoginUserRequest {
    private String email;
    private String username;
    private String password;
}
