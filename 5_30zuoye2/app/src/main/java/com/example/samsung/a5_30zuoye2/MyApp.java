package com.example.samsung.a5_30zuoye2;

import android.app.Application;

/**
 * Created by samsung on 2019/5/30.
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
