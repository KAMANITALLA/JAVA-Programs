/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package GestionRestaurant;

import java.time.LocalTime;

/**
 *
 * @author GENERAL STORES
 */
public class MainRestau {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Restaurant room = new Restaurant();
        
        RepasComplet repasComplet = new RepasComplet("Formule déjeuner", 35,
        "salade", "tartare de bœuf", "crème brûlée");
        Plat bouillabaisse = new Plat(40, "Bouillabaisse");
        
        room.addTable(4);
        room.addTable(2);
        room.addTable(2);
        
        Client marius = new Client("Marius");
        Client fanny = new Client("Fanny");
        
        Table fannyTable = room.reserver(fanny, 2, LocalTime.of(20,0));
        Table mariusTable = room.reserver(marius, 3, LocalTime.of(19,30));
        
        room.addCommande(bouillabaisse, 3, mariusTable);
        room.addCommande(repasComplet, fannyTable);
        room.addCommande(bouillabaisse, fannyTable);
        
        System.out.println(room);
        System.out.println(repasComplet);
        System.out.println(bouillabaisse);
    }
    
}
