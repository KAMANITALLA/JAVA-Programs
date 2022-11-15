import java.util.Scanner;
public class exo3 {
    public static void main(String[] args) {
        int i=4,n,som;
        som=0;
        do{System.out.println("donner un entier");
            Scanner Clavier = new Scanner(System.in);
            n=Clavier.nextInt();
            som+=n;
            i--;
        }while(i>0);
        System.out.println("somme:" +som);
    }
}

