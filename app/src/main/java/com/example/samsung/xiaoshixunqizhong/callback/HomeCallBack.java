package com.example.samsung.xiaoshixunqizhong.callback;

import com.example.samsung.xiaoshixunqizhong.bean.Home;

import java.util.List;

/**
 * Created by samsung on 2019/6/13.
 */

public interface HomeCallBack {
    void onSuccess(List<Home> list);

    void onFail(String error);
}
