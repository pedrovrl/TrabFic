/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.boletimaluno.testes;

import br.boletimaluno.dao.AlunoAtividadeDao;
import br.boletimaluno.dao.AtividadeDao;
import br.boletimaluno.models.AlunoAtividade;

/**
 *
 * @author Gustavo
 */
public class TesteAlunAtiv {
    public static void main(String args[]) {
        AlunoAtividade alunoAtividade = new AlunoAtividade();
        alunoAtividade.setNota(9);
        alunoAtividade.setAlunFkId(3);
        alunoAtividade.setAtividadeFkId(5);
        
        //gravando a conexão
        AlunoAtividadeDao dao = new AlunoAtividadeDao();
        
        dao.adicionar(alunoAtividade);
        
        System.out.println("Aluno Atividade Salvo!");
    }
}
