/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Seance1;

/**
 *
 * @author GENERAL STORES
 */
public class CompteEpargne extends CompteBancaire {
     // variables d'instances
    private double epargne;
    private static final double tauxInteret=0.05;
    //constructeurs
    //1.constructeurs par defaut
public CompteEpargne(){
    super();
    this.epargne=this.soldeCompte+this.soldeCompte*tauxInteret;
}
//2.constructeurs avec parametres
public CompteEpargne(String nom){
    super(nom);
    this.epargne=this.soldeCompte+this.soldeCompte*tauxInteret;

}
//3.constructeur par recopie
public CompteEpargne(CompteEpargne e){
    super((CompteEpargne)e);
    this.epargne=this.soldeCompte+this.soldeCompte*tauxInteret;

}
//getters
public double getEpargne(){
    return this.epargne;
}
//setters impossible car on ne doit pas modifie l'epargne

//redefinition des methodes de classe objet
@Override
public String toString(){
    return super.toString()+" epargne :"+this.epargne;
}

@Override
public boolean equals(Object o){
    if(o==null)
        return false;
    if(o.getClass() != CompteEpargne.class)
        return false;
    CompteEpargne c=(CompteEpargne)o;
    return super.equals(o) && epargne == c.epargne;
        
}
}
