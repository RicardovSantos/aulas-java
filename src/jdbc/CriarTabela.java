package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarTabela {
    static void main(String[] args) throws SQLException {
        Connection conexao = FabricadeConection.getConexao();


                Statement stmt = conexao.createStatement();


        System.out.println("tabela criada com sucesso!");
        conexao.close();
    }
}
