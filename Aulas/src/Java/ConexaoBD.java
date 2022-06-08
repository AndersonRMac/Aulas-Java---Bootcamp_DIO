package Java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLDataException;
import java.sql.SQLException;

import javax.swing.RootPaneContainer;

class ConexaoBD{
   private static Connection connection;

   public static Connection getConnection() {
        if (connection != null) {
            return connection;
        }
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/appsemnome-db", "root", "12345");
        } catch (SQLException e) {
            System.out.println("Não foi possivel fazer a conexão");
            e.printStackTrace();
        }
        

   }
   
}