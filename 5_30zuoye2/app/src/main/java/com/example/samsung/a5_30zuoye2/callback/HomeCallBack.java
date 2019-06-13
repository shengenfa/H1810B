package com.example.samsung.a5_30zuoye2.callback;

import com.example.samsung.a5_30zuoye2.bean.Home;

import java.util.List;

/**
 * Created by samsung on 2019/5/30.
 */

public interface HomeCallBack {
    void onSuccess(List<Home.ResultBean.DataBean> dataBeanList);

    void onFail(String error);
}
