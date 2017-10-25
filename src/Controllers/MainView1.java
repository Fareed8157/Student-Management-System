/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXDrawer;
import com.jfoenix.controls.JFXHamburger;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.transitions.hamburger.HamburgerBasicCloseTransition;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import de.jensd.fx.glyphs.materialdesignicons.MaterialDesignIconView;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Fareed
 */
public class MainView1 implements Initializable{
 
    
    @FXML
    private JFXHamburger hamburger;
    
    @FXML
    private AnchorPane hbox;
    
    @FXML
    private AnchorPane studTableAnchor;
    
    @FXML
    private JFXDrawer studentDrawer;
    
    @FXML
    private JFXButton admission;

    @FXML
    private JFXButton semester;

    @FXML
    private JFXButton challan;

    @FXML
    private Label labelForCategory;
    
   
    @FXML
    private JFXButton student;
    Stage stage;
    boolean flag=false;        //sets true for current module
    
    @FXML
    void onAction(ActionEvent event) {
        if(event.getSource()==student){
            studTableAnchor.toFront();
            flag=true;
        }
    }
    
    //Start of Add Student
    
     @FXML
    private AnchorPane editStud;

    @FXML
    private FontAwesomeIconView addStudIcon;

    @FXML
    private FontAwesomeIconView updStudIcon;

    @FXML
    private FontAwesomeIconView refStudIcon;

    @FXML
    private MaterialDesignIconView delStudIcon;

    @FXML
    private AnchorPane addStudAnchor;
     
    @FXML
    private AnchorPane studPic;

    @FXML
    private JFXButton addStud;

    @FXML
    private JFXButton updateStud;

    @FXML
    private JFXButton refreshStud;

    @FXML
    private JFXButton delStud;

    @FXML
    private JFXTextField sRno;

    @FXML
    private JFXTextField sFname;

    @FXML
    private JFXTextField sLname;

    @FXML
    private JFXTextField urlImage;

    @FXML
    private JFXTextField sEmail;

    @FXML
    private JFXDatePicker sdob;

    @FXML
    private JFXButton sImage;

    @FXML
    private JFXTextField sFather;

    @FXML
    private JFXButton sSave;

    @FXML
    void addStudent(MouseEvent event) {
        if(event.getSource()==addStud || event.getSource()==addStudIcon){
            addStudAnchor.toFront();
        }
    }

    @FXML
    void delStudent(MouseEvent event) {

    }

    

    @FXML
    void refreshStud(MouseEvent event) {

    }

    @FXML
    void updateStudent(MouseEvent event) {
        if(event.getSource()==updateStud || event.getSource()==updStudIcon){
            editStud.toFront();
        }
    }
    
    //end of Student module
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        hbox.toBack();
        studentDrawer.setSidePane(hbox);
        //studentDrawer.setOverLayVisible(false);
        
        HamburgerBasicCloseTransition tran= new HamburgerBasicCloseTransition(hamburger);
        tran.setRate(-1);
        hamburger.addEventHandler(MouseEvent.MOUSE_CLICKED,(e)->{
            tran.setRate(tran.getRate()*-1);
            tran.play();
            if(studentDrawer.isShown())
                studentDrawer.close();
            else
                studentDrawer.open();
        });
    }

    
}
