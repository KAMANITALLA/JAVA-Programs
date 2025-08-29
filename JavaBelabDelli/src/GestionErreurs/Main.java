/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package GestionErreurs;

/**
 *
 * @author GENERAL STORES
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Temps t1,t2,t3;
        t1=new Temps();
//        t2=new Temps();
//        t3=new Temps(16,00,45);
//        
//        t1.setHeure(13);
//        t1.setMinute(30);
//        t1.setSeconde(45);
//        
//        t2.setHeure(15);
//        t2.setMinute(55);
//        t2.setSeconde(45);
//        
////        System.out.println(t1);
////        System.out.println(t2);
////        System.out.println(t3);
        
        
        
        
/////POUR GENERER LES EXCEPTIONS AVEC NETBEANS FAIRE: ALT+ENTER sur la partie du code.
////e.printStackTrace();  Pour localiser sur la console la ligne de l'exceptions.
//        while( true ) {
//            try{
//                String message = "Entrez un temps au format HH:MM:SS"; String reponse = "";
//                reponse = javax.swing.JOptionPane.showInputDialog(message, reponse );
//                String[] valeurs = reponse.split(":");
//                t1.setHeure( Integer.parseInt( valeurs[0] ) );
//                t1.setMinute( Integer.parseInt( valeurs[1] ) );
//                t1.setSeconde( Integer.parseInt( valeurs[2] ) );
//                break;
//            }
            
//            catch(NumberFormatException e){
//                //e.printStackTrace();
//                String reponse = "";
//            }
//            catch(IllegalArgumentException e){
//                //e.printStackTrace();
//                String reponse = "";
//            }

//            catch(Exception e){
//                String reponse="";
//            }
//        }
//        System.out.println(t1);
//    }
    



//        String message = "Entrez un temps au format HH:MM:SS"; String reponse = "";
//        while( true ) {
//            try {
////               / reponse = javax.swing.JOptionPane.showInputDialog(message, reponse);
////                message=reponse;
//                String[] valeurs = reponse.split(":");
//                t1.setHeure(Integer.parseInt(valeurs[0]));
//                t1.setMinute(Integer.parseInt(valeurs[1]));
//                t1.setSeconde(Integer.parseInt(valeurs[2]));
//                break;
//            } catch (NumberFormatException e) {
//                message="Valeur non numerique ("+reponse+") veuillez reessayer:";
//                System.out.println(message);
////                System.out.println("Valeur non numerique:  "+reponse);
//                reponse="";
//            } catch (IllegalArgumentException e) {
//                message="Valeurs anormales ("+reponse+") veuillez reessayer:";
//                System.out.println(message);
////                System.out.println("Intervales non respecter:  "+message);
//                reponse="";
//            } catch (ArrayIndexOutOfBoundsException e) {
//                message="Format obligatoire HH:MM:SS : "+reponse;
//                System.out.println(message);
////                System.out.println("Valeurs manquantes:  "+message);
//                reponse="";
//            }
//            
//        }
//        System.out.println(t1);


        
///*4*/   String reponse1="01:23:20";
//        String reponse2="15:25:55";
//        try {
//            Temps t4 = new Temps(reponse1);
//            Temps t5 = new Temps(reponse2);
//            Temps t6 = new Temps(55555);
//            System.out.println(t4);
//            System.out.println(t4.getTotalSeconde()+" secondes");
//            System.out.println(t5);
//            System.out.println(t5.getTotalSeconde()+" secondes");
//            System.out.println(t6);
//        } catch (Exception e) {
////            e.printStackTrace();
//            System.out.println(e.getMessage());
//        }



        String message = "Entrez un temps au format HH:MM:SS"; String reponse = "";
        while( true ) {
            try {
                reponse = javax.swing.JOptionPane.showInputDialog(message, reponse);
                Temps t7=new Temps(reponse);
                
                message = "Entrez autre temps au format HH:MM:SS";
                reponse = javax.swing.JOptionPane.showInputDialog(message, reponse);
                Temps t8=new Temps(reponse);
                
                int t7Sec=t7.getTotalSeconde();
                int t8Sec=t8.getTotalSeconde();
                
                message="somme";
                int tSec=t7Sec+t8Sec;
                try {
                    Temps total = new Temps(tSec);
                    message = t7.toString() + "\n" + "  +\n" + t8.toString() + "   \n---------------\n";
                    message += total.toString();
                    javax.swing.JOptionPane.showMessageDialog(null, message);
                } catch (Exception e) {
                    message = t7.toString()+"+"+t8.toString()+"\n";
                    message += "Addition impossible\n";
                    message +="Resultat trop grand";
                    javax.swing.JOptionPane.showMessageDialog(null, message);
                }
                break;
            } catch (Exception e) {
                
            }
            
        }


        
    }

}
