/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package LocationVehicules;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author GENERAL STORES
 */
public class Loueur {
    private String nomL;
    private List<Vehicule> vehicule=new ArrayList<>();

    public Loueur(String nomL) {
        this.nomL = nomL;
    }
    
    @Override
    public String toString(){
        return "Nom du loueur: "+nomL;
    }
    
    public void ajoutVeh(Vehicule v){
//        for(Vehicule i:vehicule){
//            if(vehicule[i]==null)
//                vehicule[i].add(v);
//        }    
        vehicule.add(v);
    }
    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) {
//        // TODO code application logic here
//    }
    
}
