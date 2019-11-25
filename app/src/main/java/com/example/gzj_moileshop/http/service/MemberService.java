package com.example.gzj_moileshop.http.service;

import com.example.gzj_moileshop.http.entity.HttpResult;
import com.example.gzj_moileshop.http.entity.MemberEntity;
import retrofit2.http.*;
import rx.Observable;

public interface MemberService {

    @FormUrlEncoded
    @POST("member/login2")
    Observable<HttpResult<MemberEntity>> login2(
            @Field("input") String input,
            @Field("password") String password

    );


    @FormUrlEncoded
    @POST("member")
    Observable<HttpResult<MemberEntity>> register(
            @Field("uname") String uname,
            @Field("password") String password,
            @Field("email") String email

    );

    @FormUrlEncoded
    @PUT("member/{memberId}")
    Observable<HttpResult> changePassword(
            @Path("memberId") String memberId,
            @Query("old_pwd") String old_pwd,
            @Query("new_pwd") String new_pwd
    );
}