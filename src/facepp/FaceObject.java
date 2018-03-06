package facepp;

/**
 * Created by guojilong on 2018/3/6.
 */
public class FaceObject {

    private double confidence;
    private String value;

    @Override
    public String toString() {
        return "FaceObject{" +
                "confidence=" + confidence +
                ", value='" + value + '\'' +
                '}';
    }

    public void setConfidence(double confidence) {
        this.confidence = confidence;
    }

    public double getConfidence() {
        return confidence;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
