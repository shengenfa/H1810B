package com.example.samsung.a5_30zuoye2.bean;

import java.util.List;

/**
 * Created by samsung on 2019/5/30.
 */

public class Home {

    /**
     * error_code : 0
     * reason : Success
     * result : {"data":[{"content":"谁动了我的冰箱！","hashId":"DDE51B6C09E1557D6542627755901308","unixtime":1418967626,"updatetime":"2014-12-19 13:40:26","url1":"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1512966715871&di=66a99bc6b3ae7c1f3a1a96abbd6d0fe9&imgtype=0&src=http%3A%2F%2Fimgsrc.baidu.com%2Fimgad%2Fpic%2Fitem%2Ff603918fa0ec08fae0b1528f52ee3d6d55fbda61.jpg"},{"content":"这鱼我怎么抓不到？","hashId":"B0C3ABBEBBE0A6EA5B8FE04E27215FBC","unixtime":1418965236,"updatetime":"2014-12-19 13:00:36","url1":"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1512966715872&di=7399b2f9f788dbf99243abbc3bffe4c2&imgtype=0&src=http%3A%2F%2Fimgsrc.baidu.com%2Fimgad%2Fpic%2Fitem%2Fb17eca8065380cd708ae52d1aa44ad345982815e.jpg"},{"content":"期末考试了，送各位学生党一张图","hashId":"B9EBF01A3C718DABB4C166356CC839A8","unixtime":1418964026,"updatetime":"2014-12-19 12:40:26","url1":"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1512966715873&di=fb80d0116d5d016ebe8480a0acd1133a&imgtype=0&src=http%3A%2F%2Fimgsrc.baidu.com%2Fimgad%2Fpic%2Fitem%2Ff7246b600c3387447d2db0ff5b0fd9f9d62aa04d.jpg"},{"content":"云雨过后，男友抱着我说\u201c想想咱俩还真是有缘\u201d　　\u201c可不是吗，咋俩小学同校，初中同班，高中同桌，大学同寝\u201d","hashId":"62287B57ED97B8A06861ADA51D921CEB","unixtime":1418962826,"updatetime":"2014-12-19 12:20:26","url1":"http://p9.pstatp.com/origin/19fc00007f27b4c9ead9"},{"content":"自从有了这个装置，妈妈再也不担心我的起床了！","hashId":"E005FFD7C7A9C80F1C0E8EEF3F44DB71","unixtime":1418961624,"updatetime":"2014-12-19 12:00:24","url1":"https://cdn.kaishuhezi.com/kstory/story/image/03913a1d-5b97-48b6-9f0b-d4b8339cb480.jpg"},{"content":"那些神馬有錢任性的都弱爆了，前幾天在銀行辦理業務，一哥們走到櫃檯，哥們：\u201c給我取30萬，謝謝！\u201d一會兒工作人員就說：\u201c先生，對不起！卡上餘額不足。\u201d只見這哥們悠悠衝懷裡掏出手槍：\u201c沒辦法有槍就是任性！！\u201d我想說哥們你搶劫就搶劫，裝神馬B！","hashId":"E3070767518CB4DFEA708DCCC332EE2F","unixtime":1418960433,"updatetime":"2014-12-19 11:40:33","url1":"http://p1.pstatp.com/origin/19fc00007f26052f7da0","url2":"http://p3.pstatp.com/origin/19fb00025352da4724b1"}]}
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
        private List<DataBean> data;

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public static class DataBean {
            /**
             * content : 谁动了我的冰箱！
             * hashId : DDE51B6C09E1557D6542627755901308
             * unixtime : 1418967626
             * updatetime : 2014-12-19 13:40:26
             * url1 : https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1512966715871&di=66a99bc6b3ae7c1f3a1a96abbd6d0fe9&imgtype=0&src=http%3A%2F%2Fimgsrc.baidu.com%2Fimgad%2Fpic%2Fitem%2Ff603918fa0ec08fae0b1528f52ee3d6d55fbda61.jpg
             * url2 : http://p3.pstatp.com/origin/19fb00025352da4724b1
             */

            private String content;
            private String hashId;
            private int unixtime;
            private String updatetime;
            private String url1;
            private String url2;

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }

            public String getHashId() {
                return hashId;
            }

            public void setHashId(String hashId) {
                this.hashId = hashId;
            }

            public int getUnixtime() {
                return unixtime;
            }

            public void setUnixtime(int unixtime) {
                this.unixtime = unixtime;
            }

            public String getUpdatetime() {
                return updatetime;
            }

            public void setUpdatetime(String updatetime) {
                this.updatetime = updatetime;
            }

            public String getUrl1() {
                return url1;
            }

            public void setUrl1(String url1) {
                this.url1 = url1;
            }

            public String getUrl2() {
                return url2;
            }

            public void setUrl2(String url2) {
                this.url2 = url2;
            }
        }
    }
}
