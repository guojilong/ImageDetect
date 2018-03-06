package facepp;

import com.alibaba.fastjson.JSON;
import request.HttpParams;
import request.HttpUtils;
import request.IDetect;
import request.Resp;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by guojilong on 2018/3/6.
 */
public class FacePP implements IDetect {
    final String url = "";
    final String key = "";
    final String secret = "";

    @Override
    public Resp detect(File file) {

        HttpParams httpParams = new HttpParams();
        httpParams.put("api_secret", secret);
        httpParams.put("api_key", key);
        String respStr = HttpUtils.postFile(url, httpParams, "image_file", file);


        Resp resp = new Resp();
        resp.setSucc(false);
        if (respStr != null) {

            try {

                FacePPResp facePP = JSON.parseObject(respStr, FacePPResp.class);

                if (facePP.getScenes() != null && facePP.getScenes().size() > 0) {

                    List<String> scenes = new ArrayList<>();
                    for (FaceObject scene : facePP.getScenes()) {

                        scenes.add(scene.getValue());
                    }
                    resp.setScenes(scenes);
                }

                if (facePP.getObjects() != null && facePP.getObjects().size() > 0) {

                    List<String> objects = new ArrayList<>();
                    for (FaceObject faceObject : facePP.getObjects()) {
                        objects.add(faceObject.getValue());
                    }
                    resp.setGoods(objects);
                }

                if (resp.getScenes() != null || resp.getGoods() != null) {
                    resp.setSucc(true);
                }

                resp.setErr(facePP.getError_message());


            } catch (Exception e) {

            }

        } else {

            resp.setSucc(false);
        }

        return resp;
    }

}
