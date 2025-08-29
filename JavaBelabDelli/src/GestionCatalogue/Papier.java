/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package GestionCatalogue;

/**
 *
 * @author GENERAL STORES
 */
public class Papier extends Document{

    protected int nbPages;
    protected double largeur;
    protected double hauteur;

    public Papier(Epoque epoque, String titre, int anneePubli, double valeur,int nbPages,double largeur,double hauteur) {
        super(epoque, titre, anneePubli, valeur);
        this.nbPages = nbPages;
        this.largeur = largeur;
        this.hauteur = hauteur;
    }
   
    
    
    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) {
//        // TODO code application logic here
//    }
    
}
