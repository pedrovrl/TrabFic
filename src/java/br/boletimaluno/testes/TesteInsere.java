/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.boletimaluno.testes;

import br.boletimaluno.models.Aluno;
import br.boletimaluno.dao.AlunoDao;

/**
 *
 * @author Gustavo
 */
public class TesteInsere {
    public static void main(String args[]) {
        Aluno aluno = new Aluno();
        aluno.setAlunNome("Santiago");
        
        //gravando a conexão
        AlunoDao dao = new AlunoDao();
        
        dao.adiciona(aluno);
        
        System.out.println("Aluno Salvo!");
    }
}
