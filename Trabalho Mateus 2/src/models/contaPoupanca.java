package models;

import interfaces.Tributavel;
import exceptions.SaqueInvalidoException;

public class ContaPoupanca extends ContaBancaria implements Tributavel {
    private static final double rendimentoMensal = 0.005; // 0,5%

    public ContaPoupanca(String titular, String conta, String agencia, String senha) {
        super(titular, conta, agencia, senha);
    }

    public void aplicarRendimentoMensal() {
        saldo += saldo * rendimentoMensal;
    }

    @Override
    public void sacar(double valor) throws SaqueInvalidoException {
        if (valor > saldo || valor <= 0) {
            throw new SaqueInvalidoException("Saque inválido!");
        }
        saldo -= valor;
    }

    @Override
    public double calculaIR() {
        return saldo * 0.015;
    }
}
