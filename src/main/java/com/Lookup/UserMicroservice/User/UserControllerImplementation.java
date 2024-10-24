package com.Lookup.UserMicroservice.User;

import com.Lookup.UserMicroservice.User.DTO.UserBasicDTO;
import com.Lookup.UserMicroservice.User.DTO.UserCompleteDTO;
import com.Lookup.UserMicroservice.User.DTO.UserRegisterRequestDTO;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/user")
@RestController
public class UserControllerImplementation implements UserController {
    private final UserService userService;

    @Autowired
    public UserControllerImplementation(UserService userService) {
        this.userService = userService;
    }

    @Override
    @GetMapping("/complete/{userId}")
    public ResponseEntity<UserCompleteDTO> getCompleteUser(@PathVariable("userId") String userId) {
        return ResponseEntity.ok(userService.getCompleteUser(userId));
    }

    @Override
    @GetMapping("/basic/{userId}")
    public ResponseEntity<UserBasicDTO> getBasicUser(@PathVariable("userId") String userId) {
        return ResponseEntity.ok(userService.getBasicUser(userId));
    }

    @Override
    @PostMapping("")
    public ResponseEntity<UserBasicDTO> createUser(@RequestBody UserRegisterRequestDTO user) {
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.createUser(user));
    }

    @Override
    @PutMapping("/{userId}")
    public ResponseEntity<Void> updateUser(@PathVariable("userId") String userId, @RequestBody UserRegisterRequestDTO user) {
        userService.updateUser(userId, user);
        return ResponseEntity.ok().build();
    }
}
