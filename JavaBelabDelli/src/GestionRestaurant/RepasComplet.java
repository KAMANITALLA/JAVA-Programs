/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package GestionRestaurant;

/**
 *
 * @author GENERAL STORES
 */
public class RepasComplet implements GestionRestaurant.Article{
    private String nomf;
    private String entree;
    private String platprin;
    private String dessert;
    private int prix;
    
    public RepasComplet(String nomf,int prix,String entree,
            String platprin,String dessert
    ){
        this.nomf=nomf;
        this.prix=prix;
        this.entree=entree;
        this.platprin=platprin;
        this.dessert=dessert;
    }
//    
//    public int getPrix(){
//        return this.prixf;
//    }
    @Override
    public String toString(){
        return this.nomf+"("+this.entree+"+"
                +this.platprin+"+"+this.dessert+
                "): "+this.prix+"€.";
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
