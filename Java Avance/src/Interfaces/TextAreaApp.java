///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
// */
package Interfaces;
//
//import java.awt.Font;
//import java.io.IOException;
//import javafx.application.Application;
//import javafx.event.ActionEvent;
//import javafx.event.EventHandler;
//import javafx.fxml.FXMLLoader;
//import javafx.scene.Parent;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.control.TextArea;
//import javafx.scene.layout.StackPane;
//import javafx.stage.Stage;
//
///**
// *
// * @author GENERAL STORES
// */
//public class EventHandling extends Application {
//    
//    @Override
//    public void start(Stage primaryStage){
//        // Création d'une zone de texte
//        TextArea tArea = new TextArea();
//        tArea.setPromptText("Entrez votre texte ici..."); // consigne par defaut
//        //boutons
//        Button btnInsert=new Button("Insert");
//        Button btnDelete=new Button("Delete");
//        Button btnQuit=new Button("Quit");
//        
////        FXMLLoader loader = new FXMLLoader(getClass().getResource(
////                    "/Interfaces/EventHandlingFXML.fxml"));
////        Parent root = loader.load();
//        Scene scene = new Scene(root);
//        
//        
//        // Action pour les boutons 
//        btnInsert.setOnAction(event -> {
//            String text = tArea.getText(); // Récupération du texte saisi
//            System.out.println("Texte enregistré : " + text); // Affichage du texte dans la console
//            tArea.clear(); // Efface le texte après l'enregistrement (optionnel)
//        });
//          
//        btnDelete.setOnAction(event -> {
//            tArea.deletePreviousChar();
//        });
//            
//        btnQuit.setOnAction(event -> {
//            primaryStage.close();
//        });
////            
//            primaryStage.setTitle("Event Handling");
//            primaryStage.setScene(scene);
//            primaryStage.show();
//    }
//
//    
//    public static void main(String[] args){
//        launch(args);
//    }
//    
//}
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class TextAreaApp extends Application {

    public static void main(String[] args) {
        launch(args); // Lancement de l'application JavaFX
    }
    
    @Override
    public void start(Stage primaryStage) {
//         Création d'une zone de texte
        TextArea textArea = new TextArea();
        textArea.setPromptText("Entrez votre texte ici..."); // Texte d'invite

        // Création des boutons
        Button btnEnregistrer = new Button("Enregistrer");
        Button btnEffacer = new Button("Effacer");
        Button btnQuitter = new Button("Quitter");

        // Action pour le bouton Enregistrer
        btnEnregistrer.setOnAction(event -> {
            String text = textArea.getText(); // Récupération du texte saisi
            System.out.println("Texte enregistré : " + text); // Affichage du texte dans la console
            textArea.clear(); // Efface le texte après l'enregistrement (optionnel)
        });

        // Action pour le bouton Effacer
        btnEffacer.setOnAction(event -> {
            textArea.clear(); // Efface le contenu de la zone de texte
        });

        // Action pour le bouton Quitter
        btnQuitter.setOnAction(event -> {
            primaryStage.close(); // Ferme la fenêtre principale
        });

        // Création d'un layout vertical et ajout des éléments
        VBox vbox = new VBox(10); // 10 pixels d'espacement entre les éléments
        vbox.getChildren().addAll(textArea, btnEnregistrer, btnEffacer, btnQuitter);

        // Création de la scène et ajout du layout à celle-ci
        Scene scene = new Scene(vbox, 400, 300); // Largeur: 400px, Hauteur: 300px

        primaryStage.setTitle("Application Text Area"); // Titre de la fenêtre principale
        primaryStage.setScene(scene); // Ajout de la scène à la fenêtre principale
        primaryStage.show(); // Affiche la fenêtre principale


//        private BorderPane root = new BorderPane();
//        private HBox btnPanel = new HBox(10);
//        private Label lblTitle = new Label("Event Handling");
//        private TextArea txaMsg = new TextArea();
//        private Button btnInsert = new Button("Insert");
//        private Button btnDelete = new Button("Delete");
//        private Button btnQuit = new Button("Quit");
//        primaryStage.setTitle("Event Handling");
//        root.setPadding(new Insets(10));
//        //--- Title
//        lblTitle.setFont(Font.font("System", FontWeight.BOLD, 20));
//        lblTitle.setTextFill(Color.DARKGREEN);
//        BorderPane.setAlignment(lblTitle, Pos.CENTER);
//        BorderPane.setMargin(lblTitle, new Insets(0, 0, 10, 0));
//        root.setTop(lblTitle);
//        //--- Text-Area
//        txaMsg.setWrapText(true);
//        txaMsg.setPrefColumnCount(15);
//        txaMsg.setPrefRowCount(10);
//        root.setCenter(txaMsg);
//        //--- Button Panel
//        btnPanel.getChildren().add(btnInsert);
//        btnPanel.getChildren().add(btnDelete);
//        btnPanel.getChildren().add(btnQuit);
//        btnPanel.setAlignment(Pos.CENTER_RIGHT);
//        btnPanel.setPadding(new Insets(10, 0, 0, 0));
//        root.setBottom(btnPanel);
//        
//        //--- Button Events Handling
//        btnDelete.addEventHandler(ActionEvent.ACTION,
//        new EventHandler<ActionEvent>() {
//        @Override
//        public void handle(ActionEvent event) {
//        txaMsg.deletePreviousChar();
//        }
//        });
//        Scene scene = new Scene(root);
//        primaryStage.setScene(scene);
//        primaryStage.show();
    }
}
