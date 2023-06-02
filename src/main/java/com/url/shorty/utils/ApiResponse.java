package com.url.shorty.utils;

import lombok.*;
import org.springframework.http.HttpStatus;

import java.time.ZonedDateTime;

@Data
@Setter
@Getter
@AllArgsConstructor
@Builder
public class ApiResponse {
    private ZonedDateTime timeStamp;
    private HttpStatus statusCode;
    private String path;
    private  Object data;
    private Boolean isSuccessful;
}
