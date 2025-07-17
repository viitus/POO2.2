package util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 * @author Cris
 */
public class Conexao {
    public Connection conector;
    
    public void conectar(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url= "jdbc:mysql://localhost:/vendas";
            String usuario = "root";
            String senha = "root";
            conector = DriverManager.getConnection(url,usuario,senha);
            System.out.println("Aplicação conectada com Banco!");
        }catch(ClassNotFoundException e){
            System.out.println("Driver não encontrado! "+ e.getMessage());
        }catch(SQLException e){
            System.out.println("Erro na conexão com banco!"+e.getMessage());
        }
    }
    public void desconectar(){
        try{
            conector.close();
        }catch(SQLException e){
            System.out.println("Erro ao fechar conexão!"+e.getMessage());
        }
    }
}
