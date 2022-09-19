
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
    if (this.getAlunos().getAprovado() == true){
    JOptionPane.showMessageDialog(null,"" + this.toString(),
    "CERTIFICADO DO ALUNO",JOptionPane.PLAIN_MESSAGE);
}
    else{
        JOptionPane.showMessageDialog(null, "ERRO ALUNO NÃO PODE EMITIR CERTIFCADO!!",null, JOptionPane.ERROR_MESSAGE);
    }    

}

public String toString() {
    
        return "ALUNO: " + this.getAlunos().getNome()
        +"\nCARGA HÓRARIA: "+this.getCurso().getCaraHoraria()
        +"\nMODALIDADE: "+this.getCurso().getModalidade()
        +"\nNIVEL: "+this.getCurso().getNivel()
        +"\nDATA DE INICIO: "+getCurso().getDataDeInicio()
        +"\nFIM DO CURSO: "+this.getCurso().getDataDeFim()
        +"\n---------------------------------------------";
    }    
   
}
    
    

