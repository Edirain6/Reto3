
package Controlador;



import Modelo.*;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
import com.mysql.cj.protocol.Resultset;
import java.util.ArrayList;


public class CbSucursal {
    
    Connection connection;
    Conexion conexion = new Conexion();
    Statement st;
    Resultset rs;
            
    public ArrayList getListSucursales() {
        ArrayList mListaSucursales = new ArrayList();
        try{
            connection = conexion.getConnection();
            st = connection.createStatement();
            rs = (Resultset) st.executeQuery("SELECT idSucursal, nombreSucursal FROM ``sucursal");
            
        }catch(SQLException e){
            System.out.println(e);
        }
        return mListaSucursales;
    }        
}          
            
