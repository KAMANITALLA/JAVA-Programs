/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sessionN;

/**
 *
 * @author GENERAL STORES
 */
public class Trou extends Tuile {
    
    //constructeur par defaut
    public Trou(){
        super(-1); //numero du trou
        /*super();
        this.numero=-1*/
    }
    //methode isCorrectPosition
    @Override
    public boolean isCorrectPosition(){
        return getPosition()==tailleTab-1;
        //return this.position==this.tailleTab-1;
    }
}
