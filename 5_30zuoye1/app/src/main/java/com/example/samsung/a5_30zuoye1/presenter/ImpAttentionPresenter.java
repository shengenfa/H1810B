package com.example.samsung.a5_30zuoye1.presenter;

import com.example.samsung.a5_30zuoye1.bean.Attention;
import com.example.samsung.a5_30zuoye1.bean.HomeBean;
import com.example.samsung.a5_30zuoye1.callback.AttentionCallBack;
import com.example.samsung.a5_30zuoye1.callback.HomeCallBack;
import com.example.samsung.a5_30zuoye1.model.AttentionModel;
import com.example.samsung.a5_30zuoye1.model.HomeModel;
import com.example.samsung.a5_30zuoye1.view.AttentionView;
import com.example.samsung.a5_30zuoye1.view.HomeView;

import java.util.List;

/**
 * Created by samsung on 2019/5/30.
 */

public class ImpAttentionPresenter implements AttentionPresenter, AttentionCallBack {
    private AttentionModel homeModel;
    private AttentionView homeView;

    public ImpAttentionPresenter(AttentionModel homeModel, AttentionView homeView) {
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
    public void onSuccess(List<Attention.ResultBean.DataBean> beanList) {
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
