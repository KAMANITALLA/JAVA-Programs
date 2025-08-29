/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package FichiersInputOuput;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Objects;
import java.util.Scanner;

public class QCM2 {

    public static void main(String[] args) throws IOException {
        // Ouverture des fichiers pour écrire les questions
        String filename = "C:\\Users\\GENERAL STORES\\OneDrive\\Documents\\NetBeansProjects\\Java Avance\\src\\FichiersInputOuput\\question.txt";
        PrintWriter p = new PrintWriter(new BufferedWriter(new FileWriter(filename)));

        // Écriture des questions
        p.println("Le soleil se leve a l'Est et se couche a l'Ouest ?");
        p.println("Est-il vrai que Dieu a tout creer en 1 semaine ?");
        p.println("Les camerounais sont-ils tous pauvre ?");
        p.println("Le Cameroun est un pays de l'afrique du sud ?");
        p.println("Il y a des justices equitable sur Terre.");
        
        // Fermeture
        p.close();

        // Ouverture des fichiers pour écrire les réponses
        String filename2 = "C:\\Users\\GENERAL STORES\\OneDrive\\Documents\\NetBeansProjects\\Java Avance\\src\\FichiersInputOuput\\reponses.txt";
        PrintWriter f = new PrintWriter(new BufferedWriter(new FileWriter(filename2)));

        // Écriture des réponses
        f.println("True");
        f.println("True");
        f.println("False");
        f.println("False");
        f.println("True");

        // Fermeture
        f.close();

        // Lecture des questions et réponses
        BufferedReader r = new BufferedReader(new FileReader(filename));
        BufferedReader r2 = new BufferedReader(new FileReader(filename2));

        String question, correctAnswer;
        
        int score = 0; // Initialisation du score
        int totalQuestions = 5; // Nombre total de questions

        Scanner scanner = new Scanner(System.in);

        while ((question = r.readLine()) != null && (correctAnswer = r2.readLine()) != null) {
            System.out.print(question + " (True/False): ");
            String userAnswer = scanner.nextLine().trim(); // Lire la réponse utilisateur

            if (userAnswer.equalsIgnoreCase(correctAnswer)) {
                score++;
                System.out.println("Réponse correcte !");
            } else {
                System.out.println("Mauvaise réponse. La bonne réponse est: " + correctAnswer);
            }
            System.out.println(); // Ligne vide pour séparer les questions
       }

       System.out.println("SCORE: " + score + "/" + totalQuestions); // Affichage du score final

       r.close();
       r2.close();
       scanner.close();
    }
}

