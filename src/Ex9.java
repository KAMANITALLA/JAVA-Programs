import java.io.File;
import java.util.Scanner;
public class Ex9 {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int M,N,i;
        System.out.println("Entrer deux nombres M et N:");
        System.out.print("M=");
        M = SC.nextInt();
        System.out.print("N=");
        N = SC.nextInt();
        if(M>N){
        for (i=M; i>0; i--) {
            if( M%i==0 && N%i==0  ) {
                System.out.println( "Les diviseur commun de M et N sont");
            }
        }
        }
        /*else if(M<N){
            for (i=N; i>0; i--) {
                nM=M/i;nN=N/i;
                if (M%i==0 && N%i== 0 && nM==nN) {
                    System.out.println(nM+ " est un diviseur commun de " +M " et " +N);
                }
            }
        }else{
            System.out.println("Entrer deux nombres M et N différent");
        }*/

    }
}
