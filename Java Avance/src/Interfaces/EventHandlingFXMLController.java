/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Interfaces;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author GENERAL STORES
 */
public class EventHandlingFXMLController implements Initializable{


//import javafx.fxml.FXML;
//import javafx.scene.control.Button;
//import javafx.scene.control.TextArea;
    @FXML // fx:id="btnDelete"
    private Button btnDelete; // Value injected by FXMLLoader

    @FXML // fx:id="btnInsert"
    private Button btnInsert; // Value injected by FXMLLoader

    @FXML // fx:id="btnQuit"
    private Button btnQuit; // Value injected by FXMLLoader

    @FXML // fx:id="tArea"
    private TextArea tArea; // Value injected by FXMLLoader


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void actionInsert(ActionEvent event) {
    }

    @FXML
    private void actionDelete(ActionEvent event) {
    }

    @FXML
    private void actionQuit(ActionEvent event) {
    }
    
}
