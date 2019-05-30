package com.example.samsung.a5_30zuoye1.presenter;

import com.example.samsung.a5_30zuoye1.bean.HomeBean;
import com.example.samsung.a5_30zuoye1.callback.HomeCallBack;
import com.example.samsung.a5_30zuoye1.fragment.SchoolFragment;
import com.example.samsung.a5_30zuoye1.model.HomeModel;
import com.example.samsung.a5_30zuoye1.model.ImpHomeModel;
import com.example.samsung.a5_30zuoye1.view.HomeView;

import java.util.List;

/**
 * Created by samsung on 2019/5/30.
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
        if (homeModel != null) {
            homeModel.getData(this);
        }
    }

    @Override
    public void onSuccess(List<HomeBean.ResultBean.ListBean> beanList) {
        if (homeView != null) {
            homeView.onSuccess(beanList);
        }
    }

    @Override
    public void onFail(String error) {
        if (homeView != null) {
            homeView.onFail(error);
        }
    }
}
