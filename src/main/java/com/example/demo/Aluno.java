package com.example.demo;

public class Aluno {
    private String matricula;
    private String nome;
    private double nota1;
    private double nota2;
    private double notaTrabalho;

    public double getNotaTrabalho() {
        return notaTrabalho;
    }

    public void setNotaTrabalho(double notaTrabalho) {
        this.notaTrabalho = notaTrabalho;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Aluno(String matricula, String nome, double nota1, double nota2, double notaTrabalho) {
        this.matricula = matricula;
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.notaTrabalho = notaTrabalho;
    }

    public double calculaMedia(){
        return (nota1*2.5 + nota2*2.5 + notaTrabalho*2.0)/7;
    }

    public double notafinal(){
        double notaAtual = nota1*2.5 + notaTrabalho*2.0;

        if (notaAtual>=4.2){
            return 0;
        }

        return 4.2 - notaAtual;

    }


}
