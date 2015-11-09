/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.boletimaluno.testes;

import br.boletimaluno.dao.AtividadeDao;
import br.boletimaluno.models.Atividade;

/**
 *
 * @author Gustavo
 */
public class TesteAtividade {
    public static void main(String args[]) {
        Atividade atividade = new Atividade();
        atividade.setAtivNome("Atiividade prova");
        atividade.setAtivTipo(1);
        
        //gravando a conexão
        AtividadeDao dao = new AtividadeDao();
        
        dao.adiciona(atividade);
        
        System.out.println("Atividade Salvo!");
    }
}
