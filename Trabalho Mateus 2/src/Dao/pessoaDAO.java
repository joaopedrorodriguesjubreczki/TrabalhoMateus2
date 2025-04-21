package dao;

import models.Pessoa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PessoaDAO {
    private Connection conn;

    public PessoaDAO(Connection conn) {
        this.conn = conn;
    }

    public void salvar(Pessoa pessoa) throws SQLException {
        String sql = "INSERT INTO pessoas (nome, idade, endereco, cpf) VALUES (?, ?, ?, ?)";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, pessoa.getNome());
        stmt.setInt(2, pessoa.getIdade());
        stmt.setString(3, pessoa.getEndereco());
        stmt.setString(4, pessoa.getCpf());
        stmt.executeUpdate();
    }
}
