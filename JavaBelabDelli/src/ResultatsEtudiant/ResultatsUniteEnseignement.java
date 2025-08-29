/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ResultatsEtudiant;

/**
 *
 * @author GENERAL STORES
 */
public class ResultatsUniteEnseignement {
    private Notes note;
    private String nom;
    
    public ResultatsUniteEnseignement(String nom, Notes note){
        this.nom=nom;
        this.note=note;
    }
    
    public String getNom() {
        return nom;
    }
    public Notes getNote(){
        return note;
    }

    public void setNote(Notes note) {
        this.note = note;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    
    
    @Override
    public String toString(){
       return  nom+" : "+note;
       
    }
    /**
     * @param args the command line arguments
     */
    //public static void main(String[] args) {
        // TODO code application logic here
    //}
    
}
