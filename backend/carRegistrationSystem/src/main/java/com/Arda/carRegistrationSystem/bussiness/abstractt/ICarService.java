package com.arda.carRegistrationSystem.bussiness.abstractt;

import com.arda.carRegistrationSystem.DTOs.request.CreateCarRequest;
import com.arda.carRegistrationSystem.DTOs.request.UpdateCarRequest;
import com.arda.carRegistrationSystem.DTOs.response.CarResponse;
import com.arda.carRegistrationSystem.core.utilities.DataResult;
import com.arda.carRegistrationSystem.entities.Car;

import java.util.List;
import java.util.Optional;

public interface ICarService {
    DataResult<List<CarResponse>> getAllCarsOrfindByUserIdOrBrandOrModel(Optional<Integer> userId, Optional<String> modal, Optional<String> brand);

    DataResult<Car> getOneCarsByIdHelp(int carId);
    DataResult<CarResponse> getOneCarsByIdApi(int carId);


    DataResult<Car> createOneCar(CreateCarRequest createCarRequest);

    DataResult<Car> updateOneCar(int carId, UpdateCarRequest updateCarRequest);

    DataResult<Integer> removeById(int carId);
}
