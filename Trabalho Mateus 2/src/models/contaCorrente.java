package models;

import exceptions.SaqueInvalidoException;

public class ContaCorrente extends ContaBancaria {
    private static final double tarifa = 2.5;

    public ContaCorrente(String titular, String conta, String agencia, String senha) {
        super(titular, conta, agencia, senha);
    }

    @Override
    public void sacar(double valor) throws SaqueInvalidoException {
        double total = valor + tarifa;
        if (total > saldo || valor <= 0) {
            throw new SaqueInvalidoException("Saque inválido!");
        }
        saldo -= total;
        System.out.println("Valor sacado: R$ " + valor + ", tarifa de R$ " + tarifa + " aplicada.");
    }
}
