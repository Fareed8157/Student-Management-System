/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXDrawer;
import com.jfoenix.controls.JFXHamburger;
import com.jfoenix.controls.JFXNodesList;
import com.jfoenix.controls.JFXSnackbar;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.transitions.hamburger.HamburgerBasicCloseTransition;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import de.jensd.fx.glyphs.materialdesignicons.MaterialDesignIconView;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Cursor;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author Fareed
 */
public class MainView1_1 implements Initializable{
    
    @FXML
    private AnchorPane studTableAnchor;
    @FXML
    private AnchorPane admiTable;
    @FXML
    private AnchorPane semesterTable;
    @FXML
    private AnchorPane challanTable;
    @FXML
    private AnchorPane editAdmi;
    @FXML
    private AnchorPane addAdmi;
    @FXML
    private AnchorPane addSemester;
    @FXML
    private AnchorPane editSemester;
    @FXML
    private AnchorPane addChallan;
    @FXML
    private AnchorPane editChallan;
    
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
    @FXML
    private JFXTextField search;

    @FXML
    private FontAwesomeIconView close;

    @FXML
    private TableView<?> studTable;

    @FXML
    private TableColumn<?, ?> studRollno;

    @FXML
    private TableColumn<?, ?> studFname;

    @FXML
    private TableColumn<?, ?> studLname;

    @FXML
    private TableColumn<?, ?> studMobile;

    @FXML
    private TableColumn<?, ?> studDob;

    @FXML
    private TableColumn<?, ?> studEmail;

    @FXML
    private TableColumn<?, ?> studFather;

    @FXML
    private TableView<?> admTableView;

    @FXML
    private TableColumn<?, ?> admRollno;

    @FXML
    private TableColumn<?, ?> admYoa;

    @FXML
    private TableColumn<?, ?> admDistrict;

    @FXML
    private TableColumn<?, ?> admListno;

    @FXML
    private TableColumn<?, ?> admCpn;

    @FXML
    private TableColumn<?, ?> admStatus;

    @FXML
    private TableView<?> viewSemester;

    @FXML
    private TableColumn<?, ?> semRollno;

    @FXML
    private TableColumn<?, ?> semSemNo;

    @FXML
    private TableColumn<?, ?> semGPA;

    @FXML
    private TableColumn<?, ?> admMIS;

    @FXML
    private TableColumn<?, ?> semYear;

    @FXML
    private TableColumn<?, ?> semStatus;

    @FXML
    private TableView<?> viewChallan;

    @FXML
    private TableColumn<?, ?> challChno;

    @FXML
    private TableColumn<?, ?> challanChType;

    @FXML
    private TableColumn<?, ?> challanChDate;

    @FXML
    private TableColumn<?, ?> chSemesterNo;

    @FXML
    private TableColumn<?, ?> chRollno;

    @FXML
    private JFXTextField addSemRno;

    @FXML
    private JFXTextField addSemNo;

    @FXML
    private JFXTextField addSemGPA;

    @FXML
    private JFXTextField addSemMIS;

    @FXML
    private JFXButton addSemSave;

    @FXML
    private FontAwesomeIconView addSemSaveIcon;

    @FXML
    private JFXDatePicker addSemYear;

    @FXML
    private JFXComboBox<?> addSemStatus;

    @FXML
    private JFXButton addSemCancel;

    @FXML
    private FontAwesomeIconView addSemCancelIcon;

    @FXML
    private AnchorPane editStud;

    @FXML
    private JFXTextField sRno1;

    @FXML
    private JFXTextField sFname1;

    @FXML
    private JFXTextField sLname1;

    @FXML
    private JFXTextField urlImage1;

    @FXML
    private JFXTextField sEmail1;

    @FXML
    private JFXDatePicker sdob1;

    @FXML
    private JFXButton sImage1;

    @FXML
    private JFXTextField sFather1;

    @FXML
    private JFXButton updStudCancel;

    @FXML
    private FontAwesomeIconView updStudCancelIcon;

    @FXML
    private JFXButton updSaveStud;

    @FXML
    private FontAwesomeIconView updStudIconSave;

    @FXML
    private JFXTextField aRno;

    @FXML
    private JFXTextField aCpn;

    @FXML
    private JFXTextField aLname;

    @FXML
    private JFXTextField aStatusOfAdm;

    @FXML
    private JFXTextField aDistrict;

    @FXML
    private JFXButton addAdmSave;

    @FXML
    private FontAwesomeIconView addAdmSaveIcon;

    @FXML
    private JFXDatePicker adob;

    @FXML
    private JFXButton addAdmCancel;

    @FXML
    private FontAwesomeIconView addAdmCancelIcon;

    @FXML
    private AnchorPane addStudAnchor;

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
    private JFXButton addStudSave;

    @FXML
    private FontAwesomeIconView addStudSaveIcon;

    @FXML
    private JFXButton addStudCancel;

    @FXML
    private FontAwesomeIconView addStudCancelIcon;

    @FXML
    private JFXTextField eaRno;

    @FXML
    private JFXTextField eaCpn;

    @FXML
    private JFXTextField eaLname;

    @FXML
    private JFXTextField eaStatusOfAdm;

    @FXML
    private JFXTextField eaDistrict;

    @FXML
    private JFXButton editAdmSave;

    @FXML
    private FontAwesomeIconView editAdmSaveIcon;

    @FXML
    private JFXDatePicker eadob;

    @FXML
    private JFXButton editAdmCancel;

    @FXML
    private FontAwesomeIconView editAdmCancelIcon;

    @FXML
    private JFXTextField editSemRno;

    @FXML
    private JFXTextField editSemNo;

    @FXML
    private JFXTextField editSemGPA;

    @FXML
    private JFXTextField editSemMIS;

    @FXML
    private JFXButton editSemSave;

    @FXML
    private FontAwesomeIconView editSemSaveIcon;

    @FXML
    private JFXDatePicker editSemYear;

    @FXML
    private JFXComboBox<?> editSemStatus;

    @FXML
    private JFXButton editSemCancel;

    @FXML
    private FontAwesomeIconView editSemCancelIcon;

    @FXML
    private JFXTextField addChallanRno;

    @FXML
    private JFXTextField addChallanSemNo;

    @FXML
    private JFXButton addChallanSave;

    @FXML
    private FontAwesomeIconView addChallanSaveIcon;

    @FXML
    private JFXDatePicker addChallanChDate;

    @FXML
    private JFXComboBox<?> addChallanChType;

    @FXML
    private JFXButton addChallanCancel;

    @FXML
    private FontAwesomeIconView addChallanCancelIcon;

    @FXML
    private JFXTextField editChallanRno;

    @FXML
    private JFXTextField editChallanSemNo;

    @FXML
    private JFXButton editChallanSave;

    @FXML
    private FontAwesomeIconView editChallanSaveIcon;

    @FXML
    private JFXButton logoutButton;

    @FXML
    private FontAwesomeIconView logoutIcon;

    
    @FXML
    private JFXDatePicker editChallanChDate;

    @FXML
    private JFXComboBox<?> editChallanChType;

    @FXML
    private JFXButton editChallanCancel;

    @FXML
    private FontAwesomeIconView editChallanCancelIcon;

    @FXML
    void addAdmOnAction(MouseEvent event) {

    }

    @FXML
    void addStudOnAction(MouseEvent event) {

    }

    @FXML
    void challAddOnAction(MouseEvent event) {

    }

    @FXML
    void challEditOnAction(MouseEvent event) {

    }

    @FXML
    void closeStage(MouseEvent event) {
        Scene scene=close.getScene();
        scene.setCursor(Cursor.HAND);
        ((Stage)(close.getScene().getWindow())).close();
    }

    @FXML
    void delStudent(MouseEvent event) {

    }

    @FXML
    void editAdmOnAction(MouseEvent event) {

    }

    @FXML
    void editStudOnAction(MouseEvent event) {

    }


    @FXML
    void semAddOnAction(MouseEvent event) {

    }

    @FXML
    void semEditOnAction(MouseEvent event) {

    }

    private double xOffset=0;
    private double yOffset=0;
    
    Stage stage;
    boolean flag=false;        //sets true for current module
    Integer i=0;
    
    @FXML
    void logout(MouseEvent event) {
        Stage stage=new Stage();
        if(event.getSource()==logoutButton || event.getSource()==logoutIcon){
            Parent root=null;
            try {
                root = FXMLLoader.load(getClass().getResource("/FXML/LoginWindow.fxml"));
            } catch (IOException ex) {
                System.out.println(ex.toString());
            }
         stage.initStyle(StageStyle.TRANSPARENT);
          root.setOnMousePressed(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                xOffset = stage.getX() - event.getScreenX();
                yOffset = stage.getY() - event.getScreenY();
            }
        });
                root.setOnMouseDragged(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                stage.setX(event.getScreenX() + xOffset);
                stage.setY(event.getScreenY() + yOffset);
            }
        });
        Scene scene1 = new Scene(root);
        scene1.setFill(Color.TRANSPARENT);
        stage.setScene(scene1);
        stage.show();
        scene1.setCursor(Cursor.HAND);
        ((Stage)logoutButton.getScene().getWindow()).close();
        
        }
        
    }
    
    @FXML
    void onAction(ActionEvent event) {
        Scene scene=null;
        if(event.getSource()==student){
            scene=student.getScene();
            studTableAnchor.toFront();
            i=1;
        }else if(event.getSource()==admission){
            scene=admission.getScene();
            admiTable.toFront();
            i=2;
        }else if(event.getSource()==semester){
            scene=semester.getScene();
            semesterTable.toFront();
            i=3;
        }else{
            scene=challan.getScene();
            challanTable.toFront();
            i=4;
        }
            
        scene.setCursor(Cursor.HAND);
    }
    
    //Start of Add Student
    
    @FXML
    private FontAwesomeIconView addStudIcon;

    @FXML
    private FontAwesomeIconView updStudIcon;

    @FXML
    private FontAwesomeIconView refStudIcon;

    @FXML
    private MaterialDesignIconView delStudIcon;

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
    private JFXButton sSave;

    @FXML
    private AnchorPane listOfNodes;
    
    
    @FXML
    void addStudent(MouseEvent event) {
        Scene scene=addStud.getScene();
        scene.setCursor(Cursor.HAND);
        if(event.getSource()==addStud || event.getSource()==addStudIcon){
           if(i==1){
            addStudAnchor.toFront();
            }else if(i==2){
             addAdmi.toFront();
            }else if(i==3){
              addSemester.toFront();
            }else if(i==4){
              addChallan.toFront();
            }
        }
    }

    @FXML
    void refreshStud(MouseEvent event) {

    }

    @FXML
    void updateStudent(MouseEvent event) {
        Scene scene=updateStud.getScene();
        scene.setCursor(Cursor.HAND);
        if(event.getSource()==updateStud || event.getSource()==updStudIcon){
            if(i==1){
            editStud.toFront();  
           }else if(i==2){
               editAdmi.toFront();
            }
           else if(i==3){
               editSemester.toFront();
            }else if(i==4){
               editChallan.toFront();
            }
            
        }
        
    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        i=1;
    }
     
}
