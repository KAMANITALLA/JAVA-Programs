package Interfaces.MVC.Models;

import Exceptions.IterateurDesImpairs;
import Exceptions.IterateurDesPairs;
import java.util.ArrayList;
import java.util.List;
import javafx.application.Application;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import static javafx.scene.paint.Color.color;
import static javafx.scene.text.Font.font;
import javafx.stage.Stage;

/**
 *
 * @author GENERAL STORES
 */
public class IteratorFXMain extends Application {
    private TextField number;
    @Override
    public void start(Stage primaryStage) {
        try {
            primaryStage.setTitle("Liste de Pair/Impair");//nom de la fenetre
            VBox root = new VBox();// creation d'un table vertical
            Scene scene = new Scene(root, 458, 345, Color.DARKGREY);//creation d'une scene
            root.setAlignment(Pos.TOP_CENTER);
            root.setPrefWidth(458);
            root.setSpacing(15);
//            root.setPadding(Insets(10); ou-->
            root.setStyle("-fx-padding: 10; -fx-margin: 20;"); // padding et margin avec CSS

            
            number=new TextField();
            number.setAlignment(Pos.CENTER);
            number.setPrefWidth(458);
            number.setPrefHeight(45);
            number.setPromptText("Inserer votre sequence de chiffres au format: 12 0 1 23 ...");
            number.setFont(font("Times New Roman",15));
            number.setPrefWidth(280);
            root.getChildren().add(number);
            
            HBox hbox=new HBox();
            hbox.setSpacing(10);
            
            VBox vbox1 = new VBox();
            VBox vbox2 = new VBox();
            VBox vbox3 = new VBox();
        
            RadioButton radpair=new RadioButton("    Pair");
            RadioButton radimpair=new RadioButton("Impair");
            Label indice=new Label("-1");
            Label valeur=new Label("00");
            Label ind=new Label("Indice");
            Label val=new Label("Valeur");
            
            radpair.setFont(font("Times New Roman"));
            radimpair.setFont(font("Times New Roman"));
            
            indice.setStyle("-fx-background-color:White");
            indice.setAlignment(Pos.CENTER);
            indice.setPrefWidth(50);
            indice.setPrefHeight(50);
            indice.setTextFill(Color.GRAY); // Couleur grisée
//            indice.setOpacity(0.5); // Opacité 50%
            valeur.setStyle("-fx-background-color:White");
            valeur.setAlignment(Pos.CENTER);
            valeur.setPrefWidth(50);
            valeur.setPrefHeight(50);
            valeur.setTextFill(Color.GRAY); // Couleur grisée
//            valeur.setOpacity(0.5); // Opacité 50%
            
            vbox1.setSpacing(10);
            vbox1.setAlignment(Pos.CENTER);
            vbox1.setPrefWidth(148);
            vbox1.setPrefHeight(145);
            
            vbox2.setSpacing(10);
            vbox2.setAlignment(Pos.CENTER);
            vbox2.setPrefWidth(164);
            vbox2.setPrefHeight(145);
            
            vbox3.setSpacing(10);
            vbox3.setAlignment(Pos.CENTER);
            vbox3.setPrefWidth(146);
            vbox3.setPrefHeight(145);
            
            vbox1.getChildren().add(radpair);
            vbox1.getChildren().add(radimpair);
            vbox2.getChildren().add(indice);
            vbox2.getChildren().add(ind);
            vbox3.getChildren().add(valeur);
            vbox3.getChildren().add(val);
            
            
            hbox.getChildren().add(vbox1);
            hbox.getChildren().add(vbox2);
            hbox.getChildren().add(vbox3);
            root.getChildren().add(hbox);
            
            Button precedent=new Button("PRECEDENT");
            Button suivant=new Button("SUIVANT");
            precedent.setPrefWidth(180);
            precedent.setPrefHeight(75);
            suivant.setPrefWidth(180);
            suivant.setPrefHeight(75);
            
            HBox hbox1=new HBox();
            hbox1.setAlignment(Pos.CENTER);
            hbox1.setSpacing(10);
            hbox1.getChildren().add(precedent);
            hbox1.getChildren().add(suivant);
            
            root.getChildren().add(hbox1);
           
//            String s=number.getText();
            String[] numbers=parsing();
            int[] intnumber= convertirs(numbers);
            
            IterateurDesPairs itpair=new IterateurDesPairs(intnumber);
            IterateurDesImpairs itimpair=new IterateurDesImpairs(intnumber);
            
//            indice.textProperty().bind(compteur.asString());
//            valeur.textProperty().bind(compteur1.asString());
//
//            suivant.setOnAction(e -> {
//                if (radpair.isSelected() && itpair.aUnSuivant()) {
//                    compteur.set(itpair.indiceDuSuivant());
//                    compteur1.set(itpair.suivant());
//                }else if (radimpair.isSelected() && itimpair.aUnSuivant()) {
////                    System.out.println(stringnumber);
//                    compteur.set(itimpair.indiceDuSuivant());
//                    compteur1.set(itimpair.suivant());
//                }else{
//                    System.out.println("Option non prise en charge");
//                }
//            });
            


            suivant.setOnAction(e -> {
                   // Action pour aller à l'élément suivant
                    if (radpair.isSelected() && itpair.aUnSuivant()) {
                        indice.setText(itpair.indiceDuSuivant() + "");
                        valeur.setText(itpair.suivant() + "");
                    } else if (radimpair.isSelected() && itimpair.aUnSuivant()) {
                        indice.setText(itimpair.indiceDuSuivant() + "");
                        valeur.setText(itimpair.suivant() + "");
                    }
            });

            
//            precedent.setOnAction(e -> {
//                if (radpair.isSelected()) {
//                    compteur.set(itpair.indiceDuSuivant());
//                    compteur1.set(itpair.suivant());
//                }
//            });
            
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
//private IntegerProperty compteur = new SimpleIntegerProperty(0);
//private IntegerProperty compteur1 = new SimpleIntegerProperty(0);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

    public static int[] convertirs(String[] chaine) {
        
        try {
            if (chaine == null) {
                System.out.println("Erreur de conversion : La chaîne est null");
                return new int[0]; // Retourne un tableau vide au lieu de null
            }
            List<Integer> entiers=new ArrayList<>();
            for(String ch : chaine) {
               entiers.add(Integer.valueOf(ch));
            }
            int[] entier = new int[entiers.size()]; // Crée un tableau d'entiers
            
            for(int i=0;i<entiers.size();i++) {
                entier[i]=entiers.get(i);
            }
            return entier;
        } catch (NumberFormatException e) {
            System.out.println("Erreur de conversion : La chaîne ne contient pas "
                    + "uniquement des nombres.");
            return new int[0]; // Retourne null en cas d'erreur (ou lancez une exception)
        }
    }
    
    public String[] parsing(){
        String val=number.getText();
        val=val.trim();
        val= val.replaceAll(" ", ";");
        String[] tab=val.split(";");
        return tab;
    }
    
    
    
}
