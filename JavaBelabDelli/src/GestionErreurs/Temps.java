/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package GestionErreurs;

/**
 *
 * @author GENERAL STORES
 */
public class Temps {

    private int heure;
    private int minute;
    private int seconde;
    private String time;
    private int totSec;

    public Temps() {
    }

    public Temps(int heure, int minute, int seconde) {
        setHeure(heure);
        setMinute(minute);
        setSeconde(seconde);
    }
    
    public Temps(String time) throws Exception{        //throws pour propager l'exception a la methode appelante
        //this.time=time;         //facultatif
        String[] valeurs = time.split(":");
        setHeure(Integer.parseInt(valeurs[0]));
        setMinute(Integer.parseInt(valeurs[1]));
        setSeconde(Integer.parseInt(valeurs[2]));
    }
    
    public Temps(int totalSec) throws Exception{
        setHeure((totalSec / 3600 ));
        setMinute((totalSec % 3600 ) / 60) ;
        setSeconde((totalSec % 3600 ) % 60);
    }

    public int getHeure() {
        return heure;
    }

    public int getMinute() {
        return minute;
    }

    public int getSeconde() {
        return seconde;
    }

//    public int getTotSec() {
//        return totSec;
//    }

    public void setHeure(int heure) {
        if(heure<0 || heure>23){
            throw new IllegalArgumentException("Nombre d'heure incorrect --> "+heure);
        }
        this.heure = heure;
    }

    public void setMinute(int minute) {
        if(minute<0 || minute>59){
            throw new IllegalArgumentException("Nombre de minute incorrecte --> "+minute);
        }
        this.minute = minute;
    }

    public void setSeconde(int seconde) {
        if(seconde<0 || seconde>59){
            throw new IllegalArgumentException("Nombre de seconde incorrecte --> "+seconde);
        }
        this.seconde = seconde;
    }

//    public void setTotSec(int totSec) {
//        if(totSec>99999){
//            throw new IllegalArgumentException("Nombre trop grand --> "+totSec);
//        }
//        this.totSec = totSec;
//    }
    
    @Override
    public String toString(){
        return String.format("%2d:%2d:%2d", heure,minute,seconde);
    }
    
    public int getTotalSeconde(){
        return (heure*3600)+(minute*60)+seconde;
    }
    
    
    
    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) {
//        // TODO code application logic here
//    }
    
}
