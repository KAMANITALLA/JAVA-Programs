/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author GENERAL STORES
 */
import java.sql.*;

public class connexion {
    private static final String URL="jdbc:mysql://localhost:3306/supermarket";
    private static final String USER="root";
    private static final String PASSWORD="";
    
    static{
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver charge");
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }
    
    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(URL,USER,PASSWORD);
    }
}
