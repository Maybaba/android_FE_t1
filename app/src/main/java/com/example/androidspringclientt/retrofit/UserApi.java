package com.example.androidspringclientt.retrofit;

import com.example.androidspringclientt.model.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface UserApi {

    @GET("/user/getAllUsers")
    Call<List<User>> getAllUsers();

    @POST("/user/save")
    Call<User> save(@Body User user);

}
