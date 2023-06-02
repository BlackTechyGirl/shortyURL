package com.url.shorty.mapper;


import com.url.shorty.data.dto.request.RegisterUserRequest;
import com.url.shorty.data.models.User;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Mapper {
  public static User map(RegisterUserRequest request){
      User user = new User();
      user.setUsername(request.getUsername());
      user.setPassword(request.getPassword());
      user.setEmail(request.getEmail());
      return user;
  }
}
