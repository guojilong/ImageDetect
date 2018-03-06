package facepp;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * Created by guojilong on 2018/3/6.
 * <p>
 * request_id
 * <p>
 * String
 * <p>
 * 用于区分每一次请求的唯一的字符串。
 * <p>
 * scenes
 * <p>
 * Array
 * <p>
 * 识别出的图片场景信息数组，每个场景包括
 * <p>
 * value：场景名称
 * <p>
 * confidence：对该场景的置信度，是一个浮点数，范围[0,100]，小数点后3位有效数字。
 * <p>
 * 注：如果没有检测出场景则为空
 * <p>
 * objects
 * <p>
 * Array
 * <p>
 * 检测出的图片物体信息数组，每个物体包括
 * <p>
 * value：物体名称
 * <p>
 * confidence：对该物体的置信度，是一个浮点数，范围[0,100]，小数点后3位有效数字。
 * <p>
 * 注：如果没有检测出物体则为空
 * <p>
 * image_id	String	被检测的图片在系统中的标识
 * time_used
 * <p>
 * Int
 * <p>
 * 整个请求所花费的时间，单位为毫秒。
 * <p>
 * error_message
 * <p>
 * String
 * <p>
 * 当请求失败时才会返回此字符串，具体返回内容见后续错误信息章节。否则此字段不存在。
 */
public class FacePPResp implements Serializable {
    private int time_used;
    private List<FaceObject> scenes;
    private String image_id;
    private List<FaceObject> objects;
    private String request_id;
    private String error_message;

    public String getError_message() {
        return error_message;
    }

    public void setError_message(String error_message) {
        this.error_message = error_message;
    }

    public void setTime_used(int time_used) {
        this.time_used = time_used;
    }

    public int getTime_used() {
        return time_used;
    }

    public void setScenes(List<FaceObject> scenes) {
        this.scenes = scenes;
    }

    public List<FaceObject> getScenes() {
        return scenes;
    }

    public void setImage_id(String image_id) {
        this.image_id = image_id;
    }

    public String getImage_id() {
        return image_id;
    }

    public void setObjects(List<FaceObject> objects) {
        this.objects = objects;
    }

    public List<FaceObject> getObjects() {
        return objects;
    }

    public void setRequest_id(String request_id) {
        this.request_id = request_id;
    }

    public String getRequest_id() {
        return request_id;
    }

}

