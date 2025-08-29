/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pooSN123_24;

import java.util.Random;

public class RandomSort {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[16];

        // Remplir le tableau avec les nombres de 0 à 15
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }

        // Mélanger le tableau en utilisant la classe Random
        for (int i = 0; i < numbers.length; i++) {
            // Générer un index aléatoire entre 0 et 15
            int randomIndex = random.nextInt(numbers.length);

            // Échanger les éléments à l'index actuel et à l'index aléatoire
            int temp = numbers[i];
            numbers[i] = numbers[randomIndex];
            numbers[randomIndex] = temp;
        }

        // Afficher les nombres mélangés
        System.out.print("Nombres mélangés : ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}

