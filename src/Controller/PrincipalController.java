package Controller;

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
import javafx.util.Duration;

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

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        KeyFrame frame = new KeyFrame(Duration.millis(1000), e -> atualizaHoras());
        Timeline timeline = new Timeline(frame);
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
        
        addTextLimiter(labelVoto);
        exibeData();
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
    
    public void exibeData(){
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
    }

    @FXML
    private void mouseEventCorrige(ActionEvent event) {
        labelVoto.setText("");
    }

    @FXML
    private void mouseEventBranco(ActionEvent event) {
    }
}
