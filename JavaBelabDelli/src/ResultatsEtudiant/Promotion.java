/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ResultatsEtudiant;

/**
 *
 * @author GENERAL STORES
 */
public class Promotion {
    private String name;
    private Etudiant[] etudiant;
    
    public Promotion(String name){
        this.name=name;
        etudiant= new Etudiant[100];
    }
    
    public void addEtudiant(Etudiant e){
        int i=0;
        for(i=0;i<etudiant.length;i++){
            if (etudiant[i]==null){
            etudiant[i]=e;
            }
        } 
    }
    
    public void afficherEtudiant(){
        System.out.println("Promotion: "+name+"\n");
        for(Etudiant e:etudiant){
//            if(e!=null)
//                e.afficherResultats();
//            else
//                break;
            System.out.println();
        }
    }
    
    public int nbEtudiantsValides(){
        int nb=0;
        for(Etudiant e: etudiant){
            if(e!=null){
                if(e.moyennenotes().getValeur()>=11){
                    nb++;
                }
            }else
                break;
        }
        return nb;
    }
    
//    public int nbAbsence(){
//        int nbs;
//        for(Etudiant e: etudiant){
//            if(e==null){
//                if(e.Notes().isAbsent()==true){
//                    nbs++;
//                }
//            }else
//                break;
//        }
//        return nbs;
//    }
}
