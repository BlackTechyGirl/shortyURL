package com.url.shorty.data.dto.response;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class RegisterUserResponse {
    private Long id;
    private String message;
    private boolean isSuccess;
}
