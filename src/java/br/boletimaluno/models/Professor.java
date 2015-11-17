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
public class Professor {
    private int prof_id;
    private String prof_nome;
    private String prof_senha;
    
    public int getProfId() {
        return prof_id;
    }
    
    public void setProfId(int prof_id) {
        this.prof_id = prof_id;
    }
    
    public String getProfNome() {
        return prof_nome;
    }
    
    public void setProfNome(String prof_nome) {
        this.prof_nome = prof_nome;
    }
     public String getProfSenha() {
        return prof_senha;
    }
    
    public void setProfSenha(String prof_senha) {
        this.prof_senha = prof_senha;
    }

}
