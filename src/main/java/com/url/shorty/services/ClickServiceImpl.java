package com.url.shorty.services;

import com.url.shorty.data.dto.response.ClickCountResponse;
import com.url.shorty.data.repositories.ClickRepository;
import lombok.AllArgsConstructor;
import lombok.Builder;
import org.springframework.stereotype.Service;

@Service
@Builder
@AllArgsConstructor
public class ClickServiceImpl implements ClickService{

    private final ClickRepository clickRepository;

    @Override
    public ClickCountResponse getClickCount(String shortURL) {
        // Retrieve and return the click count for a short URL
        Long clickCount = clickRepository.countByShortURL(shortURL);
        return new ClickCountResponse(clickCount);
    }
}
