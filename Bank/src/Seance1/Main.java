/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Seance1;

/**
 *
 * @author GENERAL STORES
 */
public class Main {
    public static void main(String [] args){
    CompteBancaire c1= new CompteBancaire();
    CompteBancaire c2= new CompteBancaire("toto");
    CompteBancaire c3= new CompteBancaire(c2);
    System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        
        c3.setNom("tata");
        System.out.println(c3);
        
        c2.crediter(10000);
        System.out.println(c2);
        
        c2.transferer(c3,1000);
        System.out.println(c2);
        System.out.println(c3);
        
        c2.transferer(c3,-1000);
        System.out.println(c2);
        System.out.println(c3);
        
        //instantiation des comptes d'epargne
        CompteEpargne ce1=new CompteEpargne();
        CompteEpargne ce2=new CompteEpargne("Ngo");
        ce1.setSoldeCompte(198000);
        ce1.setNom("Tala");
        //instantiation des vehicules
        VehiculeBank v1=new VehiculeBank();
        VehiculeBank v2=new VehiculeBank("uc01" , "solace" ,2900);
        //instantiation de la dataset
        DataSet dataSet=new DataSet(10);
        dataSet.add(v2);
        dataSet.add(c2);
        dataSet.add(c2);
        dataSet.add(c1);
        dataSet.add(ce1);
        dataSet.add(ce2);
        dataSet.add(c3);
        //afficher les elements de la dataSet
        for(int i=0;i<=dataSet.indexLast();i++){
            System.out.println(dataSet.getData()[i].toString());
        }
        
        //recherche du Max
        System.out.println("ELEMENT MAX: "+dataSet.getMax());

    
    
    }
    
}
