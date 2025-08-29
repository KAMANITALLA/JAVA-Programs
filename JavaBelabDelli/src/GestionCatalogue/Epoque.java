/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package GestionCatalogue;
import java.io.IOException;
import java.nio.file.*;
//import java.nio.file.Path;
//import java.nio.file.Paths;
import java.util.*;
import javax.swing.JOptionPane;
//import java.util.logging.Level;
//import java.util.logging.Logger;
/**
 *
 * @author GENERAL STORES
 */
public class Epoque {
    private String code;
    private String libelle;
    private List<Document> listdoc=new ArrayList<>();
    private Map<String,List<Document>> tabdoc=new HashMap<>();

    public Epoque(String code, String libelle) {
        this.code = code;
        this.libelle = libelle;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
    
    public void ajoutDoc(Document doc){
        listdoc.add(doc);
    }
    @Override
    public String toString(){
        return this.code+":"+this.libelle;
    }
    
    public boolean isexist(Epoque e){
        if(e.code==null || e.libelle==null){
            return false;
        }
        else{return true;}
    }
    /**
     * @param args the command line arguments
     */
      
}
