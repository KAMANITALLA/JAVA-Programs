/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CorrectionCC;

import java.util.Objects;

/**
 *
 * @author HP
 */
// creation de la classe Soldier
public class Soldier implements Soldat{
    protected String Nom;
    protected int Force;
    protected int Vie; 

public Soldier() {
    this.Nom="";
    this.Force=Force;
    this.Vie=Vie;
    }

/*public Soldier(String Nom, int Force, int Vie) {
this.Nom = Nom;
this.Force = Force;
this.Vie = Vie;
}*/

/*public Soldier(String Nom, int Force, int Vie) {
if(Nom !=null && Force < 0 && Vie < 0){
this.Nom = Nom;
this.Force = Force;
this.Vie = Vie;
}else{
this.Nom="";
this.Force=Force;
this.Vie=Vie;
}
}*/

public Soldier(String Nom, int Force, int Vie) throws IllegalArgumentException 
{
  if(Nom ==null || Force <=0 || Vie <=0)
  {
    this.Nom="";
    this.Force=0;
    this.Vie=0;
    throw new IllegalArgumentException("Argument invalide");
  }
  else{
        this.Nom = Nom;
        this.Force = Force;
        this.Vie = Vie;
      }
}

public String getNom(){
        return Nom;
    }

public void setNom(String Nom) {
        this.Nom = Nom;
    }

 @Override
public int getForce() {
        return Force;
    }

 @Override
public void setForce(int Force) {
        this.Force = Force;
    }

 @Override
public int getVie() {
        return Vie;
    }

 @Override
public void setVie(int Vie) {
        this.Vie = Vie;
    }

 @Override
 public int getArmure(){
     return 0;
 }
  @Override
  public void setArmure(int a){
    
  }
    @Override
 
public String toString() {
        return "Soldier{" + "Nom=" + Nom + ", Force=" + Force + ", Vie=" + Vie + '}';
    }

    @Override
public boolean equals(Object o)
    {
        if (o == null) {
            return false;
        }
        if (o.getClass() != Soldier.class) {
            return false;
        }
         Soldier s = (Soldier) o;
         
        if (this.getNom().equals(s.getNom())&&
                this.getForce()== s.getForce() && this.getVie()==s.getForce() ){
            return true;
        }
        return false;
    }

    //Question2(modifier le constructeur)
 @Override
 
public void hit(Soldat s){
    if(this.getVie() >0){
    s.setVie(s.getVie() - this.getForce()+ s.getArmure());
    // s.Vie-= this.Force;
    if(s.getVie() <= 0){
    System.out.println("Soldier" + getNom() + "died");
    }
    
    }
    }
    
}
    

