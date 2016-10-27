package com.miralak.basicaccelerometer.api;

import com.miralak.basicaccelerometer.model.Acceleration;
import com.miralak.basicaccelerometer.model.TrainingAcceleration;

import retrofit.client.Response;
import retrofit.http.Body;
import retrofit.http.POST;

public interface CassandraRestApi {

    @POST("/acceleration")
    Response sendAccelerationValues(@Body Acceleration acceleration);


    @POST("/training")
    Response sendTrainingAccelerationValues(@Body TrainingAcceleration trainingAcceleration);


}
