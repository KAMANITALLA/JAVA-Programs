/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pooSN123_24;

/**
 *
 * @author GENERAL STORES
 */
public class Trou extends Tuile{
    
    public Trou(){
        super(-1);
    }
    
    public boolean isCorrcetPosition(){
        return getPosition()==tailleTab-1;
    }
    
//    public static void main(String[] args) {
//        // TODO code application logic here
//    }
    
}
