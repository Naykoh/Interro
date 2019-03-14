import javax.swing.*;
import java.awt.*;

public class CelsisusToF extends JFrame{

    private JTextField celsius;
    private JButton convert;
    private JLabel labelCelsius;

    private JLabel reponse;



    public CelsisusToF() {
        super();
        build();
    }

    private void build() {
        setTitle("Convert Celsius to Fahrenheit");
        setSize(300,200);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(buildContentPane());
    }

    private JPanel buildContentPane() {
        JPanel LeftPanel = new JPanel();                     //Panel de gauche
        LeftPanel.setLayout(new GridLayout(2,1));
        JButton convert = new JButton(new ActionConvert("Convert",celsius ,reponse));

        celsius = new JTextField("", 20);
        celsius.setEditable(true);
        LeftPanel.add(celsius);
        LeftPanel.add(convert);

        JPanel RightPanel = new JPanel();                     //Panel de droite
        RightPanel.setLayout(new GridLayout(2,1));
        JLabel labelCelsius = new JLabel("Celsius");
        JLabel reponse = new JLabel("reponse la");

        RightPanel.add(labelCelsius);
        RightPanel.add(reponse);




        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add("West", LeftPanel);
        panel.add("East", RightPanel);

        return panel;
    }

    public JTextField getCelsius() {
        return celsius;
    }

    public JLabel getReponse() {
        return reponse;
    }

}
