/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helloworld;

/**
 *
 * @author GENERAL STORES
 */
public class voiture implements automobiles{
    protected String nom;
    protected String marque;
    protected double puissance;
    protected int NB=0;
    
    public voiture(){
        NB++;
        this.nom="";
        this.marque="";
        this.puissance=0.0;
    }
    
    @Override
    public String toString(){
        return "marque: "+this.marque+" avec une puissance de: "+this.puissance;
    } 
    
    public String getMarque(){
        return this.marque;
    }
    public double getPuissance(){
        return this.puissance;
    }
    public void setMarque(String nom){
        this.marque=nom;
    }
    public void setPuissance(double p){
        if (p>0.0)
                this.puissance=p;           
    }
    
    public void rouler(String R){
        R="Je peus rouler comme une voiture";
    }
    
    
    public String getType(){
        return this.nom;
    }
}
