package com.example.samsung.a5_30zuoye2.model;

import com.example.samsung.a5_30zuoye2.bean.Home;
import com.example.samsung.a5_30zuoye2.bean.SecondBean;
import com.example.samsung.a5_30zuoye2.callback.HomeCallBack;
import com.example.samsung.a5_30zuoye2.callback.SecondCallBack;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

/**
 * Created by samsung on 2019/5/30.
 */

public class ImpSecondModel implements SecondModel {
    @Override
    public void getData(final SecondCallBack homeCallBack) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                Gson gson = new GsonBuilder().serializeNulls().create();
                SecondBean home = gson.fromJson("{\n" +
                        "    \"error_code\": 0,\n" +
                        "    \"reason\": \"Success\",\n" +
                        "    \"result\": {\n" +
                        "        \"data\": [\n" +
                        "            {\n" +
                        "                \"content\": \"谁动了我的冰箱！\",\n" +
                        "                \"hashId\": \"DDE51B6C09E1557D6542627755901308\",\n" +
                        "                \"unixtime\": 1418967626,\n" +
                        "                \"updatetime\": \"2014-12-19 13:40:26\",\n" +
                        "                \"url\": \"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1512967778547&di=279f3fbe17e44cf9fbbd7dcc7c609940&imgtype=0&src=http%3A%2F%2Fimg3.redocn.com%2Ftupian%2F20141128%2Flushuizhudu_3495981.jpg\"\n" +
                        "            },\n" +
                        "            {\n" +
                        "                \"content\": \"这鱼我怎么抓不到？\",\n" +
                        "                \"hashId\": \"B0C3ABBEBBE0A6EA5B8FE04E27215FBC\",\n" +
                        "                \"unixtime\": 1418965236,\n" +
                        "                \"updatetime\": \"2014-12-19 13:00:36\",\n" +
                        "                \"url\": \"https://timgsa.baidu.com/timg?image&quality=80&size=b10000_10000&sec=1512957696&di=355ae4973e31ee432f4d6d700cf01a0d&src=http://pic.baike.soso.com/p/20140708/20140708162513-1055949871.jpg\"\n" +
                        "            },\n" +
                        "            {\n" +
                        "                \"content\": \"期末考试了，送各位学生党一张图\",\n" +
                        "                \"hashId\": \"B9EBF01A3C718DABB4C166356CC839A8\",\n" +
                        "                \"unixtime\": 1418964026,\n" +
                        "                \"updatetime\": \"2014-12-19 12:40:26\",\n" +
                        "                \"url\": \"https://timgsa.baidu.com/timg?image&quality=80&size=b10000_10000&sec=1512957696&di=bc93bdbefc207f1076c0a27ab3dac8f1&src=http://imgsrc.baidu.com/baike/pic/item/8326cffc1e178a829bec9484f403738da877e8c6.jpg\"\n" +
                        "            },\n" +
                        "            {\n" +
                        "                \"content\": \"云雨过后，男友抱着我说“想想咱俩还真是有缘”　　“可不是吗，咋俩小学同校，初中同班，高中同桌，大学同寝”\",\n" +
                        "                \"hashId\": \"62287B57ED97B8A06861ADA51D921CEB\",\n" +
                        "                \"unixtime\": 1418962826,\n" +
                        "                \"updatetime\": \"2014-12-19 12:20:26\",\n" +
                        "                \"url\": \"https://timgsa.baidu.com/timg?image&quality=80&size=b10000_10000&sec=1512957696&di=1f23394b2d49e0b9da1e31be08b82621&src=http://pic6.nipic.com/20100313/1700216_170733595053_2.jpg\"\n" +
                        "            },\n" +
                        "            {\n" +
                        "                \"content\": \"自从有了这个装置，妈妈再也不担心我的起床了！\",\n" +
                        "                \"hashId\": \"E005FFD7C7A9C80F1C0E8EEF3F44DB71\",\n" +
                        "                \"unixtime\": 1418961624,\n" +
                        "                \"updatetime\": \"2014-12-19 12:00:24\",\n" +
                        "                \"url\": \"https://timgsa.baidu.com/timg?image&quality=80&size=b10000_10000&sec=1512957696&di=0c877df0589d7411abe2793e220d528e&src=http://pic23.nipic.com/20120809/10508666_135717287167_2.jpg\"\n" +
                        "            }\n" +
                        "        ]\n" +
                        "    }\n" +
                        "}", SecondBean.class);
                if (home != null) {
                    List<SecondBean.ResultBean.DataBean> data = home.getResult().getData();
                    homeCallBack.onSuccess(data);
                } else {
                    homeCallBack.onFail("获取数据为空");
                }
            }
        }).start();
    }
}
