package dao;

import models.ContaPoupanca;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ContaPoupancaDAO {
    private Connection conn;

    public ContaPoupancaDAO(Connection conn) {
        this.conn = conn;
    }

    public void salvar(ContaPoupanca contaPoupanca) throws SQLException {
        String sql = "INSERT INTO contas_bancarias (titular, conta, agencia, saldo, senha) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, contaPoupanca.getTitular());
        stmt.setString(2, contaPoupanca.getConta());
        stmt.setString(3, contaPoupanca.getAgencia());
        stmt.setDouble(4, contaPoupanca.getSaldo());
        stmt.setString(5, contaPoupanca.getSenha());
        stmt.executeUpdate();
    }
}
