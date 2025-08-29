/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package POO.Sem1_2023_2024;

/**
 *
 * @author GENERAL STORES
 */
public class ComptePersonPhysiq extends Compte {
    private String nom;
    private String prenom;
    
    public ComptePersonPhysiq(String nom, String prenom, double solde) {
        super(solde);
        this.nom=nom;
        this.prenom=prenom;
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

    @Override
    public String toString() {
        return "Le "+super.toString()+"et appartient a "+prenom+" "+nom+" .";
    }
    
    @Override
    public double retirer(double somme){
        if(somme>=this.solde || this.solde==0 || somme<0){
            System.out.println("Retrait refuser --> Solde Insufisant");
        }else{
            this.solde-=somme;
            System.out.println("Retrait effectuer.");
        }
        return this.solde;
    }

    
    

    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) {
//        // TODO code application logic here
//    }
    
}
