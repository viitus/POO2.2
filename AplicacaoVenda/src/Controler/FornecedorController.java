package Controler;

import Model.FornecedorModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import util.Conecxao;

/*Vitus*/

public class FornecedorController {
    
    public boolean inserir(FornecedorModel fornecedor) {
        boolean retorno = false;
        //CONECTAR COM BANCO
        Conecxao c = new Conecxao();
        c.conectar();
        //CRIAR SQL INSERT
        String sql = "insert into fornecedor (cnpj,razaosocial,endereco)values (?,?,?)";
        try {
            PreparedStatement sentenca = c.conector.prepareStatement(sql);
            //PASSAR PARAMETROS
            sentenca.setString(1, fornecedor.getCnpj());
            sentenca.setString(2, fornecedor.getRazaoSocial());
            sentenca.setString(3, fornecedor.getEndereco());
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
    
    public boolean editar(FornecedorModel fornecedor){
        boolean retorno = false;
        Conecxao c = new Conecxao();
        c.conectar();
        String sql = "update fornecedor set cnpj = ?, razaosocial = ?, endereco = ? where idFornecedor = ? ";
        try {
            PreparedStatement sentenca = c.conector.prepareStatement(sql);
            sentenca.setString(1, fornecedor.getCnpj());
            sentenca.setString(2, fornecedor.getRazaoSocial());
            sentenca.setString(3, fornecedor.getEndereco());
            sentenca.setInt(4, fornecedor.getIdFornecedor());
            if (!sentenca.execute()) 
                retorno = true;
        } catch (SQLException e) {
            System.out.println("Erro ao editar: " + e.getMessage());
        }
        c.desconectar();
        return retorno;
    }
    
    public boolean excluir(FornecedorModel fornecedor) {
        boolean retorno = false;
        Conecxao c = new Conecxao();
        c.conectar();
        String sql = "delete from fornecedor where idFornecedor = ?";
        try{
            PreparedStatement sentenca = c.conector.prepareStatement(sql);
            sentenca.setInt(1, fornecedor.getIdFornecedor());
            if(!sentenca.execute())
                retorno = true;
        }catch(SQLException e){
            System.out.println("Erro ao deletar!"+ e.getMessage());
        }
        c.desconectar();
        return retorno;
    }
    
    public FornecedorModel selecionar(FornecedorModel fornecedor) {
        FornecedorModel retorno = null;
        Conecxao c = new Conecxao();
        c.conectar();
        String sql = "select * from fornecedor where idfornecedor = ?";
        try{
            PreparedStatement sentenca = c.conector.prepareStatement(sql);
            sentenca.setInt(1, fornecedor.getIdFornecedor());
            ResultSet result = sentenca.executeQuery();
            if(result.next()){
                retorno = new FornecedorModel();
                retorno.setIdFornecedor(result.getInt("idFornecedor"));
                retorno.setCnpj(result.getString("cnpj"));
                retorno.setRazaoSocial(result.getString("razaosocial"));
                retorno.setEndereco(result.getString("endereco"));
            }
        }catch(SQLException  e){
            System.out.println("Erro na seleção: "+ e.getMessage());
        }
        c.desconectar();
        return retorno;
    }

    public ArrayList<FornecedorModel> selecionarTodos() {
        ArrayList<FornecedorModel> retorno = new ArrayList<>();
        Conecxao c = new Conecxao();
        c.conectar();
        String sql = "select * from fornecedor";
        try{
            PreparedStatement sentenca = c.conector.prepareStatement(sql);
            ResultSet result = sentenca.executeQuery();
            while(result.next()){
                FornecedorModel f = new FornecedorModel();
                f.setIdFornecedor(result.getInt("idFornecedor"));
                f.setCnpj(result.getString("cnpj"));
                f.setRazaoSocial(result.getString("razaosocial"));
                f.setEndereco(result.getString("endereco"));
                retorno.add(f);
            }
        }catch(SQLException  e){
            System.out.println("Erro na seleção: "+ e.getMessage());
        }
        c.desconectar();
        return retorno;
    }
}
