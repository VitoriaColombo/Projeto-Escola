/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.objeto;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author vitoria.152217
 */
public class Aluno extends Pessoas {
    private int matricula;
    private Date dataMatricula;
    private ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();

    public Aluno(int matricula, Date dataMatricula, String nome, String rg, String cpf, Date datanascimento) {
        super(nome, rg, cpf, datanascimento);
        this.matricula = matricula;
        this.dataMatricula = dataMatricula;
    }



    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Date getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(Date dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public ArrayList getDisciplina() {
        return disciplinas;
    }

    public void setDisciplina(ArrayList disciplina) {
        this.disciplinas = disciplina;
    }

    @Override
    public String toString() {
        return "Aluno{" + "matricula=" + matricula + ", dataMatricula=" + dataMatricula + ", disciplina=" + disciplinas + '}';
    }
    
    
    
}
