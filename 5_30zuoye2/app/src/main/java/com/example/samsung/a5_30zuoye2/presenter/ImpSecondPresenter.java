package com.example.samsung.a5_30zuoye2.presenter;

import com.example.samsung.a5_30zuoye2.bean.Home;
import com.example.samsung.a5_30zuoye2.bean.SecondBean;
import com.example.samsung.a5_30zuoye2.callback.HomeCallBack;
import com.example.samsung.a5_30zuoye2.callback.SecondCallBack;
import com.example.samsung.a5_30zuoye2.model.HomeModel;
import com.example.samsung.a5_30zuoye2.model.SecondModel;
import com.example.samsung.a5_30zuoye2.view.HomeView;
import com.example.samsung.a5_30zuoye2.view.SecondView;

import java.util.List;

/**
 * Created by samsung on 2019/5/30.
 */

public class ImpSecondPresenter implements HomePresenter, SecondCallBack {
    private SecondModel homeModel;
    private SecondView homeView;

    public ImpSecondPresenter(SecondModel homeModel, SecondView homeView) {
        this.homeModel = homeModel;
        this.homeView = homeView;
    }

    @Override
    public void getData() {
        if (homeModel != null) {
            homeModel.getData(this);
        }
    }

    @Override
    public void onSuccess(List<SecondBean.ResultBean.DataBean> dataBeanList) {
        if (homeView != null) {
            homeView.onSuccess(dataBeanList);
        }
    }

    @Override
    public void onFail(String error) {
        if (homeView != null) {
            homeView.onFail(error);
        }
    }
}
