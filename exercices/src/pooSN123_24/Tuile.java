/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pooSN123_24;
//Taquin Game
/**
 *
 * @author GENERAL STORES
 */
public class Tuile {
    protected int numero;
    protected int position;
    protected int tailleTab=20;
    
    public Tuile(){
        this.numero=0;
        this.position=0;
    }
    public Tuile(int numero){
        this.numero=numero;
        this.position=position;
    }
    
    public int getNumero(){
        return this.numero;
    }
    public int getPosition(){
        return this.position;
    }
    
    public void setNumero(int num){
        this.numero=num;
    }
    public void setPosition(int Pos){
        this.position=Pos;
    }
    
    public boolean isCorrectPosition(){
        return this.numero==this.position;
    }
    @Override
    public String toString(){
        return "La tuile "+this.numero+" est a la position "+this.position+" .";
    }
    @Override
    public boolean equals(Object o){
//        if(o !(instanceof) Tuile){
//            return false;
//        }
        if(o==null){
            return false;
        }
        if(o.getClass()!=Tuile.class){
            return false;
        }
        Tuile tuile=(Tuile)o;
        if(tuile.numero==this.numero && tuile.position==this.position){
            return true;
        }else{
            return false;
        }
    }
//    public static void main(String[] args) {
//        // TODO code application logic here
//    }
    
}
