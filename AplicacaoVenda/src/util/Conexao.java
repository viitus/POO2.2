package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    
    public Connection conector;
    
    public void conectar(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:/vendas";
            String usuario = "root";
            String senha = "0810";
            conector = DriverManager.getConnection(url, usuario, senha);
            System.out.println("Aplicação conectada com Banco!");
        }catch(ClassNotFoundException e){
            System.out.println("Erro no Driver: "+ e.getMessage());
        }catch(SQLException e){
            System.out.println("Erro na conexao com o banco: "+ e.getMessage());
        }
    }
    
    public void desconectar(){
        try{
            conector.close();
        }catch(SQLException e){
            System.out.println("Erro na conexao com o banco: "+ e.getMessage());
        }
    }
        
}
