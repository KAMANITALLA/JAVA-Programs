/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POOrattrapageSN1_23_24;

/**
 *
 * @author GENERAL STORES
 */
public class Personnage extends Element{
    
    private String name;
    private int vitalite;
    private int vitaliteMax;
    private Objet[] inventaire;
    
    public Personnage(){
        super();
        this.name="Hero";
        this.vitalite=100;
        this.vitaliteMax=100;
        this.inventaire= new Objet[3];
    }

    @Override
    public String getType() {
        return "Personnage";
    }
    
    @Override
    public String getDescription(){
        return "\nNom: "+this.name+"\n"+"vitalite actuelle: "+this.vitalite+
                "\nVitalite maximale: "+this.vitaliteMax;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getVitalite(){
        return this.vitalite;
    }
    public void setVitalite(int vie){
//        this.vitalite=Math.min(vie,vitaliteMax);
            if(vie>0&&vie<=this.vitaliteMax){
                this.vitalite=vie;
            }else{
                throw new IllegalArgumentException("Valeur doit inferieur au Max");
            }
    }
    public int getVitaliteMax(){
        return this.vitaliteMax;
    }
    public void setVitaliteMax(int vieMax){
        this.vitaliteMax=vieMax;
    }
    public String afficheInventaire(){
        StringBuilder inv=new StringBuilder("");
        for(Objet o:inventaire){
            if(o!=null){
                inv.append(o.getDescription()+"\n");
            }else{
                inv.append("Vide \n");
            }
        }
        return inv.toString();
//        return inventaire.stream().map(Objet::getDescription());
    }
    public void ajouteObjet(Objet obj){
        if(obj!=null){
            
            if(inventaire[0]!=null && inventaire[1]!=null && inventaire[2]!=null){
                throw new IllegalArgumentException("inventaire plein");
            }else{
                for(int i=0;i<inventaire.length;i++){
                    if(inventaire[i]==null){
                        inventaire[i]=obj;
                        obj=null;
                    }
                }
            }
        }
        else{throw new NullPointerException("Objet vide");}
    }
    public Objet PoseObjet(int numero){
        Objet obj = null;
        if(numero>=0 && numero<inventaire.length){
            for(int i=0;i<inventaire.length;i++){
                if(numero==i){
                    obj=inventaire[i];
                    inventaire[i]=null;
                }
            }
            return obj;
        }else{
            throw new IllegalArgumentException("nan");
        }
    }
}
