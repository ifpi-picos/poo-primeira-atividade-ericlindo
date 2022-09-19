
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;

public class Cursos {
    private String  nome;
    private int caraHoraria;
    private String modalidade;
    private String nivel;
    private Date dataDeInicio;
    private Date dataDeFim;
    private boolean gratuito;
    private List <Aluno> alunos;
    private Professor professor;

public Cursos(String nome, int caraHoraria, String modalidade, String nivel,Professor professor) {
    this.nome = nome;
    this.caraHoraria = caraHoraria;
    this.modalidade = modalidade;
    this.nivel = nivel;
    this.dataDeInicio = dataDeInicio;
    this.dataDeFim = dataDeFim;
    this.gratuito = true;
    this.alunos = new ArrayList<>();
    this.professor = professor;
    
}

public String getNome() {
    return nome;

}
public int getCaraHoraria() {
    return caraHoraria;
}
public String getModalidade() {
    return modalidade;
}
public String getNivel() {
    return nivel;
}
public List<Aluno> getAluno() {
    return alunos;
}


public Professor getProfessor() {
    return professor;
}

public Date getDataDeInicio() {
    return dataDeInicio;
}
public Date getDataDeFim() {
    return dataDeFim;
}
public boolean getGratuito() {
    return gratuito;
}
public void fazerMatricula(Aluno alunos){
    this.alunos.add(alunos);

}

public int  getGuantidadeDeAlunos(){
   return this.alunos.size();
}
 

public void estadoAtualDoCurso(){
        JOptionPane.showMessageDialog(null,"CURSO: " + this.getNome()
        +"\nCARGA HÓRARIA: "+this.getCaraHoraria()
        +"\nMODALIDADE: "+this.getModalidade()
        +"\nNIVEL: "+this.getNivel()
        +"\nPROFESSOR: "+ this.getProfessor().getNome()
        +"\nTOTAL DE ALUNOS: "+ this.getGuantidadeDeAlunos()
        +"\nINICIO DO CURSO: "+this.getDataDeInicio()
        +"\nFIM DO CURSO: "+this.getDataDeFim()
        +"\nGRATUITO: "+this.getGratuito(),"DADOS DO CURSO",JOptionPane.PLAIN_MESSAGE);
        

    }
    public void informacaoDoaAlunos(){
        JOptionPane.showMessageDialog(null,"" + this.alunos.toString(), "INFORMAÇÃO DOS ALUNOS: ", JOptionPane.INFORMATION_MESSAGE);
    }
 
 }
    
