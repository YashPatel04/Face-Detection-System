import org.opencv.core.Mat;
import org.opencv.core.Size;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;
import org.opencv.videoio.VideoCapture;
import javax.swing.*;

public class Engine {
    JLabel cam;
    VideoCapture capture;
    public Engine(JLabel cam){
        this.cam = cam;
    }
    public void startCamera(){

        Thread t = new Thread(new Runnable(){
            @Override
            public void run(){
                while(true){
                    capture = new VideoCapture(0);
                    while(capture.isOpened()){
                        Mat frame = new Mat();
                        capture.read(frame);

                        Imgproc.resize(frame,frame,new Size(674,627));
                        ImageIcon image =  new ImageIcon(conversion.matToBufferedImage(frame));
                        cam.setIcon(image);
                        cam.repaint();

                        // Sleep for a short time to limit the frame rate
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    capture.release();
                }
            }
        });
        t.start();
    }
    public void startDetect(){

        Thread t = new Thread(new Runnable(){
            @Override
            public void run(){
                while(true){
                    capture = new VideoCapture(0);
                    while (capture.isOpened()){
                        Mat frame = new Mat();
                        capture.read(frame);
                        Imgproc.resize(frame,frame,new Size(674,627));
                        frame = detect.detect(frame);

                        ImageIcon image =  new ImageIcon(conversion.matToBufferedImage(frame));
                        cam.setIcon(image);
                        cam.repaint();

                        // Sleep for a short time to limit the frame rate
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    capture.release();
                }
            }
        });
        t.start();
    }
    public void back(){
        if (capture.isOpened()){
            capture.release();
            Thread.currentThread().interrupt();
            cam.removeAll();
            cam.setIcon(new ImageIcon("D:\\Face Recognition System\\resources\\icon.jpg"));
            cam.repaint();
        }
    }
}