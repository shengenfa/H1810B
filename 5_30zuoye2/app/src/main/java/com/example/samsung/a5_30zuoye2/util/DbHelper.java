package com.example.samsung.a5_30zuoye2.util;

import com.example.samsung.a5_30zuoye2.MyApp;
import com.example.samsung.a5_30zuoye2.bean.ShuJu;
import com.example.samsung.a5_30zuoye2.dao.DaoMaster;
import com.example.samsung.a5_30zuoye2.dao.DaoSession;
import com.example.samsung.a5_30zuoye2.dao.ShuJuDao;

import java.util.List;

/**
 * Created by samsung on 2019/5/30.
 */

public class DbHelper {
    private static DbHelper dbHelper;
    private final ShuJuDao shuJuDao;

    public synchronized static DbHelper getDbHelper() {
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
        DaoMaster.DevOpenHelper devOpenHelper = new DaoMaster.DevOpenHelper(MyApp.getMyApp(), "sj.db");
        DaoMaster daoMaster = new DaoMaster(devOpenHelper.getWritableDb());
        DaoSession daoSession = daoMaster.newSession();
        shuJuDao = daoSession.getShuJuDao();
    }

    public List<ShuJu> query() {
        return shuJuDao.queryBuilder().list();
    }

    public long add(ShuJu shuJu) {
        if (!isHash(shuJu)) {
            long l = shuJuDao.insertOrReplace(shuJu);
            return l;
        }
        return -1;
    }

    private boolean isHash(ShuJu shuJu) {
        List<ShuJu> list = shuJuDao.queryBuilder().where(ShuJuDao.Properties.Img.eq(shuJu.getImg())).list();
        if (list != null && list.size() > 0) {
            return true;
        }
        return false;
    }
}
