/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP5_POE;

//Classe Table
public class Table {
    private static int nombreTotalTables = 0;
    private int id;
    private int capacite;

    public Table(int capacite) {
        this.capacite = capacite;
        this.id = nombreTotalTables++;
    }

    public int getCapacite() {
        return capacite;
    }

    @Override
    public String toString() {
        return "Table " + id + " (" + capacite + " places)";
    }
}
