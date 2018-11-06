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
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author vitau
 */
public class SaibaMaisController implements Initializable {

    @FXML
    private ImageView backButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Main.addOnChangeScreenListener(new Main.OnChangeScreen() {
            @Override
            public void onScreenChanged(String newScreen, Eleitor objEleitor) {
                if (newScreen.equals("learn")) {
                }
            }
        });
    }

    @FXML
    private void backAction(MouseEvent event) {
        Main.changeScreen("main");
    }

    @FXML
    private void exitAction(MouseEvent event) {
        System.exit(0);
    }

}
