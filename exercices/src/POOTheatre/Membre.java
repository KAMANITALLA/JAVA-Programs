/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POOTheatre;

import static POOTheatre.TypeRole.*;
import java.util.Scanner;

/**
 *
 * @author GENERAL STORES
 */
public abstract class Membre {
    protected String nom;
    protected final String numSecu;
    protected TypeRole role;
    protected static double PCP=0.4;
    
    public Membre(){
        this("***","**",administratif);
    }
    public Membre(String nom,String num,TypeRole role){
        this.numSecu=num;
        this.nom=nom;
        this.role=role;
    }

    public String getNumSecu() {
        return numSecu;
    }

    public static double getPCP() {
        return PCP;
    }
    
    public static void setPCP(double d) {
        if(d<0||d>1)
            throw new IllegalArgumentException("Echec de modification. Le PCP doit être entre 0 et 1");
        PCP=d;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public TypeRole getRole() {
        return role;
    }

    public void setRole(TypeRole role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "M/Mme "+nom+" est un "+role+" avec pour numSecu "+numSecu;
    }

    @Override
    public boolean equals(Object o) {
        if(o==null)
            return false;
        if(o.getClass()!=Membre.class)
            return false;
        Membre m=(Membre)o;
        if(this.nom.equals(m.nom)&&
                this.numSecu.equals(m.numSecu)&&this.role.equals(m.role))
            return true;
        return false;
    }
    
    public abstract double salaireMensuel();
    
    public double salaireMensuelCharger(){
        return this.salaireMensuel()*(1+PCP);
    }
    
    public void saisieInfo(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Nom: ");
        this.nom=sc.nextLine();
        System.out.println("Rôle (acteur,technicien,administratif): ");
        this.role=TypeRole.valueOf(sc.nextLine());
    }
    
//    public static void main(String[] args) {
//        
//        Membre m1=new Membre();
//        Intermittent m2=new Intermittent("Paul","num00123",technicien) {};
//        
//        System.out.println(m1+"\n"+m2);
//        System.out.println(m1.equals(m1));
//        
//    }
}

