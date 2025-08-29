/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package POO.Sem1_2023_2024;

/**
 *
 * @author GENERAL STORES
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ComptePersonPhysiq c1=new ComptePersonPhysiq("Talla","Rene",200000);
        System.out.println(c1);
        ComptePersonPhysiq c2=new ComptePersonPhysiq("rio","saiba",100000);
        System.out.println(c2);
        
        c1.deposer(50000);
        System.out.println(c1);
        c1.retirer(200000);
        System.out.println(c1);
        c1.retirer(100000);
        System.out.println(c1);
        
        CompteEntreprise c3=new CompteEntreprise("Beton","BTP",20000,20000);
        System.out.println(c3);
        
        c3.deposer(2000);
        System.out.println(c3);
        c3.retirer(25000);
        System.out.println(c3);
        
        
    }
    
}
