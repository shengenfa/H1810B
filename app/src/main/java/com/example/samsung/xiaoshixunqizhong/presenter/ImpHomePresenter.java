package com.example.samsung.xiaoshixunqizhong.presenter;

import com.example.samsung.xiaoshixunqizhong.bean.Home;
import com.example.samsung.xiaoshixunqizhong.callback.HomeCallBack;
import com.example.samsung.xiaoshixunqizhong.model.HomeModel;
import com.example.samsung.xiaoshixunqizhong.view.HomeView;

import java.util.List;

/**
 * Created by samsung on 2019/6/13.
 */

public class ImpHomePresenter implements HomePresenter, HomeCallBack {
    private HomeModel homeModel;
    private HomeView homeView;

    public ImpHomePresenter(HomeModel homeModel, HomeView homeView) {
        this.homeModel = homeModel;
        this.homeView = homeView;
    }

    @Override
    public void getData() {
        if (homeModel!=null){
            homeModel.getData(this);
        }
    }

    @Override
    public void onSuccess(List<Home> home) {
        if (homeView!=null){
            homeView.onSuccess(home);
        }
    }

    @Override
    public void onFail(String error) {
        if (homeView!=null){
            homeView.onFail(error);
        }
    }
}
