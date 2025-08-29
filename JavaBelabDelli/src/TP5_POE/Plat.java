/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP5_POE;

//Classe Plat
public class Plat implements TP5_POE.Article {
    private String nom;
    private int prix;

    public Plat(String nom, int prix) {
        this.nom = nom;
        this.prix = prix;
    }

    @Override
    public int getPrix() {
        return prix;
    }

    @Override
    public String toString() {
        return nom + " : " + prix + "€";
    }
}
