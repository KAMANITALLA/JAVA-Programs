/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp.poo;

/**
 *
 * @author GENERAL STORES
 */
import java.util.Scanner;
public class Fibo{
    private int U0=0;
    private int U1=1;
    private int U;
    private int n;

    public Fibo(int n) {
        this.n = n;
        this.U=U;
    }
    
    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (o.getClass() != Fibo.class) {
            return false;
        }
        Fibo c = (Fibo) o;

        if (this.n== c.n) {
            return true;
        } else {
            return false;
        }
    }
        
    

    @Override
    public String toString() {
        return "Fibo{ n="+ n + '}';
    }
    
//    public void calc(){
//        U=U0+U1;    
//    }
    
    public int Fibonacci(){
        if (n==0){
            return (int)U0;
        }else if(n==1){
            return (int)U1;
        }else if(n>=2){
           return U=U0+U1;
        }else{
        return -1;}
    }

    public int getU0() {
        return U0;
    }

    public int getU1() {
        return U1;
    }

    public int getU() {
        return U;
    }

    public void setU(int U) {
        this.U = U;
    }

    public void setU0(int U0) {
        this.U0 = U0;
    }

    public void setU1(int U1) {
        this.U1 = U1;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Entrer n: ");
        int n = sc.nextInt();
        Fibo A=new Fibo(n);
        System.out.println(A);
//        faire une methode qui trouve la valeur de la suite de fibonacci pourtout n
//        for(int i=2;n;i++){
//            if(i>=2){A.setU(A.getU0()+A.getU1());
//            A.setU0(A.getU1());
//            A.setU1(A.getU());
//            System.out.println(A.Fibonacci());}
//        }
    }
    
    
}
    