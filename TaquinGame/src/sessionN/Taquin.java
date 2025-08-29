/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sessionN;

/**
 *
 * @author GENERAL STORES
 */
import java.util.Random;
public class Taquin {
    private Tuile[][] grille;// grille ici est un tableau de tuile de 2 dimensions
    private Trou trou;
    private int largeur;
    private int hauteur;
    
    //constructeur avec parametres de hauteur et largeur
    public Taquin(int hauteur, int largeur){
        this.largeur=largeur;
        this.hauteur=hauteur;
        this.grille=new Tuile[hauteur][largeur];
        this.trou=new Trou();
    }
    
    // Initialiser le taquin
    private void initialiserTaquin() {
        int numero = 0;
        for (int i = 0; i < hauteur; i++) {
            for (int j = 0; j < largeur; j++) {
                if (i == hauteur - 1 && j == largeur - 1) {
                    grille[i][j] = trou; // Placer le trou en bas à droite
                } else {
                    grille[i][j] = new Tuile(numero);
                    numero++;
                }
            }
        }
    }
    
    // Enumération pour les directions de déplacement
    public enum DirectionDeplacement {
        HAUT, BAS, GAUCHE, DROITE
    }
    
    // Méthode de déplacement
    public boolean deplacer(DirectionDeplacement d) throws DeplacementImpossibleException {
        int trouX = -1, trouY = -1;

        // Trouver la position du trou
        for (int i = 0; i < hauteur; i++) {
            for (int j = 0; j < largeur; j++) {
                if (grille[i][j] instanceof Trou) {
                    trouX = i;
                    trouY = j;
                }
                if (i==0 && d==DirectionDeplacement.HAUT)
                    throw new DeplacementImpossibleException
        ("Deplacement Impossible vers le haut");
                if (i==hauteur-1 && d==DirectionDeplacement.BAS)
                    throw new DeplacementImpossibleException
        ("Deplacement Impossible vers le bas");
                //a suivre le 17/10/2024
                
                if (j==0 && d==DirectionDeplacement.GAUCHE)
                    throw new DeplacementImpossibleException
        ("Deplacement Impossible vers la gauche");
                if (j==largeur-1 && d==DirectionDeplacement.DROITE)
                    throw new DeplacementImpossibleException
        ("Deplacement Impossible vers la droite");
                
                //recherche du trou
                //int itrou,jtrou;
                boolean b=false; int k=0;
                while(!b && k<hauteur){
                    //recherche du trou sur la ligne
                    if(grille[i][k].getNumero()==-1){ b=true; trouX=i; trouY=k;}
                    k++;
                }
                boolean b1=false; int v=0;
                while(!b1 && v<largeur){
                    //recherche du trou sur la colonne
                    if(grille[v][j].getNumero()==-1){b1=true; trouX=v; trouY=j;}
                    v++;
                }
                if(!(b || b1))
                    throw new DeplacementImpossibleException("Absence du trou");
                else{ 
                    Tuile temp;
                    temp=grille[trouX][trouY];
                    switch (d){
                        
                        case HAUT:
                            grille[trouX][trouY]=grille[trouX-1][trouY];
                            grille[trouX-1][trouY]=temp;
                            return true;
                        case BAS:
                            grille[trouX][trouY]=grille[trouX+1][trouY];
                            grille[trouX+1][trouY]=temp;
                            return true;
                        case GAUCHE:
                            grille[trouX][trouY]=grille[trouX][trouY-1];
                            grille[trouX][trouY-1]=temp;
                            return true;
                        case DROITE:
                            grille[trouX][trouY]=grille[trouX][trouY+1];
                            grille[trouX][trouY+1]=temp;
                            return true;
                        default: throw new DeplacementImpossibleException
        ("Deplacement impossible.");
                        }
                    }
                            
                }
            }
        return false;
        }
    }



