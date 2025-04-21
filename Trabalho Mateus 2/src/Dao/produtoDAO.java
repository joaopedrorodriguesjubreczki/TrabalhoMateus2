package dao;

import models.Produto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProdutoDAO {
    private Connection conn;

    public ProdutoDAO(Connection conn) {
        this.conn = conn;
    }

    public void salvar(Produto produto) throws SQLException {
        String sql = "INSERT INTO produtos (codigo, valor, nome, quantidade) VALUES (?, ?, ?, ?)";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, produto.getCodigo());
        stmt.setDouble(2, produto.getValor());
        stmt.setString(3, produto.getNome());
        stmt.setInt(4, produto.getQuantidade());
        stmt.executeUpdate();
    }
}
