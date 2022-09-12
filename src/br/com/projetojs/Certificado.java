package br.com.projetojs;

import javax.swing.JOptionPane;


public class Certificado  {
    private Aluno alunos;
    private Cursos curso;

    
    public void setAlunos(Aluno alunos) {
        this.alunos =  alunos;
    }
    public void setCurso(Cursos curso) {
        this.curso = curso;
    }
    public Cursos getCurso() {
        return curso;
    }
      public Aluno getAlunos() {
            return alunos;
        }   

public void emitirCertificadoDoAluno(){
    JOptionPane.showMessageDialog(null,"ALUNO: "+this.getAlunos().getNome()
    +"\nCARGA HÓRARIA: "+this.getCurso().getCaraHoraria()
    +"\nMODALIDADE: "+this.getCurso().getModalidade()
    +"\nNIVEL: "+this.getCurso().getNivel()
    +"\nDATA DE INICIO: "+getCurso().getDataDeInicio()
    +"\nFIM DO CURSO: "+this.getCurso().getDataDeFim(),"CERTIFICADO DO ALUNO",JOptionPane.PLAIN_MESSAGE);
}
    
    
}
    
    

