package com.arda.carRegistrationSystem.api;

import com.arda.carRegistrationSystem.DTOs.request.CreateCarRequest;
import com.arda.carRegistrationSystem.DTOs.request.UpdateCarRequest;
import com.arda.carRegistrationSystem.DTOs.response.CarResponse;
import com.arda.carRegistrationSystem.bussiness.abstractt.ICarService;
import com.arda.carRegistrationSystem.core.utilities.DataResult;
import com.arda.carRegistrationSystem.entities.Car;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cars")
public class CarsController {
    private final ICarService carService;

    public CarsController(ICarService carService) {
        this.carService = carService;
    }

    @GetMapping
    public DataResult<List<CarResponse>> getAllCarsOrfindByUserIdOrBrandOrModel
            (@RequestParam Optional<Integer> userId,@RequestParam Optional<String> brand,@RequestParam Optional<String> modal){
        return carService.getAllCarsOrfindByUserIdOrBrandOrModel(userId,modal,brand);
    }


    @GetMapping("/{carId}")
    public DataResult<CarResponse> getOneCarsById(@PathVariable int carId){
        return carService.getOneCarsByIdApi(carId);
    }

    @PostMapping
    public DataResult<Car> createOneCar(@RequestBody CreateCarRequest createCarRequest){
        return carService.createOneCar(createCarRequest);
    }

    @PutMapping("/{carId}")
    public DataResult<Car> updateOneCar(@PathVariable int carId,@RequestBody UpdateCarRequest UpdateCarRequest){
        return carService.updateOneCar(carId,UpdateCarRequest);
    }

    @DeleteMapping("{carId}")
    public DataResult<Integer> removeById(@PathVariable int carId){
        return carService.removeById(carId);
    }
}
