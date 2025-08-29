
package application;

/**
 *
 * @author Jean Marc
 */
public class IterateurDesImpairs extends Iterateur {

    public IterateurDesImpairs(int[] tab) {
        super(tab);
    }
    
    @Override
    @SuppressWarnings("empty-statement")
    public int indiceDuSuivant() {
        
        int indice = pos;
        indice = indice + 1;
        
        for (;  indice < tab.length && tab[indice] % 2 == 0; indice++);
        return indice;  
    }

    @Override
    @SuppressWarnings("empty-statement")
    public int indiceDuPrecedent() {
        int indice = pos;
        indice = indice - 1;    
        for (;  indice >= 0 && tab[indice] % 2 == 0; indice--);
        return indice;
    }
    
}
