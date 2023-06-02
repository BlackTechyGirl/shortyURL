package com.url.shorty.controller;


import com.url.shorty.data.dto.request.RegisterUserRequest;
import com.url.shorty.data.dto.response.RegisterUserResponse;
import com.url.shorty.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
@AllArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/register")
    public ResponseEntity<?> registerUser(@RequestBody RegisterUserRequest request){
        RegisterUserResponse response = userService.registerUser(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);

    }
}
