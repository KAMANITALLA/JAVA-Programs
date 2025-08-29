/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package Interfaces;

import java.awt.Font;
import java.awt.Insets;
//import javafx.geometry.Insets;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

//import javafx.geometry.Insets;

/**
 *
 * @author GENERAL STORES
 */
public class NFXMain extends Application {
    private BorderPane root = new BorderPane();
    private HBox btnPanel = new HBox(10);
    private Label lblTitle = new Label("Event Handling");
    private TextArea txaMsg = new TextArea();
    private Button btnInsert = new Button("Insert");
    private Button btnDelete = new Button("Delete");
    private Button btnQuit = new Button("Quit");
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) {
        
        try {
            primaryStage.setTitle("Event Handling");
//            root.setPadding(new Insets(10));
            //--- Title
//            lblTitle.(Font.font("System", FontWeight.BOLD, 20));
            lblTitle.setTextFill(Color.DARKGREEN);
            BorderPane.setAlignment(lblTitle, Pos.CENTER);
//            BorderPane.setMargin(lblTitle, new Insets(0, 0, 10, 0));
            root.setTop(lblTitle);
            //--- Text-Area
            txaMsg.setWrapText(true);
            txaMsg.setPrefColumnCount(15);
            txaMsg.setPrefRowCount(10);
            root.setCenter(txaMsg);
            //--- Button Panel
            btnPanel.getChildren().add(btnInsert);
            btnPanel.getChildren().add(btnDelete);
            btnPanel.getChildren().add(btnQuit);
            btnPanel.setAlignment(Pos.CENTER_RIGHT);
//            btnPanel.setPadding(new Insets(10, 0, 0, 0));
//            btnPanel.setPadding(new Insets(10, 0, 0, 0));
            root.setBottom(btnPanel);

            //--- Button Events Handling
            btnDelete.addEventHandler(ActionEvent.ACTION,
                    new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    txaMsg.deletePreviousChar();
                }
            });
            
            btnQuit.addEventHandler(ActionEvent.ACTION,
                    new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    primaryStage.close();
                }
            });
            
            btnInsert.addEventHandler(ActionEvent.ACTION,
                    new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    txaMsg.appendText("ABC");
                }
            });

            //--- Button Events Handling
//       btnInsert.setOnAction(event -> {
//       txaMsg.appendText("A");
//       });
//       btnDelete.setOnAction(event -> {
//       txaMsg.deletePreviousChar();
//       });
//       btnQuit.setOnAction(event -> {
//       primaryStage.close();
//       });
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
