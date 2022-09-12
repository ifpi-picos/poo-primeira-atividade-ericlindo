package br.com.primieroprojeto;

import javax.swing.JOptionPane;

public class Principal {
   public static void main(String[] args)throws Exception {
    Professor professor = new Professor("Jesiel",null);

    Cursos curso = new Cursos("ads", 3000, "Presencial", "Superior",professor);

    Certificado certificado = new Certificado();
      String continuar = " ";
    do{
     String nomeDoAluno =  JOptionPane.showInputDialog(null,"INFORME O NOME DO ALUNO:");
      Aluno a1 = new Aluno(nomeDoAluno, "213434", null);
      curso.fazerMatricula(a1);

      certificado.setAlunos(a1);
      
      certificado.setCurso(curso);

      certificado.emitirCertificadoDoAluno();

      continuar = JOptionPane.showInputDialog("DESEJA MATRICULAR NOVO ALUNO?[S/N]").toUpperCase();

    }
   while(continuar.equals("S"));
   
   // dados do  curso
   curso.estadoAtualDoCurso();
    
   }
  } 
  


