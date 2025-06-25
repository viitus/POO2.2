package Controler;

import Model.ProdutoModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import util.Conecxao;

/*Vitus*/

public class ProdutoController {
    
    public boolean inserir(ProdutoModel produto) {
        boolean retorno = false;
        //CONECTAR COM BANCO
        Conecxao c = new Conecxao();
        c.conectar();
        //CRIAR SQL INSERT
        String sql = "insert into produto (descricao, estoque, valor, fornecedor) values (?,?,?,?)";
        try {
            PreparedStatement sentenca = c.conector.prepareStatement(sql);
            //PASSAR PARAMETROS
            sentenca.setString(1, produto.getDescricao());
            sentenca.setInt(2, produto.getEstoque());
            sentenca.setFloat(3, produto.getValor());
            sentenca.setInt(4,produto.getFornecedor().getIdFornecedor());
            //EXECUTAR SENTENCA
            if (!sentenca.execute()) {
                retorno = true;
            }
        } catch (SQLException e) {
            System.out.println("Erro na sentença SQL: " + e.getMessage());
        }
        //DESCONECTAR
        c.desconectar();
        return retorno;
    }
    
    public boolean editar(ProdutoModel produto){
        boolean retorno = false;
        Conecxao c = new Conecxao();
        c.conectar();
        String sql = "update produto set descricao = ?, estoque = ?, valor = ?, fornecedor = ? where idProduto = ? ";
        try {
            PreparedStatement sentenca = c.conector.prepareStatement(sql);
            sentenca.setString(1, produto.getDescricao());
            sentenca.setInt(2, produto.getEstoque());
            sentenca.setFloat(3, produto.getValor());
            sentenca.setInt(4, produto.getIdProduto());
            sentenca.setInt(5, produto.getFornecedor().getIdFornecedor());
            if (!sentenca.execute()) 
                retorno = true;
        } catch (SQLException e) {
            System.out.println("Erro ao editar: " + e.getMessage());
        }
        c.desconectar();
        return retorno;
    }
    
    public boolean excluir(ProdutoModel produto) {
        boolean retorno = false;
        Conecxao c = new Conecxao();
        c.conectar();
        String sql = "delete from produto where idProduto = ?";
        try{
            PreparedStatement sentenca = c.conector.prepareStatement(sql);
            sentenca.setInt(1, produto.getIdProduto());
            if(!sentenca.execute())
                retorno = true;
        }catch(SQLException e){
            System.out.println("Erro ao deletar!"+ e.getMessage());
        }
        c.desconectar();
        return retorno;
    }
    
    public ProdutoModel selecionar(ProdutoModel produto) {
        ProdutoModel retorno = null;
        Conecxao c = new Conecxao();
        c.conectar();
        String sql = "select p.idProduto, p.estoque, p.valor, p.descricao, f.razaoSocial, f.idfornecedor " 
                   + "from produto p, fornecedor f "
                   + "where f.idfornecedor = p.fornecedor and idProduto = ?";
        try{
            PreparedStatement sentenca = c.conector.prepareStatement(sql);
            sentenca.setInt(1, produto.getIdProduto());
            ResultSet result = sentenca.executeQuery();
            if(result.next()){
                retorno = new ProdutoModel();
                retorno.setIdProduto(result.getInt("idProduto"));
                retorno.setDescricao(result.getString("descricao"));
                retorno.setEstoque(result.getInt("estoque"));
                retorno.setValor(result.getFloat("valor"));
                retorno.getFornecedor().setIdFornecedor(result.getInt("idfornecedor"));
                retorno.getFornecedor().setRazaoSocial(result.getString("razaoSocial"));
                
            }
        }catch(SQLException  e){
            System.out.println("Erro na seleção: "+ e.getMessage());
        }
        c.desconectar();
        return retorno;
    }

    public ArrayList<ProdutoModel> selecionarTodos() {
        ArrayList<ProdutoModel> retorno = new ArrayList<>();
        Conecxao c = new Conecxao();
        c.conectar();
        String sql = "select p.idProduto, p.estoque, p.valor, p.descricao, f.razaoSocial, f.idfornecedor " 
                   + "from produto p, fornecedor f "
                   + "where f.idfornecedor = p.fornecedor";
        try{
            PreparedStatement sentenca = c.conector.prepareStatement(sql);
            ResultSet result = sentenca.executeQuery();
            while(result.next()){
                ProdutoModel f = new ProdutoModel();
                f.setIdProduto(result.getInt("idProduto"));
                f.setDescricao(result.getString("descricao"));
                f.setEstoque(result.getInt("estoque"));
                f.setValor(result.getFloat("valor"));
                f.getFornecedor().setIdFornecedor(result.getInt("idfornecedor"));
                f.getFornecedor().setRazaoSocial(result.getString("razaoSocial"));
                
                retorno.add(f);
            }
        }catch(SQLException  e){
            System.out.println("Erro na seleção: "+ e.getMessage());
        }
        c.desconectar();
        return retorno;
    }
}
