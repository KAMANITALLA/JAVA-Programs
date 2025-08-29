/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POOrattrapageSN1_23_24;

/**
 *
 * @author GENERAL STORES
 */
public class Niveau {
    private Element[][] carte;
    private Personnage pj;
    private String titre;
    
    public Niveau(){
        this.carte=new Element[10][10];
        this.pj=new Personnage();
        this.titre="";
    }
    public Niveau(Personnage p){
        this.carte=new Element[10][10];
        this.pj=p;
        this.titre=""; 
    }
    public void setElement(int i, int j, Element k){
        for(int u=0;u<carte.length && u!=i;u++){
            for(int v=0;v<carte[u].length && v!=j;v++){
                carte[u][v]=k;
            }
        }
    }
    public Element getElement(int i, int j){
        return carte[i][j];
    }
    public String decritCarte(int i, int j){
        if(carte[i][j]!=null)
            return carte[i][j].getDescription();
        return "Case vide";
    }
    public String decritCarte(){
        StringBuilder descriptions=new StringBuilder("");
        for(int i=0;i<carte.length;i++){
            for(int j=0;j<carte[i].length;j++){
                descriptions.append(decritCarte(i,j)).append(", /n");
            }
        }
        return descriptions.toString();
    }
    public Personnage getPersonnagePrincipal( ) {
        return this.pj;
    }
    public void getPersonnagePrincipal(Personnage p ) {
        this.pj=p;
    }
    public String getTitre(){
        return this.titre;
    }
    public void setTitre(String t){
        this.titre=t;
    }
}
