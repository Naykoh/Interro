import javax.swing.*;
import java.awt.event.ActionEvent;

public class ActionConvert extends AbstractAction {

    private CelsisusToF celsisusToF;

    private JTextField celsius;

    private JLabel reponse;

    public ActionConvert(String title, JTextField celsius , JLabel reponse)
    {
        super(title);

        this.celsius=celsius;
        this.reponse=reponse;
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {

        String texteUtilisateur = celsius.getText();

        int nombreUtilisateur= Integer.parseInt(texteUtilisateur);

        int nombreResultat= nombreUtilisateur*(9/5)+32;


        String resultat = Integer.toString(nombreResultat);

        reponse.setText(resultat);
    }
}
