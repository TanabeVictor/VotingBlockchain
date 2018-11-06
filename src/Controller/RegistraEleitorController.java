package Controller;

import java.net.URL;
import java.util.ResourceBundle;
import Main.Main;
import Model.Eleitor;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javax.swing.JOptionPane;

public class RegistraEleitorController implements Initializable {

    @FXML
    private TextField codigoEleitorLabel;
    @FXML
    private TextField nomeEleitorLabel;
    @FXML
    private TextField nomePaiLabel;
    @FXML
    private TextField nomeMaeLabel;
    @FXML
    private TextField naturalidadeLabel;
    @FXML
    private TextField emailLabel;
    @FXML
    private Button ConfirmaCadastroButton;

    Eleitor objEleitor = null;
    @FXML
    private TextField situacaoLabel;
    @FXML
    private TextField dataNascDatePicker;
    @FXML
    private TextField dataEmissaoDatePicker;
    @FXML
    private RadioButton sexFem;
    @FXML
    private RadioButton sexoMasc;

    String sexo = "";
    @FXML
    private PasswordField passwordField;
    @FXML
    private ImageView logoutButton;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Main.addOnChangeScreenListener(new Main.OnChangeScreen() {
            @Override
            public void onScreenChanged(String newScreen, Eleitor objEleitor) {
                if (newScreen.equals("register")) {

                }
            }
        });
    }

    @FXML
    private void confirmaCadastroAction(ActionEvent event) throws RuntimeException, ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        EleitorController CtrEleitor = new EleitorController();

        String codigo = codigoEleitorLabel.getText();
        int userID = Integer.parseInt(codigo);
        String nomeEleitor = nomeEleitorLabel.getText();
        String nomePai = nomePaiLabel.getText();
        String nomeMae = nomeMaeLabel.getText();
        String naturalidade = naturalidadeLabel.getText();
        String dataNascLabel = dataNascDatePicker.getText();
        Date dataNasc = formatter.parse(dataNascLabel);
        String dataEmissaoLabel = dataEmissaoDatePicker.getText();
        Date dataEmissao = formatter.parse(dataEmissaoLabel);
        String situacao = situacaoLabel.getText();
        String email = emailLabel.getText();
        String password = passwordField.getText();

        try {
            CtrEleitor.addEleitor(new Eleitor(nomeEleitor, nomePai, nomeMae, sexo, naturalidade, userID, password, dataNasc, dataEmissao, situacao, email));
            sexo = "";
            codigoEleitorLabel.setText("");
            nomeEleitorLabel.setText("");
            nomePaiLabel.setText("");
            nomeMaeLabel.setText("");
            naturalidadeLabel.setText("");
            dataNascDatePicker.setText("");
            dataEmissaoDatePicker.setText("");
            situacaoLabel.setText("");
            emailLabel.setText("");
            passwordField.setText("");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Não Foi Possível Cadastrar!");
        }
        Main.changeScreen("main");
    }

    @FXML
    private void femininoAction(ActionEvent event) {
        sexo = "Feminino";
    }

    @FXML
    private void masculinoAction(ActionEvent event) {
        sexo = "Masculino";
    }

    @FXML
    private void logoutAction(MouseEvent event) {
        sexo = "";
        codigoEleitorLabel.setText("");
        nomeEleitorLabel.setText("");
        nomePaiLabel.setText("");
        nomeMaeLabel.setText("");
        naturalidadeLabel.setText("");
        dataNascDatePicker.setText("");
        dataEmissaoDatePicker.setText("");
        situacaoLabel.setText("");
        emailLabel.setText("");
        passwordField.setText("");
        Main.changeScreen("main");
    }

    @FXML
    private void exitAction(MouseEvent event) {
        System.exit(0);
    }

}
