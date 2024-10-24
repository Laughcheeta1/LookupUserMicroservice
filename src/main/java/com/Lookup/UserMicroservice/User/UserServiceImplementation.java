package com.Lookup.UserMicroservice.User;

import com.Lookup.UserMicroservice.User.DTO.UserBasicDTO;
import com.Lookup.UserMicroservice.User.DTO.UserCompleteDTO;
import com.Lookup.UserMicroservice.User.DTO.UserRegisterRequestDTO;
import com.Lookup.UserMicroservice.User.Entity.User;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImplementation implements UserService {
    private final UserDAO userDAO;

    @Autowired
    public UserServiceImplementation(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    public UserCompleteDTO getCompleteUser(String userId) {
        User user = userDAO.findById(new ObjectId(userId)).orElseThrow(() -> new RuntimeException("User not found"));
        return UserCompleteDTO.builder()
                .id(user.getId().toHexString())
                .name(user.getName())
                .email(user.getEmail())
                .number(user.getNumber())
                .dateOfBirth(user.getDateOfBirth())
                .location(user.getLocation())
                .build();
    }

    @Override
    public UserBasicDTO getBasicUser(String userId) {
        return getBasicUserDTO(userDAO.findById(new ObjectId(userId)).orElseThrow(() -> new RuntimeException("User not found")));
    }

    @Override
    public UserBasicDTO createUser(UserRegisterRequestDTO userRegister) {
        User user = User.builder()
                .name(userRegister.getName())
                .email(userRegister.getEmail())
                .number(userRegister.getNumber())
                .dateOfBirth(userRegister.getDateOfBirth())
                .location(userRegister.getLocation())
                .build();

        return getBasicUserDTO(userDAO.save(user));
    }

    @Override
    public void updateUser(String userId, UserRegisterRequestDTO newUser) {
        User user = userDAO.findById(new ObjectId(userId)).orElseThrow(() -> new RuntimeException("User not found"));

        if (newUser.getName() != null)
            user.setName(newUser.getName());

        if (newUser.getEmail() != null)
            user.setEmail(newUser.getEmail());

        if (newUser.getNumber() != null)
            user.setNumber(newUser.getNumber());

        if (newUser.getDateOfBirth() != null)
            user.setDateOfBirth(newUser.getDateOfBirth());

        if (newUser.getLocation() != null)
            user.setLocation(newUser.getLocation());

        userDAO.save(user);
    }

    private UserBasicDTO getBasicUserDTO(User user) {
        return UserBasicDTO.builder()
                .id(user.getId().toHexString())
                .name(user.getName())
                .build();
    }
}
