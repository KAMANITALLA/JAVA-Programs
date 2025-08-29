/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

import java.util.Objects;

/**
 *
 * @author GENERAL STORES
 */
public abstract class appareils implements actions {
    protected String marque;
    protected String couleur;
    protected String type;
    protected int prix;
    //varible de classe
    private static int NBAPP = 0;
    
    public appareils(String marque,String couleur,String type,int prix){
        NBAPP++;
        this.marque=marque;
        this.couleur=couleur;
        this.type=type;
        this.prix=0;
    }
    
    public String getMarque(){
        return this.marque;
    }
    public String getCouleur(){
        return this.couleur;
    }
    public String getType(){
        return this.type;
    }
    public int getPrix(){
        return this.prix;
    }
    public void setMarque(String marque){
        this.marque=marque;
    }
    public void setCouleur(String couleur){
        this.couleur=couleur;
    }
    public void setType(String type){
        this.type=type;
    }
    public void setPrix(int prix){
        this.prix=prix;
    }
    
    @Override
    public String toString() {
        return "[" + this.marque + " de couleur "
                + this.couleur+" et de type "+ this.type +" vaut: "+this.prix;
    }
    
    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (o.getClass() != appareils.class) {
            return false;
        }
        appareils c = (appareils) o;

        return this.marque.equals(c.marque)
                && this.prix == c.prix
                && this.couleur.equals(c.couleur)
                && this.type.equals(c.type);
    }

   /* @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.marque);
        hash = 37 * hash + Objects.hashCode(this.couleur);
        hash = 37 * hash + Objects.hashCode(this.type);
        hash = 37 * hash + this.prix;
        return hash;
    }*/

    public abstract void specificite();
}
