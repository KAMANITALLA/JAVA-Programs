/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */


import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author GENERAL STORES
 */
public class NewFXMain extends Application {
    
    @Override
    public void start(Stage primaryStage) throws Exception{
//        Button btn = new Button();
//        btn.setText("Say 'Hello World'");
//        btn.setOnAction(new EventHandler<ActionEvent>() {
//            
//            @Override
//            public void handle(ActionEvent event) {
//                System.out.println("Hello World!");
//            }
//        });
        
//        StackPane root = new StackPane();
//        root.getChildren().add(btn);
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("oneFXML.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            
            primaryStage.setTitle("Name");
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException iOException) {
            iOException.printStackTrace(); 
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
