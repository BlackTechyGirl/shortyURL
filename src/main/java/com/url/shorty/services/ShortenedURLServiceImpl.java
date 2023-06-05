package com.url.shorty.services;

import com.url.shorty.data.dto.request.DeleteShortenedURLRequest;
import com.url.shorty.data.dto.request.ShortenedURLRequest;
import com.url.shorty.data.dto.response.ClickCountResponse;
import com.url.shorty.data.dto.response.RedirectURLResponse;
import com.url.shorty.data.dto.response.ShortenedURLResponse;
import com.url.shorty.data.repositories.ClickRepository;
import com.url.shorty.data.repositories.ShortenedURLRepository;
import com.url.shorty.data.repositories.UserRepository;
import lombok.AllArgsConstructor;
import lombok.Builder;
import org.springframework.stereotype.Service;


@Service
@Builder
@AllArgsConstructor
public class ShortenedURLServiceImpl implements ShortenedURLService{

    private final UserRepository userRepository;
    private final ShortenedURLRepository shortenedURLRepository;
    private final ClickRepository clicksRepository;

    @Override
    public ShortenedURLResponse shortenURL(ShortenedURLRequest request) {
        return null;
    }

    @Override
    public RedirectURLResponse getLongURL(String shortURL) {
        return null;
    }

    @Override
    public void deleteShortenedURL(DeleteShortenedURLRequest request) {

    }

    @Override
    public ClickCountResponse getClickCount(String shortURL) {
        return null;
    }
}
