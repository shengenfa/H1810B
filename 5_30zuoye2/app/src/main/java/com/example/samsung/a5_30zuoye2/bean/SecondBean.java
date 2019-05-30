package com.example.samsung.a5_30zuoye2.bean;

import java.util.List;

/**
 * Created by samsung on 2019/5/30.
 */

public class SecondBean {

    /**
     * error_code : 0
     * reason : Success
     * result : {"data":[{"content":"谁动了我的冰箱！","hashId":"DDE51B6C09E1557D6542627755901308","unixtime":1418967626,"updatetime":"2014-12-19 13:40:26","url":"https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1512967778547&di=279f3fbe17e44cf9fbbd7dcc7c609940&imgtype=0&src=http%3A%2F%2Fimg3.redocn.com%2Ftupian%2F20141128%2Flushuizhudu_3495981.jpg"},{"content":"这鱼我怎么抓不到？","hashId":"B0C3ABBEBBE0A6EA5B8FE04E27215FBC","unixtime":1418965236,"updatetime":"2014-12-19 13:00:36","url":"https://timgsa.baidu.com/timg?image&quality=80&size=b10000_10000&sec=1512957696&di=355ae4973e31ee432f4d6d700cf01a0d&src=http://pic.baike.soso.com/p/20140708/20140708162513-1055949871.jpg"},{"content":"期末考试了，送各位学生党一张图","hashId":"B9EBF01A3C718DABB4C166356CC839A8","unixtime":1418964026,"updatetime":"2014-12-19 12:40:26","url":"https://timgsa.baidu.com/timg?image&quality=80&size=b10000_10000&sec=1512957696&di=bc93bdbefc207f1076c0a27ab3dac8f1&src=http://imgsrc.baidu.com/baike/pic/item/8326cffc1e178a829bec9484f403738da877e8c6.jpg"},{"content":"云雨过后，男友抱着我说\u201c想想咱俩还真是有缘\u201d　　\u201c可不是吗，咋俩小学同校，初中同班，高中同桌，大学同寝\u201d","hashId":"62287B57ED97B8A06861ADA51D921CEB","unixtime":1418962826,"updatetime":"2014-12-19 12:20:26","url":"https://timgsa.baidu.com/timg?image&quality=80&size=b10000_10000&sec=1512957696&di=1f23394b2d49e0b9da1e31be08b82621&src=http://pic6.nipic.com/20100313/1700216_170733595053_2.jpg"},{"content":"自从有了这个装置，妈妈再也不担心我的起床了！","hashId":"E005FFD7C7A9C80F1C0E8EEF3F44DB71","unixtime":1418961624,"updatetime":"2014-12-19 12:00:24","url":"https://timgsa.baidu.com/timg?image&quality=80&size=b10000_10000&sec=1512957696&di=0c877df0589d7411abe2793e220d528e&src=http://pic23.nipic.com/20120809/10508666_135717287167_2.jpg"}]}
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
             * url : https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1512967778547&di=279f3fbe17e44cf9fbbd7dcc7c609940&imgtype=0&src=http%3A%2F%2Fimg3.redocn.com%2Ftupian%2F20141128%2Flushuizhudu_3495981.jpg
             */

            private String content;
            private String hashId;
            private int unixtime;
            private String updatetime;
            private String url;

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

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }
        }
    }
}
