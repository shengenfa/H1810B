package com.example.samsung.xiaoshixunqizhong;

import android.app.Application;

/**
 * Created by samsung on 2019/6/13.
 */

public class MyApp extends Application{
    private static MyApp myApp;
    @Override
    public void onCreate() {
        super.onCreate();
        myApp=this;
    }

    public static MyApp getMyApp() {
        return myApp;
    }
}
