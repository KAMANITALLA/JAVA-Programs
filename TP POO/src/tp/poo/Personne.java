/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp.poo;

import java.util.*;
import java.util.Objects;
import static tp.poo.Personne.Sexe.F;
import static tp.poo.Personne.Sexe.M;

/**
 *
 * @author GENERAL STORES
 */
public class Personne {
    protected String nom;
    protected String prenom;
    protected Sexe sexe;
    protected int age;
    protected List<Personne> ListPers=new ArrayList<>();
    
    public enum Sexe{M,F}
    
    public Personne(String nom,String prenom,Sexe sexe,int age){
        if(age<=0){
            System.out.println("age invalide");
        }else if(sexe!=sexe.F && sexe!=sexe.M){
            System.out.println("sexe invalide");
        }else{
            this.nom=nom;
            this.prenom=prenom;
            this.sexe=sexe;
            this.age=age;
        }
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Sexe getSexe() {
        return sexe;
    }

    public void setSexe(Sexe sexe) {
        this.sexe = sexe;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<0){
            throw new IllegalArgumentException("age invalide."+age);}
        this.age = age;
    }

    @Override
    public String toString() {
        return "Personne{" + "nom=" + nom + ", prenom=" + prenom + ", sexe=" + sexe + ", age=" + age + '}';
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Personne other = (Personne) obj;
        if (this.age != other.age) {
            return false;
        }
        if (!Objects.equals(this.nom, other.nom)) {
            return false;
        }
        if (!Objects.equals(this.prenom, other.prenom)) {
            return false;
        }
        return this.sexe == other.sexe;
    }
    
    public List<Personne> enregistrer(){
        Scanner sc=new Scanner(System.in);
        for(Personne i:ListPers){
            ListPers.add(i);
        }
        return ListPers;
    }
    
    public void Lister(){
        System.out.println();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        Personne P=new Personne( "malino", "pou", F, 12);
        System.out.println(P);
    }
    
}
