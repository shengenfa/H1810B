package com.example.samsung.a5_30zuoye1.model;

import com.example.samsung.a5_30zuoye1.bean.Attention;
import com.example.samsung.a5_30zuoye1.bean.HomeBean;
import com.example.samsung.a5_30zuoye1.callback.AttentionCallBack;
import com.example.samsung.a5_30zuoye1.callback.HomeCallBack;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

/**
 * Created by samsung on 2019/5/30.
 */

public class ImpAttentionModel implements AttentionModel {
    @Override
    public void getData(final AttentionCallBack homeCallBack) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                Gson gson = new GsonBuilder().serializeNulls().create();
                Attention homeBean = gson.fromJson("{\n" +
                        "    \"error_code\": 0,\n" +
                        "    \"reason\": \"成功的返回\",\n" +
                        "    \"result\": {\n" +
                        "        \"data\": [\n" +
                        "            {\n" +
                        "                \"author_name\": \"新华国际头条\",\n" +
                        "                \"category\": \"头条\",\n" +
                        "                \"date\": \"2017-11-09 18:04\",\n" +
                        "                \"thumbnail_pic_s\": \"http://03.imgmini.eastday.com/mobile/20171109/20171109180455_d41d8cd98f00b204e9800998ecf8427e_5_mwpm_03200403.jpg\",\n" +
                        "                \"thumbnail_pic_s02\": \"http://03.imgmini.eastday.com/mobile/20171109/20171109180455_d41d8cd98f00b204e9800998ecf8427e_3_mwpm_03200403.jpg\",\n" +
                        "                \"title\": \"俄罗斯女记者参加总统选举 闹着玩还是来真的？\",\n" +
                        "                \"uniquekey\": \"685d0fccd3f5ea3014d7ab0215fecb5f\",\n" +
                        "                \"url\": \"http://mini.eastday.com/mobile/171109180455164.html\"\n" +
                        "            },\n" +
                        "            {\n" +
                        "                \"author_name\": \"人民网\",\n" +
                        "                \"category\": \"头条\",\n" +
                        "                \"date\": \"2017-11-09 18:03\",\n" +
                        "                \"thumbnail_pic_s\": \"http://01.imgmini.eastday.com/mobile/20171109/20171109180324_0338994e5dcfa065d66d13cf701ccff3_1_mwpm_03200403.jpg\",\n" +
                        "                \"thumbnail_pic_s02\": \"http://01.imgmini.eastday.com/mobile/20171109/20171109180324_8550569f222233a015e1cd7d70d2f2d4_2_mwpm_03200403.jpg\",\n" +
                        "                \"title\": \"拥抱岘港的碧海蓝天 \",\n" +
                        "                \"uniquekey\": \"5f32d44a161e65acb4db3a90f41379d1\",\n" +
                        "                \"url\": \"http://mini.eastday.com/mobile/171109180324333.html\"\n" +
                        "            },\n" +
                        "            {\n" +
                        "                \"author_name\": \"人民网\",\n" +
                        "                \"category\": \"头条\",\n" +
                        "                \"date\": \"2017-11-09 17:55\",\n" +
                        "                \"thumbnail_pic_s\": \"http://07.imgmini.eastday.com/mobile/20171109/20171109175525_4b706e469917a5184710455305391da5_4_mwpm_03200403.jpg\",\n" +
                        "                \"thumbnail_pic_s02\": \"http://07.imgmini.eastday.com/mobile/20171109/20171109175525_cc33bfe071a38cc75687f5e62d840b96_5_mwpm_03200403.jpg\",\n" +
                        "                \"title\": \"学习贯彻党的十九大精神 中央宣讲团宣讲报告会在郑举行\",\n" +
                        "                \"uniquekey\": \"2fe32f3da298fe335a3305ee53a30e39\",\n" +
                        "                \"url\": \"http://mini.eastday.com/mobile/171109175525809.html\"\n" +
                        "            },\n" +
                        "            {\n" +
                        "                \"author_name\": \"人民网\",\n" +
                        "                \"category\": \"头条\",\n" +
                        "                \"date\": \"2017-11-09 17:45\",\n" +
                        "                \"thumbnail_pic_s\": \"http://01.imgmini.eastday.com/mobile/20171109/20171109174515_58ca65a50f6c0be854a7daa51ddeee9e_1_mwpm_03200403.jpg\",\n" +
                        "                \"thumbnail_pic_s03\": \"http://05.imgmini.eastday.com/mobile/20171109/20171109174110_0c23c9c3a52033063a7af8c11880cf32_8_mwpm_03200403.jpg\",\n" +
                        "                \"title\": \"河南出台供暖管理办法 暖气不热可减免费用\",\n" +
                        "                \"uniquekey\": \"1d1e5e0826f08c0d6a43cba6d43a634f\",\n" +
                        "                \"url\": \"http://mini.eastday.com/mobile/171109174515991.html\"\n" +
                        "            }\n" +
                        "        ],\n" +
                        "        \"stat\": \"1\"\n" +
                        "    }\n" +
                        "}", Attention.class);
                if (homeBean != null) {
                    List<Attention.ResultBean.DataBean> data = homeBean.getResult().getData();
                    homeCallBack.onSuccess(data);
                } else {
                    homeCallBack.onFail("获取数据为空");
                }
            }
        }).start();
    }
}
