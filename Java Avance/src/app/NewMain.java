/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;

/**
 *
 * @author GENERAL STORES
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       telephone t1 = new telephone("TECNO","noir","mobile",50000,2);
       ordinateur o1 = new ordinateur("DELL","rouge","portable",250000,15);
       ordinateur o2 = new ordinateur("Lenovo","gris","portable",150000,17.5);
        actions[] TabApp = { o1,t1};
        for(actions i : TabApp){
            i.allumer();
            i.telecharger();
            i.toString();
            //i.equals(o2);
            System.out.println("___________________________");
        }
    }
 
}
