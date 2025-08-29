/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POOTheatre;
import java.util.List;
import java.util.ArrayList;

public class CompagnieTheatre {
    private String nom;
    private List<Membre> memberList;
    
    public CompagnieTheatre(String nom){
        this.nom=nom;
        this.memberList=new ArrayList();
    }
    public CompagnieTheatre(){
        this("");
    }
    public String getNom(){
        return this.nom;
    }
    public void setNom(String n){
        this.nom=n;
    }
    public List<Membre> getMemberList(){
        return this.memberList;
    }
    public void ajouterMembre(Membre m){
//        for(int i=0;i<memberList.size();i++)
//            if(memberList[i]!=null)
//                if(memberList[i].equals(m))
//                    throw new IllegalArgumentException(
//                            "Le membre appartient déjà à cette compagnie.");
//            throw new NullPointerException("Position "+i+" vide");
        if(m!=null)
            if(!memberList.contains(m))
                memberList.add(m);
            throw new IllegalArgumentException(
                            "Le membre appartient déjà à cette compagnie.");
    }
    
    public Double salaireMensuelChargerTotal(){
//        return memberList.stream().mapToDouble(Membre::salaireMensuelCharger).sum();
        double total=0;
        for(Membre e: memberList)
            total+=e.salaireMensuelCharger();
        return total;
    }
    
    public List<Membre> sousList(TypeRole role,double sal){
        List<Membre> SL=new ArrayList();
        for(Membre e:memberList){
            if(e.getRole()==role && e.salaireMensuel()>sal){
                SL.add(e);
            }
        }
        return SL;
    }
}
