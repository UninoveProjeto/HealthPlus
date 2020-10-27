/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author darkuser
 */
public class ConnectionFactory {
    
    
    private final String DRIVER = "com.postgresql.jdbc.Driver";
    private final String URL = "jdbc:postgresql://127.0.0.1:5432/dbhealth";
    private final String USER = "postgres";
    private final String PASS = "postgres";
    
    public Connection getConnection() throws SQLException, ClassNotFoundException{ 
           
            
            Connection con = DriverManager.getConnection(URL, USER, PASS);
            
            
             Class.forName(DRIVER);
        return con;
            
    }
}
