package dao;

import java.sql.*;

public class ContaBancariaDAO {
    private Connection conn;

    public ContaBancariaDAO(Connection conn) {
        this.conn = conn;
    }

    public void salvarConta(String titular, String conta, String agencia, double saldo, String senha) throws SQLException {
        String sql = "INSERT INTO contas_bancarias (titular, conta, agencia, saldo, senha) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, titular);
        stmt.setString(2, conta);
        stmt.setString(3, agencia);
        stmt.setDouble(4, saldo);
        stmt.setString(5, senha);
        stmt.executeUpdate();
    }
}
