/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package GestionRestaurant;

/**
 *
 * @author GENERAL STORES
 */
public class Table {
    private static int nbTab=0;
    private int id;
    private int capacite;
//    private Map<id, valeur> map;
    public Table(int capacite){
//        nbTab++;
//        map = new HashMap<id, valeur>() ;
        this.capacite=capacite;
        this.id = ++nbTab;
    }

    public static int getNbTab() {
        return nbTab;
    }

    public int getId() {
        return id;
    }

    public static void setNbTab(int nbTab) {
        Table.nbTab = nbTab;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }
    
    @Override
    public String toString(){
        return "Table "+this.id+"("+this.capacite+"places)\n";
    }
    
    public int getCapacite(){
        return this.capacite;
    }
    
    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) {
//        // TODO code application logic here
//    }
    
}
