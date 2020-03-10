/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio1;

/**
 *
 * @author Nicolas Volz
 */
public class Nota {
    private double valor;
    private Disciplina nomeDisciplina;
    
    public void nota (double nota, Disciplina nomeDisciplina){
        this.valor = valor;
        this.nomeDisciplina = nomeDisciplina;
        
    }
    
    public double getNota(){
        return this.valor;
    }
    
    public Disciplina getDisciplina(){
        return this.nomeDisciplina;
    }
    
    public void setNota(double valor){
        this.valor = valor;
    }
    
}
