package com.masbie.qr_code_scanner_ptk;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface JsonPlaceHolder {

//    @GET("detail?ptk_id=")
@GET("detail")
//@GET("detail?ptk_id=20253484185001")
    Call<GetPost> getPosts(@Query("ptk_id") String ptk_id);
//Call<GetPost> getPosts();
}
