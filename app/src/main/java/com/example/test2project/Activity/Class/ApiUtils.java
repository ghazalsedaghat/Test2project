package com.example.test2project.Activity.Class;

import com.google.android.gms.common.api.Api;

public class ApiUtils {
    private ApiUtils (){}
    public static final String BASE_URL=("https://testapinetbar.netbar.ir/api/");

    public static Api getAPI() {
        return RetrofitClient.getClient(BASE_URL).create(Api.class);
    }
}


