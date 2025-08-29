/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Seance1;

/**
 *
 * @author GENERAL STORES
 */
public class DataSet {
    //variables d'instances
    private Mesurable[] data;
    private int taille;
    //variable de classe
    private static int POSITION=0;
    
    //constructeur avec parametres
    public DataSet(int taille){
        this.taille=taille;
        this.data=new Mesurable[taille];
    }
    
    //methode d'ajout de Mesurable dans le tableau
    public void add(Mesurable m){
        if(POSITION<this.taille)
            this.data[POSITION]=m;
        POSITION++;
    }
    
    //methode retirer
    public void retirer(){
        if(POSITION>0)
            POSITION--;
    }
    
    //methode position du dernier element
    public int indexLast(){
        return POSITION-1;
    }
    
    //methode de retour du max(plus grande entite)
    public Mesurable getMax(){
        int positionMax=0;
        double Max=this.data[0].getValue();
        for(int i=0;i<POSITION;i++){
            if(this.data[i].getValue()>Max){
                Max=this.data[i].getValue();
                positionMax=i;
            }
        }
        return this.data[positionMax];
    }
    
    //getters
    public Mesurable[] getData(){
        Mesurable[] m=new Mesurable[POSITION];
        for(int i=0;i<POSITION;i++){
        m[i]=this.data[i];}
        return m;
    }
    //public void
}
