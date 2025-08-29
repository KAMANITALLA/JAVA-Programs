/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package LocationVehicules;

/**
 *
 * @author GENERAL STORES
 */
public abstract class Vehicule {
    protected String nomV;
    protected int immatri;

    public Vehicule(String nomV, int immatri) {
        this.nomV = nomV;
        this.immatri = immatri;
    }
    
    @Override
    public abstract String toString();
    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) {
//        // TODO code application logic here
//    }
    
}
