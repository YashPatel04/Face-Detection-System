import org.opencv.core.*;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;
import org.opencv.objdetect.CascadeClassifier;

public class detect {
    public static void detectImage(String img){
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        //we load the Haar classifier for the face detection
        CascadeClassifier detector = new CascadeClassifier();
        detector.load("Resources/haarcascade_frontalface_default.xml");

        //Reading the Image
        Mat image = Imgcodecs.imread(img);

        //convert image into grayscale
        Mat gray = new Mat();
        Imgproc.cvtColor(image, gray, Imgproc.COLOR_BGR2GRAY);

        //Detect faces
        MatOfRect faces = new MatOfRect();
        detector.detectMultiScale(gray, faces);

        //to draw rectangles around recognized faces
        for (Rect rect : faces.toArray()){
            Imgproc.rectangle(image, new Point(rect.x, rect.y), new Point(rect.x + rect.width, rect.y + rect.height), new Scalar(0, 255, 0));
        }

        Imgcodecs.imwrite("Resources/output.jpg", image);
        System.out.println("Face Detection Completed");
    }
}