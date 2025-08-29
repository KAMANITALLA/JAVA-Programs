/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package Interfaces.MVC.Models;

import java.awt.Insets;
//import javafx.geometry.Insets;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author GENERAL STORES
 */
public class ObsFXMain extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Chapter 1-11 Creating and Working with ObservableLists");
        Group root = new Group();
        Scene scene = new Scene(root, 400, 250, Color.WHITE);
        // create a grid pane
        GridPane gridpane = new GridPane();
//        gridpane.setPadding(new Insets(5));
        gridpane.setHgap(10);
        gridpane.setVgap(10);
        // candidates label
        Label candidatesLbl = new Label("Candidates");
        GridPane.setHalignment(candidatesLbl, HPos.CENTER);
        gridpane.add(candidatesLbl, 0, 0);
        Label heroesLbl = new Label("Heroes");
        gridpane.add(heroesLbl, 2, 0);
        GridPane.setHalignment(heroesLbl, HPos.CENTER);
        // candidates
        final ObservableList<String> candidates =
        FXCollections.observableArrayList("Superman",
        "Spiderman",
        "Wolverine",
        "Police",
        "Fire Rescue",
        "Soldiers",
        "Dad & Mom",
        "Doctor",
        "Politician",
        "Pastor",
        "Teacher");
        final ListView<String> candidatesListView = new ListView<String>(candidates);
        candidatesListView.setPrefWidth(150);
        candidatesListView.setPrefHeight(150);
        gridpane.add(candidatesListView, 0, 1);
        // heros
        final ObservableList<String> heroes = FXCollections.observableArrayList();
        
        final ListView<String> heroListView = new ListView<String>(heroes);
        heroListView.setPrefWidth(150);
        heroListView.setPrefHeight(150);
        gridpane.add(heroListView, 2, 1);
        // select heroes
        Button sendRightButton = new Button(">");
        sendRightButton.setOnAction(new EventHandler<ActionEvent>() {
        public void handle(ActionEvent event) {
        String potential = candidatesListView.getSelectionModel().getSelectedItem();
        if (potential != null) {
        candidatesListView.getSelectionModel().clearSelection();
        candidates.remove(potential);
        heroes.add(potential);
        }
        }
        });
        // deselect heroes
        Button sendLeftButton = new Button("<");
        sendLeftButton.setOnAction(new EventHandler<ActionEvent>() {
        public void handle(ActionEvent event) {
        String notHero = heroListView.getSelectionModel().getSelectedItem();
        if (notHero != null) {
        heroListView.getSelectionModel().clearSelection();
        heroes.remove(notHero);
        candidates.add(notHero);
        }
        }
        });
        
        // HBox, label, button ADD and DEL
        HBox hbox=new HBox();
        Button a=new Button("ADD");
        Button b=new Button("DEL");
        TextField TF=new TextField();
//        String txt=new String();
        
        gridpane.add(TF, 0, 2);
        hbox.setSpacing(5);
        hbox.setAlignment(Pos.CENTER);
        hbox.getChildren().add(a);
        hbox.getChildren().add(b);
        gridpane.add(hbox, 2, 2);
        
        //evenement des nouveaux boutons ADD et DEL 
        a.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                String chn = new String(TF.getText());
//                if (chn == null) {
//                    candidatesListView.append(candidates.getSelectionModel().clearSelectionModels());
                    candidates.add(chn);
                    TF.clear();
                
            }
        });
        b.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                String chn = candidatesListView.getSelectionModel().getSelectedItem();
                if (chn != null) {
                    candidatesListView.getSelectionModel().clearSelection();
                    candidates.remove(chn);
                }
            }
        });
        
        VBox vbox = new VBox(5);
        vbox.getChildren().addAll(sendRightButton,sendLeftButton);
        gridpane.add(vbox, 1, 1);
        GridPane.setConstraints(vbox, 1, 1, 1, 2,HPos.CENTER, VPos.CENTER);
        root.getChildren().add(gridpane);
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
