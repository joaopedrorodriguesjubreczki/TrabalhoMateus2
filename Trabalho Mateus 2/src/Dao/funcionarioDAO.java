package dao;

import models.Funcionario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FuncionarioDAO {
    private Connection conn;

    public FuncionarioDAO(Connection conn) {
        this.conn = conn;
    }

    public void salvar(Funcionario funcionario) throws SQLException {
        String sql = "INSERT INTO funcionarios (nome, idade, endereco, cpf, cargo, salario) VALUES (?, ?, ?, ?, ?, ?)";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, funcionario.getNome());
        stmt.setInt(2, funcionario.getIdade());
        stmt.setString(3, funcionario.getEndereco());
        stmt.setString(4, funcionario.getCpf());
        stmt.setString(5, funcionario.getCargo());
        stmt.setDouble(6, funcionario.getSalario());
        stmt.executeUpdate();
    }
}
