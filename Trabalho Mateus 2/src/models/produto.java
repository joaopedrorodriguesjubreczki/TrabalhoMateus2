package models;

public class Produto {
    private String codigo;
    private double valor;
    private String nome;
    private int quantidade;

    public Produto(String codigo, String nome, double valor, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    // Getters e Setters
}
