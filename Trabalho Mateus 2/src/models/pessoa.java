package models;

public class Pessoa {
    protected String nome;
    protected int idade;
    protected String endereco;
    protected String cpf;

    public Pessoa(String nome, int idade, String endereco, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
        this.cpf = cpf;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome + ", Idade: " + idade + ", CPF: " + cpf + ", Endereço: " + endereco);
    }

    // Getters e Setters
}
