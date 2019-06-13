package com.example.samsung.xiaoshixunqizhong.utils;

import com.example.samsung.xiaoshixunqizhong.MyApp;
import com.example.samsung.xiaoshixunqizhong.bean.Home;
import com.example.samsung.xiaoshixunqizhong.dao.DaoMaster;
import com.example.samsung.xiaoshixunqizhong.dao.DaoSession;
import com.example.samsung.xiaoshixunqizhong.dao.HomeDao;

import java.util.List;

/**
 * Created by samsung on 2019/6/13.
 */

public class DbHelper {
    private static DbHelper dbHelper;
    private final HomeDao homeDao;

    public static synchronized DbHelper getDbHelper() {
        if (dbHelper == null) {
            synchronized (DbHelper.class) {
                if (dbHelper == null) {
                    dbHelper = new DbHelper();
                }
            }
        }
        return dbHelper;
    }

    public DbHelper() {
        DaoMaster.DevOpenHelper devOpenHelper = new DaoMaster.DevOpenHelper(MyApp.getMyApp(), "sch.db");
        DaoMaster daoMaster = new DaoMaster(devOpenHelper.getReadableDb());
        DaoSession daoSession = daoMaster.newSession();
        homeDao = daoSession.getHomeDao();
    }

    public void insert(Home home) {
        homeDao.insertOrReplace(home);
    }

    public List<Home> query() {
        return homeDao.queryBuilder().list();
    }

}
