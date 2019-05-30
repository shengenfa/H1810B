package com.example.samsung.a5_30zuoye1.callback;

import com.example.samsung.a5_30zuoye1.bean.Attention;
import com.example.samsung.a5_30zuoye1.bean.HomeBean;

import java.util.List;

/**
 * Created by samsung on 2019/5/30.
 */

public interface AttentionCallBack {
    void onSuccess(List<Attention.ResultBean.DataBean> beanList);

    void onFail(String error);
}
