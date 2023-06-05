package com.url.shorty.data.repositories;

import com.url.shorty.data.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long>{
    Optional<Object> findByUsername(String username);
    Optional<Object> findByEmail(String email);
}
