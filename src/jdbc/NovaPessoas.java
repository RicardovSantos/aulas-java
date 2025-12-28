package jdbc;

import java.sql.SQLException;
import java.util.Scanner;

public class NovaPessoas {
    static void main(String[] args) throws SQLException {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o nome da pessoa: ");
        String nome = entrada.next();

        String sql = "INSER INTO clientes (nome) VALUES ('"+nome+"')";

        entrada.close();
    }
}
