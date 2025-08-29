/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package GestionCatalogue;

/**
 *
 * @author GENERAL STORES
 */
public class Magazine extends Papier {
    protected int numero;
    protected String theme;

    public Magazine(Epoque epoque, String titre, int anneePubli,
            double valeur, int nbPages, double largeur,double hauteur,
            int numero,String theme) {
        super(epoque, titre, anneePubli, valeur, nbPages, largeur, hauteur);
        this.numero=numero;
        this.theme=theme;
    }
    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) {
//        // TODO code application logic here
//    }
    
}
