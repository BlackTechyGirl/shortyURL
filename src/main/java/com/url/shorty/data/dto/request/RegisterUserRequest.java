package com.url.shorty.data.dto.request;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterUserRequest {


    @JsonProperty("username")
    private String username;

    private String email;

    @JsonProperty("password")
    private String password;
}
