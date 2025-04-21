package models;

public abstract class ContaBancaria {
    protected String titular;
    protected double saldo;
    protected String conta;
    protected String agencia;
    protected String senha;

    public ContaBancaria(String titular, String conta, String agencia, String senha) {
        this.titular = titular;
        this.conta = conta;
        this.agencia = agencia;
        this.senha = senha;
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public abstract void sacar(double valor) throws SaqueInvalidoException;

    public void exibirSaldo() {
        System.out.println("Saldo atual: R$ " + saldo);
    }

    // Getters e Setters
}
