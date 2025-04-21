package models;

import interfaces.Tributavel;

public class Funcionario extends Pessoa implements Tributavel {
    private String cargo;
    private double salario;
    private ContaBancaria contaSalario;

    public Funcionario(String nome, int idade, String endereco, String cpf, String cargo, double salario, ContaBancaria contaSalario) {
        super(nome, idade, endereco, cpf);
        this.cargo = cargo;
        this.salario = salario;
        this.contaSalario = contaSalario;
    }

    public double getSalario() {
        return salario;
    }

    public double getSalario(double bonus) {
        return salario + bonus;
    }

    @Override
    public double calculaIR() {
        return salario * 0.075;
    }

    public ContaBancaria getContaSalario() {
        return contaSalario;
    }
}
