package cidades;

import controller.ConexaoMySql;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Exercicio19 {

    public static void main(String[] args) {

        try {
            ConexaoMySql.createConnection();
            ConexaoMySql.selecionar("SELECT * FROM cidade");

            while (ConexaoMySql.resultset.next()) {
                System.out.println(ConexaoMySql.resultset.getString("id"));
                System.out.println(ConexaoMySql.resultset.getString("cidade"));
                System.out.println(ConexaoMySql.resultset.getString("estado"));
            }

        } catch (SQLException ex) {
            System.out.println("Erro no SQL");
        }
    }

}
