/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exos;

/**
 *
 * @author GENERAL STORES
 */
import java.util.Scanner;
public class Exos {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double Dc,Df;
        Scanner S=new Scanner(System.in);
        /*System.out.print("Entrer une valeur de temperature: Dc= ");
        Dc= S.nextDouble();
        System.out.print("Vous avez entre la temperature: Dc= "+Dc+" °C");
        Df=(Dc*(9/5))+32;
        System.out.println("La temperature en farenheit sera: Df= "+Df+" °F");
        */
        // pour un tableau de temperatures on aura:
        System.out.print("Entrer la derniere valeur de temperature: Dc= ");
        Dc= S.nextDouble();
        System.out.println("Vous avez entre la temperature: Dc= "+Dc+" °C");
        System.out.println("Celcius (°C) || Farenheit(°F)");
        for(double i=0; i<Dc; i++){
            Df=(i*(9/5))+32;
            System.out.println(i+" °C      || "+Df+" °F");
        }
        //*/
        
        
// TODO code application logic here
    }
    
}
