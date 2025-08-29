package application;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class Controller implements Initializable {

    @FXML
    private RadioButton impairs;

    @FXML
    private Label indice;

    @FXML
    private RadioButton pairs;

    @FXML
    private Button precedent;

    @FXML
    private Button suivant;

    @FXML
    private TextField tableauDesEntiers;

    @FXML
    private Label valeur;
    
    @FXML
    private ToggleGroup evenOrOdd;
    
    
    private Iterateur i;
    
    @FXML
    public void random(){
    
        tableauDesEntiers.setText("");       
        Random rd = new Random();
        
        int borne = rd.nextInt(14);
        
        for(int i = 0; i <= borne; i++){
            tableauDesEntiers.appendText("  "+rd.nextInt(15));
        }
        
        changeIterator();
        
        tableauDesEntiers.setFocusTraversable(false);
    }
    
    public void radioChanged(){
       evenOrOdd.selectedToggleProperty().addListener(new ChangeListener(){
           @Override
           public void changed(ObservableValue ov, Object t, Object t1) {
               changeIterator();
           }
       });
    }    
    
    public void changeIterator(){
        
        String [] stringThreated = treatString();       
        int [] entier = stringIntoInt(stringThreated);
        
        indice.setText("");
        valeur.setText("");
        
        if(pairs.isSelected())        
            i = new IterateurDesPairs(entier);
        else
            i = new IterateurDesImpairs(entier);
    }
    
    public int [] stringIntoInt(String [] chaine){
        
        int[] entier = new int[chaine.length];
        
        for(int i = 0; i < chaine.length; i++){
            
            int a = Integer.valueOf(chaine[i]);
            entier[i] = a;
        }
        
        return entier;
    }
    
    public String [] treatString(){
        String tableau = tableauDesEntiers.getText();
        tableau = tableau.trim();
        tableau = tableau.replaceAll("  ", ";");
        String [] tab = tableau.split(";");
        return tab;
    }
    
    @FXML
    void next(ActionEvent event) {        
        
        if(i.aUnSuivant()){
           indice.setText(""+i.indiceDuSuivant());
            valeur.setText(""+i.suivant());  
        }
   
    }

    @FXML
    void previous(ActionEvent event) {
        
        if(i.aUnPrecedent()){
           indice.setText(""+i.indiceDuPrecedent());
            valeur.setText(""+i.precedent());  
        }
        
               
    }   

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        random();
        radioChanged();        
    }
    

}
