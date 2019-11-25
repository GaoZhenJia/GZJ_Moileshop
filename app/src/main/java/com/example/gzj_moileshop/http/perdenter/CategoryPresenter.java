package com.example.gzj_moileshop.http.perdenter;

import com.example.gzj_moileshop.http.entity.CategoryEntity;
import com.example.gzj_moileshop.HttpMethods;
import rx.Observable;
import rx.Subscriber;

import java.util.List;

public class CategoryPresenter extends HttpMethods {

    public static void getTopList(Subscriber<List<CategoryEntity>> subscriber){
        Observable<List<CategoryEntity>> observable = categoryService.getTopList()
                .map(new HttpResultFunc<List<CategoryEntity>>());
        toSubscribe(observable,subscriber);
    }

    public static void getSecondList(Subscriber<List<CategoryEntity>> subscriber,int parentId){
        Observable<List<CategoryEntity>> observable = categoryService.getSecondList(parentId)
                .map(new HttpResultFunc<List<CategoryEntity>>());
        toSubscribe(observable,subscriber);
    }


}