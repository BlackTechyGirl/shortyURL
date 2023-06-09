package com.url.shorty.data.dto.response;

import lombok.*;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class RegisterUserResponse {
    private HttpStatus status;
    private String message;
}
