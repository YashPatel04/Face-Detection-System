import org.opencv.core.Core;

public class main {
    public static void main(String[] args){
        sqlConnect.connect();
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        detect.detectImage("Resources/rdj.jpg");
        recognize.faceRecog("Resources/input.jpg","Resources/rdj.jpg");
    }
}
