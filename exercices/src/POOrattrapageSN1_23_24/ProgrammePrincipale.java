/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package POOrattrapageSN1_23_24;

/**
 *
 * @author GENERAL STORES
 */
public class ProgrammePrincipale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Objet o1=new Objet();
        Objet o2=new Objet();
        Objet o3=new Objet();
        Objet o4=new Objet();
        Objet o5=new Objet();
        
        Personnage p1=new Personnage();
        Personnage p2=new Personnage();
        
        System.out.println(o4.getType());
        System.out.println(p1.getType());
        System.out.println(o4.getDescription());
        o4.setDescription("Ballon piquant du roi Allan");
        System.out.println(o4.getDescription());
        
        o1.setDescription("Flêche glacée de la reine des archères");
        o2.setDescription("Bottes electriques de la champione royale");
        o3.setDescription("Boule de feu du Gardien FarWest");
        o5.setDescription("Calecons de fer du prince Gargouille");
        
        System.out.println(p1.getDescription());
        p1.setName("Arthur");
        p1.setVitalite(91);
        System.out.println(p1.getDescription());
        
        p1.ajouteObjet(o1);
        p1.ajouteObjet(o3);
        System.out.println("\n"+p1.afficheInventaire());
        p1.ajouteObjet(o2);
        System.out.println("\n"+p1.afficheInventaire());
//        p1.ajouteObjet(o5); //inventaire plein
//        System.out.println("\n"+p1.afficheInventaire());
//        System.out.println("\n"+p1.PoseObjet(2)); //pour retirer un equipement
//        System.out.println("\n"+p1.afficheInventaire());


        
        Niveau n1=new Niveau();
        Niveau n2=new Niveau(p1);
        
    }
    
}
