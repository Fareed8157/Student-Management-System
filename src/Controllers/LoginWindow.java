/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.PauseTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author Fareed
 */
public class LoginWindow implements Initializable{

    @FXML
    private JFXButton signUp;

    @FXML
    private JFXButton signIn;

    @FXML
    private JFXTextField fName;

    @FXML
    private JFXPasswordField uSignUpPass;

    @FXML
    private JFXTextField lname;

    @FXML
    private JFXTextField email;

    @FXML
    private JFXButton uSignUp;

    @FXML
    private FontAwesomeIconView signUpIcon;

    @FXML
    private JFXTextField uName;

    @FXML
    private JFXPasswordField uPass;

    @FXML
    private JFXButton login;

    @FXML
    private FontAwesomeIconView close;
    
    @FXML
    private AnchorPane pn_SignUp;
    
    @FXML
    private JFXTextField mbl;
    
    @FXML
    private AnchorPane pn_SignIn;
    
    @FXML
    private ImageView signUpProg;
    
    @FXML
    private ImageView signInProg;
    
    @FXML
    private FontAwesomeIconView signInIcon;

    boolean flag=false;        //stores result for whether signIn or signUp icon is clicked by mouse or not
    @FXML
    void onAction(ActionEvent event) {
        if(event.getSource()==signIn){
            pn_SignIn.toFront();
         }else if(event.getSource()==signUp){
            pn_SignUp.toFront();
         }
    }
    
    
    @FXML
    void onAction1(MouseEvent event) {
        if(event.getSource()==login || event.getSource()==signInIcon){
            signInProg.setVisible(true);
            PauseTransition pt=new PauseTransition();
            pt.setDuration(Duration.seconds(2));
        }else if(event.getSource()==uSignUp || event.getSource()==signUpIcon){
            signUpProg.setVisible(true);
            PauseTransition pt=new PauseTransition();
            pt.setDuration(Duration.seconds(2));
            pt.setOnFinished((ActionEvent ev)->{
                signUpProg.setVisible(false);
            System.out.println("In finied");
            pn_SignUp.toBack();
            pn_SignIn.toFront();
            
            });
            pt.play();
            
        }else if(event.getSource()==close){
            Stage win=(Stage)close.getScene().getWindow();
            win.close();
        }
        System.out.println("MouseEvent");
    }
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
    signInProg.setVisible(false);
    signUpProg.setVisible(false);
    }
    
}
