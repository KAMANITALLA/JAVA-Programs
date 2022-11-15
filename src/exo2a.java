import java.util.Scanner;
public class exo2a {
    public static void main(String[] args) {
        int i,n,som;
        som=0;
        for(i=0;i<4;i++)
        {System.out.println("donner un entier");
            Scanner Clavier = new Scanner(System.in);
                n=Clavier.nextInt();
            
            som+=n;
        }
        System.out.println("somme:" +som);
    }
}
