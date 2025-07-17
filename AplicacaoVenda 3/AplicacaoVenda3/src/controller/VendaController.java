/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.VendaModel;
import util.Conexao;

/**
 *
 * @author Cris
 */
public class VendaController {
    public boolean inserir(VendaModel venda) {
        boolean retorno = false;
        //CONECTAR COM BANCO
        Conexao c = new Conexao();
        c.conectar();
        //CRIAR SQL INSERT
        String sql = "insert into venda (cliente,datavenda,pagamento)values (?,?,?)";
        try {
            PreparedStatement sentenca = c.conector.prepareStatement(sql);
            //PASSAR PARAMETROS
            sentenca.setString(1, venda.getCliente());
            sentenca.setString(2, venda.toStringDataVenda());
            sentenca.setString(3, venda.getPagamento());
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

    public boolean editar(VendaModel venda) {
        boolean retorno = false;
        Conexao c = new Conexao();
        c.conectar();
        String sql = "update venda set cliente = ?, "
                + "datavenda = ?, pagamento=? where idvenda = ? ";
        try {
            PreparedStatement sentenca = c.conector.prepareStatement(sql);
            sentenca.setString(1, venda.getCliente());
            sentenca.setString(2, venda.toStringDataVenda());
            sentenca.setString(3, venda.getPagamento());
            sentenca.setInt(4, venda.getIdvenda());
            if (!sentenca.execute()) 
                retorno = true;
        } catch (SQLException e) {
            System.out.println("Erro ao editar: " + e.getMessage());
        }
        c.desconectar();

        return retorno;
    }

    public boolean excluir(VendaModel venda) {
        boolean retorno = false;
        Conexao c = new Conexao();
        c.conectar();
        String sql = "delete from venda where idvenda = ?";
        try{
            PreparedStatement sentenca = c.conector.prepareStatement(sql);
            sentenca.setInt(1, venda.getIdvenda());
            if(!sentenca.execute())
                retorno = true;
        }catch(SQLException e){
            System.out.println("Erro ao deletar!"+ e.getMessage());
        }
        c.desconectar();
        return retorno;
    }

    public VendaModel selecionar(VendaModel venda) {
        VendaModel retorno = null;
        Conexao c = new Conexao();
        c.conectar();
        String sql = "select * from venda where idvenda = ?";
        try{
            PreparedStatement sentenca = c.conector.prepareStatement(sql);
            sentenca.setInt(1, venda.getIdvenda());
            ResultSet result = sentenca.executeQuery();
            if(result.next()){
                retorno = new VendaModel();
                retorno.setIdvenda(result.getInt("idvenda"));
                retorno.setCliente(result.getString("cliente"));
                retorno.setDataVenda(result.getDate("datavenda"));
                retorno.setPagamento(result.getString("pagamento"));
            }
        }catch(SQLException  e){
            System.out.println("Erro na seleção: "+ e.getMessage());
        }
        c.desconectar();
        return retorno;
    }

    public ArrayList<VendaModel> selecionarTodos() {
        ArrayList<VendaModel> retorno = new ArrayList<>();
        Conexao c = new Conexao();
        c.conectar();
        String sql = "select * from venda";
        try{
            PreparedStatement sentenca = c.conector.prepareStatement(sql);
            ResultSet result = sentenca.executeQuery();
            while(result.next()){
                VendaModel v = new VendaModel();
                v.setIdvenda(result.getInt("idvenda"));
                v.setCliente(result.getString("cliente"));
                v.setDataVenda(result.getDate("datavenda"));
                v.setPagamento(result.getString("pagamento"));
                retorno.add(v);
            }
        }catch(SQLException  e){
            System.out.println("Erro na seleção: "+ e.getMessage());
        }
        c.desconectar();
        return retorno;
    }
    public int selecionarUltimoId() {
        int retorno = 0;
        Conexao c = new Conexao();
        c.conectar();
        String sql = "select max(idvenda) as ultimo from venda";
        try{
            PreparedStatement sentenca = c.conector.prepareStatement(sql);
            ResultSet result = sentenca.executeQuery();
            if(result.next()){
                retorno = result.getInt("ultimo");
            }
        }catch(SQLException  e){
            System.out.println("Erro na seleção: "+ e.getMessage());
        }
        c.desconectar();
        return retorno;
    }
}
