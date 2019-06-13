package com.example.samsung.xiaoshixunqizhong.model;

import com.example.samsung.xiaoshixunqizhong.bean.Home;
import com.example.samsung.xiaoshixunqizhong.callback.HomeCallBack;
import com.example.samsung.xiaoshixunqizhong.utils.DbHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by samsung on 2019/6/13.
 */

public class ImpHomeModel implements HomeModel {
    @Override
    public void getData(final HomeCallBack homeCallBack) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    Home home = new Home();
                    home.setContent("一堆小学生在班里认真学习，埋头苦干" + i);
                    home.setHtml("http://mini.eastday.com/mobile/190613111051217.html");
                    home.setTitle("校园学习情况" + i);
                    home.setImg("http://05imgmini.eastday.com/mobile/20190613/2019061311_4d03bd59768f49c1906076635ad9e774_5172_cover_mwpm_03200403.jpg");
                    DbHelper.getDbHelper().insert(home);
                }
                List<Home> query = DbHelper.getDbHelper().query();
                if (query != null && query.size() > 0) {
                    homeCallBack.onSuccess(query);
                } else {
                    homeCallBack.onFail("查询数据为空");
                }
            }
        }).start();

    }
}
