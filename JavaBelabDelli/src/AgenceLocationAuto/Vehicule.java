/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package AgenceLocationAuto;

/**
 *
 * @author GENERAL STORES
 */
public interface Vehicule {
    String getMarque();
    String getModele();
    int getAnneeDeProduction();
    double prixLocationParJour();
    boolean equals();
    String toString();
    
}
