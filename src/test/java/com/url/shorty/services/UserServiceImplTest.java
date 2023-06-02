package com.url.shorty.services;

import com.url.shorty.data.dto.request.RegisterUserRequest;
import com.url.shorty.data.dto.response.RegisterUserResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserServiceImplTest {

    @Autowired
    private UserService userService;
    private RegisterUserRequest request;

    @BeforeEach
    void setUp() {
        request = new RegisterUserRequest();
        request.setEmail("test@gmai.com");
        request.setUsername("testuser");
        request.setPassword("testpassword");
    }

    @Test
    void registerUserTest() {
        RegisterUserResponse response = userService.registerUser(request);
        assertThat(response).isNotNull();
    }
}