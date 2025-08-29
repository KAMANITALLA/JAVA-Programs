/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package GestionCatalogue;

/**
 *
 * @author GENERAL STORES
 */
public class Audio extends Media{
    protected String auteur;
    protected String interprete;

    public Audio(Epoque epoque, String titre, int anneePubli,
            double valeur,String format,int duree,String auteur,
            String interprete) {
        super(epoque, titre, anneePubli, valeur, format, duree);
        this.auteur=auteur;
        this.interprete=interprete;
    }
    
    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) {
//        // TODO code application logic here
//    }
    
}
