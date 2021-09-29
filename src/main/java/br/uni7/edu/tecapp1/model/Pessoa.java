package br.uni7.edu.tecapp1.model;

public class Pessoa {

    private String nome;
    private int idade;
    private boolean teste;


    public Pessoa(){

    }

    public Pessoa(String nome, int idade, boolean teste) {
        this.nome = nome;
        this.idade = idade;
        this.teste = teste;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean getTeste(){
        return teste;
    }

    public void setTeste(boolean teste){
        this.teste = teste;
    }

}
