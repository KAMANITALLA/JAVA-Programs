/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Seance1;

/**
 *
 * @author GENERAL STORES
 */
public class CompteBancaire implements Mesurable{

    /**
     *
     * @author GENERAL STORES
     */
    //Variables d'instances
    protected String numeroCompte;
    protected Double soldeCompte;
    protected String nom;

    //varible de classe
    private static int NB_COMPTE = 0;

    //constructeurs
    //1-constructeur par defaut
    public CompteBancaire() {
        NB_COMPTE++;
        this.numeroCompte = "IUC" + NB_COMPTE;
        this.soldeCompte = 0.0;
        this.nom = "";
    }

    //2-constructeur avec parametres
    public CompteBancaire(String nom) {
        NB_COMPTE++;
        this.numeroCompte = "IUC" + NB_COMPTE;
        this.soldeCompte = 0.0;
        this.nom = nom;
    }

    //3-constructeur par recopie
    public CompteBancaire(CompteBancaire c) {
        NB_COMPTE++;
        this.numeroCompte = "IUC" + NB_COMPTE;
        //this.numeroCompte=c.numeroCompte;   On cree un new compte dc pas besoin de copier le numCompte
        this.soldeCompte = c.soldeCompte;
        this.nom = c.nom;
    }

    //Qlqs methodes
    @Override
    public String toString() {
        return "[" + this.nom + " : { numerocompte="
                + this.numeroCompte + " , solde= " + this.soldeCompte + "} ]";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (o.getClass() != CompteBancaire.class) {
            return false;
        }
        CompteBancaire c = (CompteBancaire) o;

        if (this.numeroCompte.equals(c.numeroCompte)
                && this.soldeCompte == c.soldeCompte
                && this.nom.equals(c.nom)) {
            return true;
        } else {
            return false;
        }
    }

    //Les accesseurs
    public String getNumeroCompte() {
        return this.numeroCompte;
    }

    public double getSoldeComte() {
        return this.soldeCompte;
    }

    public String getNom() {
        return this.nom;
    }

    //Les mutateurs
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setSoldeCompte(double s) {
        if (s >= 0) {
            this.soldeCompte = s;
        }
    }
    // comme on ne change pas de num de compte il ne sert dc pas de realiser son setteur.

    // Les methodes metiers
    public void crediter(double m) {
        if (m > 0.0) {
            this.soldeCompte += m;
        }
    }

    public void debiter(double m) {
        if (m > 0) {
            if (this.soldeCompte - m >= 0.0) {
                this.soldeCompte -= m;
            }
        }
    }

    public void transferer(CompteBancaire c, double m) {
        if (m > 0.0) {
            if (this.soldeCompte - m >= 0) {
                this.soldeCompte -= m;
                c.soldeCompte += m;
            }
        }
    }
@Override    
public double getValue(){
    return this.soldeCompte;
}
    
}
