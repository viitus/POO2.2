package Controler;

import Model.VendaModel;
import java.sql.PreparedStatement;
import java.sql.Timestamp;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import util.Conexao;


public class VendaController {
    
    public boolean inserir(VendaModel venda){
        boolean retorno = false;
        //CONECTAR COM O BANCO
        Conexao c = new Conexao();
        c.conectar();
        //CRIAR SQL INSERT
        String sql = "INSERT INTO venda (cliente, dataVenda, pagamento) VALUES (?,?,?)";
        try {
            PreparedStatement sentenca = c.conector.prepareStatement(sql);
            //PASSAR PARAMETROS
            sentenca.setString(1, venda.getCliente());
            sentenca.setTimestamp(2 , Timestamp.valueOf(venda.getDataVenda()));
            sentenca.setString(3, venda.getPagamento());
            //EXECUTAR SENTENCA
            if(!sentenca.execute()){
                retorno = true;
            }
        } catch (SQLException e){
            System.out.println("Erro ao inserir venda: " + e.getMessage());
        }
        //DESCONECTAR
        c.desconectar();
        return retorno;
    }
    
    public boolean editar(VendaModel venda) {
        boolean retorno = false;
        Conexao c = new Conexao();
        c.conectar();

        String sql = "UPDATE venda SET cliente = ?, dataVenda = ?, pagamento = ? WHERE idVenda = ?";
        try {
            PreparedStatement sentenca = c.conector.prepareStatement(sql);
            sentenca.setString(1, venda.getCliente());
            sentenca.setTimestamp(2, Timestamp.valueOf(venda.getDataVenda()));
            sentenca.setString(3, venda.getPagamento());
            sentenca.setInt(4, venda.getIdVenda());

            if (!sentenca.execute()) {
                retorno = true;
            }
        } catch (SQLException e) {
            System.out.println("Erro ao editar Venda: " + e.getMessage());
        }
        c.desconectar();
        return retorno;
    }
    public boolean excluir(VendaModel venda) {
        boolean retorno = false;
        Conexao c = new Conexao();
        c.conectar();
        String sql = "DELETE FROM venda WHERE idVenda = ?";
        try{
            PreparedStatement sentenca = c.conector.prepareStatement(sql);
            sentenca.setInt(1, venda.getIdVenda());
            if(!sentenca.execute())
                retorno = true;
        }catch(SQLException e){
            System.out.println("Erro ao deletar venda: "+ e.getMessage());
        }
        c.desconectar();
        return retorno;
    }

    public VendaModel selecionar(VendaModel venda) {
        VendaModel retorno = null;
        Conexao c = new Conexao();
        c.conectar();
        String sql = "SELECT idVenda, cliente, dataVenda, pagamento "
                   + "FROM venda "
                   + "WHERE idVenda = ?";
        try {
            PreparedStatement sentenca = c.conector.prepareStatement(sql);
            sentenca.setInt(1, venda.getIdVenda());
            ResultSet result = sentenca.executeQuery();

            if (result.next()) {
                retorno = new VendaModel();
                retorno.setIdVenda(result.getInt("idVenda"));
                retorno.setCliente(result.getString("cliente"));
                retorno.setDataVenda(result.getTimestamp("dataVenda").toLocalDateTime());
                retorno.setPagamento(result.getString("pagamento"));
            }
        } catch (SQLException e) {
            System.out.println("Erro ao selecionar venda: " + e.getMessage());
        }
        c.desconectar();
        return retorno;
    }

    public ArrayList<VendaModel> selecionarTodos() {
        ArrayList<VendaModel> retorno = new ArrayList<>();
        Conexao c = new Conexao();
        c.conectar();
        String sql = "SELECT idVenda, cliente, dataVenda, pagamento "
                   + "FROM venda";
        try {
            PreparedStatement sentenca = c.conector.prepareStatement(sql);
            ResultSet result = sentenca.executeQuery();
            while (result.next()) {
                VendaModel v = new VendaModel();
                v.setIdVenda(result.getInt("idVenda"));
                v.setCliente(result.getString("cliente"));
                v.setDataVenda(result.getTimestamp("dataVenda").toLocalDateTime());
                v.setPagamento(result.getString("pagamento"));
                retorno.add(v);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao selecionar vendas: " + e.getMessage());
        }
        c.desconectar();
        return retorno;
    }

}
