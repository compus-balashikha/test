package com.company.temp;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {
    @GET("/data/histominute?fsym=BTC&tsym=GBP&limit=10&api_key=b534b119d464723254ef55fcb3f1192e0c36d4d25a983ce487992dc2d9292f15")
    Call<ResponseBody> load();
}
