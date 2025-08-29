
package application;

/**
 *
 * @author Jean Marc
 */
public abstract class Iterateur implements IterateurTabInt{

    
    protected int[] tab;
    protected int pos;

    public Iterateur(int[] tab) {
        this.tab = tab;
        this.pos = -1;
    }

    @Override
    public int suivant() {
        int i = indiceDuSuivant();
        pos = i;
        return tab[pos];
    }
    
    @Override
    public int precedent(){
        int i = indiceDuPrecedent();
        pos = i;
        return tab[pos];
    }
    
    @Override
    @SuppressWarnings("empty-statement")
    public boolean aUnSuivant() {
        
        int indice = indiceDuSuivant();       
        return (indice < tab.length);
    }
    
    @Override
    public boolean aUnPrecedent() {
        
        int indice = indiceDuPrecedent();
        
        return (indice >= 0);
    }


    @Override
    public abstract int indiceDuSuivant();

    @Override
    public abstract int indiceDuPrecedent();

    
}
