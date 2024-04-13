import org.opencv.core.MatOfRect;
import org.opencv.core.Rect;
import org.opencv.core.Scalar;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;
import org.opencv.objdetect.CascadeClassifier;
import org.opencv.core.Mat;

public class detect{
    public static Mat detect(Mat image){
        CascadeClassifier haar = new CascadeClassifier("D:\\Face Recognition System\\resources\\haarcascade_frontalface_default.xml");

        Mat grayImg =  new Mat();
        Imgproc.cvtColor(image,grayImg, Imgproc.COLOR_BGR2GRAY);

        MatOfRect faces = new MatOfRect();
        haar.detectMultiScale(grayImg,faces);

        for(Rect rect: faces.toArray()){
            Imgproc.rectangle(image,
                    new org.opencv.core.Point(rect.x, rect.y),
                    new org.opencv.core.Point(rect.x + rect.width, rect.y + rect.height),
                    new Scalar(0, 255, 0),
                    3);
        }
        return image;
    }
}