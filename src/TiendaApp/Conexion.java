/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TiendaApp;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author javie
 */
public class Conexion {

    static Connection Conectar;
    static final String Driver = "com.mysql.cj.jdbc.Driver";
    static final String Host = "bpwxf4e69x5fyugcydw6-mysql.services.clever-cloud.com";
    static final String Port = "3306";
    static final String User = "uaokk8xarf8izd6x";
    static final String Password = "m9xjWB2LjW7A6V9vlat2";
    static final String Namebd = "bpwxf4e69x5fyugcydw6";
    
//    static final String Driver = "com.mysql.cj.jdbc.Driver";
//    static final String Host = "localhost";
//    static final String Port = "3306";
//    static final String User = "root";
//    static final String Password = "javier20";
//    static final String Namebd = "tienda";
    
    static final String url = "jdbc:mysql://"+Host+":"+Port+"/"+Namebd;
    
    //Constructor que realiza la coneccion
    public Conexion(){
        try{
            Class.forName(Driver);
            Conectar= DriverManager.getConnection(url,User,Password);
            JOptionPane.showMessageDialog(null, "Conexion correcta");
        }catch (Exception e){
            
            JOptionPane.showMessageDialog(null,"No se pudo conectar a la base de datos"+e.toString());
        }
    }
    
    //llamar al constructor//el constructor ya hizo la conexion y lo unico
    //que nos va a retornar es la conexion
    public Connection getConnection(){
    return Conectar;
    }
    
    //desconectar
    public void desconectar(){
    Conectar=null;
    if (Conectar==null)
        JOptionPane.showMessageDialog(null, "Conexion terminada...");
    }

}
