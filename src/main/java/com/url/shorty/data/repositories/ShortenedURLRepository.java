package com.url.shorty.data.repositories;

import com.url.shorty.data.models.ShortenedURL;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShortenedURLRepository extends JpaRepository<ShortenedURL, Long> {
}
