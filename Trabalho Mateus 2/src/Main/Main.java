import dao.Conexao;
import dao.ContaBancariaDAO;
import models.ContaCorrente;
import models.Funcionario;
import models.Empresa;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        try {
            Connection conn = Conexao.conectar();
            ContaBancariaDAO contaDAO = new ContaBancariaDAO(conn);

            
            ContaCorrente conta = new ContaCorrente("Ana Silva", "12345", "001", "senha123");
            conta.depositar(1000);
            contaDAO.salvarConta(conta.getTitular(), conta.getConta(), conta.getAgencia(), conta.getSaldo(), conta.getSenha());

            System.out.println("Conta salva com sucesso!");

            
            Empresa empresa = new Empresa("Empresa X", "00.000.000/0001-00");

            
            Funcionario funcionario = new Funcionario(
                    "Carlos Souza", 30, "Rua A", "123.456.789-00", "Gerente", 5000.0, conta
            );

            empresa.cadastrarFuncionario(funcionario);

            // Pagar funcionários
            empresa.pagarFuncionarios();
            conta.exibirSaldo();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
