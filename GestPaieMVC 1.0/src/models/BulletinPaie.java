/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.Date;

/**
 *
 * @author MIGUEL PYTHON
 */
public class BulletinPaie {
    private String id_bul;
    private Date dateRemise;
    private String nomEnt;
    private String adrEnt;
    private Employe employe;
    
    public BulletinPaie(String idBul, Date date, String nomEnt, String adrEnt, Employe e){
        this.id_bul = idBul;
        this.dateRemise = date;
        this.nomEnt = nomEnt;
        this.adrEnt = adrEnt;
        this.employe = employe;
    }
    
    //Getters

    public String getId_bul() {
        return id_bul;
    }

    public Date getDateRemise() {
        return dateRemise;
    }

    public String getNomEnt() {
        return nomEnt;
    }

    public String getAdrEnt() {
        return adrEnt;
    }

    public Employe getEmploye() {
        return employe;
    }
    
    //Setters

    public void setDateRemise(Date dateRemise) {
        if(dateRemise == null)
            throw new IllegalArgumentException("Veillez entrer une date");
        this.dateRemise = dateRemise;
    }

    public void setAdrEnt(String adrEnt) {
        if(adrEnt == null)
            throw new IllegalArgumentException("Veillez entrer l'adresse de l'entreprise");
        this.adrEnt = adrEnt;
    }

    public void setEmploye(Employe employe) {
        if(employe == null)
            throw new IllegalArgumentException("Donnez un employe");
        this.employe = employe;
    }
    
    public void genererBulletin(){
        //A implementer
    }
    
}
