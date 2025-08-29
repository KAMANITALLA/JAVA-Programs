/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp.poo;
//import java.NbreComplexe;
import java.util.*;

/**
 *
 * @author GENERAL STORES
 */
public class CollNbComplexe{
    private List<NbreComplexe> lComp;
    
    
    //constructeurs
    public CollNbComplexe(){
        lComp=new ArrayList<>();
    }
    
    public void ajouter(NbreComplexe a){
        lComp.add(a);
    }
    
    public NbreComplexe somme(){
        NbreComplexe som=new NbreComplexe(0.0,0.0);
        for(NbreComplexe i:lComp){
            som=som.somme(i);
        }
        return som; 
    }
    
    public NbreComplexe produit(){
        NbreComplexe pro=new NbreComplexe(1.0,1.0);
        for(NbreComplexe j:lComp){
            pro=pro.produit(j);
        }
        return pro; 
    }
    
    public void lister(){
        for(NbreComplexe i:lComp){
           if(i!=null){
               i.afficher();
           }
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        NbreComplexe a=new NbreComplexe(1.1,2.0);
        NbreComplexe b=new NbreComplexe(3.4,3.0);
        
        CollNbComplexe cnc1=new CollNbComplexe();
        cnc1.ajouter(a);
        cnc1.ajouter(b);
        cnc1.lister();
        
        System.out.println(a.afficher());
        System.out.println(b.afficher());
        System.out.println("Somme :"+cnc1.somme());
        System.out.println("produit :"+cnc1.produit());
        
    }
    
}
