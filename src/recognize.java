import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.objdetect.FaceRecognizerSF;

public class recognize {
    public static void faceRecog(String pic, String train){
        FaceRecognizerSF sf = FaceRecognizerSF.create("Resources/model.onnx" ,"");

        Mat image = Imgcodecs.imread(train);
        Mat image2 = Imgcodecs.imread(pic);

        Mat align1=image.clone();
        Mat align2=image2.clone();
        Mat face1=image.clone();
        Mat face2=image2.clone();
        sf.alignCrop(image,face1, align1);
        sf.alignCrop(image2, face2, align2);

        Mat feat1=align1.clone();
        Mat feat2=align2.clone();

        sf.feature(align1,feat1);
        feat1 = feat1.clone();
        sf.feature(align2,feat2);
        feat2 = feat2.clone();
        feat1 = feat1.clone();
        double cosine = sf.match(feat1,feat2,FaceRecognizerSF.FR_COSINE);
        double norm = sf.match(feat1,feat2,FaceRecognizerSF.FR_NORM_L2);

        System.out.println("Cosine: "+cosine+" \nNorm: "+ norm);

    }
}
