/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package POOTheatre;

/**
 *
 * @author GENERAL STORES
 */
public class Intermittent extends Membre{
    private static double tauxHoraire=15;
    
    public Intermittent(){
        super();
    }
    public Intermittent(String nom,String n,TypeRole role){
        super(nom,n,role);
    }
    
    public static double getTauxHoraire() {
        return tauxHoraire;
    }
    
    public static void setTauxHoraire(double d){
        tauxHoraire=d;
    }

    @Override
    public double salaireMensuel() {
        return tauxHoraire*140;
    }

}
