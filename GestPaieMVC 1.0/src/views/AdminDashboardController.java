/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package views;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import java.sql.*;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import models.Connexion;
import models.Employe;

/**
 * FXML Controller class
 *
 * @author MIGUEL PYTHON
 */
public class AdminDashboardController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private Label nbEmployes; // Le label pour afficher le nombre d'employés

    // Cette méthode récupère le nombre d'employés dans la base de données
    public void compterEmployes() {
        // Connexion à la base de données
        try (Connection conn = Connexion.getConnection(); Statement stmt = conn.createStatement()) {

            // Requête SQL pour récupérer le nombre d'employés par type
            String sql = "SELECT type, COUNT(*) AS total FROM employe WHERE type IN ('C', 'M', 'R') GROUP BY type";
            ResultSet rs = stmt.executeQuery(sql);

            // Initialisation des variables pour compter les employés par type
            int totalC = 0;
            int totalM = 0;
            int totalR = 0;
            int totalE = 0;

            // Traiter le résultat de la requête
            while (rs.next()) {
                String type = rs.getString("type");
                int total = rs.getInt("total");

                // Mettre à jour le total en fonction du type
                if ("C".equals(type)) {
                    totalC = total;
                } else if ("M".equals(type)) {
                    totalM = total;
                } else if ("R".equals(type)) {
                    totalR = total;
                }
                totalE = totalC+totalM+totalR;
            }

            

           
            nbEmployes.setText(totalC +" Caissiers | "+totalM+" Magazinier | "+totalR+ " Rayonnistes"+" Total Employes : "+totalE);

        } catch (SQLException e) {
            e.printStackTrace();  // Afficher l'exception dans la console en cas d'erreur
        }
    }

    // Cette méthode sera appelée à l'initialisation pour afficher le nombre d'employés
    
    @FXML
    private TableView<Employe> employeTableView;

    @FXML
    private TableColumn<Employe, Integer> idEmColumn;
    @FXML
    private TableColumn<Employe, String> nomEmColumn;
    @FXML
    private TableColumn<Employe, String> emailColumn;
    @FXML
    private TableColumn<Employe, Double> salaireColumn;
    @FXML
    private TableColumn<Employe, Double> primeColumn;
    @FXML
    private TableColumn<Employe, String> dateEmbaucheColumn;
    @FXML
    private TableColumn<Employe, String> numEmColumn;
    @FXML
    private TableColumn<Employe, String> numSecuColumn;
    @FXML
    private TableColumn<Employe, Integer> nbAbsColumn;
    @FXML
    private TableColumn<Employe, String> typeColumn;
    @FXML
    private TableColumn<Employe, String> secteurColumn;

    // Méthode pour charger les employés depuis la base de données
   /* public void loadEmployes() {
        ObservableList<Employe> employeList = FXCollections.observableArrayList();

        try (Connection conn = Connexion.getConnection();
             PreparedStatement stmt = conn.prepareStatement("SELECT * FROM employe");
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Employe employe = new Employe(
                        rs.getInt("idEm"),
                        rs.getString("nomEm"),
                        rs.getString("email"),
                        rs.getDouble("salaire"),
                        rs.getDouble("prime"),
                        rs.getString("dateEmbauche"),
                        rs.getString("numEm"),
                        rs.getString("numSecu"),
                        rs.getInt("nbAbs"),
                        rs.getString("type"),
                        rs.getString("secteur")
                );
                employeList.add(employe);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Remplir les colonnes du TableView avec les données
        idEmColumn.setCellValueFactory(cellData -> cellData.getValue().getIdEm());
        nomEmColumn.setCellValueFactory(cellData -> cellData.getValue().getNomEm());
        emailColumn.setCellValueFactory(cellData -> cellData.getValue().getEmail());
        salaireColumn.setCellValueFactory(cellData -> cellData.getValue().getSalaire());
        primeColumn.setCellValueFactory(cellData -> cellData.getValue().getPrime());
        dateEmbaucheColumn.setCellValueFactory(cellData -> cellData.getValue().getDateEmbauche());
        numEmColumn.setCellValueFactory(cellData -> cellData.getValue().getNumEm());
        numSecuColumn.setCellValueFactory(cellData -> cellData.getValue().getNumSecuEm());
        nbAbsColumn.setCellValueFactory(cellData -> cellData.getValue().getNbAbs());
        typeColumn.setCellValueFactory(cellData -> cellData.getValue().getType());
        secteurColumn.setCellValueFactory(cellData -> cellData.getValue().getSecteur());

        // Ajouter la liste d'employés au TableView
        employeTableView.setItems(employeList);
    }*/
    

}
