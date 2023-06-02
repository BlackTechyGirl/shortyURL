package com.url.shorty.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.ZonedDateTime;

@Getter
@Setter
@AllArgsConstructor
public class ErrorDetails {
    private ZonedDateTime timeStamp;
    private String message;
    private String description;
}
