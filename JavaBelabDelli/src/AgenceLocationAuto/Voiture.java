/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package AgenceLocationAuto;

/**
 *
 * @author GENERAL STORES
 */
public class Voiture implements Vehicule{
    
    //variables
    private static final int annee=2021;
    private String marque;
    private String modele;
    private int anneeDeProduction;
    private int nbSieges;
    
    //constructeur
    
    public Voiture(String marque, String modele, int anneeDeProduction, int nbSieges){
      if(anneeDeProduction<1900||anneeDeProduction>annee){
          throw new IllegalArgumentException("Annee incorrecte: "+anneeDeProduction);
      }
      if (nbSieges<1){
          throw new IllegalArgumentException("Nombre de siege incorrecte:"+nbSieges);
      }
      this.marque=marque; 
      this.modele=modele;
      this.anneeDeProduction=anneeDeProduction;
      this.nbSieges=nbSieges;
    }
    
    //Getters
    public String getMarque(){
        return this.marque;
    }
    public String getModele(){
        return this.modele;
    }
    public int getAnneeDeProduction(){
      return this.anneeDeProduction;  
    }
    public int getNbSieges() {
        return nbSieges;
    }
    
    //setters
    public void setMarque(String marque) {
        this.marque = marque;
    }
    public void setModele(String modele) {
        this.modele = modele;
    }
    public void setAnneeDeProduction(int anneeDeProduction) {
        this.anneeDeProduction = anneeDeProduction;
    }
    public void setNbSieges(int nbSieges) {
        this.nbSieges = nbSieges;
    }
   
    public boolean isNouvelle(){
       int diff=annee-anneeDeProduction;
      if(diff<=5){
        System.out.println("Modele recent");  
        return true;
      }
      System.out.println("Vieux modele");
      return false;
    }
    public double prixLocationParJour(){
        Voiture v = new Voiture(marque,modele,anneeDeProduction,nbSieges);
        double pu;
      if(v.isNouvelle()==false){
       pu=20;
      } 
      else{
        pu=40;
      }
      System.out.println(pu*nbSieges);
      return pu*nbSieges; 
    }
    @Override
    public boolean equals(Object o){
        if (o==null){            
//            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            return false;
        }
        if (o.getClass() != Voiture.class) {
            return false;
        }
        Voiture c = (Voiture) o;

        if (this.marque.equals(c.marque)
                &&this.modele.equals(c.modele)
                && this.anneeDeProduction== c.anneeDeProduction
                && this.nbSieges==c.nbSieges) {
            return true;
        } else {
            return false;}
    }
        
    @Override
    public String toString(){
        return this.getClass().getSimpleName()+" de marque : "+this.marque+" modele: "
                +this.modele+"\n annee de production: "+this.anneeDeProduction+"( avec"
                +this.nbSieges+" sieges): "+this.prixLocationParJour()+"€";
    }
//    public static void main(String args[]){
//      Voiture v1=new Voiture("Toyota","Yaris",2003,3);  
//    System.out.print(v1);
//    v1.isNouvelle();
//   v1.prixLocationParJour();
//    }

    @Override
    public boolean equals() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
