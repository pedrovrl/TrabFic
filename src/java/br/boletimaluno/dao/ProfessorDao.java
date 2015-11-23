/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.boletimaluno.dao;

import br.boletimaluno.connection.ConnectionFactory;
import br.boletimaluno.models.Professor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Pedro
 */
public class ProfessorDao {
    private Connection connection;
    
    public ProfessorDao() {
        this.connection = new ConnectionFactory().getConnection();
    }
    
    public void autentifica(Professor professor){
        String sql = "SELECT FROM dtc_professor WHERE professor_id=?";
        
        try{
            PreparedStatement stmt = connection.prepareStatement(sql);
            
            stmt.setInt(1, professor.getProfId());
            
            stmt.execute();
            stmt.close();
        } catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
    
    public void adiciona(Professor professor) {
        String sql = "INSERT INTO dtc_professor (nome, senha) values (?, ?)";
        try {
            //preparando o statement para inserção
            PreparedStatement stmt = connection.prepareStatement(sql);
            
            //setando valores
            stmt.setString(1, professor.getProfNome());
            stmt.setString(2, professor.getProfSenha());
            
            // executa
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
