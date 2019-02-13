package com.masbie.qr_code_scanner_ptk;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.GET;
import retrofit2.http.Query;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

public interface JsonPlaceHolder {

//    @GET("detail?ptk_id=")
@GET("detail?")
//@ByRegExp("member_.+")
//@GET("detail?ptk_id=20253484185001")
    Call<GetPost> getPosts(@Query("ptk_id") String ptk_id);
//Call<GetPost> getPosts();
//@Retention(RUNTIME)
//@Target(METHOD)
//@interface ByRegExp {
//
//    String value();
//
//}
}
