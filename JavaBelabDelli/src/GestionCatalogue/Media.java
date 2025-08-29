/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package GestionCatalogue;

/**
 *
 * @author GENERAL STORES
 */
public class Media extends Document{
    protected String format;
    protected int duree;

    public Media(Epoque epoque, String titre, int anneePubli,
            double valeur,String format,int duree) {
        super(epoque, titre, anneePubli, valeur);
        this.format=format;
        this.duree=duree;
    }
    
    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) {
//        // TODO code application logic here
//    }
    
}
