import javax.swing.*;

public class Main {

    public static void main(String[] args)
    {
        launch();
    }


    public static void launch()
    {
        SwingUtilities.invokeLater(new Runnable(){
            public void run() {
                CelsisusToF frame = new CelsisusToF();
                frame.setVisible(true);
            }
        });
    }
}
