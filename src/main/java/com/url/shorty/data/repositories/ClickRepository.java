package com.url.shorty.data.repositories;

import com.url.shorty.data.models.Click;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClickRepository extends JpaRepository<Click, Long> {
}
