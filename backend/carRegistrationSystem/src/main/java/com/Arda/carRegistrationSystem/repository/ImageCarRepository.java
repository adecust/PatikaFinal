package com.arda.carRegistrationSystem.repository;

import com.arda.carRegistrationSystem.entities.ImageCar;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ImageCarRepository extends JpaRepository<ImageCar,Integer> {
    List<ImageCar> findByCarId(Integer carId);
}
