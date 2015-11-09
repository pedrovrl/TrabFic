/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.boletimaluno.testes;

import br.boletimaluno.models.Aluno;
import br.boletimaluno.dao.AlunoDao;
import java.util.List;

/**
 *
 * @author Gustavo
 */
public class TestaLista {
    public static void main(String args[]) {
        AlunoDao dao = new AlunoDao();
        
        List<Aluno> alunos = dao.getLista("");
        
        for (Aluno aluno : alunos) {
            System.out.println("Nome: " + aluno.getAlunNome());
        }
    }
}
