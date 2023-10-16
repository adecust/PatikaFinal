package com.arda.carRegistrationSystem.api;

import com.arda.carRegistrationSystem.DTOs.request.ChangePasswordUserRequest;
import com.arda.carRegistrationSystem.DTOs.request.CreateUserRequest;
import com.arda.carRegistrationSystem.DTOs.response.ChangePasswordResponse;
import com.arda.carRegistrationSystem.bussiness.abstractt.IUserService;
import com.arda.carRegistrationSystem.core.utilities.DataResult;
import com.arda.carRegistrationSystem.core.utilities.Result;
import com.arda.carRegistrationSystem.entities.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UsersController {

    private final IUserService userService;

    public UsersController(IUserService userService) {
        this.userService = userService;
    }

    @GetMapping()
    public DataResult<List<User>>getAllUsers(){
        return userService.getAllUser();
    }

    @GetMapping("/{userId}")
    public DataResult<User> getById(@PathVariable int userId){
        return userService.getById(userId);

    }



    @PostMapping
    public DataResult<User> createOneUser(@RequestBody CreateUserRequest createUserRequest){
        return userService.createOneUser(createUserRequest);
    }

    @PutMapping("/{userId}")
    public ChangePasswordResponse updateOneUser(@PathVariable int userId, @RequestBody ChangePasswordUserRequest changePasswordUserRequest){
        return userService.updateOneUser(userId,changePasswordUserRequest);
    }

    @DeleteMapping("/{userId}")
    public Result removeById(@PathVariable int userId){
        return userService.removeById(userId);
    }
}
