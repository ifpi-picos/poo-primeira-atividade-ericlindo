package br.com.primieroprojeto;

import java.util.Date;

public class Aluno {
    private String nome;
    private String matricula;
    private String email;
    private Date dataDeNasc;


    public Aluno(String nome, String matricula, String email) {
        this.nome = nome;
        this.matricula = matricula;
        this.email = email;
        this.dataDeNasc = dataDeNasc;
     
    }

    public void setDataDeNasc(Date dataDeNasc) {
        this.dataDeNasc = dataDeNasc;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getEmail() {
        return email;
    }

    public Date getDataDeNasc() {
        return dataDeNasc;
    }     
}

