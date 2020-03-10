/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exercicio1;

import java.util.ArrayList;

/**
 *
 * @author Nicolas Volz
 */
public class Aluno {
    
private String nome,sobrenome;
private int codigo;
private ArrayList<Nota> notas = new ArrayList();

public Aluno(String nome, int codigo){
    this.nome = nome;
    this.codigo = codigo;
}

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public int getCodigo() {
        return codigo;
    }

    public ArrayList getNotas() {
        return notas;
    }


}
