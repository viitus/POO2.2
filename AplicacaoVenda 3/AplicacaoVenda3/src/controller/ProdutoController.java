package controller;

import java.util.ArrayList;
import model.ProdutoModel;
import util.Conexao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

/**
 *
 * @author Cris
 */
public class ProdutoController {

    public boolean inserir(ProdutoModel produto) {
        boolean retorno = false;
        //CONECTAR COM BANCO
        Conexao c = new Conexao();
        c.conectar();
        //CRIAR SQL INSERT
        String sql = "insert into produto (descricao,estoque,valor,fornecedor)values (?,?,?,?)";
        try {
            PreparedStatement sentenca = c.conector.prepareStatement(sql);
            //PASSAR PARAMETROS
            sentenca.setString(1, produto.getDescricao());
            sentenca.setInt(2, produto.getEstoque());
            sentenca.setFloat(3, produto.getValor());
            sentenca.setInt(4, produto.getFornecedor().getIdFornecedor());
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

    public boolean editar(ProdutoModel produto) {
        boolean retorno = false;
        Conexao c = new Conexao();
        c.conectar();
        String sql = "update produto set descricao = ?, "
                + "estoque = ?, valor=?, fornecedor = ? where idproduto = ? ";
        try {
            PreparedStatement sentenca = c.conector.prepareStatement(sql);
            sentenca.setString(1, produto.getDescricao());
            sentenca.setInt(2, produto.getEstoque());
            sentenca.setFloat(3, produto.getValor());
            sentenca.setInt(4, produto.getFornecedor().getIdFornecedor());
            sentenca.setInt(5, produto.getIdproduto());
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
        Conexao c = new Conexao();
        c.conectar();
        String sql = "delete from produto where idproduto = ?";
        try{
            PreparedStatement sentenca = c.conector.prepareStatement(sql);
            sentenca.setInt(1, produto.getIdproduto());
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
        Conexao c = new Conexao();
        c.conectar();
        String sql = "select p.idproduto,p.descricao,p.estoque,p.valor,f.idfornecedor,f.razaosocial "
                + "from produto p, fornecedor f where f.idfornecedor = p.fornecedor and p.idproduto = ?";
        try{
            PreparedStatement sentenca = c.conector.prepareStatement(sql);
            sentenca.setInt(1, produto.getIdproduto());
            ResultSet result = sentenca.executeQuery();
            if(result.next()){
                retorno = new ProdutoModel();
                retorno.setIdproduto(result.getInt("idproduto"));
                retorno.setDescricao(result.getString("descricao"));
                retorno.setEstoque(result.getInt("estoque"));
                retorno.setValor(result.getFloat("valor"));
                retorno.getFornecedor().setIdFornecedor(result.getInt("idfornecedor"));
                retorno.getFornecedor().setRazaoSocial(result.getString("razaosocial"));
            }
        }catch(SQLException  e){
            System.out.println("Erro na seleção: "+ e.getMessage());
        }
        c.desconectar();
        return retorno;
    }

    public ArrayList<ProdutoModel> selecionarTodos() {
        ArrayList<ProdutoModel> retorno = new ArrayList<>();
        Conexao c = new Conexao();
        c.conectar();
        String sql = "select p.idproduto,p.descricao,p.estoque,p.valor, f.idfornecedor,f.razaosocial"
                + " from produto p, fornecedor f where p.fornecedor = f.idfornecedor";
        try{
            PreparedStatement sentenca = c.conector.prepareStatement(sql);
            ResultSet result = sentenca.executeQuery();
            while(result.next()){
                ProdutoModel p = new ProdutoModel();
                
                p.setIdproduto(result.getInt("idproduto"));
                p.setDescricao(result.getString("descricao"));
                p.setEstoque(result.getInt("estoque"));
                p.setValor(result.getFloat("valor"));
                p.getFornecedor().setIdFornecedor(result.getInt("idfornecedor"));
                p.getFornecedor().setRazaoSocial(result.getString("razaosocial"));
                retorno.add(p);
            }
        }catch(SQLException  e){
            System.out.println("Erro na seleção: "+ e.getMessage());
        }
        c.desconectar();
        return retorno;
    }
}
