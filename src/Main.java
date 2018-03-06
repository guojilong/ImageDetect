import facepp.FacePP;
import request.IDetect;
import request.Resp;

import java.io.File;

public class Main {

    public static void main(String[] args) {


        File file = new File("");

        IDetect detect = new FacePP();
        Resp resp = detect.detect(file);

        if (resp != null) {
            System.out.println(resp.toString());

        }
    }
}
