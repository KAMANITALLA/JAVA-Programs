/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP5_POE;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Classe Restaurant
public class Restaurant {
    private List<Table> tables;
    private Map<Table, Reservation> tablesReservees;

    public Restaurant() {
        this.tables = new ArrayList<>();
        this.tablesReservees = new HashMap<>();
    }

    public void addTable(int capacite) {
        tables.add(new Table(capacite));
    }

    public boolean tableEstReservee(Table table) {
        return tablesReservees.containsKey(table);
    }

    private Table chercherTableCapaciteSuffisante(int nombrePersonnes) {
        return tables.stream()
            .filter(t -> t.getCapacite() >= nombrePersonnes && !tableEstReservee(t))
            .findFirst()
            .orElse(null);
    }

    public Table reserver(Client client, int nombrePlaces, LocalTime heureArrivee) {
        Table table = chercherTableCapaciteSuffisante(nombrePlaces);
        if (table != null) {
            Reservation reservation = new Reservation(heureArrivee, client, nombrePlaces);
            tablesReservees.put(table, reservation);
            return table;
        }
        return null;
    }

    public void addCommande(Article article, Table table) {
        if (tablesReservees.containsKey(table)) {
            tablesReservees.get(table).addCommande(article);
        }
    }

    public void addCommande(Plat plat, int quantite) {
        // Implementation pour ajouter plusieurs exemplaires d'un plat
    }

    public void addCommande(Plat plat, int quantite, Table table) {
        if (tablesReservees.containsKey(table)) {
            for (int i = 0; i < quantite; i++) {
                tablesReservees.get(table).addCommande(plat);
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Table table : tables) {
            sb.append(table).append("\n");
            if (tablesReservees.containsKey(table)) {
                sb.append(tablesReservees.get(table).toString());
            } else {
                sb.append("vide\n");
            }
        }
        return sb.toString();
    }
}