/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package POO.Sem1_2023_2024;

/**
 *
 * @author GENERAL STORES
 */
public abstract class Compte {
    protected static int nbcompte=0;
    protected double solde;
    protected int NB_DEPOT=0;
    protected int numcompte=0;

    public Compte(double solde) {
        nbcompte++;
        this.numcompte=nbcompte;
        this.solde = solde;
    }

    public int getNumcompte() {
        return numcompte;
    }

    public void setNumcompte(int numcompte) {
        this.numcompte = numcompte;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    @Override
    public String toString() {
        return "Compte numero 0" + numcompte + " a un solde de " + solde + " FCFA ";
    }

//    @Override
//    public int hashCode() {
//        int hash = 5;
//        hash = 37 * hash + this.numcompte;
//        hash = 37 * hash + (int) (Double.doubleToLongBits(this.solde) ^ (Double.doubleToLongBits(this.solde) >>> 32));
//        return hash;
//    }

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
        final Compte other = (Compte) obj;
        if (this.numcompte != other.numcompte) {
            return false;
        }
        return Double.doubleToLongBits(this.solde) == Double.doubleToLongBits(other.solde);
    }
    
    public Double ConsulterCompte(){
        return this.solde;
    }
    
    public void deposer(double somme){
        if(somme>0)
            this.solde+=somme;
            System.out.println("Depot reussi.");
    }
    
    public abstract double retirer(double somme);
//    public void transferer(double somme);
    
    
   
    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) {
//        // TODO code application logic here
//    }
    
}
