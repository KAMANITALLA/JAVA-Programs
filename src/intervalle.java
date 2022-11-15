import java.io.File;
import java.util.Scanner;
public class intervalle {
    public static void main(String[] args) {
        Scanner SC=new Scanner(System.in);
        double A;
        System.out.println("Entrer un nombre:");
        A= SC.nextDouble();
        if(A>=0 && A<=20)
            System.out.println("votre nombre appartient à cet interval.");
        else
            System.out.println("votre nombre n'appartient pas à cet interval.");
    }
}
