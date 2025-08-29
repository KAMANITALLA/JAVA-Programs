/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package GestionRestaurant;

/**
 *
 * @author GENERAL STORES
 */
import java.time.*;
import java.util.ArrayList;
import java.util.List;

public class Reservation {
    private LocalTime hArrivee;
    private Client client;
    private int nbPlaceReserv;
    private List<Article> articleCommand;

    public Reservation(LocalTime hArrivee, 
            Client client, int nbPlaceReserv) {
        this.hArrivee = hArrivee;
        this.client = client;
        this.nbPlaceReserv = nbPlaceReserv;
        this.articleCommand=new ArrayList<Article>();
    }
    
    public void addCommande(Article article){
        this.articleCommand.add(article);
    }
    public void addArticle(Article article){
        this.articleCommand.add(article);
    }
    
    public int montantFacture(){
        int som=0;
        for(Article c: articleCommand){
            som+=c.getPrix();
        }
        return som;
    }
    
    public List<Article> getArticleCommand(){
        return articleCommand;
    }
    
    public void addCommand(Plat plat,int quantite){
        for(int i=0;i<quantite;i++){
            //articlesCommand.add(plat);
            addArticle(plat);
        }
    }
    
    @Override
    public String toString(){
        String ch="";
        ch+="Reservation de "+client.getNomclient()+" ("+nbPlaceReserv+" , "+hArrivee.getHour()+":"+
                hArrivee.getMinute()+")\n";
        for(Article a:articleCommand){
            ch+=a +" \n";
        }
        ch+="Total = "+montantFacture()+"\n"+"_________________________";
        return ch; 
    }
    
    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) {
//        // TODO code application logic here
//    }
    
}
