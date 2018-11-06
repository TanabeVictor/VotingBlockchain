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
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Font;
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
    @FXML
    private Label logoII;
    @FXML
    private Label logoI;
    @FXML
    private Button learnButton;

    EleitorController verificador = new EleitorController();
    Eleitor objEleitor = null;
    @FXML
    private Label signInLabel;
    @FXML
    private Label signUpLabel;
    @FXML
    private Label orLabel;
    @FXML
    private Label descriptionLabel;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            verificador.recuperaLista();
            logoI.setFont(Font.loadFont(HomeController.class.getResource("/Font/BebasNeue-Regular.ttf").toExternalForm(), 32));
            logoII.setFont(Font.loadFont(HomeController.class.getResource("/Font/BebasNeue-Regular.ttf").toExternalForm(), 32));
            descriptionLabel.setFont(Font.loadFont(HomeController.class.getResource("/Font/SegoeUiLight.ttf").toExternalForm(), 18));
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

    @FXML
    private void exitAction(MouseEvent event) {
        System.exit(0);
    }

}
