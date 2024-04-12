import org.opencv.core.Core;
public class main {
    public static void main(String[] args){
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        UI dialog = new UI();
        dialog.pack();
        dialog.setSize(720,720);
        dialog.setResizable(false);
        dialog.setVisible(true);
        System.exit(0);
    }
}
