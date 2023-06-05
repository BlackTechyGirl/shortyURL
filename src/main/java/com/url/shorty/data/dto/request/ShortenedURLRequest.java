package com.url.shorty.data.dto.request;


import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class ShortenedURLRequest {
    private String longUrl;
    private String username;
    private String password;
}
