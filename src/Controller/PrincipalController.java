package Controller;

import Main.Main;
import Model.Candidato;
import Model.Eleitor;
import java.io.File;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.util.Duration;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author vitau
 */
public class PrincipalController implements Initializable {

    @FXML
    private Label hora;
    private SimpleDateFormat formatador = new SimpleDateFormat("HH:mm:ss");
    @FXML
    private Button buttonConfirma;
    @FXML
    private Button buttonCorrige;
    @FXML
    private Button buttonBranco;
    @FXML
    private Button buttonOne;
    @FXML
    private Button buttonTwo;
    @FXML
    private Button buttonThree;
    @FXML
    private Button buttonFour;
    @FXML
    private Button buttonFive;
    @FXML
    private Button buttonSix;
    @FXML
    private Button buttonSeven;
    @FXML
    private Button buttonEight;
    @FXML
    private Button buttonNine;
    @FXML
    private Button buttonZero;
    @FXML
    private TextField labelVoto;
    @FXML
    private Label data;
    @FXML
    private Label labelNomeCandidato;
    @FXML
    private Label labelNomeVice;
    @FXML
    private Label labelNomePartido;

    CandidatoController ctrCandidato = new CandidatoController();
    @FXML
    private ImageView imagePresidente;
    @FXML
    private ImageView imageVice;
    Configurador config = new Configurador();
    Eleitor eleitor = null;
    @FXML
    private Label labelLocalizacao;
    @FXML
    private Label labelNome;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Main.addOnChangeScreenListener(new Main.OnChangeScreen() {
            @Override
            public void onScreenChanged(String newScreen, Eleitor objEleitor) {
                if (newScreen.equals("voting")) {
                    labelNome.setText(objEleitor.getNomeEleitor());
                    try {
                        ctrCandidato.recuperaLista();
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Erro ao Recuperar Lista de Candidatos!");
                    }

                    KeyFrame frame = new KeyFrame(Duration.millis(1000), e -> atualizaHoras());
                    Timeline timeline = new Timeline(frame);
                    timeline.setCycleCount(Timeline.INDEFINITE);
                    timeline.play();

                    addTextLimiter(labelVoto);

                    labelVoto.textProperty().addListener(new ChangeListener<String>() {
                        @Override
                        public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                            String numeroInformado = labelVoto.getText();
                            if (numeroInformado.length() < 2) {
                                File file = new File("src/Img/Presidenciaveis/default.jpg");
                                Image image = new Image(file.toURI().toString());

                                labelNomeCandidato.setText("Nome do Candidato");
                                labelNomeVice.setText("Nome do Vice");
                                labelNomePartido.setText("Nome do Partido");
                                imagePresidente.setImage(image);
                                imageVice.setImage(image);
                            }
                            try {
                                Candidato cand = ctrCandidato.retornaCandidato(Integer.parseInt(numeroInformado));
                                File file = new File("src/Img/Presidenciaveis/" + cand.getNomeImagem() + ".jpg");
                                File file2 = new File("src/Img/Vices/" + cand.getNomeImagemVice() + ".jpg");
                                Image image = new Image(file.toURI().toString());
                                Image image2 = new Image(file2.toURI().toString());

                                labelNomeCandidato.setText(cand.getNomeCandidato());
                                labelNomeVice.setText(cand.getNomeVice());
                                labelNomePartido.setText(cand.getPartido());
                                imagePresidente.setImage(image);
                                imageVice.setImage(image2);
                            } catch (Exception ex) {

                            }
                        }
                    });
                    exibeData();
                    eleitor = objEleitor;
                }
            }

        });

    }

    public static void addTextLimiter(final TextField tf) {
        int maxLength = 2;
        tf.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if (tf.getText().length() > maxLength) {
                    String s = tf.getText().substring(0, maxLength);
                    tf.setText(s);
                }
            }
        });
    }

    public void exibeData() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-mm-yy");
        data.setText("03/10/2018");
    }

    private void atualizaHoras() {
        Date agora = new Date();
        hora.setText(formatador.format(agora));
    }

    @FXML
    private void mouseEventOne(ActionEvent event) {
        labelVoto.setText(labelVoto.getText() + "1");
    }

    @FXML
    private void mouseEventTwo(ActionEvent event) {
        labelVoto.setText(labelVoto.getText() + "2");
    }

    @FXML
    private void mouseEventThree(ActionEvent event) {
        labelVoto.setText(labelVoto.getText() + "3");
    }

    @FXML
    private void mouseEventFour(ActionEvent event) {
        labelVoto.setText(labelVoto.getText() + "4");
    }

    @FXML
    private void mouseEventFive(ActionEvent event) {
        labelVoto.setText(labelVoto.getText() + "5");
    }

    @FXML
    private void mouseEventSix(ActionEvent event) {
        labelVoto.setText(labelVoto.getText() + "6");
    }

    @FXML
    private void mouseEventSeven(ActionEvent event) {
        labelVoto.setText(labelVoto.getText() + "7");
    }

    @FXML
    private void mouseEventEight(ActionEvent event) {
        labelVoto.setText(labelVoto.getText() + "8");
    }

    @FXML
    private void mouseEventNine(ActionEvent event) {
        labelVoto.setText(labelVoto.getText() + "9");
    }

    @FXML
    private void mouseEventZero(ActionEvent event) {
        labelVoto.setText(labelVoto.getText() + "0");
    }

    @FXML
    private void mouseEventConfirma(ActionEvent event) {
        String musicFile = "confirma-urna.mp3";
        Media sound = new Media(new File(musicFile).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);
        mediaPlayer.play();

        int matricula = eleitor.getUserID();

        //config.publish("Teste de Comunicação");
        Main.changeScreen("confirm");
    }

    @FXML
    private void mouseEventCorrige(ActionEvent event) {
        labelVoto.setText("");
    }

    @FXML
    private void mouseEventBranco(ActionEvent event) {

    }

}
