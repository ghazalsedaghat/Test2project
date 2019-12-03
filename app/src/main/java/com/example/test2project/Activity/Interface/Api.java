package com.example.test2project.Activity.Interface;


import com.example.test2project.Activity.Model.GetSmsModel;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface Api {




    @GET("GetSms")
    Call<GetSmsModel> getsms(@Query("PhoneNumber") String PhoneNumber
            , @Query("userType") String userType,
                             @Query("invitationCode")String invitationCode,
                             @Query("OperationSystemEnum")String OperationSystemEnum);






}


