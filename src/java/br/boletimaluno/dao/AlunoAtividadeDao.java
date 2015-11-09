/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.boletimaluno.dao;

import br.boletimaluno.connection.ConnectionFactory;
import br.boletimaluno.models.AlunoAtividade;
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
public class AlunoAtividadeDao {
    private Connection connection;
    
    public AlunoAtividadeDao() {
        this.connection = new ConnectionFactory().getConnection();
    }
    
    public void adicionar(AlunoAtividade alunoAtividade) {
        String sql = "INSERT INTO dtc_aluno_atividade (nota,alun_fk_id,ativ_fk_id) values (?,?,?)";
        try {
            //preparando o statement para inserção
            PreparedStatement stmt = connection.prepareStatement(sql);
            
            //setando valores
            //stmt.setDouble(1, alunoAtividade.getNota());
            //stmt.setInt(2, alunoAtividade.getAlunFkId());
            //stmt.setInt(3, alunoAtividade.getAtividadeFkId());

            
            // executa
            //stmt.execute();
            //stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
//    
//    public void altera(AlunoAtividade atividade) {
//    }
//    
//    public void remove(AlunoAtividade atividade) {
//    }
//    
//    public List<AlunoAtividade> getLista() {
//    }
}
