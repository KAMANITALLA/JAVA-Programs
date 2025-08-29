/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package GestionCatalogue;

/**
 *
 * @author GENERAL STORES
 */
public class Video extends Media{
    protected String realisateur;
    protected String acteur;

    public Video(Epoque epoque, String titre, int anneePubli,
            double valeur, String format, int duree,String realisateur,
            String acteur) {
        super(epoque, titre, anneePubli, valeur, format, duree);
        this.realisateur=realisateur;
        this.acteur=acteur;
    }
    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) {
//        // TODO code application logic here
//    }
    
}
