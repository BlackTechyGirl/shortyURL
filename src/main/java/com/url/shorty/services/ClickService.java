package com.url.shorty.services;

import com.url.shorty.data.dto.response.ClickCountResponse;

public interface ClickService {
    ClickCountResponse getClickCount(String shortURL);
}
