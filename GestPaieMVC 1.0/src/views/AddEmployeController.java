/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package views;

import java.net.URL;
import java.sql.*;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import models.Connexion;

/**
 * FXML Controller class
 *
 * @author MIGUEL PYTHON
 */
public class AddEmployeController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private TextField nom;
    @FXML
    private TextField email;
    @FXML
    private PasswordField pass;
    @FXML
    private TextField salaire;
    @FXML
    private DatePicker date;
    @FXML
    private TextField tel;
    @FXML
    private TextField securite;
    @FXML
    private TextField abscence;
    @FXML
    private TextField type;
    @FXML
    private TextField secteur;
    @FXML
    private TextField prime;
    @FXML
    private Button ajouter;
    
    // Méthode qui sera appelée quand l'utilisateur clique sur "Ajouter"
    @FXML
    private void handleAddEmploye() {
        // Récupérer les valeurs des champs
        String nomText = nom.getText();
        String emailText = email.getText();
        String passText = pass.getText();
        String salaireText = salaire.getText();
        LocalDate dateEmbauche = date.getValue();
        String telText = tel.getText();
        String securiteText = securite.getText();
        String abscenceText = abscence.getText();
        String typeText = type.getText();
        String secteurText = secteur.getText();
        String primeText = prime.getText();

        // Validation de base
        if (nomText.isEmpty() || emailText.isEmpty() || passText.isEmpty() || salaireText.isEmpty() || dateEmbauche == null ||
            telText.isEmpty() || securiteText.isEmpty() || abscenceText.isEmpty() || typeText.isEmpty() || secteurText.isEmpty() || primeText.isEmpty()) {
            showAlert("Erreur", "Tous les champs doivent être remplis.");
            return;
        }

        try {
            // Conversion des champs numériques
            double salaireVal = Double.parseDouble(salaireText);
            double primeVal = Double.parseDouble(primeText);
            int telVal = Integer.parseInt(telText);
            int abscenceVal = Integer.parseInt(abscenceText);
            
            // Récupérer et transformer le premier caractère du champ "type" en majuscule
            if (!typeText.isEmpty()) {
                typeText = typeText.substring(0, 1).toUpperCase();
            }
            
            Connection conn = null;

            try {
                // Utilisation de la classe Connexion pour obtenir la connexion à la base de données
                conn = Connexion.getConnection(); // Obtenir la connexion à la base de données
                // La requête SQL pour ajouter un employé
                String sql = "INSERT INTO employe (nomEm, email, pass, salaire, prime, dateEmbauche, numEm, numSecu, nbAbs, type, secteur) "
                           + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

                try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                    // Lier les paramètres à la requête SQL
                    stmt.setString(1, nomText);
                    stmt.setString(2, emailText);
                    stmt.setString(3, passText);
                    stmt.setDouble(4, salaireVal);
                    stmt.setDouble(5, primeVal);
                    stmt.setDate(6, java.sql.Date.valueOf(dateEmbauche));
                    stmt.setInt(7, telVal);
                    stmt.setString(8, securiteText);
                    stmt.setInt(9, abscenceVal);
                    stmt.setString(10, typeText);
                    stmt.setString(11, secteurText);

                    // Exécuter la requête
                    stmt.executeUpdate();

                    // Afficher un message de succès
                    showAlert("Succès", "L'employé a été ajouté avec succès.");
                } catch (SQLException e) {
                    showAlert("Erreur", "Erreur lors de l'ajout de l'employé: " + e.getMessage());
                }
            } catch (SQLException e) {
                showAlert("Erreur", "Erreur de connexion à la base de données: " + e.getMessage());
            }
        } catch (NumberFormatException e) {
            showAlert("Erreur", "Assurez-vous que les champs numériques (Salaire, Prime, Téléphone, Sécurité sociale, Absences) sont valides.");
        }
    }

    // Méthode pour afficher des alertes
    private void showAlert(String title, String message) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }


}
