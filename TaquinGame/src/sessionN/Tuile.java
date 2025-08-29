/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sessionN;

/**
 *
 * @author GENERAL STORES
 */
public class Tuile {
    //variables d'instances
    protected int numero;
    protected int position;
    public static int valeur=0;
    public static int tailleTab=20;
    
    //constructeur ayant en parametre le numero
    public Tuile(int num){
        this.numero=num;
        this.position=0;
        valeur++;
    }
    
    //constructeur par defaut
    public Tuile(){
        this.numero=0;
        this.position=valeur;
        valeur++;
    }
    
    //les accesseurs
    public int getNumero(){
        return this.numero;
    }
    public int getPosition(){
        return this.position;
    }
    
    //mutateur de la position
    public void setPosition(int position){
        this.position=position;
    }
    
    //methode tostring
    @Override
    public String toString(){
        return String.valueOf(position);
        //return "Position numero: "+position;
    }
    //methode equals
    @Override
    public boolean equals(Object o){
        if(o==null)
            return false;
        if(o.getClass() != Tuile.class){
            return false;
        }
        Tuile t=(Tuile) o;
        if (this.numero==t.numero && this.position==t.position){
            return true;
        }else{
            return false;
        }
    }
    
    //methode isCorrectPosition
    public boolean isCorrectPosition(){
        if(this.position != this.numero)
            return false;
        else
            return true;
        //this.numero==this.position;
    }
}
