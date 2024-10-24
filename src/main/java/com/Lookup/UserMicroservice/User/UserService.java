package com.Lookup.UserMicroservice.User;

import com.Lookup.UserMicroservice.User.DTO.UserBasicDTO;
import com.Lookup.UserMicroservice.User.DTO.UserCompleteDTO;
import com.Lookup.UserMicroservice.User.DTO.UserRegisterRequestDTO;

public interface UserService {
    UserCompleteDTO getCompleteUser(String userId);

    UserBasicDTO getBasicUser(String userId);

    UserBasicDTO createUser(UserRegisterRequestDTO userRegister);

    void updateUser(String userId, UserRegisterRequestDTO userNew);
}
