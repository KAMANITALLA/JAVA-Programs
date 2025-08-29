/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Seance1;

/**
 *
 * @author GENERAL STORES
 */
public class VehiculeBank implements Mesurable{
    //Variables d'instances
    private String immatriculation;
    private String marque;
    private double valeur;
    //variable classe
    public static int NB_Vehicule=0;
    
    //constructeurs
    //1. celui par defaut
    public VehiculeBank(){
        this.immatriculation="";
        this.marque="";
        this.valeur=0.0;
        NB_Vehicule++;
    }
    
    //2.celui avec parametres
    public VehiculeBank(String im, String ma, double v){
        this.immatriculation=im;
        this.marque=ma;
        this.valeur=v;
        NB_Vehicule++;
    }
    
    //redefinition des methodes de la classe Object
    @Override
    public String toString(){
        return "VEHICULE { immatricule= "+this.immatriculation+ "marque= "
                +this.marque+" Valeur= "+this.valeur;
    }
    @Override
    public boolean equals(Object o){
        if(o==null)
            return false;
        if(o.getClass()!=VehiculeBank.class)
            return false;
      
        VehiculeBank v=(VehiculeBank)o;
        if(this.immatriculation
                .equals(v.immatriculation)&&
                this.marque.equals(v.marque)&&
                this.valeur==v.valeur)
            return true;
        return false;
    }
    
    //getters
    public String getImmatriculation(){
        return this.immatriculation;
    }
    public String getMarque(){
        return this.marque;
    }
    public double getValeur(){
        return this.valeur;
    }
    
    //setters
    public void setImmatriculation(String im){
        this.immatriculation=im;
    }
    public void setMarque(String ma){
        this.marque=ma;
    }
    public void setValeur(double v){
        this.valeur=v;
    }
    
    @Override
    public double getValue(){
        return this.valeur;
    }
}
