package com.Lookup.UserMicroservice.User;

import com.Lookup.UserMicroservice.User.DTO.UserBasicDTO;
import com.Lookup.UserMicroservice.User.DTO.UserCompleteDTO;
import com.Lookup.UserMicroservice.User.DTO.UserRegisterRequestDTO;
import org.springframework.http.ResponseEntity;

public interface UserController {
    ResponseEntity<UserCompleteDTO> getCompleteUser(String userId);

    ResponseEntity<UserBasicDTO> getBasicUser(String userId);

    ResponseEntity<UserBasicDTO> createUser(UserRegisterRequestDTO user);

    ResponseEntity<Void> updateUser(String userId, UserRegisterRequestDTO user);
}
