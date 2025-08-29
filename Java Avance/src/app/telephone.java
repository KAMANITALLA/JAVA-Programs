/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

/**
 *
 * @author GENERAL STORES
 */
public class telephone extends appareils implements actions {
    private int nbSim;
    public telephone(String marque, String couleur, String type,
            int prix,int nbSim) {
        super(marque, couleur, type, prix);
        this.nbSim=nbSim;
    }

    @Override
    public void allumer() {
        System.out.println("Je demarre sous Android.");
    }

    @Override
    public void telecharger() {
        System.out.println("Je telecharge sur playstore.");    
    }

    @Override
    public String toString(){
        return super.toString() + "Le nombre d'emplacement de carte sim " +nbSim;
    }

    @Override
    public void specificite() {
        System.out.println("J'ai les meme specificites qu'un telephone.");
    }
    
}
