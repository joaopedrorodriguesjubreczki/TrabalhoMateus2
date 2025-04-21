package dao;

import models.Empresa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmpresaDAO {
    private Connection conn;

    public EmpresaDAO(Connection conn) {
        this.conn = conn;
    }

    public void salvar(Empresa empresa) throws SQLException {
        String sql = "INSERT INTO empresas (nome, cnpj) VALUES (?, ?)";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, empresa.getNome());
        stmt.setString(2, empresa.getCnpj());
        stmt.executeUpdate();
    }
}
