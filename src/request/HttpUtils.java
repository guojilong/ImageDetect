package request;

import okhttp3.*;

import java.io.File;
import java.io.IOException;
import java.util.Map;

/**
 * Created by guojilong on 2018/3/6.
 */
public class HttpUtils {


    public static String postFile(String url, HttpParams params, String fileKey, File file) {

        try {
            OkHttpClient client = new OkHttpClient();

            MultipartBody.Builder builder = new MultipartBody.Builder().setType(MultipartBody.FORM);
            for (Map.Entry<String, String> entry : params.entrySet()) {
                builder.addFormDataPart(entry.getKey(), entry.getValue());
            }
            RequestBody body = RequestBody.create(MediaType.parse("image/*"), file);

            builder.addFormDataPart(fileKey, file.getName(), body);

            Request request = new Request.Builder()
                    .url(url)
                    .post(builder.build())
                    .build();
            Response response = null;

            response = client.newCall(request).execute();

            return response.body().string();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }


}


