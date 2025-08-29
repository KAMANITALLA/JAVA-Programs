/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

/**
 *
 * @author GENERAL STORES
 */
public class ordinateur extends appareils implements actions {
    private static double tailleEcran;
    public ordinateur(String marque, String couleur, String type,
            int prix, double tailleEcran) {
        super(marque, couleur, type, prix);
        this.tailleEcran=tailleEcran;
        
    }

    @Override
    public void allumer() {
        System.out.println("Je demarre sous windows.");
    }

    @Override
    public void telecharger() {
        System.out.println("Je telecharge sur appstore.");
    }
    
    @Override
    public String toString(){
        return super.toString() + " l'ecran a une taille de "+tailleEcran+" pouces";
    }

    @Override
    public void specificite() {
        System.out.println("J'ai les meme specificites qu'un ordinateur.");
    }
    
}
