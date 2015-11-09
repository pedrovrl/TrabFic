/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.boletimaluno.testes;

import br.boletimaluno.connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Gustavo
 */
public class TesteConexao {
    public static void main(String args[]) {
        try {
            Connection connection = new ConnectionFactory().getConnection();
            System.out.println("Conexão aberta!");
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(TesteConexao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
