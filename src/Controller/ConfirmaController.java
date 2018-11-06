/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Main.Main;
import Model.Eleitor;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author vitau
 */
public class ConfirmaController implements Initializable {

    @FXML
    private Button buttonLearn;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Main.addOnChangeScreenListener(new Main.OnChangeScreen() {
            @Override
            public void onScreenChanged(String newScreen, Eleitor objEleitor) {
                if (newScreen.equals("confirm")) {

                }
            }
        });
    }

    @FXML
    private void learnAction(ActionEvent event) {
        Main.changeScreen("learn");
    }

    @FXML
    private void exitAction(MouseEvent event) {
        System.exit(0);
    }
}
