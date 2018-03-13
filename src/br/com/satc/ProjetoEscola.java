/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc;

import br.com.satc.objeto.Aluno;
import br.com.satc.objeto.Disciplina;
import br.com.satc.objeto.Professor;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author vitoria.152217
 */
public class ProjetoEscola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        Disciplina disciplina;
        String nomeDisciplina = JOptionPane.showInputDialog("Informe o nome da disciplina: ");
        String departamento = JOptionPane.showInputDialog("Informe o departamento: ");
        char status = JOptionPane.showInputDialog("Informe o status: ").charAt(0);
        
        disciplina = new Disciplina(nomeDisciplina, departamento, status);
        JOptionPane.showMessageDialog(null, disciplina.toString());
        
        Professor professor;
        String nomeProfessor = JOptionPane.showInputDialog("Informe o nome do professor: ");
        int cargaHoraria = Integer.parseInt(JOptionPane.showInputDialog("Informe a carga horaria do professor: "));
        float valorHora = Float.parseFloat(JOptionPane.showInputDialog("Imforme o valor da hora: "));
        String rgProfessor = JOptionPane.showInputDialog("Informe o rg do professor: ");
        String cpfProfessor = JOptionPane.showInputDialog("Informe o cpf do professor: ");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date dataNascimento = sdf.parse(JOptionPane.showInputDialog("Informe a data de nascimento: "));
        
        
        professor = new Professor(cargaHoraria, valorHora, nomeProfessor, rgProfessor, cpfProfessor, dataNascimento, cargaHoraria);
        JOptionPane.showMessageDialog(null, professor.toString());
        
        Aluno aluno;
        String nomeAluno = JOptionPane.showInputDialog("Informe o nome do aluno: ");
        int matricula = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero da matricula: "));
        Date dataMatricula = sdf.parse(JOptionPane.showInputDialog("Informe a data da matricula: "));
        String rgAluno = JOptionPane.showInputDialog("Informe  o rg do Aluno: ");
        String cpfAluno = JOptionPane.showInputDialog("Informe p cpf do aluno: ");
        Date dataNascimentoAluno = sdf.parse(JOptionPane.showInputDialog("Informe a data de nascimento do aluno: "));
        
        aluno = new Aluno(matricula, dataMatricula, nomeAluno, rgAluno, cpfAluno, dataNascimento, matricula);
        JOptionPane.showMessageDialog(null, aluno.toString());
        
    }
    
}
