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
public class AlunoAtividade {
   private double nota;
   private int alun_fk_id;
   private int ativ_fk_id;
   
   public double getNota() {
       return nota;
   }
   
   public void setNota(double nota) {
       this.nota = nota;
   }
   
   public int getAlunFkId() {
       return alun_fk_id;
   }
   
   public void setAlunFkId(int alun_fk_id) {
       this.alun_fk_id = alun_fk_id;
   }
   
   public int getAtividadeFkId() {
       return ativ_fk_id;
   }
   
   public void setAtividadeFkId(int ativ_fk_id) {
       this.ativ_fk_id = ativ_fk_id;
   }
}