package Exceptions;

import java.util.List;

/**
 *
 * @author GENERAL STORES
 */
public class IterateurDesPairs implements IterateurTabInt{
    private int[] tab;
//    private List<Integer> tab;
    private int pos;
    
    public IterateurDesPairs(int[] tab) {
        this.tab = tab;
        this.pos=-1;
    }

    @Override
    public int suivant() {
        int indice=indiceDuSuivant();
        pos=indice;
        return tab[pos];
    }
    
    @Override
    public boolean aUnSuivant() {
        int indice=indiceDuSuivant();
        return (indice<tab.length);
    }
    
    @Override
    public int indiceDuSuivant() {
        int i=pos+1;
        for(;i<tab.length && tab[i]%2!=0;i++){}
        return i;
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
}



