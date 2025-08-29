/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package POO.Sem1_2023_2024;

/**
 *
 * @author GENERAL STORES
 */
public class CompteEntreprise extends Compte {
    private String nomEnt;
    private String raisonSociale;
    private double decouvert;
    
    public CompteEntreprise(String nomEnt,String raisonSociale,double decouvert,double solde) {
        super(solde);
        this.decouvert=decouvert;
        this.nomEnt=nomEnt;
        this.raisonSociale=raisonSociale;
    }

    public String getNomEnt() {
        return nomEnt;
    }

    public void setNomEnt(String nomEnt) {
        this.nomEnt = nomEnt;
    }

    public String getRaisonSociale() {
        return raisonSociale;
    }

    public void setRaisonSociale(String raisonSociale) {
        this.raisonSociale = raisonSociale;
    }
    
    @Override
    public String toString(){
        return "Le "+super.toString()+" appartient a l'entreprise "+nomEnt+" "+raisonSociale+" .";
    }
    
    @Override
    public double retirer(double somme){
//        if(somme>=this.solde+this.decouvert || this.solde==0 || somme<0){
//            System.out.println("Retrait refuser --> Solde Insufisant");
//        }
//        if(somme<this.solde+this.decouvert || somme<0){
//            
//            this.solde-=somme;
//            System.out.println("Retrait effectuer.");
//        }
          if(somme>0 && somme<(solde+decouvert)){
              solde-=somme;
              if(solde<0){
                System.out.println("Retrait impossible.");
                solde+=somme;
              }
              
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
