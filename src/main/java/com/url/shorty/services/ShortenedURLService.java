package com.url.shorty.services;

import com.url.shorty.data.dto.request.DeleteShortenedURLRequest;
import com.url.shorty.data.dto.request.ShortenedURLRequest;
import com.url.shorty.data.dto.response.ClickCountResponse;
import com.url.shorty.data.dto.response.RedirectURLResponse;
import com.url.shorty.data.dto.response.ShortenedURLResponse;

public interface ShortenedURLService {

    ShortenedURLResponse shortenURL(ShortenedURLRequest request);
    RedirectURLResponse getLongURL(String shortURL);
    void deleteShortenedURL(DeleteShortenedURLRequest request);
    ClickCountResponse getClickCount(String shortURL);
}
