/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POOrattrapageSN1_23_24;

/**
 *
 * @author GENERAL STORES
 */
public abstract class Element {
    
    protected String description;
    
    public Element(){
        this.description="";
    }
    
    public String getDescription(){
        return this.description;
    }
    public void setDescription(String s){
        this.description=s;
    }
    public abstract String getType();
    
}
