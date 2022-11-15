import java.io.File;
import java.util.Scanner;
public class DiviseursEntier {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int a,n,i;
        System.out.println("Entrer un nombre entier:");
        System.out.print("a=");
        a= SC.nextInt();
        for(i=a; i>0; i--){
            n=a/i;
            if(a%i==0){
               System.out.println(n+ " est un diviseur de " +a);}
        }
    }
}
