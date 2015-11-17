/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.boletimaluno.dao;

import br.boletimaluno.connection.ConnectionFactory;
import br.boletimaluno.models.Atividade;
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
public class AtividadeDao {
    private Connection connection;
    
    public AtividadeDao() {
        this.connection = new ConnectionFactory().getConnection();
    }
    
    public int adiciona(Atividade atividade) {
        String sql = "INSERT INTO dtc_atividade (ativ_nome, ativ_tipo, ativ_valor, professor_fk_id) values (?, ?, ?, ?)";
        try {
            //preparando o statement para inserção
            PreparedStatement stmt = connection.prepareStatement(sql);
            
            //setando valores
            stmt.setString(1, atividade.getAtivNome());
            stmt.setInt(2, atividade.getAtivTipo());
            stmt.setDouble(3, atividade.getAtivValor());
            stmt.setInt(4, atividade.getAtivProfId());
            
            // executa
            stmt.execute();
            stmt.close(); 

            return getLastId();
  
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public int getLastId() throws SQLException{ 
        String sql = "SELECT MAX(ativ_id) as ativ_id FROM dtc_atividade"; 
        PreparedStatement stmt = (PreparedStatement) connection.prepareStatement(sql); 
        ResultSet rs = stmt.executeQuery(); 
        rs.next(); 
        int lastId = rs.getInt("ativ_id"); 

        rs.close(); 
        stmt.close(); 

        return lastId;
    }
    public void altera(Atividade atividade) {
        String sql = "UPDATE dtc_atividade SET ativ_nome='?', ativ_tipo='?'";
        
        try {
            //preparando o statement para inserção
            PreparedStatement stmt = connection.prepareStatement(sql);
            
            //setando valores
            stmt.setString(1, atividade.getAtivNome());
            stmt.setInt(2, atividade.getAtivTipo());
            
            // executa
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public void remove(Atividade atividade) {
        String sql = "DELETE FROM dtc_atividade WHERE ativ_id=?";
        
        try{
            //preparando o statement para inserção
            PreparedStatement stmt = connection.prepareStatement(sql);
            
            //setando valores
            stmt.setInt(1, atividade.getAtiv_id());
            
            // executa
            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    
    public List<Atividade> getLista() {
        try {
            List<Atividade> atividades = new ArrayList<Atividade>();
            PreparedStatement stmt = this.connection.
                    prepareStatement("SELECT * FROM dtc_atividade");
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()) {
                Atividade atividade = new Atividade();
                
                atividade.setAtivNome(rs.getString("ativ_nome"));
                atividade.setAtivTipo(rs.getInt("ativ_tipo"));
                atividade.setAtivValor(rs.getDouble("ativ_valor"));
                atividade.setAtivProfId(rs.getInt("ativ_profid"));
                
                atividades.add(atividade);
            }
            rs.close();
            stmt.close();
            return atividades;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
