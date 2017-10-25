/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import de.jensd.fx.glyphs.materialdesignicons.MaterialDesignIconView;
import java.awt.event.MouseEvent;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author Fareed
 */
public class MainView implements Initializable{

    @FXML
    private AnchorPane rootPane;

    @FXML
    private TableView<?> proTable;

    @FXML
    private TableColumn<?, ?> id;

    @FXML
    private TableColumn<?, ?> name;

    @FXML
    private TableColumn<?, ?> desc;

    @FXML
    private TableColumn<?, ?> unitPrice;

    @FXML
    private TableColumn<?, ?> stockIn;

    @FXML
    private TableColumn<?, ?> stockOut;

    @FXML
    private TableColumn<?, ?> pCategory;

    @FXML
    private JFXButton newItem;

    @FXML
    private JFXButton updateItem;

    @FXML
    private JFXButton deleteItem;

    @FXML
    private JFXButton closeButton;

    @FXML
    private JFXTextField pSearch;

    @FXML
    private MaterialDesignIconView close;

    @FXML
    private FontAwesomeIconView searchIcon;

    @FXML
    private JFXButton refresh;

    @FXML
    private ImageView imv;

    @FXML
    private JFXButton refresh11;

    @FXML
    private JFXButton refresh111;

    @FXML
    private JFXButton supplier;

    @FXML
    private JFXButton refresh1;

    

    @FXML
    void onAction(ActionEvent event) {

    }

    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }
    
}
