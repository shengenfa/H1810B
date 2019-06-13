package com.example.samsung.a5_30zuoye1.view;

import com.example.samsung.a5_30zuoye1.bean.HomeBean;

import java.util.List;

/**
 * Created by samsung on 2019/5/30.
 */

public interface HomeView {
    void onSuccess(List<HomeBean.ResultBean.ListBean> beanList);

    void onFail(String error);
}
