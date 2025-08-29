/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package GestionRestaurant;

/**
 *
 * @author GENERAL STORES
 */
public class Plat implements GestionRestaurant.Article{
    private String nomPlat;
    private int prix=0;
    
    public Plat(int prix, String nomPlat){
        this.nomPlat=nomPlat;
        this.prix=prix;
    }

    public String getNomPlat() {
        return nomPlat;
    }

//    public int getPrixPlat() {
//        return prixPlat;
//    }

    public void setNomPlat(String nomPlat) {
        this.nomPlat = nomPlat;
    }

    public void setPrix(int prixPlat) {
        this.prix = prix;
    }
    
    @Override
    public String toString(){
        return "Le plat de "+this.nomPlat+
                " coute: "+this.prix+" €.";
    }

    @Override
    public int getPrix() {
        return this.prix;
    }
    
    
    
    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) {
//        // TODO code application logic here
//    }
    
}
