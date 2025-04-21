package services;

import models.ContaBancaria;

public class BancoService {

    public void depositar(ContaBancaria conta, double valor) {
        conta.depositar(valor);
        System.out.println("Depósito de R$" + valor + " realizado com sucesso para " + conta.getTitular());
    }

    public void sacar(ContaBancaria conta, double valor) {
        try {
            conta.sacar(valor);
            System.out.println("Saque de R$" + valor + " realizado com sucesso para " + conta.getTitular());
        } catch (Exception e) {
            System.out.println("Erro ao sacar: " + e.getMessage());
        }
    }
}
