/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package POOTheatre;

import java.util.Scanner;

/**
 *
 * @author GENERAL STORES
 */
public class Regulier extends Membre{
    private double salaireBrute;
    
    public Regulier(){
        super();
        this.salaireBrute=0;
    }
    public Regulier(String nom,String n,TypeRole role,double salaireBrute){
        super(nom,n,role);
        this.salaireBrute=salaireBrute;
    }
    
    public double getSalaireBrute() {
        return salaireBrute;
    }

    public void setSalaireBrute(double salaireBrute) {
        this.salaireBrute = salaireBrute;
    }

    @Override
    public double salaireMensuel() {
        return this.salaireBrute;
    }
    
    @Override
    public String toString(){
        return super.toString()+" et pour salaire brute "+salaireBrute;
    }
//    @Override
//     public void saisieInfo(){
//        super();
//        System.out.println("Rôle (acteur,technicien,administratif): ");
//        this.role=TypeRole.valueOf(sc.nextLine());
//    }
    
//    @Override
//    public boolean equals(Object o) {
//        if(o==null)
//            return false;
//        if(o.getClass()!=Regulier.class)
//            return false;
//        Regulier m=(Regulier)o;
//        if(this.nom.equals(m.nom)&&
//                this.numSecu.equals(m.numSecu)&&
//                this.role.equals(m.role))
////                &&this.salaireBrute.)
//            return true;
//        return false;
//    }

}
