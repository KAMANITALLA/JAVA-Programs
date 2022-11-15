import java.io.File;
import java.util.Scanner;
public class Maxmin {
    public static void main(String[] args) {
        int a,b;
        Scanner SC=new Scanner(System.in);
        System.out.println("Entrer deux nombres a et b:");
        System.out.print("a=");
        a= SC.nextInt();
        System.out.print("b=");
        b= SC.nextInt();
        if(a<b){
            System.out.print("Max=" +b);System.out.print("min=" +a);}
        else if(b<a){
            System.out.print("Max=" +a);System.out.print("min=" +b);}
            else {
                System.out.println("Vous avez entré des valeures identiques de a et b.Veuillez y remedier.");}
    }
}
