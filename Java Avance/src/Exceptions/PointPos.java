/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exceptions;

/**
 *
 * @author GENERAL STORES
 */
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
public class PointPos {
    protected int Abs;
    protected int Ord;
   
    
    public PointPos(int abs, int ord) throws ErrConst{
        this.Abs=abs;
        this.Ord=ord;
        if (abs < 0 || ord < 0) {
            throw new ErrConst("Erreur : Les coordonnées doivent être des entiers naturels (positifs ou nuls).");
        }
        
    }
    
    public int getAbs(){
        return this.Abs;
    }
    public int getOrd(){
        return this.Ord;
    }
    public void setAbs(int abs) throws ErrConst{
        this.Abs=abs;
        if (abs < 0) {
            throw new ErrConst("Erreur : L'abscisse doit être un entier naturel (positif ou nul).");
        }
    }
    public void setOrd(int ord) throws ErrConst{
        this.Ord=ord;
        if (Ord < 0) {
            throw new ErrConst("Erreur : L'ordonnee doit être un entier naturel (positif ou nul).");
        }
    }
    
    @Override
    public String toString(){
        return "L'objet PointPos a pour abscisse "+this.Abs+" et pour ordonnee "+this.Ord;
    }
    
    public static void main(String [] args){
        //scanner v=new scanner(System.in);
        
        try {
            PointPos point1 = new PointPos(-1, 2); // Cela va lever une exception
        }
        catch (ErrConst e) {
            System.err.println(e.getMessage());
            //point1.setAbs(5);
        }
        finally {
            System.out.println("Fin._____________________________");
	}
        
        try {
            PointPos p = new PointPos(3, 4);
            System.out.println(p);
            p.setAbs(5);
            p.setOrd(-1); // Cela va lever une exception
        } 
        catch (ErrConst e) {
            System.err.println(e.getMessage());
        }
        finally {
            System.out.println("Fin._____________________________");
	}
//        PointPos p1 = null;
//        try {
//            p1 = new PointPos(5, 3);
//        } catch (ErrConst ex) {
//            Logger.getLogger(PointPos.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        System.out.println(p1);
    }
}

