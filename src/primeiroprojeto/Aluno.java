

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Aluno {
    private String nome;
    private String matricula;
    private String email;
    private Date dataDeNasc;
    private Boolean aprovado;
    private List <Float> notas;
    private Cursos curso;

    public Aluno(String nome, String matricula, String email) {
        this.nome = nome;
        this.matricula = matricula;
        this.email = email;
        this.dataDeNasc = dataDeNasc;
        this.notas = new ArrayList<>();
     
    }

    public Aluno() {
    }

    public void setDataDeNasc(Date dataDeNasc) {
        this.dataDeNasc = dataDeNasc;
    }

    public String getNome() {
        return nome;
    }

    public Boolean getAprovado() {
        return aprovado;
    }

    public void setAprovado(Boolean aprovado) {
        this.aprovado = aprovado;
    }


    public String getMatricula() {
        return matricula;
    }

    public String getEmail() {
        return email;
    }

    public String toString() {
        return  "\nALUNO: " + this.getNome()
        + "\nMATRICULA: " + this.getMatricula()
        + "\nEMAIL: " + this.getEmail()
        + "\nCURSO: " + this.curso.getNome()
        + "\nNOTAS: " + this.getNotas()
        + "\nMÉDIA: " + this.media()
        + "\nAPROVADO? " + this.getAprovado()
        + "\n-------------------------------------------";

    }

    public Date getDataDeNasc() {
        return dataDeNasc;
    }

    public List<Float> getNotas() {
        return notas;
    }

    public Cursos getCurso() {
        return curso;
    }

    public void setCurso(Cursos curso) {
        this.curso = curso;
    }    
    public void adiconarNotas(float nota){
        if(this.media() >= 7){
            this.setAprovado(true);
        }
        else{
            this.setAprovado(false);
        }
    }
    public float media(){
        float soma = 0;
        for(float nota: this.getNotas()){
            soma += nota;
         
        }
        return soma / this.getNotas().size();
    }
}
       

