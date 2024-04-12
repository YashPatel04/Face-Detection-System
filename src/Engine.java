import org.opencv.core.Mat;
import org.opencv.core.Core;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.imgproc.Imgproc;
import org.opencv.video.Video;
import org.opencv.videoio.VideoCapture;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.MemoryImageSource;


public class GUI {

    public GUI(JPanel frame){

        VideoCapture capture = new VideoCapture(0);
        if(capture.isOpened()){
            startCamera(capture,camera);
            System.out.println("Camera is open");
        }else{
            System.out.println("Error! Cannot open camera");
        }
    }
    public void startCamera(VideoCapture capture, JLabel camera){
        Thread t = new Thread(new Runnable(){
          @Override
          public void run(){
              while(true){
                  Mat frame = new Mat();
                  capture.read(frame);
                  frame = detect.detect(frame);

                  ImageIcon image =  new ImageIcon(conversion.matToBufferedImage(frame));
                  camera.setIcon(image);
                  camera.repaint();

                  // Sleep for a short time to limit the frame rate
                  try {
                      Thread.sleep(100);
                  } catch (InterruptedException e) {
                      e.printStackTrace();
                  }
              }
          }
        });
        t.start();
    }
}
