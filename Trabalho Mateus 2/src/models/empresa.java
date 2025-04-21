package models;

import java.util.*;
import java.util.stream.Collectors;

public class Empresa {
    private String nome;
    private String cnpj;
    private List<String> emails = new ArrayList<>();
    private List<Funcionario> funcionarios = new ArrayList<>();
    private Map<String, Produto> produtos = new HashMap<>();

    public Empresa(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }

    // Métodos de cadastro, remoção e exibição

    public void cadastrarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void removerFuncionario(Funcionario funcionario) {
        funcionarios.remove(funcionario);
    }

    public void cadastrarEmail(String email) {
        if (emails.size() < 5) {
            emails.add(email);
        } else {
            System.out.println("Limite de e-mails atingido.");
        }
    }

    public void removerEmail(String email) {
        emails.remove(email);
    }

    public void cadastrarProduto(Produto produto) {
        produtos.put(produto.getCodigo(), produto);
    }

    public void removerProduto(String codigo) {
        produtos.remove(codigo);
    }

    public List<Produto> buscarProdutosPorNome(String nome) {
        return produtos.values().stream()
                .filter(p -> p.getNome().equalsIgnoreCase(nome))
                .collect(Collectors.toList());
    }

    public Produto buscarProdutoPorCodigo(String codigo) {
        return produtos.get(codigo);
    }

    public List<Produto> buscarProdutosPorPreco(double precoMaximo) {
        return produtos.values().stream()
                .filter(p -> p.getValor() <= precoMaximo)
                .collect(Collectors.toList());
    }

    public void pagarFuncionarios() {
        for (Funcionario funcionario : funcionarios) {
            funcionario.getContaSalario().depositar(funcionario.getSalario());
        }
    }
}
