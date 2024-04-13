import org.opencv.core.Core;

import javax.swing.*;
import java.awt.*;

public class main {
    public static void main(String[] args){
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        UI frame = new UI();
        Image icon = Toolkit.getDefaultToolkit().getImage("D:\\Face Recognition System\\resources\\icons8-npc-face-32.png");
        frame.setIconImage(icon);
        frame.pack();
        frame.setSize(720,720);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
