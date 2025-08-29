/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author GENERAL STORES
 */
public class OneFXMLController implements Initializable {

    @FXML
    private TextField textname;
    @FXML
    private TextField textlname;
    @FXML
    private Label sortie;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void btnok(ActionEvent event) {
        String firstname=textname.getText();
        String lastname=textlname.getText();
        sortie.setText("Welcome "+firstname+" "+lastname);
    }

    @FXML
    private void btnoff(ActionEvent event) {
        textname.setText("");
        textlname.setText("");
        sortie.setText("");
    }
    
}
