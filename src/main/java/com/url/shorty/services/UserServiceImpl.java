package com.url.shorty.services;


import com.url.shorty.data.dto.request.RegisterUserRequest;
import com.url.shorty.data.dto.response.RegisterUserResponse;
import com.url.shorty.data.models.User;
import com.url.shorty.data.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {


    private final UserRepository userRepository;

    @Override
    public RegisterUserResponse registerUser(RegisterUserRequest request) {
       User user = new User();
       user.setUsername(request.getUsername());
       user.setPassword(request.getPassword());

       user = userRepository.save(user);

       RegisterUserResponse response = new RegisterUserResponse();
       response.setMessage("User registered successfully");
       return response;

    }
}
