package com.example.test2project.Activity.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.test2project.Activity.Interface.Api;
import com.example.test2project.Activity.Model.GetSmsModel;
import com.example.test2project.R;


import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {





    GetSmsModel getSmsModel;
    TextView textView;
    EditText editText;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        editText=findViewById(R.id.phone);
        textView=findViewById(R.id.txt_login);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                Retrofit retrofit = new Retrofit.Builder().baseUrl("http://testapinetbar.netbar.ir/api/Verification/")
                        .addConverterFactory(GsonConverterFactory.create()).build();
                Api api = retrofit.create(Api.class);
                Call<GetSmsModel> call = api.getsms(editText.getText().toString(), "User", "",
                        "");
                call.enqueue(new Callback<GetSmsModel>() {
                    @Override
                    public void onResponse(Call<GetSmsModel> call, Response<GetSmsModel> response) {
                        if (response.isSuccessful()) {

                            if (response.body().getStatus()) {
                                Intent myIntent = new Intent(MainActivity.this, GetSmsActivity.class);
                                MainActivity.this.startActivity(myIntent);
                            }
                        }


                    }


                    @Override
                    public void onFailure(Call<GetSmsModel> call, Throwable t) {

                    }
                });

            }
        });



    }
}