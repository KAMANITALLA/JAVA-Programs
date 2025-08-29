/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP5_POE;

//Classe RepasComplet
public class RepasComplet implements TP5_POE.Article {
    private String nom;
    private String entree;
    private String platPrincipal;
    private String dessert;
    private int prix;

    public RepasComplet(String nom, int prix, String entree, String platPrincipal, String dessert) {
        this.nom = nom;
        this.prix = prix;
        this.entree = entree;
        this.platPrincipal = platPrincipal;
        this.dessert = dessert;
    }

    @Override
    public int getPrix() {
        return prix;
    }

    @Override
    public String toString() {
        return nom + " (" + entree + " + " + platPrincipal + " + " + dessert + ") : " + prix + "€";
    }
}
