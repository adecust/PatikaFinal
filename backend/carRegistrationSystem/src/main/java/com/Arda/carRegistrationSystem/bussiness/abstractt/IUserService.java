package com.arda.carRegistrationSystem.bussiness.abstractt;

import com.arda.carRegistrationSystem.DTOs.request.ChangePasswordUserRequest;
import com.arda.carRegistrationSystem.DTOs.request.CreateUserRequest;
import com.arda.carRegistrationSystem.DTOs.response.ChangePasswordResponse;
import com.arda.carRegistrationSystem.core.utilities.DataResult;
import com.arda.carRegistrationSystem.core.utilities.Result;
import com.arda.carRegistrationSystem.entities.User;

import java.util.List;

public interface IUserService {
    DataResult<List<User>> getAllUser();

    DataResult<User> getById(int userId);

    DataResult<User> getByUserName(String userName);

    DataResult<User> createOneUser(CreateUserRequest createUserRequest);

   ChangePasswordResponse updateOneUser(int userId, ChangePasswordUserRequest changePasswordUserRequest);

    Result removeById(int userId);
}
