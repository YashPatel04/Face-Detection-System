import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UI extends JFrame {
    private JPanel contentPane;
    private JButton openCameraButton;
    private JButton detectButton;
    private JPanel CPanel;
    private JLabel Camera;
    private JButton back;
    private JButton exitButton;
    private JButton buttonOK;


    public UI() {
        Engine engine = new Engine(Camera);
        setContentPane(contentPane);

        ImageIcon icon = new ImageIcon("D:\\Face Recognition System\\resources\\icon.jpg");
        Camera.setIcon(icon);
        Camera.repaint();
        setTitle("Detector");
        getRootPane().setDefaultButton(buttonOK);

        back.setEnabled(false);
        openCameraButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                engine.startCamera();
                detectButton.setEnabled(true);
                back.setEnabled(true);
            }
        });
        detectButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                engine.startDetect();
                back.setEnabled(true);
            }
        });
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                engine.back();
            }
        });
        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}
