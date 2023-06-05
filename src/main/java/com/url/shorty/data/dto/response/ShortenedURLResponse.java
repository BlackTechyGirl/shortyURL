package com.url.shorty.data.dto.response;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class ShortenedURLResponse {
    private String shortURL;
}
