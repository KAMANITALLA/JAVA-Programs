
package application;

public class IterateurDesPairs extends Iterateur {


    public IterateurDesPairs(int[] tab) {
        super(tab);
    }

    @Override
    @SuppressWarnings("empty-statement")
    public int indiceDuSuivant() {
      
        int indice = pos;
        indice = indice + 1;
        
        for (;  indice < tab.length && tab[indice] % 2 != 0; indice++);
        return indice;
    }
    
    @SuppressWarnings("empty-statement")
    @Override
    public int indiceDuPrecedent(){
        
        int indice = pos;
        indice = indice - 1;    
        for (;  indice >= 0 && tab[indice] % 2 != 0; indice--);
        return indice;
        
    }

}


