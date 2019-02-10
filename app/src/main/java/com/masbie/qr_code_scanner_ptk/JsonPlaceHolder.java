package com.masbie.qr_code_scanner_ptk;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
public interface JsonPlaceHolder {

//    @GET("detail?ptk_id=")
//@GET("detail")
@GET("detail?ptk_id=20253484185001")
    Call<List<GetPost>> getPosts();
}
