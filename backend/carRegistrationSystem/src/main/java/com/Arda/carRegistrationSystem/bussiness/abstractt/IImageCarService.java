package com.arda.carRegistrationSystem.bussiness.abstractt;


import com.arda.carRegistrationSystem.DTOs.request.ImageAddRequest;
import com.arda.carRegistrationSystem.DTOs.response.ImageResponse;
import com.arda.carRegistrationSystem.core.utilities.DataResult;

import java.util.List;
import java.util.Optional;

public interface IImageCarService {
    DataResult<List<ImageResponse>> getAllOrByCarId(Optional<Integer> carId);

    DataResult<ImageResponse> getImageById(int imageId);

    DataResult<ImageResponse> addOneImage(ImageAddRequest imageAddRequest);

    DataResult<Integer> removeOneImage(int imageId);
}
