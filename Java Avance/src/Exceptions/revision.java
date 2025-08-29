/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exceptions;

/**
 *
 * @author GENERAL STORES
 */
public class revision {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("DEBUT");
        try {
            int a = 3;
            int b = 0;
            int c=a/0;
            int[] tab={1,3,2,6,5,10};
            System.out.println(tab[6]);
        } catch (Exception e) {
            System.out.println(e);
//              throw e;
        }
        System.out.println("FIN");
    }
    
}
