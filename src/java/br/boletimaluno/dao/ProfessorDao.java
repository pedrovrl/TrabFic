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
import java.sql.ResultSet;
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
    
    public int select(String nome, String senha) throws SQLException{
        try 
        {
            int profid = 0;
            PreparedStatement stmt = this.connection.
                    prepareStatement("select * from dtc_professor where nome='"+nome+"' and senha='"+senha+"'");
            ResultSet rs = stmt.executeQuery();
            
            if (rs.next()){
                profid = rs.getInt("professor_id");
            }
            stmt.close();
            
            return profid;
        }
        catch (SQLException e) 
        {
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
