/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exceptions;

/**
 *
 * @author GENERAL STORES
 */  
public class TestIterateur{
    public TestIterateur(String message, int[] t){
//        IterateurDesPairs i= new IterateurDesPairs(t);
        IterateurDesImpairs i= new IterateurDesImpairs(t);
//        System.out.println("");
        System.out.print("\n"+message);
        while(i.aUnSuivant()){
            int indice =i.indiceDuSuivant();
            int valeur =i.suivant();
            System.out.print(indice+"->"+valeur+",");
        }
    }
    

    public static void main(String[] args) {
        
        new TestIterateur("test1 : ", new int[]{1,2,6,7,8,9,11,12,14,13,5});
        new TestIterateur("test2 : ", new int[]{2,79});
        new TestIterateur("test3 : ", new int[]{});
    }
    
}
