/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.boletimaluno.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
import java.util.Properties;

/**
 *
 * @author Gustavo
 */
public class ConnectionFactory {
    
    public Connection getConnection() {
     try {
         
         // deve mudar o login/senha do postgres para o mesmo funcionar
         String url = "jdbc:postgresql://localhost:5432/BoletimVirtual";
         Properties props = new Properties();
         props.setProperty("user","postgres");
         props.setProperty("password","p2093v");
         
         Connection conn = DriverManager.getConnection(url, props);
         return conn;
     } catch (SQLException e) {
         throw new RuntimeException(e);
     }
 }
}
