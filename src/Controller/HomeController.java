package Controller;

import Main.Main;
import Model.Eleitor;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javax.swing.JOptionPane;

public class HomeController implements Initializable {

    @FXML
    private Button loginButton;
    @FXML
    private PasswordField passwordLabel;
    @FXML
    private TextField userLabel;
    @FXML
    private CheckBox rememberCheckbox;

    EleitorController verificador = new EleitorController();
    Eleitor objEleitor = null;
    @FXML
    private Button learnButton;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            verificador.recuperaLista();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Recuperar Lista de Eleitores!");
        }

        Main.addOnChangeScreenListener(new Main.OnChangeScreen() {
            @Override
            public void onScreenChanged(String newScreen, Eleitor objEleitor) {
                if (newScreen.equals("main")) {
                    try {
                        verificador.recuperaLista();
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Erro ao Recuperar Lista de Eleitores!");
                    }
                }
            }
        });

    }

    @FXML
    private void loginAction(ActionEvent event) {
        int matricula = Integer.parseInt(userLabel.getText());
        String password = passwordLabel.getText();
        objEleitor = verificador.retornaEleitor(matricula, password);
        if (objEleitor != null) {
            userLabel.setText("");
            passwordLabel.setText("");
            Main.changeScreen("profile", objEleitor);
        } else {
            JOptionPane.showMessageDialog(null, "Usuário Não Cadastrado");
        }

    }

    @FXML
    private void checkboxAction(ActionEvent event) {
    }

    @FXML
    private void learnAction(ActionEvent event) {
        userLabel.setText("");
        passwordLabel.setText("");
        Main.changeScreen("learn");
    }

    @FXML
    private void cadastroAction(MouseEvent event) {
        userLabel.setText("");
        passwordLabel.setText("");
        Main.changeScreen("register");
    }

}
