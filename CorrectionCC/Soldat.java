/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package CorrectionCC;

/**
 *
 * @author HP
 */
public interface Soldat {
    public void hit(Soldat s);
    public int getVie();
    public int getForce();
    public int getArmure();
    public void setVie(int v);
    public void setForce(int f);
    public void setArmure(int a);
}
