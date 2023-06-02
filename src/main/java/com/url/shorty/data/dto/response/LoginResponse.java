package com.url.shorty.data.dto.response;

import lombok.*;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LoginResponse {
    private HttpStatus httpStatus;
    private String message;
}
