/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

/**
 *
 * @author MIGUEL PYTHON
 */
public class Employe {
    protected String idEm;
    protected String nomEm;
    protected String email;
    protected String passEm;
    protected double salaire;
    protected double prime;
    protected Date dateEmbauche;
    protected int numEm;
    protected String numSecuEm;
    protected int nbrAbs;
    protected String type;
    protected List<BulletinPaie> bulletins;

    public Employe(int numEm, String idEm, String nomEm, double salaire, double prime, String email, String passEm, String numSecuEm, int nbrAbs, String type, String string6) {
        this.idEm = idEm;
        this.nomEm = nomEm;
        this.email = email;
        this.passEm = passEm;
        this.salaire = salaire;
        this.prime = prime;
        this.dateEmbauche = dateEmbauche;
        this.numEm = numEm;
        this.numSecuEm = numSecuEm;
        this.nbrAbs = nbrAbs;
        this.type = type;
        this.bulletins = bulletins;
    }
    
    public Employe(String idEm, String nomEm, String email, double salaire, double prime, Date dateEmbauche, int numEm, String numSecuEm, int nbrAbs, String type) {
        this.idEm = idEm;
        this.nomEm = nomEm;
        this.email = email;
        this.salaire = salaire;
        this.prime = prime;
        this.dateEmbauche = dateEmbauche;
        this.numEm = numEm;
        this.numSecuEm = numSecuEm;
        this.nbrAbs = nbrAbs;
        this.type = type;
    }
    public Employe(){
        
    }

    
    
    //Getters
    public String getIdEm() {
        return idEm;
    }

    public String getNomEm() {
        return nomEm;
    }

    public String getEmail() {
        return email;
    }

    public String getPassEm() {
        return passEm;
    }

    public double getSalaire() {
        return salaire;
    }

    public double getPrime() {
        return prime;
    }

    public Date getDateEmbauche() {
        return dateEmbauche;
    }

    public int getNumEm() {
        return numEm;
    }

    public String getNumSecuEm() {
        return numSecuEm;
    }

    public int getNbrAbs() {
        return nbrAbs;
    }
    
    public List<BulletinPaie> getBulletins() {
        return bulletins;
    }
    
    public String getType() {
        return type;
    }
    
    //Setters

    public void setIdEm(String idEm) {
        this.idEm = idEm;
    }

    public void setNomEm(String nomEm) {
        this.nomEm = nomEm;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassEm(String passEm) {
        this.passEm = passEm;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public void setPrime(double prime) {
        this.prime = prime;
    }

    public void setDateEmbauche(Date dateEmbauche) {
        this.dateEmbauche = dateEmbauche;
    }

    public void setNumEm(int numEm) {
        this.numEm = numEm;
    }

    public void setNumSecuEm(String numSecuEm) {
        this.numSecuEm = numSecuEm;
    }

    public void setNbrAbs(int nbrAbs) {
        this.nbrAbs = nbrAbs;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setBulletins(List<BulletinPaie> bulletins) {
        this.bulletins = bulletins;
    }
    
    
    
    //Methodes pour le calcul de salaire
    public double calculerPrime(double prime, double salaire){
        return salaire * (prime/100);
    }
    
    public double calculerSalaireAbs(double salaire, int nbrAbs) {
        double deductionParAbsence = salaire / 30;
        return deductionParAbsence * nbrAbs;
    }
    
    public double calculerSalaire(double prime,double salaire, int nbrAbs){
        return salaire + calculerPrime(prime,salaire)- calculerSalaireAbs(salaire, nbrAbs);
    }
    
    //Meethode pour ajouter un bulletin
    public void ajouterBulletin(BulletinPaie b){
        bulletins.add(b);
    }
    
    @Override
    public String toString(){
        return "Employe [id : "+idEm+", Nom : "+nomEm+", email : "+email+", "
                + "Salaire : "+salaire+", Prime: "+prime+", Date embauche:"+dateEmbauche
                +", Numero :"+numEm+", Numero de securite sociale :"+numSecuEm+", Nombres d'absences : "+nbrAbs+"]";
    }
    
    // Méthode pour valider l'email et le mot de passe
    public static boolean seConnecter(String email, String password) {
        // Exemple de validation basique
        // Ici, tu pourrais faire une vérification avec une base de données, par exemple
        if (email.equals("employe@exemple.com") && password.equals("motdepasse")) {
            return true;
        }
        return false;
    }
    
}
