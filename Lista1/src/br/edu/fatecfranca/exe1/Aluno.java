package br.edu.fatecfranca.exe1;
public class Aluno {
    //variaveis
    public int numeroAluno, idade;
    public String nome;
    public float p1, p2;
    //motodo construtor
    public Aluno(){
        numeroAluno = -1;
        nome = "";
        idade = -1;
        p1 = -1;
        p2 = -1;
    }
    public Aluno(int na, String no, int id, float num, float ndois){
        numeroAluno = na;
        nome = no;
        idade = id;
        p1 = num;
        p2 = ndois;
    }
    public float notaFinal(){
        return (p1 + p2) / 2;
    }
    public String dadosAluno(){
        return "Número do aluno: " + numeroAluno +
               "\nNome: " + nome +
               "\nIdade: " + idade;
    }
    public String passou(){
        if(notaFinal() >= 6){
            return "Aluno aprovado";
        }
        else return "Aluno reprovado";
    }
}
