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

/**
 *
 * @author GENERAL STORES
 */
public class QCM {

    /**
     * @param args the command line arguments
     */
//    public static String lireLigne(String filePath, int lineNumber) throws IOException {
//        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\GENERAL STORES\\OneDrive\\Documents\\NetBeansProjects\\Java Avance\\src\\FichiersInputOuput\\reponses.txt"))) {
//            String line;
//            int currentLine = 1;
//            while ((line = reader.readLine()) != null) {
//                if (currentLine == lineNumber) {
//                    return line;
//                }
//                currentLine++;
//            }
//        }
//        return null; // Ligne non trouvée
//    }
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        //Ouverture
        String filename = "C:\\Users\\GENERAL STORES\\OneDrive\\Documents\\NetBeansProjects\\Java Avance\\src\\FichiersInputOuput\\question.txt";
        PrintWriter p = new PrintWriter(
                new BufferedWriter(
                        new FileWriter(filename)));
        //Écriture
        p.println("Le soleil se leve a l' Est et se couche a l'Ouest ? ");
        p.println("Est-il vrai que Dieu a tout creer en 1 semaine ? ");
        p.println("Les camerounais sont-ils tous pauvre ? ");
        p.println("Le Cameroun est un pays de l'afrique du sud ? ");
        p.println("Il y a des justices equitable sur Terre. ");
        //Fermeture
        p.close();
        //Ouverture
        String filename2 = "C:\\Users\\GENERAL STORES\\OneDrive\\Documents\\NetBeansProjects\\Java Avance\\src\\FichiersInputOuput\\reponses.txt";
        PrintWriter f = new PrintWriter(
                new BufferedWriter(
                        new FileWriter(filename2)));
        //Écriture
        f.println("True");
        f.println("True");
        f.println("False");
        f.println("False");
        f.println("True");
        //Fermeture
        f.close();
        
        BufferedReader r = new BufferedReader(
            new FileReader(filename));
        BufferedReader r2 = new BufferedReader(
            new FileReader(filename2));

        String s,s2;
        int l=0,n=0;
        s = r.readLine();
        s2=r2.readLine();
        Scanner a=new Scanner(System.in);
        
        while (s != null && s2!=null) {
//            String ll=lireLigne(filename2,l+=1);
            System.out.print(s);
            Boolean b=a.nextBoolean();
            if(Objects.equals(b, s2)){
                n+=1;
                System.out.println("reponse correcte");
            }else{
                System.out.println("mauvaise reponse. La bonne est: "+s2);
            }
            s2=r2.readLine();
            s = r.readLine();
            
        }
        System.out.println("SCORE: "+n+"/"+s2.length());
        r2.close();
        r.close();
        
        
        
        
    }
    
}
