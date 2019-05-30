package com.example.samsung.a5_30zuoye1.bean;

import java.util.List;

/**
 * Created by samsung on 2019/5/30.
 */

public class HomeBean {

    /**
     * error_code : 0
     * reason : 请求成功
     * result : {"list":[{"firstImg":"https://cdn.kaishuhezi.com/kstory/story/image/488d1e32-d848-4ccd-8c28-1fe72fc592da.jpg","mark":"1","source":"学习方法","title":"12岁之前，一定要告诉孩子这几件事，孩子早晚会感激你！","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171109018087"},{"firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-56182660.jpg/640","secondImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-58619774.jpg/640","mark":"2","source":"读史","title":"人穷不坑三人，没钱不沾三情，失意不犯三贱","title2":"保时捷车主打电话给保险说撞了一辆奥迪，来到现场保险公司哭了","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171109019104"},{"firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-58621409.jpg/640","mark":"2","source":"人民网","title":"荐读 | 人生短暂，别在犹豫不决中荒废了时光","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171109019257"},{"firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-58622841.jpg/640","mark":"1","source":"经管之家论坛","title":"最贫穷的哈佛女孩儿告诉我们：成熟的人到底是什么样的？","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171109019847"}],"pno":7,"ps":20,"totalPage":9952}
     */

    private int error_code;
    private String reason;
    private ResultBean result;

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * list : [{"firstImg":"https://cdn.kaishuhezi.com/kstory/story/image/488d1e32-d848-4ccd-8c28-1fe72fc592da.jpg","mark":"1","source":"学习方法","title":"12岁之前，一定要告诉孩子这几件事，孩子早晚会感激你！","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171109018087"},{"firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-56182660.jpg/640","secondImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-58619774.jpg/640","mark":"2","source":"读史","title":"人穷不坑三人，没钱不沾三情，失意不犯三贱","title2":"保时捷车主打电话给保险说撞了一辆奥迪，来到现场保险公司哭了","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171109019104"},{"firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-58621409.jpg/640","mark":"2","source":"人民网","title":"荐读 | 人生短暂，别在犹豫不决中荒废了时光","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171109019257"},{"firstImg":"http://zxpic.gtimg.com/infonew/0/wechat_pics_-58622841.jpg/640","mark":"1","source":"经管之家论坛","title":"最贫穷的哈佛女孩儿告诉我们：成熟的人到底是什么样的？","url":"http://v.juhe.cn/weixin/redirect?wid=wechat_20171109019847"}]
         * pno : 7
         * ps : 20
         * totalPage : 9952
         */

        private int pno;
        private int ps;
        private int totalPage;
        private List<ListBean> list;

        public int getPno() {
            return pno;
        }

        public void setPno(int pno) {
            this.pno = pno;
        }

        public int getPs() {
            return ps;
        }

        public void setPs(int ps) {
            this.ps = ps;
        }

        public int getTotalPage() {
            return totalPage;
        }

        public void setTotalPage(int totalPage) {
            this.totalPage = totalPage;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class ListBean {
            /**
             * firstImg : https://cdn.kaishuhezi.com/kstory/story/image/488d1e32-d848-4ccd-8c28-1fe72fc592da.jpg
             * mark : 1
             * source : 学习方法
             * title : 12岁之前，一定要告诉孩子这几件事，孩子早晚会感激你！
             * url : http://v.juhe.cn/weixin/redirect?wid=wechat_20171109018087
             * secondImg : http://zxpic.gtimg.com/infonew/0/wechat_pics_-58619774.jpg/640
             * title2 : 保时捷车主打电话给保险说撞了一辆奥迪，来到现场保险公司哭了
             */

            private String firstImg;
            private String mark;
            private String source;
            private String title;
            private String url;
            private String secondImg;
            private String title2;

            public String getFirstImg() {
                return firstImg;
            }

            public void setFirstImg(String firstImg) {
                this.firstImg = firstImg;
            }

            public String getMark() {
                return mark;
            }

            public void setMark(String mark) {
                this.mark = mark;
            }

            public String getSource() {
                return source;
            }

            public void setSource(String source) {
                this.source = source;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getSecondImg() {
                return secondImg;
            }

            public void setSecondImg(String secondImg) {
                this.secondImg = secondImg;
            }

            public String getTitle2() {
                return title2;
            }

            public void setTitle2(String title2) {
                this.title2 = title2;
            }
        }
    }
}
