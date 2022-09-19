
import javax.swing.JOptionPane;

public class Principal {
   public static void main(String[] args)throws Exception {
    Professor professor = new Professor("Jesiel",null);

    Cursos curso = new Cursos("ads", 3000, "Presencial", "Superior",professor);

    Certificado certificado = new Certificado();
   
   
      certificado.setCurso(curso);

  Aluno aluno1 = new Aluno();
  float Notas = 0;
   while (true){
    String[] rsp = new String[]{"DADOS DO CURSO","INFORMAÇÃO DO PROFESSOR","INFORMAR NOTA","MATRICULAR ALUNO","LISTA DE ALUNOS",
    "CERTIFICADO DO ALUNO","FECHAR"};
  
    int opcao = JOptionPane.showInternalOptionDialog(null, "ESCOLHA SUA OPÇÃO", "OPÇÕES", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, rsp,0 );

    
    switch(opcao){
        case 0:
        curso.estadoAtualDoCurso();
        break;
        case 1:
        professor.dadosDoprofessor();
        break;
        case 2:
        for(int c = 1; c <= 4;c++){
        Notas = Float.parseFloat(JOptionPane.showInputDialog(null, "INFORME A " +c+"ª NOTA DO ALUNO:"));
        aluno1.adiconarNotas(Notas);
        aluno1.media();
        }
        break;
        case 3:
         aluno1 = new Aluno(JOptionPane.showInputDialog(null, "NOME:"), JOptionPane.showInputDialog(null, "MATRICULA:"),JOptionPane.showInputDialog(null, "EMAIL:"));
         curso.fazerMatricula(aluno1);
         certificado.setAlunos(aluno1);
         aluno1.setCurso(curso);
        
         break;
         case 4:
         curso.informacaoDoaAlunos();
         
         break;
         case 5: 
         certificado.emitirCertificadoDoAluno();
         break;      
    }
    if (opcao == 6){
      break;

    }
   
}
    
   
  }
}
   
  


