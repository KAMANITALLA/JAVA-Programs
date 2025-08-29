/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pooSN123_24;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RandomS {
    public static void main(String[] args) {
        // Créer une liste pour stocker les nombres de 0 à 15
        List<Integer> numbers = new ArrayList<>();

        // Remplir la liste avec les nombres de 0 à 15
        for (int i = 0; i < 15; i++) {
            numbers.add(i);
        }
        
        System.out.println("Nombres ordonnes : " + numbers);
        
        // Mélanger la liste au hasard
        Collections.shuffle(numbers);

        // Afficher les nombres mélangés
        System.out.println("Nombres mélangés : " + numbers);
        
//        int[][] tab= new int[3][5];
//        for(int k=0;k<15;k++){
//            for(int i=0;i<=2;i++){
//                for(int j=0;j<=tab.length;j++){
//
//                        tab[i][j]=numbers[k];
//
//                }
//            }
//        }
    }
}

