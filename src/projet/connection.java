/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet;
import java.sql.*;
import javax.swing.JOptionPane;
import projet.acceuil;
/**
 *
 * @author Andrô Ajpr Romain
 */
public class connection {
    String url="jdbc:mysql://localhost/gestionlocationvoiture";
    Connection con=null;
    Statement stat;
    
     Statement connectionDB(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url,"root","");
            stat=con.createStatement();
        }catch(Exception e){
            acceuil a=new acceuil();
           JOptionPane.showMessageDialog(a, "Le connection au base de donnée a echoué","Avertissement",JOptionPane.WARNING_MESSAGE);
           e.printStackTrace();
        }
        return stat;
    }
    
     void closeDB(){
         try{
             stat.close();
             con.close();     
         }catch(Exception e){
             e.printStackTrace();
         }
     }
     
            
}
