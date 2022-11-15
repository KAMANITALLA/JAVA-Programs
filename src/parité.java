import java.util.Scanner;
public class parité {
    public static void main(String[] args) {
        int entier;
        System.out.println("Entrer un nombre entier:");
        Scanner c= new Scanner(System.in);
        entier = c.nextInt();
        if((entier%2)==1)
            System.out.println("Votre nombre entier est impaire");
        else
            System.out.println("Votre nombre entier est paire");
    }
}