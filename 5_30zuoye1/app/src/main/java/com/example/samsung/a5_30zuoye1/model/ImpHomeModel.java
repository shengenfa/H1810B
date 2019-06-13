package com.example.samsung.a5_30zuoye1.model;

import com.example.samsung.a5_30zuoye1.bean.HomeBean;
import com.example.samsung.a5_30zuoye1.callback.HomeCallBack;
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
                HomeBean homeBean = gson.fromJson("{\n" +
                        "    \"error_code\": 0,\n" +
                        "    \"reason\": \"请求成功\",\n" +
                        "    \"result\": {\n" +
                        "        \"list\": [\n" +
                        "            {\n" +
                        "                \"firstImg\": \"https://cdn.kaishuhezi.com/kstory/story/image/488d1e32-d848-4ccd-8c28-1fe72fc592da.jpg\",\n" +
                        "                \"mark\": \"1\",\n" +
                        "                \"source\": \"学习方法\",\n" +
                        "                \"title\": \"12岁之前，一定要告诉孩子这几件事，孩子早晚会感激你！\",\n" +
                        "                \"url\": \"http://v.juhe.cn/weixin/redirect?wid=wechat_20171109018087\"\n" +
                        "            },\n" +
                        "            {\n" +
                        "                \"firstImg\": \"http://zxpic.gtimg.com/infonew/0/wechat_pics_-56182660.jpg/640\",\n" +
                        "                \"secondImg\": \"http://zxpic.gtimg.com/infonew/0/wechat_pics_-58619774.jpg/640\",\n" +
                        "                \"mark\": \"2\",\n" +
                        "                \"source\": \"读史\",\n" +
                        "                \"title\": \"人穷不坑三人，没钱不沾三情，失意不犯三贱\",\n" +
                        "                \"title2\": \"保时捷车主打电话给保险说撞了一辆奥迪，来到现场保险公司哭了\",\n" +
                        "                \"url\": \"http://v.juhe.cn/weixin/redirect?wid=wechat_20171109019104\"\n" +
                        "            },\n" +
                        "            {\n" +
                        "                \"firstImg\": \"http://zxpic.gtimg.com/infonew/0/wechat_pics_-58621409.jpg/640\",\n" +
                        "                \"mark\": \"2\",\n" +
                        "                \"source\": \"人民网\",\n" +
                        "                \"title\": \"荐读 | 人生短暂，别在犹豫不决中荒废了时光\",\n" +
                        "                \"url\": \"http://v.juhe.cn/weixin/redirect?wid=wechat_20171109019257\"\n" +
                        "            },\n" +
                        "            {\n" +
                        "                \"firstImg\": \"http://zxpic.gtimg.com/infonew/0/wechat_pics_-58622841.jpg/640\",\n" +
                        "                \"mark\": \"1\",\n" +
                        "                \"source\": \"经管之家论坛\",\n" +
                        "                \"title\": \"最贫穷的哈佛女孩儿告诉我们：成熟的人到底是什么样的？\",\n" +
                        "                \"url\": \"http://v.juhe.cn/weixin/redirect?wid=wechat_20171109019847\"\n" +
                        "            }\n" +
                        "        ],\n" +
                        "        \"pno\": 7,\n" +
                        "        \"ps\": 20,\n" +
                        "        \"totalPage\": 9952\n" +
                        "    }\n" +
                        "}", HomeBean.class);
                if (homeBean != null) {
                    List<HomeBean.ResultBean.ListBean> list = homeBean.getResult().getList();
                    homeCallBack.onSuccess(list);
                } else {
                    homeCallBack.onFail("获取数据为空");
                }
            }
        }).start();
    }
}
