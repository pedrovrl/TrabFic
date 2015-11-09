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
public class Atividade {
    private int ativ_id;
    private String ativ_nome;
    private int ativ_tipo;
    
    public int getAtiv_id() {
        return ativ_id;
    }
    
    public void setAtivId(int ativ_id) {
        this.ativ_id = ativ_id;
    }
    
    public String getAtivNome() {
        return ativ_nome;
    }
    
    public void setAtivNome(String ativ_nome) {
        this.ativ_nome = ativ_nome;
    }
    
    public int getAtivTipo() {
        return ativ_tipo; 
    }
    
    public void setAtivTipo(int ativ_tipo) {
        this.ativ_tipo = ativ_tipo;
    }
}
