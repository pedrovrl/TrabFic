/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.boletimaluno.dao;

import br.boletimaluno.connection.ConnectionFactory;
import br.boletimaluno.models.Aluno;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gustavo
 */
public class AlunoDao {
    
    private Connection connection;
    
    public AlunoDao() {
        this.connection = new ConnectionFactory().getConnection();
    }
    
    public void adiciona(Aluno aluno) {
        String sql = "INSERT INTO dtc_aluno (alun_nome) values (?)";
        try {
            //preparando o statement para inserção
            PreparedStatement stmt = connection.prepareStatement(sql);
            
            //setando valores
            stmt.setString(1, aluno.getAlunNome());
            
            // executa
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public void altera(Aluno aluno) {
        String sql = "UPDATE dtc_aluno SET alun_nome=?";
        
        try {
            //preparando o statement para inserção
            PreparedStatement stmt = connection.prepareStatement(sql);
            
            //setando valores
            stmt.setString(1, aluno.getAlunNome());
            
            // executa
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public void remove(Aluno aluno) {
        String sql = "DELETE FROM dtc_aluno WHERE alun_id=?";
        
        try {
            //preparando o statement para inserção
            PreparedStatement stmt = connection.prepareStatement(sql);
            
            //setando valores
            stmt.setInt(1, aluno.getAlunId());
            
            // executa
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public List<Aluno> getLista(String where) {
        try {
            List<Aluno> alunos = new ArrayList<Aluno>();
            PreparedStatement stmt = this.connection.
                    prepareStatement("select * from dtc_aluno "+where);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()) {
                Aluno aluno = new Aluno();
                aluno.setAlunId(rs.getInt("alun_id"));
                aluno.setAlunNome(rs.getString("alun_nome"));
                
                alunos.add(aluno);
            }
            rs.close();
            stmt.close();
            return alunos;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
