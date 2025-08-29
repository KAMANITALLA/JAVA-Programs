/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package GestionCatalogue;

/**
 *
 * @author GENERAL STORES
 */
public abstract class Document {
    protected String titre;
    protected int anneePubli;
    protected double valeur;
    protected Epoque epoque;

    public Document(Epoque epoque, String titre, int anneePubli, double valeur) {
        this.titre = titre;
        this.anneePubli = anneePubli;
        this.valeur = valeur;
        this.epoque = epoque;
    }
    
    
    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) {
//        // TODO code application logic here
//    }
    
}
