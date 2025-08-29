/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CorrectionCC;

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String [] args){
        Soldier s1= new Soldier("FULL",12,23);
        Soldier s2= new Soldier("TOTO",13,2);
        Soldier s3= new Soldier("PAPA",22,100);
        Soldier s4= new Soldier("BEN",3,12);
        s1.hit(s2);
        System.out.println(s2);
        s2.hit(s3);
        System.out.println(s3);
        s3.hit(s4);
        System.out.println(s4);
        s4.hit(s1);
        System.out.println(s1);
        Soldier s5= new Soldier("TEN",4,12);
        Soldier s6= new Soldier("REN",13,2);
        Soldier s7= new Soldier("IMM",13,13);
        s5.hit(s6);
        System.out.println(s6);
        s6.hit(s5);
         System.out.println(s5);
         s6.hit(s7);
         System.out.println(s7);
    }
}
