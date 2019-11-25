package com.example.gzj_moileshop.http.service;

import com.example.gzj_moileshop.http.entity.CategoryEntity;
import com.example.gzj_moileshop.http.entity.HttpResult;
import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

import java.util.List;

public interface CategoryService {



    @GET("cat")
    Observable<HttpResult<List<CategoryEntity>>> getTopList();


    @GET("cat/parent/{parentId}")
    Observable<HttpResult<List<CategoryEntity>>> getSecondList(@Path("parentId") int parentId);

}
