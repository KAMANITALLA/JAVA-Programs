/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP5_POE;

//Classe Reservation

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Reservation {
    private LocalTime heureArrivee;
    private Client client;
    private int nbPlacesReservee;
    private List<Article> articlesCommandes;

    public Reservation(LocalTime heureArrivee, Client client, int nbPlacesReservee) {
        this.heureArrivee = heureArrivee;
        this.client = client;
        this.nbPlacesReservee = nbPlacesReservee;
        this.articlesCommandes = new ArrayList<>();
    }

    public void addCommande(Article article) {
        articlesCommandes.add(article);
    }

    public int montantFacture() {
        return articlesCommandes.stream().mapToInt(Article::getPrix).sum();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Réservation de ").append(client).append(" (").append(nbPlacesReservee).append(", ").append(heureArrivee).append(")\n");
        for (Article article : articlesCommandes) {
            sb.append(article).append("\n");
        }
        sb.append("Total : ").append(montantFacture()).append("€\n");
        return sb.toString();
    }
}
