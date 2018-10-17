/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Controller.Configurador;
import Model.cadastroCandidato;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {
    private static Stage stage;
    private static Scene mainScene;
    private static Scene profileScene;
    private static Scene votingScene;    
    cadastroCandidato cadCandidato;
    
    @Override
    public void start(Stage primaryStage) throws Exception{
        cadCandidato =  new cadastroCandidato();
        stage = primaryStage;
        
        primaryStage.setTitle("VotingBlockchain - E - Voting Blockchain System ");
        
        Parent fxmlMain = FXMLLoader.load(getClass().getResource("/View/Home.fxml"));
        mainScene = new Scene(fxmlMain, 1200, 600);
        
        Parent fxmlProfile = FXMLLoader.load(getClass().getResource("/View/Perfil.fxml"));
        profileScene = new Scene(fxmlProfile, 1200, 600);
        
        Parent fxmlVoting = FXMLLoader.load(getClass().getResource("/View/Principal.fxml"));
        votingScene = new Scene(fxmlVoting, 1200, 600);
        
        primaryStage.setScene(mainScene);
        primaryStage.show();
        primaryStage.getIcons().add(new Image("/Img/icon.png"));
    }
    
    
    public static void changeScreen(String scr){
        switch(scr){
            case "main":
                stage.setScene(mainScene);
                break;
                
            case "profile":
                stage.setScene(profileScene);
                break;
                
            case "voting":
                stage.setScene(votingScene);
                break;       
        }
    }
 
    
    public static void main(String[] args) throws Exception {
        launch(args);
        //Configurador config = new Configurador();
        //config.publish();
    }
}
