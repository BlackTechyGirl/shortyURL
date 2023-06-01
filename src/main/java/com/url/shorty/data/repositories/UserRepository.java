package com.url.shorty.data.repositories;

import com.url.shorty.data.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
