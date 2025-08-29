/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CorrectionCC;

/**
 *
 * @author HP
 */
public class ArmoredSoldier extends Soldier {
    private int Armure;

public ArmoredSoldier() {
        super();
        this.Armure=0;
    }

public ArmoredSoldier(String Nom, int Force, int Vie,int Armure) throws IllegalArgumentException {
        super(Nom, Force, Vie);
        this.Armure= Armure;
    }

public int getArmure() {
        return Armure;
    }

public void setArmure(int Armure) {
        this.Armure = Armure;
    }
       
}
