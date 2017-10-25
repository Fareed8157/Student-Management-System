/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 *
 * @author Fareed
 */
public class drawerButtons implements Initializable{

    @FXML
    private JFXButton color1;

    @FXML
    private JFXButton color2;

    @FXML
    private JFXButton color3;

    @FXML
    private JFXButton color4;

    @FXML
    private JFXButton color5;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("Hello");
    }
    
}
