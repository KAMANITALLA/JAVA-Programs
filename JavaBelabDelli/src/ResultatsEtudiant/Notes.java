/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ResultatsEtudiant;

/**
 *
 * @author GENERAL STORES
 */
public class Notes {
    private static final int NOTE_MAXIMUM=20;
    private static int i=0;
    private double valeur;
    private boolean absent;
    
    public Notes(double valeur,boolean absent){
        setValeur(valeur);
        this.absent=absent;    
    }
    public Notes(){
        this(0,true);//appel du constructeur complet
    }
     public Notes(double valeur){
        this(valeur,false);
    }
     
     public double getValeur(){
         return valeur;
     }
     public boolean isAbsent(){
        return absent;
     }
     
    public void setValeur(double valeur) {
      if(valeur>=0 && valeur<=NOTE_MAXIMUM){
          this.valeur=valeur;}
      else{
          this.valeur=0;
          this.absent=true;
          System.out.println("Note non valide!");}
    }
    
    public void setAbsent(boolean absent){
        this.absent=absent;
    }
    
    @Override
    public String toString(){
        //if(this.absent)
          //  return "ABS";
        //return valeur+"/20";
       return !absent? String.format("%2.2f", valeur)+"/20" : "ABS";
             //operateur ternaire: si absent est faux on evalu sinon on 
             //execute ce qu'il ya apres les :"ABS"
    }
     
    public static void main(String[] args) {
       int val=Notes.NOTE_MAXIMUM;
       Notes n1=new Notes(17.555,false);
       Notes n2=new Notes(18.555,false);
       Notes[] tab={n1,n2};
       Etudiant e=new Etudiant("Toc","Toon");
       e.AddResutat("informatique", n2);
       e.AddResutat("Poo", n1);
       System.out.println(e);
       System.out.println("La moyenne est: "+moyenneNotes(tab));
//       System.out.println(e.moyennenotes());
//       ResultatsUniteEnseignement RUE1=new 
//       ResultatsUniteEnseignement("informatique", n1);
//       /*System.out.println("Note= "+n1.toString());*/
//       System.out.println(RUE1.toString());
    }
    
    public static Notes moyenneNotes(Notes[] note){
        double moy=0.0;
        for(i=0;i<note.length;i++){
            if(note[i].isAbsent()){
                moy=-1;
                break;}
            moy+=note[i].getValeur();
        }
        if(moy<0){
            return new Notes();
        }
        return new Notes(moy/note.length,false);
//        return moy/note.length;
//        return System.out.println(moy/note.length);
    }
    
}
