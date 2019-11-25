package com.example.gzj_moileshop.http.perdenter;


import com.example.gzj_moileshop.http.entity.GoodsEntity;
import com.example.gzj_moileshop.HttpMethods;
import rx.Observable;
import rx.Subscriber;

import java.util.List;

public class GoodsPresenter extends HttpMethods {
    public static void listByKeywords(Subscriber<List<GoodsEntity>> subscriber, String keywords){
        Observable<List<GoodsEntity>> observable = goodsService.listByKeywords(keywords)
                .map(new HttpResultFunc<List<GoodsEntity>>());
        toSubscribe(observable,subscriber);
    }

    public static void list(Subscriber<List<GoodsEntity>> subscriber,int catId){
        Observable<List<GoodsEntity>>observable = goodsService.list(catId).map(new HttpResultFunc<List<GoodsEntity>>());
        toSubscribe(observable,subscriber);
    }
}