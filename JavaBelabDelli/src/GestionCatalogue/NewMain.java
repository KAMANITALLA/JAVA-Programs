/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package GestionCatalogue;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author GENERAL STORES
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Path p1=Paths.get(System.getProperty("user.dir"),"epoques.txt");
        Path p2=Paths.get(System.getProperty("user.dir"),"documents.txt");
//        System.out.println(p1);
//        System.out.println(p2);
        
        
        
        try {
//            List<Epoque> lepoq=new ArrayList<>();
            List<String> dom=Files.readAllLines(p1);
            List<Epoque> listeepoque=new ArrayList<>();
//            for(String s:dom){
//                System.out.println(s);
//            }
//            
              for (String s : dom) {
                String[]e1 = s.split(";");
                System.out.println(s);
                
                if(e1.length==2&&!e1[0].isEmpty() && !e1[1].isEmpty()){
                    Epoque e = new Epoque(e1[0].trim(), e1[1].trim());
                    listeepoque.add(e);
                }
              }

            Epoque selectedvalue=(Epoque)JOptionPane.showInputDialog(null,
                    "selectionnez une epoque",
                        "catalogue",JOptionPane.INFORMATION_MESSAGE,null,
                        listeepoque.toArray(),listeepoque.get(0));
                System.out.println(selectedvalue);
        } catch (IOException ex) {
            //Logger.getLogger(Epoque.class.getName()).log(Level.SEVERE, null, ex);
//            ex.printStackTrace();
            System.exit(1);
        }   
    }
    
}
