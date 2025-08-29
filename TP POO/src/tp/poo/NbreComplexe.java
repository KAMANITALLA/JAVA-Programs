/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp.poo;

import static java.lang.Math.sqrt;
/**
 *
 * @author GENERAL STORES
 */
//import java.util.*;
//import java.math.*;
public class NbreComplexe {
    protected Double rel;
    protected Double img;

    public NbreComplexe() {
        this.rel = 0.0;
        this.img = 0.0;
    }

    public NbreComplexe(Double rel, Double img) {
        this.rel = rel;
        this.img = img;
    }
    
//    public NbreComplexe(NbreComplexe c) {
//        this.rel = c.rel;
//        this.img = c.img;
//    }
    
    public NbreComplexe(Double rel) {
        this.rel = rel;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String toString() {
        return "NbreComplexe{" + "rel=" + rel + ", img=" + img + '}';
    }
    
    public String afficher() {
//        return img<0?rel+""+img+"i est un nombre complexe.":rel+" + "+"i est un nombre complexe."+img;
         return +rel+" + "+img+"i est un nombre complexe.";
    }

    public Double getRel() {
        return rel;
    }

    public void setRel(Double rel) {
        this.rel = rel;
    }

    public Double getImg() {
        return img;
    }

    public void setImg(Double img) {
        this.img = img;
    }
    
    
    public NbreComplexe somme(NbreComplexe a){
        NbreComplexe som =new NbreComplexe(0.0,0.0);
        som.rel=this.getRel()+a.rel;
        som.img=this.getImg()+a.img;
        return som;    
    }
    
    public NbreComplexe diff(NbreComplexe a){
        NbreComplexe som =new NbreComplexe(0.0,0.0);
        som.rel=this.getRel()-a.rel;
        som.img=this.getImg()-a.img;
        return som;    
    }
    
    public NbreComplexe produit(NbreComplexe a){
        NbreComplexe pro =new NbreComplexe(0.0,0.0);
        pro.rel=(this.rel*a.rel)+(this.img*a.img);
        pro.img=(this.rel*a.img)+(this.img*a.rel);
        return pro;    
    }
    
    public Double modulo(){
        return sqrt((this.rel)*(this.rel)+(this.img)*(this.img));    
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        NbreComplexe a=new NbreComplexe(1.1,2.0);
        NbreComplexe b=new NbreComplexe(3.4,3.0);
        
        NbreComplexe s=a.somme(b);
        NbreComplexe p=a.produit(b);
        NbreComplexe d=a.diff(b);
        
        System.out.println(a.afficher());
        System.out.println(b.afficher());
        
        System.out.println("La somme est: "+s.afficher());
        System.out.println("La difference est: "+d.afficher());
        System.out.println("Le produit est: "+p.afficher());
        System.out.println(a.modulo());
        System.out.println(a.equals(a));


    }
    
}
