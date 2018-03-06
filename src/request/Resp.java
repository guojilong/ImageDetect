package request;

import java.util.List;

/**
 * Created by guojilong on 2018/3/6.
 */
public class Resp {
    private List<String> scenes;
    private List<String> goods;
    private Boolean isSucc;
    private String err;

    public String getErr() {
        return err;
    }

    public void setErr(String err) {
        this.err = err;
    }

    public List<String> getScenes() {
        return scenes;
    }

    public void setScenes(List<String> scenes) {
        this.scenes = scenes;
    }

    public List<String> getGoods() {
        return goods;
    }

    public void setGoods(List<String> goods) {
        this.goods = goods;
    }

    public Boolean getSucc() {
        return isSucc;
    }

    public void setSucc(Boolean succ) {
        isSucc = succ;
    }

    @Override
    public String toString() {
        return "Resp{" +
                "scenes=" + scenes +
                ", goods=" + goods +
                ", isSucc=" + isSucc +
                ", err='" + err + '\'' +
                '}';
    }
}
