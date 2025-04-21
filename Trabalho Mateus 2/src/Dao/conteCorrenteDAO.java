package dao;

import models.ContaCorrente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ContaCorrenteDAO {
    private Connection conn;

    public ContaCorrenteDAO(Connection conn) {
        this.conn = conn;
    }

    public void salvar(ContaCorrente contaCorrente) throws SQLException {
        String sql = "INSERT INTO contas_bancarias (titular, conta, agencia, saldo, senha) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, contaCorrente.getTitular());
        stmt.setString(2, contaCorrente.getConta());
        stmt.setString(3, contaCorrente.getAgencia());
        stmt.setDouble(4, contaCorrente.getSaldo());
        stmt.setString(5, contaCorrente.getSenha());
        stmt.executeUpdate();
    }
}
