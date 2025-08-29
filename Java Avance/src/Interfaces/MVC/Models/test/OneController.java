/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Interfaces.MVC.Models.test;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author GENERAL STORES
 */


import Exceptions.IterateurDesPairs;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class OneController implements Initializable {
    @FXML
    private TextField textField;
    @FXML
    private RadioButton radioButtonPair;
    @FXML
    private Label labelIndice;
    @FXML
    private Label labelValeur;
    @FXML
    private Button buttonSuivant;

    private IterateurDesPairs iterateurDesPairs;
    @FXML
    private RadioButton radioButtonImpair;
    @FXML
    private Button precedent;

    public void initialize() {
        buttonSuivant.setOnAction(event -> onSuivantButtonClicked());
    }

    private void onSuivantButtonClicked() {
        if (radioButtonPair.isSelected()) {
            String input = textField.getText();
            int[] intArray = convertStringToIntArray(input);
            iterateurDesPairs = new IterateurDesPairs(intArray);
            if (iterateurDesPairs.aUnSuivant()) {
                int value = iterateurDesPairs.suivant();
                int index = iterateurDesPairs.indiceDuSuivant();
                labelIndice.setText(String.valueOf(index));
                labelValeur.setText(String.valueOf(value));
            } else {
                labelIndice.setText("X");
                labelValeur.setText("X");
            }
        } else {
            labelIndice.setText("N/A");
            labelValeur.setText("Selectionner 'Pair'");
        }
    }

    private int[] convertStringToIntArray(String input) {
        String[] stringArray = input.trim().split("\\s+");
        int[] intArray = new int[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            try {
                intArray[i] = Integer.parseInt(stringArray[i]);
            } catch (NumberFormatException e) {
                intArray[i] = 0;
            }
        }
        return intArray;
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
