/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sn23_24.Iterateur;

/**
 *
 * @author GENERAL STORES
 */
public class IterateurDesPairs implements IterateurTabInt{
    private int[] tab;
    private int pos;
    
    public IterateurDesPairs(){
        
    }
    
    public IterateurDesPairs(int[] tab){
        this.tab=tab;
        this.pos=-1;
    }

    @Override
    public int suivant() {
//        int[] table=new int[];
       pos=indiceDuSuivant();
        return tab[pos];
        
    }

    @Override
    public int indiceDuSuivant() {
        int i=pos+1;
        for(;i<=tab.length && tab[i]%2!=0;i++){}
        return i;
    }

    @Override
    public boolean aUnSuivant() {
        
        return (indiceDuSuivant()<tab.length);
        
    }

    public int[] getTab() {
        return tab;
    }

    public void setTab(int[] tab) {
        this.tab = tab;
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) {
//        // TODO code application logic here
//    }
    
}
