package com.example.samsung.a5_30zuoye2.view;

import com.example.samsung.a5_30zuoye2.bean.Home;
import com.example.samsung.a5_30zuoye2.bean.SecondBean;

import java.util.List;

/**
 * Created by samsung on 2019/5/30.
 */

public interface SecondView {
    void onSuccess(List<SecondBean.ResultBean.DataBean> dataBeanList);

    void onFail(String error);
}
