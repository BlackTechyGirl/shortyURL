package com.url.shorty.services;

import com.url.shorty.data.dto.request.RegisterUserRequest;
import com.url.shorty.data.dto.response.RegisterUserResponse;

public interface UserService {

    RegisterUserResponse registerUser(RegisterUserRequest request);

}
