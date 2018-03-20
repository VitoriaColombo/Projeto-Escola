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
import java.util.ArrayList;
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
        int escMenu = 0;
        ArrayList<Disciplina> materias = new ArrayList<>();
        ArrayList<Aluno> estudantes = new ArrayList<>();
        ArrayList<Professor> professores = new ArrayList<>();
        do{
            escMenu = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma das opções: \n"
                    + "1. Cadastro Disciplinas \n"
                    + "2. Cadastro de Alunos \n"
                    + "3. Cadastro de Professores\n"
                    + "4. Sair"));
            switch (escMenu){
                case 1: {
                    do{
                        String nome = JOptionPane.showInputDialog("Qual o nome: ");
                        String departamento = JOptionPane.showInputDialog("Qual departamento: ");
                        char status = JOptionPane.showInputDialog("Status: ").charAt(0);
                        materias.add(new Disciplina(nome, departamento, status));
                    }while ((JOptionPane.showConfirmDialog(null, "Deseja Continuar?")) == 0);
                    break;
                }   
                case 2: {
                    
                       String nomeAluno = JOptionPane.showInputDialog("Informe o nome do aluno: ");
                       int matricula = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero da matricula: "));
                       SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                       Date dataMatricula = sdf.parse(JOptionPane.showInputDialog("Informe a data da matricula: "));
                       String rgAluno = JOptionPane.showInputDialog("Informe  o rg do Aluno: ");
                       String cpfAluno = JOptionPane.showInputDialog("Informe p cpf do aluno: ");
                       Date dataNascimentoAluno = sdf.parse(JOptionPane.showInputDialog("Informe a data de nascimento do aluno: "));
                       estudantes.add(new Aluno(matricula, dataMatricula, nomeAluno, rgAluno, cpfAluno, dataNascimentoAluno));
                       if (JOptionPane.showConfirmDialog(null, "O aluno ja se matriculou em alguma disciplina? ") == 0);
                       String materiasExistentes = "";
                       for (Disciplina materia : materias){
                       materiasExistentes += materias.indexOf(materia)+ " " + materia.getNome() + "\n";
                       }
                       do{
                           int esc = Integer.parseInt(JOptionPane.showInputDialog("-- Informe a matéria -- \n" + materiasExistentes));
                           estudantes.get(estudantes.size() -1).getDisciplina().add(materias.get(esc));
                       }while ((JOptionPane.showConfirmDialog(null, "Tem outra máteria para cadastrar? ")) == 0);
                }
                    break;
             
                case 3: {
                    
         
                       String nomeProfessor = JOptionPane.showInputDialog("Informe o nome do professor: ");
                       int cargaHorariaProfessor = Integer.parseInt(JOptionPane.showInputDialog("Informe a carga horaria do professor: "));
                       float valorHoraProfessor = Float.parseFloat(JOptionPane.showInputDialog("Imforme o valor da hora: "));
                       String rgProfessor = JOptionPane.showInputDialog("Informe o rg do professor: ");
                       String cpfProfessor = JOptionPane.showInputDialog("Informe o cpf do professor: ");
                       SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                       Date dataNascimentoProfessor = sdf.parse(JOptionPane.showInputDialog("Informe a data de nascimento: "));
                       professores.add(new Professor(cargaHorariaProfessor, valorHoraProfessor, nomeProfessor, rgProfessor, cpfProfessor, dataNascimentoProfessor));
                       if (JOptionPane.showConfirmDialog(null, "O professor ja se matriculou em alguma disciplina? ") == 0);
                       String materiaExistente = "";
                       for (Disciplina materia : materias){
                       materiaExistente += materias.indexOf(materia)+ " " + materia.getNome() + "\n";
                       }
                       do{
                           int esc = Integer.parseInt(JOptionPane.showInputDialog("-- Informe a matéria -- \n" + materiaExistente));
                           professores.get(professores.size() -1).getDisciplinas().add(materias.get(esc));
                       }while ((JOptionPane.showConfirmDialog(null, "Tem outra máteria para cadastrar? ")) == 0); 
                      }
                        break;
                    }
          }while (escMenu !=4);
        
    }
}
        


        
        
        
        
        
        
        
        
        
        
        
        
        
        
        /*
        
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
*/