package Controller;

import Main.Main;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;


public class HomeController implements Initializable {

    @FXML
    private Button loginButton;
    @FXML
    private PasswordField passwordLabel;
    @FXML
    private TextField userLabel;
    @FXML
    private CheckBox rememberCheckbox;

    //EleitorController verificador = new EleitorController();
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

   
    @FXML
    private void loginAction(ActionEvent event) {
        //String user = userLabel.getText();
        //String password = passwordLabel.getText();
        //int senha = Integer.parseInt(password);
        //verificador.retornaEleitor(user, senha);
        Main.changeScreen("profile");
    }

    @FXML
    private void checkboxAction(ActionEvent event) {
    }
   
}
