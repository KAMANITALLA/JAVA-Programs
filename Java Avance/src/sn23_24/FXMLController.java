/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package sn23_24;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author GENERAL STORES
 */
public class FXMLController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private Button btnCalcul;

    @FXML
    private Button btnDelete;

    @FXML
    private TextField entier1;

    @FXML
    private TextField entier2;

    @FXML
    private Label produit;

    @FXML
    private Label somme;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void Calcul(ActionEvent event) {
        try {
            // Récupérer les valeurs des labels entier1 et 2
            int nombre1 = Integer.parseInt(entier1.getText());
            int nombre2 = Integer.parseInt(entier2.getText());

            // Calcule  somme et  produit
            int resultatSomme = nombre1 + nombre2;
            int resultatProduit = nombre1 * nombre2;

            // Affichage les résultats dans les labels
            somme.setText(String.valueOf(resultatSomme));
            produit.setText(String.valueOf(resultatProduit));
        } catch (NumberFormatException e) {
            // Gérer l'erreur si l'utilisateur entre une valeur non entière
            somme.setText("Erreur");
            produit.setText("Erreur");
        }
    }

    @FXML
    private void Delete(ActionEvent event) {
        // Réinitialiser les champs de texte et labels à vide ou à zéro si nécessaire
        entier1.clear();
        entier2.clear();
        somme.setText("0");
        produit.setText("0");
    }
    
}
