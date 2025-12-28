package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricadeConection {

    public static Connection getConexao() {

        try {
            final String url = "jdbc:mysql://localhost/curso_java?verifyServerCertificate=false&useSSL=true";
            final String usuario = "root";
            final String senha = "root";

            System.out.println("conectou o Banco");
            return DriverManager.getConnection(url, usuario, senha);

        }catch (SQLException error){
            throw new  RuntimeException(error);
        }
    }
}
