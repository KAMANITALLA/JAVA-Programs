/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package GestionRestaurant;

import java.time.LocalTime;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
import java.util.*;

/**
 *
 * @author GENERAL STORES
 */
public class Restaurant {
    private List<Table> tables=new ArrayList<Table>();
//pour les listes et les HMap on peut aussi faire-->
//private List<Table> tables=new ArrayList<>();
    private Map<Table,Reservation> tableReserv=new 
        HashMap<Table,Reservation>();
    
    public Restaurant(){
//       this.tables=tables;
//       this.tableReserv=tableReserv;
    }
    
    public void addTable(int capacite){
        tables.add(new Table(capacite));
    }
    
    public boolean tableEstReservee(Table table){
//        autres methodes
//        boolean res=false;
//        if(tableReserv.get(table)!=null){
//            res=true;
//        }
//        return res;
        return tableReserv.containsKey(table); //retourne true si cle est présente dans map;;
    } 
    
    private Table searchTabCapaciteSuffisante(int nbPerson){
        //Methode du prof
            /*Table table=null;
            for(Table t:tables){
                if(!tableEstReservee(t) && 
                        t.getCapacite()>=nbPerson){
                    if(table==null){
                        table=t;
                    }
                    else{
                        if(t.getCapacite()<table.getCapacite()){
                            table=t;
                        }
                    }
                }
            }
            return table;
            */
        //Methode de JeanMarc
        Collections.sort(tables,new Comparator<Table>(){
            @Override
            public int compare(Table o1, Table o2){
                return o1.getCapacite()-o2.getCapacite();
            }
        });
        for(Table t:tables){
            if(!tableEstReservee(t) && t.getCapacite()>=nbPerson){
                return t;
            }
        }
        return null;
     }
    
    public Table reserver(Client client, int nbPlaceReserv, LocalTime hArrivee){
        Table T=searchTabCapaciteSuffisante(nbPlaceReserv);
        if (T!=null){
            tableReserv.put(T, new Reservation(hArrivee,client,nbPlaceReserv));
            return T;}
        return null;
     }
    
    public void addCommande(Article article, Table table){
        if(tableEstReservee(table)){
            Reservation reservation=tableReserv.get(table);
            reservation.addArticle(article); 
        }
    }
    
    public void addCommande(Plat plat,int quantite, Table table){
        if(tableEstReservee(table)){
            Reservation res=tableReserv.get(table);
            res.addCommand(plat, quantite);
        }
    }
    
    @Override
    public String toString(){
        String ch="";
        
        for(Table t:tables){
            ch+=t + "\n";
            ch+=tableReserv.get(t) == null? "vide" : tableReserv.get(t);
            ch+= "\n";
        }
        return ch; 
    }
    
    
    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) {
//        // TODO code application logic here
//    }
    
}
