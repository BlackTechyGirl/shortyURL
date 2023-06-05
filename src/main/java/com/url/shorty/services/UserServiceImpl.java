package com.url.shorty.services;


import com.url.shorty.data.dto.request.LoginUserRequest;
import com.url.shorty.data.dto.request.RegisterUserRequest;
import com.url.shorty.data.dto.response.LoginResponse;
import com.url.shorty.data.dto.response.RegisterUserResponse;
import com.url.shorty.data.models.User;
import com.url.shorty.data.repositories.UserRepository;
import com.url.shorty.utils.UserLoginException;
import lombok.AllArgsConstructor;
import lombok.Builder;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
@Builder
@AllArgsConstructor
public class UserServiceImpl implements UserService {


    private final UserRepository userRepository;

    @Override
    public RegisterUserResponse registerUser(RegisterUserRequest request) {
        boolean emailExist = userRepository.findByEmail(request.getEmail()).isPresent();
        if (emailExist) throw new IllegalStateException("Email Already Exist");
        User user = new User();
        user.setUsername(request.getUsername());
        user.setEmail(request.getEmail());
        user.setPassword(request.getPassword());

        userRepository.save(user);

        return RegisterUserResponse.builder()
                .message("Account created successfully")
                .status(HttpStatus.CREATED)
                .build();
    }

    @Override
    public LoginResponse login(LoginUserRequest request){
        User user = (User) userRepository.findByUsername(request.getUsername())
                .orElseThrow(()-> new UserLoginException("User does not exist"));
        LoginResponse response = new LoginResponse();
        if (user.getPassword().equals(request.getPassword())){
            response.setMessage("Login successful");
            response.setHttpStatus(HttpStatus.OK);
        }else {
            response.setMessage("re-login");
            response.setHttpStatus(HttpStatus.BAD_REQUEST);
            throw new UserLoginException("wrong email or password");
        }
        return response;
    }
}
