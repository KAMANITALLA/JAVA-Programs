/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package GestionRestaurant;

/**
 *
 * @author GENERAL STORES
 */
public class Client {

    /**
     * @param args the command line arguments
     */

    private String nomclient;
    public Client(String nom){//constructeur complet avec parametre
        this.nomclient=nom;
    }
    
    @Override
    public String toString(){
        return this.nomclient;
    }
//    public static void main(String[] args) {
//        // TODO code application logic here
//    } 

    public void setNomclient(String nomclient) {
        this.nomclient = nomclient;
    }

    public String getNomclient() {
        return nomclient;
    }
}
