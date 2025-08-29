/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boutique;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
//import com.mysql.cj.xdevapi.Statement;
//import java.lang.System.Logger;
//import java.lang.System.Logger.Level;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
//import java.
/**
 *
 * @author GENERAL STORES
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            //etape1: charger la classe de DRIVER
            Class.forName("com.mysql.cj.jdbc.Driver");
            //etape2: creer l'objet de connexuion
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/boutique","root","");

            //etape3: creer l'objet statement
            //Statement stmt=conn.createStatement();
            Statement stmt=conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet res=stmt.executeQuery("select * FROM utilisateur");
            ResultSetMetaData rsmd=res.getMetaData();
            //etape4: executer la requete

            while(res.next())//Affichage de la table utilisateur
                System.out.println(res.getInt("idutilisateur")+" "+res.getString(
                        "nom")+" "+res.getString("prenom")+" "+res.getString(
                                "email")+" "+res.getString("motdepasse"));
            System.out.println("parcourir selon la MetaDta: ");

            for(int i=1;i<=rsmd.getColumnCount();i++){/*affichage des caracteristiques
                des champs de la table utilisateur*/
                System.out.println("colonne : "+rsmd.getColumnName(i));
                System.out.println(" > "+rsmd.getColumnTypeName(i));
                 System.out.println(" > "+rsmd.getColumnClassName(i));
            }
            System.out.println();
            
            //reaffichage de utilisateur
            res.beforeFirst();
            while(res.next()){
                for(int i=1;i<rsmd.getColumnCount();i++){
                    System.out.println(res.getObject(i).toString()+" - ");
                }
//                 System.out.println();
            }
            res.beforeFirst();
            res.next();
            
            //insertion des donnees dans la table produit
            String nom="Spageti royal 500g";
            double prix=500;
            int idcategorie=1;
            int idutilisateur=2;
            PreparedStatement psNouvProduit=conn.prepareStatement(("INSERT INTO produit(nom,prix,idcategorie,idutilisateur)"+"VALUES(?,?,?,?)"));
            psNouvProduit.setString(1,nom);
            psNouvProduit.setDouble(2,prix);
            psNouvProduit.setInt(3,idcategorie);
            psNouvProduit.setInt(4,idutilisateur);
//            int result=psNouvProduit.executeUpdate();
            
            ResultSet res1=stmt.executeQuery("select * FROM produit");
            ResultSetMetaData rsmd1=res1.getMetaData();
            while(res1.next())//Affichage de la table produit
                System.out.println(res1.getInt("idproduit")+" "+res1.getString(
                        "nom")+" "+res1.getDouble("prix")+" "+res1.getInt(
                                "idcategorie")+" "+res1.getInt("idutilisateur"));
            
        }catch(SQLException e){
        }catch(ClassNotFoundException ex){
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE , null , ex);
        }
        
    }
    
}
