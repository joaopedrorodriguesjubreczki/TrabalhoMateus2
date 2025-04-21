package services;

import models.Empresa;
import models.Funcionario;
import models.Produto;

public class EmpresaService {

    public void cadastrarFuncionario(Empresa empresa, Funcionario funcionario) {
        empresa.cadastrarFuncionario(funcionario);
        System.out.println("Funcionário " + funcionario.getNome() + " cadastrado com sucesso.");
    }

    public void cadastrarProduto(Empresa empresa, Produto produto) {
        empresa.cadastrarProduto(produto);
        System.out.println("Produto " + produto.getNome() + " cadastrado com sucesso.");
    }

    public void pagarFuncionarios(Empresa empresa) {
        empresa.pagarFuncionarios();
        System.out.println("Pagamentos realizados com sucesso!");
    }
}
