/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ResultatsEtudiant;

//import java.util.ArrayList;
//import java.util.List;

/**
 *
 * @author GENERAL STORES
 */
public class Etudiant {
    private String nom;
    private String prenom;
    private ResultatsUniteEnseignement [] resultats ;
    private static int i=0;
//    private List<Notes> resultats=new ArrayList<>();
    
    
    public Etudiant(String nom, String prenom){
        this.nom=nom;
        this.prenom=prenom;
        resultats=new ResultatsUniteEnseignement [30];
//        resultats=new ArrayList<>();
        
    }
    
    //public static void main(String[] args) {}

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public ResultatsUniteEnseignement[] getResultats() {
        return resultats;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setResultats(ResultatsUniteEnseignement[] resultats) {
        this.resultats = resultats;
    }

    public void AddResutat(String nom, Notes note){
        //int i=0;
        while (i<30 && resultats[i]!=null){
            i++;
        }
        if(i<30){resultats[i]=new ResultatsUniteEnseignement(nom,note);}
        
        /*for(ResultatsUniteEnseignement i:resultats){
            if(resultats[i]==null){
                resultats[i]=new ResultatsUniteEnseignement(nom,note);
                break;
            }
        }*/
        //resultats[i++]=new ResultatsUniteEnseignement(nom,note);
    }

    @Override
    public String toString() {
        String chaine=nom+" "+prenom+"\n";
        
        for(ResultatsUniteEnseignement r:resultats){
            if(r==null){
                break;}
            chaine +=r.toString()+"\n";
        }
        return chaine;
    }
    
//    public list<Notes> getNotes(){
//        list<Notes> notes=new Arraylist<>();
//        for(ResultatsUnitesEnseignement
//        Notes.add(res.getNote());
//        return notes;
//    }    
    public Notes[] getNotes(){
        int taille=0;
        //compte le nombre de notes
        for(ResultatsUniteEnseignement r:resultats){
            if(r!=null){
                taille++; 
            }
        }
        //creation d'un tableau
        Notes[] N=new Notes[taille];
        //remplissage
        for(i=0;i<taille;i++){
            N[i]=resultats[i].getNote();
        }
        return N;
    }
    
    public Notes moyennenotes(){
        Notes[] tabNot=getNotes();
        Notes moyenne=Notes.moyenneNotes(tabNot);
        return moyenne;
//        return Notes.moyenneNotes(getNotes());
    }
    
//    public void afficherResultats(){
//        String chaine=this.toString();
//        Notes moyenne=Notes.moyenneNotes(getNotes);
//        System.out.println(chaine+"\n");
//        System.out.println("moyenne : "+moyenne);
//        System.out.println();
//    }
    
}
