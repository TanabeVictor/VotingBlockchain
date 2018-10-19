/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Main.Main;
import Model.Eleitor;
import java.io.File;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author vitau
 */
public class PerfilController implements Initializable {

    @FXML
    private Button nextButton;
    @FXML
    private ImageView logoutButton;
    @FXML
    private Label labelNome;
    @FXML
    private Label labelDataNasc;
    @FXML
    private Label labelNaturalidade;
    @FXML
    private Label labelSexo;
    @FXML
    private Label labelMatricula;
    @FXML
    private Label labelNomePai;
    @FXML
    private Label labelNomeMae;
    @FXML
    private Label labelSituacao;
    @FXML
    private Label labelDataEmissao;

    Eleitor eleitor = null;
    EleitorController verificador = new EleitorController();
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
    @FXML
    private ImageView imageProfile;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Main.addOnChangeScreenListener(new Main.OnChangeScreen() {
            @Override
            public void onScreenChanged(String newScreen, Eleitor objEleitor) {
                if (newScreen.equals("profile")) {
                    File file = new File("src/Img/Eleitores/" + objEleitor.getUserID() + ".jpg");
                    Image image = new Image(file.toURI().toString());
                    imageProfile.setImage(image);

                    labelNome.setText(objEleitor.getNomeEleitor());

                    String dataNascimento = formatter.format(objEleitor.getDataNasc());
                    String dataEmissao = formatter.format(objEleitor.getDataEmissao());

                    labelDataNasc.setText(dataNascimento);
                    labelDataEmissao.setText(dataEmissao);
                    labelNaturalidade.setText(objEleitor.getNaturalidade());
                    labelSexo.setText(objEleitor.getSexo());
                    labelMatricula.setText(String.valueOf(objEleitor.getUserID()));
                    labelNomePai.setText(objEleitor.getNomePai());
                    labelNomeMae.setText(objEleitor.getNomeMae());
                    labelSituacao.setText(objEleitor.getSituacao());
                    eleitor = objEleitor;
                }
            }
        });
    }

    @FXML
    private void nextAction(ActionEvent event) {
        Main.changeScreen("voting", eleitor);
    }

    @FXML
    private void logoutAction(MouseEvent event) {
        Main.changeScreen("main", null);
    }

}
