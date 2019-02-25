package com.company.temp;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.http.GET;

import java.io.IOException;

public class but {

    public static void main(String[] args) {

        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://min-api.cryptocompare.com/")
                .build();


        Api api = retrofit.create(Api.class);

        Call<ResponseBody> call = api.load();
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    String responseRaw = new String(response.body().bytes());
                    FullResponse fullResponse = gson.fromJson(responseRaw, FullResponse.class);
                    System.out.println(fullResponse.Data);

                    int i = 0;
                    while (i < fullResponse.Data.size()) {
                        ChartObject o = fullResponse.Data.get(i);
                    }
                    System.out.println(new String(response.body().bytes()));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable throwable) {
                System.out.println("error");
            }
        });


    }

}
