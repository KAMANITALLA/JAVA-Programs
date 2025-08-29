/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package GestionCatalogue;

/**
 *
 * @author GENERAL STORES
 */
public class Livre extends Papier{
    protected String auteur;
    protected String collection;

    public Livre(Epoque epoque, String titre, int anneePubli,
            double valeur, int nbPages,double largeur,
            double hauteur,String auteur,String collection) {
        super(epoque, titre, anneePubli, valeur, nbPages, largeur, hauteur);
        this.auteur=auteur;
        this.collection=collection;
    }
    
    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) {
//        // TODO code application logic here
//    }
    
}
