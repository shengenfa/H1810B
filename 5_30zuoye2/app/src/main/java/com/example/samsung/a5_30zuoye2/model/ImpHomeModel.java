package com.example.samsung.a5_30zuoye2.model;

import com.example.samsung.a5_30zuoye2.bean.Home;
import com.example.samsung.a5_30zuoye2.callback.HomeCallBack;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

/**
 * Created by samsung on 2019/5/30.
 */

public class ImpHomeModel implements HomeModel {
    @Override
    public void getData(final HomeCallBack homeCallBack) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                Gson gson = new GsonBuilder().serializeNulls().create();
                Home home = gson.fromJson("{\n" +
                        "    \"error_code\": 0,\n" +
                        "    \"reason\": \"Success\",\n" +
                        "    \"result\": {\n" +
                        "        \"data\": [\n" +
                        "            {\n" +
                        "                \"content\": \"谁动了我的冰箱！\",\n" +
                        "                \"hashId\": \"DDE51B6C09E1557D6542627755901308\",\n" +
                        "                \"unixtime\": 1418967626,\n" +
                        "                \"updatetime\": \"2014-12-19 13:40:26\",\n" +
                        "                \"url1\": \"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1512966715871&di=66a99bc6b3ae7c1f3a1a96abbd6d0fe9&imgtype=0&src=http%3A%2F%2Fimgsrc.baidu.com%2Fimgad%2Fpic%2Fitem%2Ff603918fa0ec08fae0b1528f52ee3d6d55fbda61.jpg\"\n" +
                        "            },\n" +
                        "            {\n" +
                        "                \"content\": \"这鱼我怎么抓不到？\",\n" +
                        "                \"hashId\": \"B0C3ABBEBBE0A6EA5B8FE04E27215FBC\",\n" +
                        "                \"unixtime\": 1418965236,\n" +
                        "                \"updatetime\": \"2014-12-19 13:00:36\",\n" +
                        "                \"url1\": \"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1512966715872&di=7399b2f9f788dbf99243abbc3bffe4c2&imgtype=0&src=http%3A%2F%2Fimgsrc.baidu.com%2Fimgad%2Fpic%2Fitem%2Fb17eca8065380cd708ae52d1aa44ad345982815e.jpg\"\n" +
                        "            },\n" +
                        "            {\n" +
                        "                \"content\": \"期末考试了，送各位学生党一张图\",\n" +
                        "                \"hashId\": \"B9EBF01A3C718DABB4C166356CC839A8\",\n" +
                        "                \"unixtime\": 1418964026,\n" +
                        "                \"updatetime\": \"2014-12-19 12:40:26\",\n" +
                        "                \"url1\": \"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1512966715873&di=fb80d0116d5d016ebe8480a0acd1133a&imgtype=0&src=http%3A%2F%2Fimgsrc.baidu.com%2Fimgad%2Fpic%2Fitem%2Ff7246b600c3387447d2db0ff5b0fd9f9d62aa04d.jpg\"\n" +
                        "            },\n" +
                        "            {\n" +
                        "                \"content\": \"云雨过后，男友抱着我说“想想咱俩还真是有缘”　　“可不是吗，咋俩小学同校，初中同班，高中同桌，大学同寝”\",\n" +
                        "                \"hashId\": \"62287B57ED97B8A06861ADA51D921CEB\",\n" +
                        "                \"unixtime\": 1418962826,\n" +
                        "                \"updatetime\": \"2014-12-19 12:20:26\",\n" +
                        "                \"url1\": \"http://p9.pstatp.com/origin/19fc00007f27b4c9ead9\"\n" +
                        "            },\n" +
                        "            {\n" +
                        "                \"content\": \"自从有了这个装置，妈妈再也不担心我的起床了！\",\n" +
                        "                \"hashId\": \"E005FFD7C7A9C80F1C0E8EEF3F44DB71\",\n" +
                        "                \"unixtime\": 1418961624,\n" +
                        "                \"updatetime\": \"2014-12-19 12:00:24\",\n" +
                        "                \"url1\": \"https://cdn.kaishuhezi.com/kstory/story/image/03913a1d-5b97-48b6-9f0b-d4b8339cb480.jpg\"\n" +
                        "            },\n" +
                        "            {\n" +
                        "                \"content\": \"那些神馬有錢任性的都弱爆了，前幾天在銀行辦理業務，一哥們走到櫃檯，哥們：“給我取30萬，謝謝！”一會兒工作人員就說：“先生，對不起！卡上餘額不足。”只見這哥們悠悠衝懷裡掏出手槍：“沒辦法有槍就是任性！！”我想說哥們你搶劫就搶劫，裝神馬B！\",\n" +
                        "                \"hashId\": \"E3070767518CB4DFEA708DCCC332EE2F\",\n" +
                        "                \"unixtime\": 1418960433,\n" +
                        "                \"updatetime\": \"2014-12-19 11:40:33\",\n" +
                        "                \"url1\": \"http://p1.pstatp.com/origin/19fc00007f26052f7da0\",\n" +
                        "                \"url2\": \"http://p3.pstatp.com/origin/19fb00025352da4724b1\"\n" +
                        "            }\n" +
                        "        ]\n" +
                        "    }\n" +
                        "}", Home.class);
                if (home != null) {
                    List<Home.ResultBean.DataBean> data = home.getResult().getData();
                    homeCallBack.onSuccess(data);
                } else {
                    homeCallBack.onFail("获取数据为空");
                }
            }
        }).start();
    }
}
