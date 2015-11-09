/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.boletimaluno.models;

/**
 *
 * @author Gustavo
 */
public class Aluno {
    private int alun_id;
    private String alun_nome;
    
    public int getAlunId() {
        return alun_id;
    }
    
    public void setAlunId(int alun_id) {
        this.alun_id = alun_id;
    }
    
    public String getAlunNome() {
        return alun_nome;
    }
    
    public void setAlunNome(String alun_nome) {
        this.alun_nome = alun_nome;
    }

}
