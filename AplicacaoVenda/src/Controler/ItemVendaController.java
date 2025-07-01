package Controler;

import Model.ItemVendaModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import util.Conexao;

/*Vitus*/

public class ItemVendaController {

    public boolean inserir(ItemVendaModel item) {
        boolean retorno = false;
        Conexao c = new Conexao();
        c.conectar();
        String sql = "INSERT INTO itemvenda (idProduto, idVenda, quantidade) VALUES (?, ?, ?)";
        try {
            PreparedStatement sentenca = c.conector.prepareStatement(sql);
            sentenca.setInt(1, item.getProduto().getIdProduto());
            sentenca.setInt(2, item.getVenda().getIdVenda());
            sentenca.setInt(3, item.getQuantidade());

            if (!sentenca.execute()) {
                retorno = true;
            }
        } catch (SQLException e) {
            System.out.println("Erro ao inserir item da venda: " + e.getMessage());
        }
        c.desconectar();
        return retorno;
    }

    public boolean editar(ItemVendaModel item) {
        boolean retorno = false;
        Conexao c = new Conexao();
        c.conectar();
        String sql = "UPDATE itemvenda SET idProduto = ?, idVenda = ?, quantidade = ? "
                   + "WHERE idItemVenda = ?";
        try {
            PreparedStatement sentenca = c.conector.prepareStatement(sql);
            sentenca.setInt(1, item.getProduto().getIdProduto());
            sentenca.setInt(2, item.getVenda().getIdVenda());
            sentenca.setInt(3, item.getQuantidade());
            sentenca.setInt(4, item.getIdItemVenda());

            if (!sentenca.execute()) {
                retorno = true;
            }
        } catch (SQLException e) {
            System.out.println("Erro ao editar item da venda: " + e.getMessage());
        }
        c.desconectar();
        return retorno;
    }

    public boolean excluir(ItemVendaModel item) {
        boolean retorno = false;
        Conexao c = new Conexao();
        c.conectar();
        String sql = "DELETE FROM itemvenda WHERE idItemVenda = ?";
        try {
            PreparedStatement sentenca = c.conector.prepareStatement(sql);
            sentenca.setInt(1, item.getIdItemVenda());

            if (!sentenca.execute()) {
                retorno = true;
            }
        } catch (SQLException e) {
            System.out.println("Erro ao excluir item da venda: " + e.getMessage());
        }
        c.desconectar();
        return retorno;
    }

    public ItemVendaModel selecionar(ItemVendaModel item) {
        ItemVendaModel retorno = null;
        Conexao c = new Conexao();
        c.conectar();
        String sql = "SELECT iv.idItemVenda, iv.quantidade, p.idProduto, p.descricao, v.idVenda, v.cliente " +
                     "FROM itemvenda iv " +
                     "JOIN produto p ON p.idProduto = iv.idProduto " +
                     "JOIN venda v ON v.idVenda = iv.idVenda " +
                     "WHERE iv.idItemVenda = ?";
        try {
            PreparedStatement sentenca = c.conector.prepareStatement(sql);
            sentenca.setInt(1, item.getIdItemVenda());
            ResultSet result = sentenca.executeQuery();
            if (result.next()) {
                retorno = new ItemVendaModel();
                retorno.setIdItemVenda(result.getInt("idItemVenda"));
                retorno.setQuantidade(result.getInt("quantidade"));
                // Produto
                retorno.getProduto().setIdProduto(result.getInt("idProduto"));
                retorno.getProduto().setDescricao(result.getString("descricao"));
                // Venda
                retorno.getVenda().setIdVenda(result.getInt("idVenda"));
                retorno.getVenda().setCliente(result.getString("cliente"));
            }
        } catch (SQLException e) {
            System.out.println("Erro ao selecionar item da venda: " + e.getMessage());
        }
        c.desconectar();
        return retorno;
    }

    public ArrayList<ItemVendaModel> selecionarTodos() {
        ArrayList<ItemVendaModel> retorno = new ArrayList<>();
        Conexao c = new Conexao();
        c.conectar();
        String sql = "SELECT iv.idItemVenda, iv.quantidade, p.idProduto, p.descricao, v.idVenda, v.cliente " +
                     "FROM itemvenda iv " +
                     "JOIN produto p ON p.idProduto = iv.idProduto " +
                     "JOIN venda v ON v.idVenda = iv.idVenda";
        try {
            PreparedStatement sentenca = c.conector.prepareStatement(sql);
            ResultSet result = sentenca.executeQuery();
            while (result.next()) {
                ItemVendaModel i = new ItemVendaModel();
                i.setIdItemVenda(result.getInt("idItemVenda"));
                i.setQuantidade(result.getInt("quantidade"));
                // Produto
                i.getProduto().setIdProduto(result.getInt("idProduto"));
                i.getProduto().setDescricao(result.getString("descricao"));
                // Venda
                i.getVenda().setIdVenda(result.getInt("idVenda"));
                i.getVenda().setCliente(result.getString("cliente"));
                retorno.add(i);
            }
        } catch (SQLException e) {
            System.out.println("Erro ao listar itens da venda: " + e.getMessage());
        }
        c.desconectar();
        return retorno;
    }
}