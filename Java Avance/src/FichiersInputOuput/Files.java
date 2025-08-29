/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package FichiersInputOuput;

import java.io.*;
import java.nio.*;/*BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;*/

/**
 *
 * @author GENERAL STORES
 */

public class Files {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        //Ouverture
        String filename = "C:\\Users\\GENERAL STORES\\OneDrive\\Documents\\NetBeansProjects\\Java Avance\\src\\FichiersInputOuput\\Hello.txt";
        PrintWriter p = new PrintWriter(
                new BufferedWriter(
                        new FileWriter(filename)));
        //Écriture
        p.print("Hello");
        p.println(" world" + 3*2);
        p.println("Fin du fichier " + filename);
        p.println("END");
        //Fermeture
        p.close();
        
        
        
//        Ouverture
//        String filename = "C:\\Users\\GENERAL STORES\\OneDrive\\Documents\\NetBeansProjects\\Java Avance\\src\\FichiersInputOuput\\Hello.txt";
        BufferedReader r = new BufferedReader(
        new FileReader(filename));
//        • Lecture (ligne par ligne)
        String s;
        s = r.readLine();
        while (s != null) { //--- Tant qu'il y a encore des lignes...
        System.out.println(s);
        s = r.readLine();
        }
//        • Fermeture
        r.close();
    }
    
}
